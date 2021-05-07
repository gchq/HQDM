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

package uk.gov.gchq.hqdm.model;

/**
 * A {@link ClassOfState} that is {@link Individual} or any of its subsets. Note: Only classes that
 * necessarily apply to an individual for the whole of its life are valid members. Others are
 * members of class_of_state and apply to the state that is the individual for the period of time
 * that the class applies for.
 */
public interface ClassOfIndividual extends ClassOfState {
}
