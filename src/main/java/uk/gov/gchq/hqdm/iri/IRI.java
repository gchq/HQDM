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
 *
 */
public class IRI {
    /** */
    private IriBase base;

    /** */
    private String value;

    /** */
    private String iri;

    /**
     *
     * @param base
     * @param value
     */
    public IRI(final IriBase base, final String value) {
        this.base = base;
        this.value = value;
        this.iri = base.getValue() + value;
    }

    /**
     *
     * @param iri
     * @throws IriException
     */
    public IRI(final String iri) throws IriException {
        fromString(iri);
    }

    /**
     *
     * @return
     */
    public IriBase getBase() {
        return base;
    }

    /**
     *
     * @param base
     */
    public void setBase(final IriBase base) {
        this.base = base;
    }

    /**
     *
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    public void setValue(final String value) {
        this.value = value;
    }

    /**
     *
     * @return
     */
    public String getIri() {
        return iri;
    }

    /**
     *
     * @param iri
     * @throws IriException
     */
    public void setIri(final String iri) {
        this.iri = iri;
    }

    /**
     *
     * @param iri
     */
    private void fromString(final String iri) throws IriException {
        int index = iri.lastIndexOf('#');
        if (index < 0) {
            index = iri.lastIndexOf('/');
        }
        if (index < 0) {
            throw new IriException("Cannot parse IRI: " + iri);
        } else {
            final String baseString = iri.substring(0, index + 1);
            base = new IriBase(baseString, baseString);
            value = iri.substring(index + 1);
            this.iri = base.getValue() + value;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return iri;
    }

    /**
     *
     * @param object
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
        return Objects.equals(base, iri.base) && Objects.equals(value, iri.value);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(base, value);
    }
}
