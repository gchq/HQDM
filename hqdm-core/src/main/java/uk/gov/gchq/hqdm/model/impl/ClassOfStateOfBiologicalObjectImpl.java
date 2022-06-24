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

package uk.gov.gchq.hqdm.model.impl;

import uk.gov.gchq.hqdm.model.ClassOfStateOfBiologicalObject;
import uk.gov.gchq.hqdm.model.HqdmObject;

/**
 * An implementation of ClassOfStateOfBiologicalObject.
 */
public class ClassOfStateOfBiologicalObjectImpl extends HqdmObject implements ClassOfStateOfBiologicalObject {
    /**
     * Constructs a new ClassOfStateOfBiologicalObject.
     *
     * @param id String of the ClassOfStateOfBiologicalObject.
     */
    public ClassOfStateOfBiologicalObjectImpl(final String id) {
        super(id);
    }
}
