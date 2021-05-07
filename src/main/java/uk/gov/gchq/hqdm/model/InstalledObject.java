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
 * A {@link StateOfOrdinaryPhysicalObject} that is also a {@link StateOfSystemComponent} that is a
 * temporal_part_of an {@link OrdinaryPhysicalObject} from when it is installed as a
 * {@link SystemComponent} to when it is removed.
 */
public interface InstalledObject extends
        StateOfOrdinaryPhysicalObject,
        StateOfSystemComponent {
}
