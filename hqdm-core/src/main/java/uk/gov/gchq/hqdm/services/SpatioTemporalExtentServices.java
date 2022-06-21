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

package uk.gov.gchq.hqdm.services;

import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.*;
import uk.gov.gchq.hqdm.model.impl.*;

/**
 * Service for creating SpatioTemporalExtent objects.
 */
public class SpatioTemporalExtentServices {

    /**
     * Create a AbstractObject with an IRI.
     *
     * @param iri the IRI.
     * @return a AbstractObject instance.
     */
    public static AbstractObject createAbstractObject(final IRI iri) {
        return new AbstractObjectImpl(iri);
    }

    /**
     * Create a AcceptanceOfOffer with an IRI.
     *
     * @param iri the IRI.
     * @return a AcceptanceOfOffer instance.
     */
    public static AcceptanceOfOffer createAcceptanceOfOffer(final IRI iri) {
        return new AcceptanceOfOfferImpl(iri);
    }

    /**
     * Create a AcceptanceOfOfferForGoods with an IRI.
     *
     * @param iri the IRI.
     * @return a AcceptanceOfOfferForGoods instance.
     */
    public static AcceptanceOfOfferForGoods createAcceptanceOfOfferForGoods(final IRI iri) {
        return new AcceptanceOfOfferForGoodsImpl(iri);
    }

    /**
     * Create a Activity with an IRI.
     *
     * @param iri the IRI.
     * @return a Activity instance.
     */
    public static Activity createActivity(final IRI iri) {
        return new ActivityImpl(iri);
    }

    /**
     * Create a AgreeContract with an IRI.
     *
     * @param iri the IRI.
     * @return a AgreeContract instance.
     */
    public static AgreeContract createAgreeContract(final IRI iri) {
        return new AgreeContractImpl(iri);
    }

    /**
     * Create a AgreementExecution with an IRI.
     *
     * @param iri the IRI.
     * @return a AgreementExecution instance.
     */
    public static AgreementExecution createAgreementExecution(final IRI iri) {
        return new AgreementExecutionImpl(iri);
    }

    /**
     * Create a AgreementProcess with an IRI.
     *
     * @param iri the IRI.
     * @return a AgreementProcess instance.
     */
    public static AgreementProcess createAgreementProcess(final IRI iri) {
        return new AgreementProcessImpl(iri);
    }

    /**
     * Create a AmountOfMoney with an IRI.
     *
     * @param iri the IRI.
     * @return a AmountOfMoney instance.
     */
    public static AmountOfMoney createAmountOfMoney(final IRI iri) {
        return new AmountOfMoneyImpl(iri);
    }

    /**
     * Create a Asset with an IRI.
     *
     * @param iri the IRI.
     * @return a Asset instance.
     */
    public static Asset createAsset(final IRI iri) {
        return new AssetImpl(iri);
    }

    /**
     * Create a Association with an IRI.
     *
     * @param iri the IRI.
     * @return a Association instance.
     */
    public static Association createAssociation(final IRI iri) {
        return new AssociationImpl(iri);
    }

    /**
     * Create a BeginningOfOwnership with an IRI.
     *
     * @param iri the IRI.
     * @return a BeginningOfOwnership instance.
     */
    public static BeginningOfOwnership createBeginningOfOwnership(final IRI iri) {
        return new BeginningOfOwnershipImpl(iri);
    }

    /**
     * Create a BiologicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a BiologicalObject instance.
     */
    public static BiologicalObject createBiologicalObject(final IRI iri) {
        return new BiologicalObjectImpl(iri);
    }

    /**
     * Create a BiologicalSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a BiologicalSystem instance.
     */
    public static BiologicalSystem createBiologicalSystem(final IRI iri) {
        return new BiologicalSystemImpl(iri);
    }

    /**
     * Create a BiologicalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a BiologicalSystemComponent instance.
     */
    public static BiologicalSystemComponent createBiologicalSystemComponent(final IRI iri) {
        return new BiologicalSystemComponentImpl(iri);
    }

    /**
     * Create a ContractExecution with an IRI.
     *
     * @param iri the IRI.
     * @return a ContractExecution instance.
     */
    public static ContractExecution createContractExecution(final IRI iri) {
        return new ContractExecutionImpl(iri);
    }

    /**
     * Create a ContractProcess with an IRI.
     *
     * @param iri the IRI.
     * @return a ContractProcess instance.
     */
    public static ContractProcess createContractProcess(final IRI iri) {
        return new ContractProcessImpl(iri);
    }

    /**
     * Create a Currency with an IRI.
     *
     * @param iri the IRI.
     * @return a Currency instance.
     */
    public static Currency createCurrency(final IRI iri) {
        return new CurrencyImpl(iri);
    }

    /**
     * Create a Definition with an IRI.
     *
     * @param iri the IRI.
     * @return a Definition instance.
     */
    public static Definition createDefinition(final IRI iri) {
        return new DefinitionImpl(iri);
    }

    /**
     * Create a Description with an IRI.
     *
     * @param iri the IRI.
     * @return a Description instance.
     */
    public static Description createDescription(final IRI iri) {
        return new DescriptionImpl(iri);
    }

    /**
     * Create a Employee with an IRI.
     *
     * @param iri the IRI.
     * @return a Employee instance.
     */
    public static Employee createEmployee(final IRI iri) {
        return new EmployeeImpl(iri);
    }

    /**
     * Create a Employer with an IRI.
     *
     * @param iri the IRI.
     * @return a Employer instance.
     */
    public static Employer createEmployer(final IRI iri) {
        return new EmployerImpl(iri);
    }

    /**
     * Create a Employment with an IRI.
     *
     * @param iri the IRI.
     * @return a Employment instance.
     */
    public static Employment createEmployment(final IRI iri) {
        return new EmploymentImpl(iri);
    }

    /**
     * Create a EndingOfOwnership with an IRI.
     *
     * @param iri the IRI.
     * @return a EndingOfOwnership instance.
     */
    public static EndingOfOwnership createEndingOfOwnership(final IRI iri) {
        return new EndingOfOwnershipImpl(iri);
    }

    /**
     * Create a Event with an IRI.
     *
     * @param iri the IRI.
     * @return a Event instance.
     */
    public static Event createEvent(final IRI iri) {
        return new EventImpl(iri);
    }

    /**
     * Create a ExchangeOfGoodsAndMoney with an IRI.
     *
     * @param iri the IRI.
     * @return a ExchangeOfGoodsAndMoney instance.
     */
    public static ExchangeOfGoodsAndMoney createExchangeOfGoodsAndMoney(final IRI iri) {
        return new ExchangeOfGoodsAndMoneyImpl(iri);
    }

    /**
     * Create a FunctionalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a FunctionalObject instance.
     */
    public static FunctionalObject createFunctionalObject(final IRI iri) {
        return new FunctionalObjectImpl(iri);
    }

    /**
     * Create a FunctionalSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a FunctionalSystem instance.
     */
    public static FunctionalSystem createFunctionalSystem(final IRI iri) {
        return new FunctionalSystemImpl(iri);
    }

    /**
     * Create a FunctionalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a FunctionalSystemComponent instance.
     */
    public static FunctionalSystemComponent createFunctionalSystemComponent(final IRI iri) {
        return new FunctionalSystemComponentImpl(iri);
    }

    /**
     * Create a Identification with an IRI.
     *
     * @param iri the IRI.
     * @return a Identification instance.
     */
    public static Identification createIdentification(final IRI iri) {
        return new IdentificationImpl(iri);
    }

    /**
     * Create a IdentificationOfPhysicalQuantity with an IRI.
     *
     * @param iri the IRI.
     * @return a IdentificationOfPhysicalQuantity instance.
     */
    public static IdentificationOfPhysicalQuantity 
            createIdentificationOfPhysicalQuantity(final IRI iri) {
        return new IdentificationOfPhysicalQuantityImpl(iri);
    }

    /**
     * Create a InPlaceBiologicalComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a InPlaceBiologicalComponent instance.
     */
    public static InPlaceBiologicalComponent createInPlaceBiologicalComponent(final IRI iri) {
        return new InPlaceBiologicalComponentImpl(iri);
    }

    /**
     * Create a Individual with an IRI.
     *
     * @param iri the IRI.
     * @return a Individual instance.
     */
    public static Individual createIndividual(final IRI iri) {
        return new IndividualImpl(iri);
    }

    /**
     * Create a InstalledFunctionalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a InstalledFunctionalSystemComponent instance.
     */
    public static InstalledFunctionalSystemComponent 
            createInstalledFunctionalSystemComponent(final IRI iri) {
        return new InstalledFunctionalSystemComponentImpl(iri);
    }

    /**
     * Create a InstalledObject with an IRI.
     *
     * @param iri the IRI.
     * @return a InstalledObject instance.
     */
    public static InstalledObject createInstalledObject(final IRI iri) {
        return new InstalledObjectImpl(iri);
    }

    /**
     * Create a IntentionallyConstructedObject with an IRI.
     *
     * @param iri the IRI.
     * @return a IntentionallyConstructedObject instance.
     */
    public static IntentionallyConstructedObject 
            createIntentionallyConstructedObject(final IRI iri) {
        return new IntentionallyConstructedObjectImpl(iri);
    }

    /**
     * Create a LanguageCommunity with an IRI.
     *
     * @param iri the IRI.
     * @return a LanguageCommunity instance.
     */
    public static LanguageCommunity createLanguageCommunity(final IRI iri) {
        return new LanguageCommunityImpl(iri);
    }

    /**
     * Create a MoneyAsset with an IRI.
     *
     * @param iri the IRI.
     * @return a MoneyAsset instance.
     */
    public static MoneyAsset createMoneyAsset(final IRI iri) {
        return new MoneyAssetImpl(iri);
    }

    /**
     * Create a Offer with an IRI.
     *
     * @param iri the IRI.
     * @return a Offer instance.
     */
    public static Offer createOffer(final IRI iri) {
        return new OfferImpl(iri);
    }

    /**
     * Create a OfferAndAcceptanceForGoods with an IRI.
     *
     * @param iri the IRI.
     * @return a OfferAndAcceptanceForGoods instance.
     */
    public static OfferAndAcceptanceForGoods createOfferAndAcceptanceForGoods(final IRI iri) {
        return new OfferAndAcceptanceForGoodsImpl(iri);
    }

    /**
     * Create a OfferForGoods with an IRI.
     *
     * @param iri the IRI.
     * @return a OfferForGoods instance.
     */
    public static OfferForGoods createOfferForGoods(final IRI iri) {
        return new OfferForGoodsImpl(iri);
    }

    /**
     * Create a Offering with an IRI.
     *
     * @param iri the IRI.
     * @return a Offering instance.
     */
    public static Offering createOffering(final IRI iri) {
        return new OfferingImpl(iri);
    }

    /**
     * Create a OrdinaryBiologicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a OrdinaryBiologicalObject instance.
     */
    public static OrdinaryBiologicalObject createOrdinaryBiologicalObject(final IRI iri) {
        return new OrdinaryBiologicalObjectImpl(iri);
    }

    /**
     * Create a OrdinaryFunctionalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a OrdinaryFunctionalObject instance.
     */
    public static OrdinaryFunctionalObject createOrdinaryFunctionalObject(final IRI iri) {
        return new OrdinaryFunctionalObjectImpl(iri);
    }

    /**
     * Create a OrdinaryPhysicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a OrdinaryPhysicalObject instance.
     */
    public static OrdinaryPhysicalObject createOrdinaryPhysicalObject(final IRI iri) {
        return new OrdinaryPhysicalObjectImpl(iri);
    }

    /**
     * Create a Organization with an IRI.
     *
     * @param iri the IRI.
     * @return a Organization instance.
     */
    public static Organization createOrganization(final IRI iri) {
        return new OrganizationImpl(iri);
    }

    /**
     * Create a OrganizationComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a OrganizationComponent instance.
     */
    public static OrganizationComponent createOrganizationComponent(final IRI iri) {
        return new OrganizationComponentImpl(iri);
    }

    /**
     * Create a Owner with an IRI.
     *
     * @param iri the IRI.
     * @return a Owner instance.
     */
    public static Owner createOwner(final IRI iri) {
        return new OwnerImpl(iri);
    }

    /**
     * Create a Ownership with an IRI.
     *
     * @param iri the IRI.
     * @return a Ownership instance.
     */
    public static Ownership createOwnership(final IRI iri) {
        return new OwnershipImpl(iri);
    }

    /**
     * Create a Participant with an IRI.
     *
     * @param iri the IRI.
     * @return a Participant instance.
     */
    public static Participant createParticipant(final IRI iri) {
        return new ParticipantImpl(iri);
    }

    /**
     * Create a ParticipantInActivityOrAssociation with an IRI.
     *
     * @param iri the IRI.
     * @return a ParticipantInActivityOrAssociation instance.
     */
    public static ParticipantInActivityOrAssociation 
            createParticipantInActivityOrAssociation(final IRI iri) {
        return new ParticipantInActivityOrAssociationImpl(iri);
    }

    /**
     * Create a Party with an IRI.
     *
     * @param iri the IRI.
     * @return a Party instance.
     */
    public static Party createParty(final IRI iri) {
        return new PartyImpl(iri);
    }

    /**
     * Create a Pattern with an IRI.
     *
     * @param iri the IRI.
     * @return a Pattern instance.
     */
    public static Pattern createPattern(final IRI iri) {
        return new PatternImpl(iri);
    }

    /**
     * Create a PeriodOfTime with an IRI.
     *
     * @param iri the IRI.
     * @return a PeriodOfTime instance.
     */
    public static PeriodOfTime createPeriodOfTime(final IRI iri) {
        return new PeriodOfTimeImpl(iri);
    }

    /**
     * Create a Person with an IRI.
     *
     * @param iri the IRI.
     * @return a Person instance.
     */
    public static Person createPerson(final IRI iri) {
        return new PersonImpl(iri);
    }

    /**
     * Create a PersonInPosition with an IRI.
     *
     * @param iri the IRI.
     * @return a PersonInPosition instance.
     */
    public static PersonInPosition createPersonInPosition(final IRI iri) {
        return new PersonInPositionImpl(iri);
    }

    /**
     * Create a PhysicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a PhysicalObject instance.
     */
    public static PhysicalObject createPhysicalObject(final IRI iri) {
        return new PhysicalObjectImpl(iri);
    }

    /**
     * Create a PhysicalProperty with an IRI.
     *
     * @param iri the IRI.
     * @return a PhysicalProperty instance.
     */
    public static PhysicalProperty createPhysicalProperty(final IRI iri) {
        return new PhysicalPropertyImpl(iri);
    }

    /**
     * Create a PhysicalPropertyRange with an IRI.
     *
     * @param iri the IRI.
     * @return a PhysicalPropertyRange instance.
     */
    public static PhysicalPropertyRange createPhysicalPropertyRange(final IRI iri) {
        return new PhysicalPropertyRangeImpl(iri);
    }

    /**
     * Create a PhysicalQuantity with an IRI.
     *
     * @param iri the IRI.
     * @return a PhysicalQuantity instance.
     */
    public static PhysicalQuantity createPhysicalQuantity(final IRI iri) {
        return new PhysicalQuantityImpl(iri);
    }

    /**
     * Create a PhysicalQuantityRange with an IRI.
     *
     * @param iri the IRI.
     * @return a PhysicalQuantityRange instance.
     */
    public static PhysicalQuantityRange createPhysicalQuantityRange(final IRI iri) {
        return new PhysicalQuantityRangeImpl(iri);
    }

    /**
     * Create a Plan with an IRI.
     *
     * @param iri the IRI.
     * @return a Plan instance.
     */
    public static Plan createPlan(final IRI iri) {
        return new PlanImpl(iri);
    }

    /**
     * Create a PointInTime with an IRI.
     *
     * @param iri the IRI.
     * @return a PointInTime instance.
     */
    public static PointInTime createPointInTime(final IRI iri) {
        return new PointInTimeImpl(iri);
    }

    /**
     * Create a Position with an IRI.
     *
     * @param iri the IRI.
     * @return a Position instance.
     */
    public static Position createPosition(final IRI iri) {
        return new PositionImpl(iri);
    }

    /**
     * Create a PossibleWorld with an IRI.
     *
     * @param iri the IRI.
     * @return a PossibleWorld instance.
     */
    public static PossibleWorld createPossibleWorld(final IRI iri) {
        return new PossibleWorldImpl(iri);
    }

    /**
     * Create a Price with an IRI.
     *
     * @param iri the IRI.
     * @return a Price instance.
     */
    public static Price createPrice(final IRI iri) {
        return new PriceImpl(iri);
    }

    /**
     * Create a ProductBrand with an IRI.
     *
     * @param iri the IRI.
     * @return a ProductBrand instance.
     */
    public static ProductBrand createProductBrand(final IRI iri) {
        return new ProductBrandImpl(iri);
    }

    /**
     * Create a ProductOffering with an IRI.
     *
     * @param iri the IRI.
     * @return a ProductOffering instance.
     */
    public static ProductOffering createProductOffering(final IRI iri) {
        return new ProductOfferingImpl(iri);
    }

    /**
     * Create a ReachingAgreement with an IRI.
     *
     * @param iri the IRI.
     * @return a ReachingAgreement instance.
     */
    public static ReachingAgreement createReachingAgreement(final IRI iri) {
        return new ReachingAgreementImpl(iri);
    }

    /**
     * Create a RecognizingLanguageCommunity with an IRI.
     *
     * @param iri the IRI.
     * @return a RecognizingLanguageCommunity instance.
     */
    public static RecognizingLanguageCommunity createRecognizingLanguageCommunity(final IRI iri) {
        return new RecognizingLanguageCommunityImpl(iri);
    }

    /**
     * Create a RepresentationByPattern with an IRI.
     *
     * @param iri the IRI.
     * @return a RepresentationByPattern instance.
     */
    public static RepresentationByPattern createRepresentationByPattern(final IRI iri) {
        return new RepresentationByPatternImpl(iri);
    }

    /**
     * Create a RepresentationBySign with an IRI.
     *
     * @param iri the IRI.
     * @return a RepresentationBySign instance.
     */
    public static RepresentationBySign createRepresentationBySign(final IRI iri) {
        return new RepresentationBySignImpl(iri);
    }

    /**
     * Create a Requirement with an IRI.
     *
     * @param iri the IRI.
     * @return a Requirement instance.
     */
    public static Requirement createRequirement(final IRI iri) {
        return new RequirementImpl(iri);
    }

    /**
     * Create a RequirementSpecification with an IRI.
     *
     * @param iri the IRI.
     * @return a RequirementSpecification instance.
     */
    public static RequirementSpecification createRequirementSpecification(final IRI iri) {
        return new RequirementSpecificationImpl(iri);
    }

    /**
     * Create a SaleOfGoods with an IRI.
     *
     * @param iri the IRI.
     * @return a SaleOfGoods instance.
     */
    public static SaleOfGoods createSaleOfGoods(final IRI iri) {
        return new SaleOfGoodsImpl(iri);
    }

    /**
     * Create a SalesProduct with an IRI.
     *
     * @param iri the IRI.
     * @return a SalesProduct instance.
     */
    public static SalesProduct createSalesProduct(final IRI iri) {
        return new SalesProductImpl(iri);
    }

    /**
     * Create a SalesProductInstance with an IRI.
     *
     * @param iri the IRI.
     * @return a SalesProductInstance instance.
     */
    public static SalesProductInstance createSalesProductInstance(final IRI iri) {
        return new SalesProductInstanceImpl(iri);
    }

    /**
     * Create a SalesProductVersion with an IRI.
     *
     * @param iri the IRI.
     * @return a SalesProductVersion instance.
     */
    public static SalesProductVersion createSalesProductVersion(final IRI iri) {
        return new SalesProductVersionImpl(iri);
    }

    /**
     * Create a Sign with an IRI.
     *
     * @param iri the IRI.
     * @return a Sign instance.
     */
    public static Sign createSign(final IRI iri) {
        return new SignImpl(iri);
    }

    /**
     * Create a SociallyConstructedActivity with an IRI.
     *
     * @param iri the IRI.
     * @return a SociallyConstructedActivity instance.
     */
    public static SociallyConstructedActivity createSociallyConstructedActivity(final IRI iri) {
        return new SociallyConstructedActivityImpl(iri);
    }

    /**
     * Create a SociallyConstructedObject with an IRI.
     *
     * @param iri the IRI.
     * @return a SociallyConstructedObject instance.
     */
    public static SociallyConstructedObject createSociallyConstructedObject(final IRI iri) {
        return new SociallyConstructedObjectImpl(iri);
    }

    /**
     * Create a SpatioTemporalExtent with an IRI.
     *
     * @param iri the IRI.
     * @return a SpatioTemporalExtent instance.
     */
    public static SpatioTemporalExtent createSpatioTemporalExtent(final IRI iri) {
        return new SpatioTemporalExtentImpl(iri);
    }

    /**
     * Create a State with an IRI.
     *
     * @param iri the IRI.
     * @return a State instance.
     */
    public static State createState(final IRI iri) {
        return new StateImpl(iri);
    }

    /**
     * Create a StateOfActivity with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfActivity instance.
     */
    public static StateOfActivity createStateOfActivity(final IRI iri) {
        return new StateOfActivityImpl(iri);
    }

    /**
     * Create a StateOfAmountOfMoney with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfAmountOfMoney instance.
     */
    public static StateOfAmountOfMoney createStateOfAmountOfMoney(final IRI iri) {
        return new StateOfAmountOfMoneyImpl(iri);
    }

    /**
     * Create a StateOfAssociation with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfAssociation instance.
     */
    public static StateOfAssociation createStateOfAssociation(final IRI iri) {
        return new StateOfAssociationImpl(iri);
    }

    /**
     * Create a StateOfBiologicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfBiologicalObject instance.
     */
    public static StateOfBiologicalObject createStateOfBiologicalObject(final IRI iri) {
        return new StateOfBiologicalObjectImpl(iri);
    }

    /**
     * Create a StateOfBiologicalSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfBiologicalSystem instance.
     */
    public static StateOfBiologicalSystem createStateOfBiologicalSystem(final IRI iri) {
        return new StateOfBiologicalSystemImpl(iri);
    }

    /**
     * Create a StateOfBiologicalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfBiologicalSystemComponent instance.
     */
    public static StateOfBiologicalSystemComponent 
            createStateOfBiologicalSystemComponent(final IRI iri) {
        return new StateOfBiologicalSystemComponentImpl(iri);
    }

    /**
     * Create a StateOfFunctionalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfFunctionalObject instance.
     */
    public static StateOfFunctionalObject createStateOfFunctionalObject(final IRI iri) {
        return new StateOfFunctionalObjectImpl(iri);
    }

    /**
     * Create a StateOfFunctionalSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfFunctionalSystem instance.
     */
    public static StateOfFunctionalSystem createStateOfFunctionalSystem(final IRI iri) {
        return new StateOfFunctionalSystemImpl(iri);
    }

    /**
     * Create a StateOfFunctionalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfFunctionalSystemComponent instance.
     */
    public static StateOfFunctionalSystemComponent 
            createStateOfFunctionalSystemComponent(final IRI iri) {
        return new StateOfFunctionalSystemComponentImpl(iri);
    }

    /**
     * Create a StateOfIntentionallyConstructedObject with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfIntentionallyConstructedObject instance.
     */
    public static StateOfIntentionallyConstructedObject 
            createStateOfIntentionallyConstructedObject(final IRI iri) {
        return new StateOfIntentionallyConstructedObjectImpl(iri);
    }

    /**
     * Create a StateOfLanguageCommunity with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfLanguageCommunity instance.
     */
    public static StateOfLanguageCommunity createStateOfLanguageCommunity(final IRI iri) {
        return new StateOfLanguageCommunityImpl(iri);
    }

    /**
     * Create a StateOfOrdinaryBiologicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfOrdinaryBiologicalObject instance.
     */
    public static StateOfOrdinaryBiologicalObject 
            createStateOfOrdinaryBiologicalObject(final IRI iri) {
        return new StateOfOrdinaryBiologicalObjectImpl(iri);
    }

    /**
     * Create a StateOfOrdinaryFunctionalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfOrdinaryFunctionalObject instance.
     */
    public static StateOfOrdinaryFunctionalObject 
            createStateOfOrdinaryFunctionalObject(final IRI iri) {
        return new StateOfOrdinaryFunctionalObjectImpl(iri);
    }

    /**
     * Create a StateOfOrdinaryPhysicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfOrdinaryPhysicalObject instance.
     */
    public static StateOfOrdinaryPhysicalObject createStateOfOrdinaryPhysicalObject(final IRI iri) {
        return new StateOfOrdinaryPhysicalObjectImpl(iri);
    }

    /**
     * Create a StateOfOrganization with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfOrganization instance.
     */
    public static StateOfOrganization createStateOfOrganization(final IRI iri) {
        return new StateOfOrganizationImpl(iri);
    }

    /**
     * Create a StateOfOrganizationComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfOrganizationComponent instance.
     */
    public static StateOfOrganizationComponent createStateOfOrganizationComponent(final IRI iri) {
        return new StateOfOrganizationComponentImpl(iri);
    }

    /**
     * Create a StateOfParty with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfParty instance.
     */
    public static StateOfParty createStateOfParty(final IRI iri) {
        return new StateOfPartyImpl(iri);
    }

    /**
     * Create a StateOfPerson with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfPerson instance.
     */
    public static StateOfPerson createStateOfPerson(final IRI iri) {
        return new StateOfPersonImpl(iri);
    }

    /**
     * Create a StateOfPhysicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfPhysicalObject instance.
     */
    public static StateOfPhysicalObject createStateOfPhysicalObject(final IRI iri) {
        return new StateOfPhysicalObjectImpl(iri);
    }

    /**
     * Create a StateOfPosition with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfPosition instance.
     */
    public static StateOfPosition createStateOfPosition(final IRI iri) {
        return new StateOfPositionImpl(iri);
    }

    /**
     * Create a StateOfSalesProductInstance with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfSalesProductInstance instance.
     */
    public static StateOfSalesProductInstance createStateOfSalesProductInstance(final IRI iri) {
        return new StateOfSalesProductInstanceImpl(iri);
    }

    /**
     * Create a StateOfSign with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfSign instance.
     */
    public static StateOfSign createStateOfSign(final IRI iri) {
        return new StateOfSignImpl(iri);
    }

    /**
     * Create a StateOfSociallyConstructedActivity with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfSociallyConstructedActivity instance.
     */
    public static StateOfSociallyConstructedActivity 
            createStateOfSociallyConstructedActivity(final IRI iri) {
        return new StateOfSociallyConstructedActivityImpl(iri);
    }

    /**
     * Create a StateOfSociallyConstructedObject with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfSociallyConstructedObject instance.
     */
    public static StateOfSociallyConstructedObject 
            createStateOfSociallyConstructedObject(final IRI iri) {
        return new StateOfSociallyConstructedObjectImpl(iri);
    }

    /**
     * Create a StateOfSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfSystem instance.
     */
    public static StateOfSystem createStateOfSystem(final IRI iri) {
        return new StateOfSystemImpl(iri);
    }

    /**
     * Create a StateOfSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a StateOfSystemComponent instance.
     */
    public static StateOfSystemComponent createStateOfSystemComponent(final IRI iri) {
        return new StateOfSystemComponentImpl(iri);
    }

    /**
     * Create a System with an IRI.
     *
     * @param iri the IRI.
     * @return a System instance.
     */
    public static uk.gov.gchq.hqdm.model.System createSystem(final IRI iri) {
        return new SystemImpl(iri);
    }

    /**
     * Create a SystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a SystemComponent instance.
     */
    public static SystemComponent createSystemComponent(final IRI iri) {
        return new SystemComponentImpl(iri);
    }

    /**
     * Create a Thing with an IRI.
     *
     * @param iri the IRI.
     * @return a Thing instance.
     */
    public static Thing createThing(final IRI iri) {
        return new ThingImpl(iri);
    }

    /**
     * Create a TransferOfOwnership with an IRI.
     *
     * @param iri the IRI.
     * @return a TransferOfOwnership instance.
     */
    public static TransferOfOwnership createTransferOfOwnership(final IRI iri) {
        return new TransferOfOwnershipImpl(iri);
    }

    /**
     * Create a TransferOfOwnershipOfMoney with an IRI.
     *
     * @param iri the IRI.
     * @return a TransferOfOwnershipOfMoney instance.
     */
    public static TransferOfOwnershipOfMoney createTransferOfOwnershipOfMoney(final IRI iri) {
        return new TransferOfOwnershipOfMoneyImpl(iri);
    }

    /**
     * Create a Transferee with an IRI.
     *
     * @param iri the IRI.
     * @return a Transferee instance.
     */
    public static Transferee createTransferee(final IRI iri) {
        return new TransfereeImpl(iri);
    }

    /**
     * Create a Transferor with an IRI.
     *
     * @param iri the IRI.
     * @return a Transferor instance.
     */
    public static Transferor createTransferor(final IRI iri) {
        return new TransferorImpl(iri);
    }

}
