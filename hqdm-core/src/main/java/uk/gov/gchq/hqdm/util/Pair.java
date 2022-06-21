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

package uk.gov.gchq.hqdm.util;


/**
 * A utility Pair with Left (L) and Right (R) values.
 * L the type of the Left element.
 * R the type of the Right element.
 */
public class Pair<L, R> {
    // The Left element.
    private L left;

    // The Right element.
    private R right;

    /**
     * All args constructor.
     *
     * @param left the Left element of type L
     * @param right the Right element of type R
     */
    public Pair(final L left, final R right) {
        this.left = left;
        this.right = right;
    }

    /**
     * Setter for the Left element.
     *
     * @param left the left element of type L
     */
    public void setLeft(final L left) {
        this.left = left;
    }

    /**
     * Setter for the Right element.
     *
     * @param right the right element of type R
     */
    public void setRight(final R right) {
        this.right = right;
    }

    /**
     * Getter for the Left element.
     *
     * @return the left element of type L
     */
    public L getLeft() {
        return left;
    }

    /**
     * Getter for the right element.
     *
     * @return the right element of type R
     */
    public R getRight() {
        return right;
    }
}
