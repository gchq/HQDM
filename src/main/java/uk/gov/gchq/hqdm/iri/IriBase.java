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

/**
 *
 */
public class IriBase {
    /** */
    private String prefix;

    /** */
    private String namespace;

    /**
     *
     * @param prefix
     * @param value
     */
    public IriBase(final String prefix, final String value) {
        this.prefix = prefix;
        this.namespace = value;
    }

    /**
     *
     */
    public IriBase() {}

    /**
     *
     * @return
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     *
     * @param prefix
     */
    public void setPrefix(final String prefix) {
        this.prefix = prefix;
    }

    /**
     *
     * @return
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     *
     * @param namespace
     */
    public void setNamespace(final String namespace) {
        this.namespace = namespace;
    }

    /**
     *
     * @param object
     * @return
     */
    @Override
    public boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof IriBase)) {
            return false;
        }
        final IriBase iri = (IriBase) object;
        return Objects.equals(namespace, iri.namespace);
    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(namespace);
    }
}
