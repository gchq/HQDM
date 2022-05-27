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

import static uk.gov.gchq.hqdm.iri.HQDM.OFFER_AND_ACCEPTANCE_FOR_GOODS;

import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.OfferAndAcceptanceForGoods;
import uk.gov.gchq.hqdm.pojo.HqdmObject;

/**
 * An implementation of OfferAndAcceptanceForGoods.
 */
public class OfferAndAcceptanceForGoodsImpl extends HqdmObject
        implements OfferAndAcceptanceForGoods {
    /**
     * Constructs a new OfferAndAcceptanceForGoods.
     *
     * @param iri IRI of the OfferAndAcceptanceForGoods.
     */
    public OfferAndAcceptanceForGoodsImpl(final IRI iri) {
        super(OfferAndAcceptanceForGoodsImpl.class, iri, OFFER_AND_ACCEPTANCE_FOR_GOODS);
    }

}
