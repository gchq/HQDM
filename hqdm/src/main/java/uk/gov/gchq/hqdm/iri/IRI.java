/*
 * Copyright 2021 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package uk.gov.gchq.hqdm.iri;

import java.util.Objects;

import uk.gov.gchq.hqdm.exception.IriException;

/**
 * An implementation of Internationalized Resource Identifiers.
 */
public class IRI {

    private IriBase base;

    private String resource;

    private String iri;

    /**
     * Constructs a new IRI from a base namespace and resource name.
     *
     * @param base IRI base namespace.
     * @param resource Resource name.
     */
    public IRI(final IriBase base, final String resource) {
        this.base = base;
        this.resource = resource;
        this.iri = base.getNamespace() + resource;
    }

    /**
     * Constructs a new IRI from a string.
     *
     * @param iri IRI string.
     * @throws IriException If the IRI string is malformed.
     */
    public IRI(final String iri) throws IriException {
        fromString(iri);
    }

    /**
     * The namespace of the IRI.
     *
     * @return IRI namespace.
     */
    public IriBase getBase() {
        return base;
    }

    /**
     * Set the IriBase namespace of the IRI.
     *
     * @param base IRI namespace.
     */
    public void setBase(final IriBase base) {
        this.base = base;
    }

    /**
     * The name of the resource.
     *
     * @return Resource name.
     */
    public String getResource() {
        return resource;
    }

    /**
     * Set the resource name.
     *
     * @param resource Resource name.
     */
    public void setResource(final String resource) {
        this.resource = resource;
    }

    /**
     * The full IRI string of the resource.
     *
     * @return IRI string.
     */
    public String getIri() {
        return iri;
    }

    /**
     * Set the IRI string.
     *
     * @param iri IRI string.
     */
    public void setIri(final String iri) {
        this.iri = iri;
    }

    private void fromString(final String iri) throws IriException {
        int index = iri.lastIndexOf('#');
        if (index < 0) {
            index = iri.lastIndexOf('/');
        }
        if (index < 0) {
            throw new IriException("Cannot parse IRI: " + iri);
        } else {
            final String baseString = iri.substring(0, index + 1);
            this.base = new IriBase(baseString, baseString);
            this.resource = iri.substring(index + 1);
            this.iri = base.getNamespace() + resource;
        }
    }

    /**
     * Returns the full IRI string value.
     *
     * @return IRI string.
     */
    @Override
    public String toString() {
        return getIri();
    }

    /**
     * Compare to another {@code Object}.
     *
     * @param object Object to compare.
     * @return True if
     */
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof IRI)) {
            return false;
        }
        final IRI iri = (IRI) object;
        return Objects.equals(base, iri.base) && Objects.equals(resource, iri.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, resource);
    }
}
