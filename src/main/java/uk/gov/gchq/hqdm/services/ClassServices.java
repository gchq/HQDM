package uk.gov.gchq.hqdm.services;

import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.*;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.impl.*;

/**
 * Services related to HQDM Classes.
 *
 * */
public class ClassServices {
    /**
     * Create a Class with an IRI.
     *
     * @param iri the IRI.
     * @return a Class instance.
     */
    public static Class createClass(final IRI iri) {
        return new ClassImpl(iri);
    }

    /**
     * Create a ClassOfAbstractObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfAbstractObject instance.
     */
    public static ClassOfAbstractObject createClassOfAbstractObject(final IRI iri) {
        return new ClassOfAbstractObjectImpl(iri);
    }

    /**
     * Create a ClassOfActivity with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfActivity instance.
     */
    public static ClassOfActivity createClassOfActivity(final IRI iri) {
        return new ClassOfActivityImpl(iri);
    }

    /**
     * Create a ClassOfAgreeContract with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfAgreeContract instance.
     */
    public static ClassOfAgreeContract createClassOfAgreeContract(final IRI iri) {
        return new ClassOfAgreeContractImpl(iri);
    }

    /**
     * Create a ClassOfAgreementExecution with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfAgreementExecution instance.
     */
    public static ClassOfAgreementExecution createClassOfAgreementExecution(final IRI iri) {
        return new ClassOfAgreementExecutionImpl(iri);
    }

    /**
     * Create a ClassOfAgreementProcess with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfAgreementProcess instance.
     */
    public static ClassOfAgreementProcess createClassOfAgreementProcess(final IRI iri) {
        return new ClassOfAgreementProcessImpl(iri);
    }

    /**
     * Create a ClassOfAmountOfMoney with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfAmountOfMoney instance.
     */
    public static ClassOfAmountOfMoney createClassOfAmountOfMoney(final IRI iri) {
        return new ClassOfAmountOfMoneyImpl(iri);
    }

    /**
     * Create a ClassOfAssociation with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfAssociation instance.
     */
    public static ClassOfAssociation createClassOfAssociation(final IRI iri) {
        return new ClassOfAssociationImpl(iri);
    }

    /**
     * Create a ClassOfBiologicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfBiologicalObject instance.
     */
    public static ClassOfBiologicalObject createClassOfBiologicalObject(final IRI iri) {
        return new ClassOfBiologicalObjectImpl(iri);
    }

    /**
     * Create a ClassOfBiologicalSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfBiologicalSystem instance.
     */
    public static ClassOfBiologicalSystem createClassOfBiologicalSystem(final IRI iri) {
        return new ClassOfBiologicalSystemImpl(iri);
    }

    /**
     * Create a ClassOfBiologicalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfBiologicalSystemComponent instance.
     */
    public static ClassOfBiologicalSystemComponent 
            createClassOfBiologicalSystemComponent(final IRI iri) {
        return new ClassOfBiologicalSystemComponentImpl(iri);
    }

    /**
     * Create a ClassOfClass with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfClass instance.
     */
    public static ClassOfClass createClassOfClass(final IRI iri) {
        return new ClassOfClassImpl(iri);
    }

    /**
     * Create a ClassOfClassOfSpatioTemporalExtent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfClassOfSpatioTemporalExtent instance.
     */
    public static ClassOfClassOfSpatioTemporalExtent 
            createClassOfClassOfSpatioTemporalExtent(final IRI iri) {
        return new ClassOfClassOfSpatioTemporalExtentImpl(iri);
    }

    /**
     * Create a ClassOfContractExecution with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfContractExecution instance.
     */
    public static ClassOfContractExecution createClassOfContractExecution(final IRI iri) {
        return new ClassOfContractExecutionImpl(iri);
    }

    /**
     * Create a ClassOfContractProcess with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfContractProcess instance.
     */
    public static ClassOfContractProcess createClassOfContractProcess(final IRI iri) {
        return new ClassOfContractProcessImpl(iri);
    }

    /**
     * Create a ClassOfEvent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfEvent instance.
     */
    public static ClassOfEvent createClassOfEvent(final IRI iri) {
        return new ClassOfEventImpl(iri);
    }

    /**
     * Create a ClassOfFunctionalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfFunctionalObject instance.
     */
    public static ClassOfFunctionalObject createClassOfFunctionalObject(final IRI iri) {
        return new ClassOfFunctionalObjectImpl(iri);
    }

    /**
     * Create a ClassOfFunctionalSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfFunctionalSystem instance.
     */
    public static ClassOfFunctionalSystem createClassOfFunctionalSystem(final IRI iri) {
        return new ClassOfFunctionalSystemImpl(iri);
    }

    /**
     * Create a ClassOfFunctionalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfFunctionalSystemComponent instance.
     */
    public static ClassOfFunctionalSystemComponent 
            createClassOfFunctionalSystemComponent(final IRI iri) {
        return new ClassOfFunctionalSystemComponentImpl(iri);
    }

    /**
     * Create a ClassOfInPlaceBiologicalComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfInPlaceBiologicalComponent instance.
     */
    public static ClassOfInPlaceBiologicalComponent 
            createClassOfInPlaceBiologicalComponent(final IRI iri) {
        return new ClassOfInPlaceBiologicalComponentImpl(iri);
    }

    /**
     * Create a ClassOfIndividual with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfIndividual instance.
     */
    public static ClassOfIndividual createClassOfIndividual(final IRI iri) {
        return new ClassOfIndividualImpl(iri);
    }

    /**
     * Create a ClassOfInstalledFunctionalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfInstalledFunctionalSystemComponent instance.
     */
    public static ClassOfInstalledFunctionalSystemComponent 
            createClassOfInstalledFunctionalSystemComponent(final IRI iri) {
        return new ClassOfInstalledFunctionalSystemComponentImpl(iri);
    }

    /**
     * Create a ClassOfInstalledObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfInstalledObject instance.
     */
    public static ClassOfInstalledObject createClassOfInstalledObject(final IRI iri) {
        return new ClassOfInstalledObjectImpl(iri);
    }

    /**
     * Create a ClassOfIntentionallyConstructedObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfIntentionallyConstructedObject instance.
     */
    public static ClassOfIntentionallyConstructedObject 
            createClassOfIntentionallyConstructedObject(final IRI iri) {
        return new ClassOfIntentionallyConstructedObjectImpl(iri);
    }

    /**
     * Create a ClassOfOffer with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfOffer instance.
     */
    public static ClassOfOffer createClassOfOffer(final IRI iri) {
        return new ClassOfOfferImpl(iri);
    }

    /**
     * Create a ClassOfOrdinaryBiologicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfOrdinaryBiologicalObject instance.
     */
    public static ClassOfOrdinaryBiologicalObject 
            createClassOfOrdinaryBiologicalObject(final IRI iri) {
        return new ClassOfOrdinaryBiologicalObjectImpl(iri);
    }

    /**
     * Create a ClassOfOrdinaryFunctionalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfOrdinaryFunctionalObject instance.
     */
    public static ClassOfOrdinaryFunctionalObject 
            createClassOfOrdinaryFunctionalObject(final IRI iri) {
        return new ClassOfOrdinaryFunctionalObjectImpl(iri);
    }

    /**
     * Create a ClassOfOrdinaryPhysicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfOrdinaryPhysicalObject instance.
     */
    public static ClassOfOrdinaryPhysicalObject 
            createClassOfOrdinaryPhysicalObject(final IRI iri) {
        return new ClassOfOrdinaryPhysicalObjectImpl(iri);
    }

    /**
     * Create a ClassOfOrganization with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfOrganization instance.
     */
    public static ClassOfOrganization createClassOfOrganization(final IRI iri) {
        return new ClassOfOrganizationImpl(iri);
    }

    /**
     * Create a ClassOfOrganizationComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfOrganizationComponent instance.
     */
    public static ClassOfOrganizationComponent createClassOfOrganizationComponent(final IRI iri) {
        return new ClassOfOrganizationComponentImpl(iri);
    }

    /**
     * Create a ClassOfParticipant with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfParticipant instance.
     */
    public static ClassOfParticipant createClassOfParticipant(final IRI iri) {
        return new ClassOfParticipantImpl(iri);
    }

    /**
     * Create a ClassOfParty with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfParty instance.
     */
    public static ClassOfParty createClassOfParty(final IRI iri) {
        return new ClassOfPartyImpl(iri);
    }

    /**
     * Create a ClassOfPeriodOfTime with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfPeriodOfTime instance.
     */
    public static ClassOfPeriodOfTime createClassOfPeriodOfTime(final IRI iri) {
        return new ClassOfPeriodOfTimeImpl(iri);
    }

    /**
     * Create a ClassOfPerson with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfPerson instance.
     */
    public static ClassOfPerson createClassOfPerson(final IRI iri) {
        return new ClassOfPersonImpl(iri);
    }

    /**
     * Create a ClassOfPersonInPosition with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfPersonInPosition instance.
     */
    public static ClassOfPersonInPosition createClassOfPersonInPosition(final IRI iri) {
        return new ClassOfPersonInPositionImpl(iri);
    }

    /**
     * Create a ClassOfPhysicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfPhysicalObject instance.
     */
    public static ClassOfPhysicalObject createClassOfPhysicalObject(final IRI iri) {
        return new ClassOfPhysicalObjectImpl(iri);
    }

    /**
     * Create a ClassOfPhysicalProperty with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfPhysicalProperty instance.
     */
    public static ClassOfPhysicalProperty createClassOfPhysicalProperty(final IRI iri) {
        return new ClassOfPhysicalPropertyImpl(iri);
    }

    /**
     * Create a ClassOfPhysicalQuantity with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfPhysicalQuantity instance.
     */
    public static ClassOfPhysicalQuantity createClassOfPhysicalQuantity(final IRI iri) {
        return new ClassOfPhysicalQuantityImpl(iri);
    }

    /**
     * Create a ClassOfPointInTime with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfPointInTime instance.
     */
    public static ClassOfPointInTime createClassOfPointInTime(final IRI iri) {
        return new ClassOfPointInTimeImpl(iri);
    }

    /**
     * Create a ClassOfPosition with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfPosition instance.
     */
    public static ClassOfPosition createClassOfPosition(final IRI iri) {
        return new ClassOfPositionImpl(iri);
    }

    /**
     * Create a ClassOfPossibleWorld with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfPossibleWorld instance.
     */
    public static ClassOfPossibleWorld createClassOfPossibleWorld(final IRI iri) {
        return new ClassOfPossibleWorldImpl(iri);
    }

    /**
     * Create a ClassOfReachingAgreement with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfReachingAgreement instance.
     */
    public static ClassOfReachingAgreement createClassOfReachingAgreement(final IRI iri) {
        return new ClassOfReachingAgreementImpl(iri);
    }

    /**
     * Create a ClassOfRelationship with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfRelationship instance.
     */
    public static ClassOfRelationship createClassOfRelationship(final IRI iri) {
        return new ClassOfRelationshipImpl(iri);
    }

    /**
     * Create a ClassOfRepresentation with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfRepresentation instance.
     */
    public static ClassOfRepresentation createClassOfRepresentation(final IRI iri) {
        return new ClassOfRepresentationImpl(iri);
    }

    /**
     * Create a ClassOfSalesProductInstance with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfSalesProductInstance instance.
     */
    public static ClassOfSalesProductInstance createClassOfSalesProductInstance(final IRI iri) {
        return new ClassOfSalesProductInstanceImpl(iri);
    }

    /**
     * Create a ClassOfSign with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfSign instance.
     */
    public static ClassOfSign createClassOfSign(final IRI iri) {
        return new ClassOfSignImpl(iri);
    }

    /**
     * Create a ClassOfSociallyConstructedActivity with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfSociallyConstructedActivity instance.
     */
    public static ClassOfSociallyConstructedActivity 
            createClassOfSociallyConstructedActivity(final IRI iri) {
        return new ClassOfSociallyConstructedActivityImpl(iri);
    }

    /**
     * Create a ClassOfSociallyConstructedObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfSociallyConstructedObject instance.
     */
    public static ClassOfSociallyConstructedObject 
            createClassOfSociallyConstructedObject(final IRI iri) {
        return new ClassOfSociallyConstructedObjectImpl(iri);
    }

    /**
     * Create a ClassOfSpatioTemporalExtent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfSpatioTemporalExtent instance.
     */
    public static ClassOfSpatioTemporalExtent 
            createClassOfSpatioTemporalExtent(final IRI iri) {
        return new ClassOfSpatioTemporalExtentImpl(iri);
    }

    /**
     * Create a ClassOfState with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfState instance.
     */
    public static ClassOfState createClassOfState(final IRI iri) {
        return new ClassOfStateImpl(iri);
    }

    /**
     * Create a ClassOfStateOfActivity with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfActivity instance.
     */
    public static ClassOfStateOfActivity createClassOfStateOfActivity(final IRI iri) {
        return new ClassOfStateOfActivityImpl(iri);
    }

    /**
     * Create a ClassOfStateOfAmountOfMoney with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfAmountOfMoney instance.
     */
    public static ClassOfStateOfAmountOfMoney createClassOfStateOfAmountOfMoney(final IRI iri) {
        return new ClassOfStateOfAmountOfMoneyImpl(iri);
    }

    /**
     * Create a ClassOfStateOfAssociation with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfAssociation instance.
     */
    public static ClassOfStateOfAssociation createClassOfStateOfAssociation(final IRI iri) {
        return new ClassOfStateOfAssociationImpl(iri);
    }

    /**
     * Create a ClassOfStateOfBiologicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfBiologicalObject instance.
     */
    public static ClassOfStateOfBiologicalObject 
            createClassOfStateOfBiologicalObject(final IRI iri) {
        return new ClassOfStateOfBiologicalObjectImpl(iri);
    }

    /**
     * Create a ClassOfStateOfBiologicalSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfBiologicalSystem instance.
     */
    public static ClassOfStateOfBiologicalSystem 
            createClassOfStateOfBiologicalSystem(final IRI iri) {
        return new ClassOfStateOfBiologicalSystemImpl(iri);
    }

    /**
     * Create a ClassOfStateOfBiologicalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfBiologicalSystemComponent instance.
     */
    public static ClassOfStateOfBiologicalSystemComponent 
            createClassOfStateOfBiologicalSystemComponent(final IRI iri) {
        return new ClassOfStateOfBiologicalSystemComponentImpl(iri);
    }

    /**
     * Create a ClassOfStateOfFunctionalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfFunctionalObject instance.
     */
    public static ClassOfStateOfFunctionalObject 
            createClassOfStateOfFunctionalObject(final IRI iri) {
        return new ClassOfStateOfFunctionalObjectImpl(iri);
    }

    /**
     * Create a ClassOfStateOfFunctionalSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfFunctionalSystem instance.
     */
    public static ClassOfStateOfFunctionalSystem 
            createClassOfStateOfFunctionalSystem(final IRI iri) {
        return new ClassOfStateOfFunctionalSystemImpl(iri);
    }

    /**
     * Create a ClassOfStateOfFunctionalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfFunctionalSystemComponent instance.
     */
    public static ClassOfStateOfFunctionalSystemComponent 
            createClassOfStateOfFunctionalSystemComponent(final IRI iri) {
        return new ClassOfStateOfFunctionalSystemComponentImpl(iri);
    }

    /**
     * Create a ClassOfStateOfIntentionallyConstructedObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfIntentionallyConstructedObject instance.
     */
    public static ClassOfStateOfIntentionallyConstructedObject 
            createClassOfStateOfIntentionallyConstructedObject(final IRI iri) {
        return new ClassOfStateOfIntentionallyConstructedObjectImpl(iri);
    }

    /**
     * Create a ClassOfStateOfOrdinaryBiologicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfOrdinaryBiologicalObject instance.
     */
    public static ClassOfStateOfOrdinaryBiologicalObject 
            createClassOfStateOfOrdinaryBiologicalObject(final IRI iri) {
        return new ClassOfStateOfOrdinaryBiologicalObjectImpl(iri);
    }

    /**
     * Create a ClassOfStateOfOrdinaryFunctionalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfOrdinaryFunctionalObject instance.
     */
    public static ClassOfStateOfOrdinaryFunctionalObject 
            createClassOfStateOfOrdinaryFunctionalObject(final IRI iri) {
        return new ClassOfStateOfOrdinaryFunctionalObjectImpl(iri);
    }

    /**
     * Create a ClassOfStateOfOrdinaryPhysicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfOrdinaryPhysicalObject instance.
     */
    public static ClassOfStateOfOrdinaryPhysicalObject 
            createClassOfStateOfOrdinaryPhysicalObject(final IRI iri) {
        return new ClassOfStateOfOrdinaryPhysicalObjectImpl(iri);
    }

    /**
     * Create a ClassOfStateOfOrganization with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfOrganization instance.
     */
    public static ClassOfStateOfOrganization 
            createClassOfStateOfOrganization(final IRI iri) {
        return new ClassOfStateOfOrganizationImpl(iri);
    }

    /**
     * Create a ClassOfStateOfOrganizationComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfOrganizationComponent instance.
     */
    public static ClassOfStateOfOrganizationComponent 
            createClassOfStateOfOrganizationComponent(final IRI iri) {
        return new ClassOfStateOfOrganizationComponentImpl(iri);
    }

    /**
     * Create a ClassOfStateOfParty with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfParty instance.
     */
    public static ClassOfStateOfParty createClassOfStateOfParty(final IRI iri) {
        return new ClassOfStateOfPartyImpl(iri);
    }

    /**
     * Create a ClassOfStateOfPerson with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfPerson instance.
     */
    public static ClassOfStateOfPerson createClassOfStateOfPerson(final IRI iri) {
        return new ClassOfStateOfPersonImpl(iri);
    }

    /**
     * Create a ClassOfStateOfPhysicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfPhysicalObject instance.
     */
    public static ClassOfStateOfPhysicalObject createClassOfStateOfPhysicalObject(final IRI iri) {
        return new ClassOfStateOfPhysicalObjectImpl(iri);
    }

    /**
     * Create a ClassOfStateOfPosition with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfPosition instance.
     */
    public static ClassOfStateOfPosition createClassOfStateOfPosition(final IRI iri) {
        return new ClassOfStateOfPositionImpl(iri);
    }

    /**
     * Create a ClassOfStateOfSalesProductInstance with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfSalesProductInstance instance.
     */
    public static ClassOfStateOfSalesProductInstance 
            createClassOfStateOfSalesProductInstance(final IRI iri) {
        return new ClassOfStateOfSalesProductInstanceImpl(iri);
    }

    /**
     * Create a ClassOfStateOfSign with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfSign instance.
     */
    public static ClassOfStateOfSign createClassOfStateOfSign(final IRI iri) {
        return new ClassOfStateOfSignImpl(iri);
    }

    /**
     * Create a ClassOfStateOfSociallyConstructedActivity with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfSociallyConstructedActivity instance.
     */
    public static ClassOfStateOfSociallyConstructedActivity 
            createClassOfStateOfSociallyConstructedActivity(final IRI iri) {
        return new ClassOfStateOfSociallyConstructedActivityImpl(iri);
    }

    /**
     * Create a ClassOfStateOfSociallyConstructedObject with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfSociallyConstructedObject instance.
     */
    public static ClassOfStateOfSociallyConstructedObject 
            createClassOfStateOfSociallyConstructedObject(final IRI iri) {
        return new ClassOfStateOfSociallyConstructedObjectImpl(iri);
    }

    /**
     * Create a ClassOfStateOfSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfSystem instance.
     */
    public static ClassOfStateOfSystem createClassOfStateOfSystem(final IRI iri) {
        return new ClassOfStateOfSystemImpl(iri);
    }

    /**
     * Create a ClassOfStateOfSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfStateOfSystemComponent instance.
     */
    public static ClassOfStateOfSystemComponent createClassOfStateOfSystemComponent(final IRI iri) {
        return new ClassOfStateOfSystemComponentImpl(iri);
    }

    /**
     * Create a ClassOfSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfSystem instance.
     */
    public static ClassOfSystem createClassOfSystem(final IRI iri) {
        return new ClassOfSystemImpl(iri);
    }

    /**
     * Create a ClassOfSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a ClassOfSystemComponent instance.
     */
    public static ClassOfSystemComponent createClassOfSystemComponent(final IRI iri) {
        return new ClassOfSystemComponentImpl(iri);
    }

    /**
     * Create a Classification with an IRI.
     *
     * @param iri the IRI.
     * @return a Classification instance.
     */
    public static Classification createClassification(final IRI iri) {
        return new ClassificationImpl(iri);
    }

    /**
     * Create a KindOfActivity with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfActivity instance.
     */
    public static KindOfActivity createKindOfActivity(final IRI iri) {
        return new KindOfActivityImpl(iri);
    }

    /**
     * Create a KindOfAssociation with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfAssociation instance.
     */
    public static KindOfAssociation createKindOfAssociation(final IRI iri) {
        return new KindOfAssociationImpl(iri);
    }

    /**
     * Create a KindOfBiologicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfBiologicalObject instance.
     */
    public static KindOfBiologicalObject createKindOfBiologicalObject(final IRI iri) {
        return new KindOfBiologicalObjectImpl(iri);
    }

    /**
     * Create a KindOfBiologicalSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfBiologicalSystem instance.
     */
    public static KindOfBiologicalSystem createKindOfBiologicalSystem(final IRI iri) {
        return new KindOfBiologicalSystemImpl(iri);
    }

    /**
     * Create a KindOfBiologicalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfBiologicalSystemComponent instance.
     */
    public static KindOfBiologicalSystemComponent 
            createKindOfBiologicalSystemComponent(final IRI iri) {
        return new KindOfBiologicalSystemComponentImpl(iri);
    }

    /**
     * Create a KindOfFunctionalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfFunctionalObject instance.
     */
    public static KindOfFunctionalObject createKindOfFunctionalObject(final IRI iri) {
        return new KindOfFunctionalObjectImpl(iri);
    }

    /**
     * Create a KindOfFunctionalSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfFunctionalSystem instance.
     */
    public static KindOfFunctionalSystem createKindOfFunctionalSystem(final IRI iri) {
        return new KindOfFunctionalSystemImpl(iri);
    }

    /**
     * Create a KindOfFunctionalSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfFunctionalSystemComponent instance.
     */
    public static KindOfFunctionalSystemComponent 
            createKindOfFunctionalSystemComponent(final IRI iri) {
        return new KindOfFunctionalSystemComponentImpl(iri);
    }

    /**
     * Create a KindOfIndividual with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfIndividual instance.
     */
    public static KindOfIndividual createKindOfIndividual(final IRI iri) {
        return new KindOfIndividualImpl(iri);
    }

    /**
     * Create a KindOfIntentionallyConstructedObject with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfIntentionallyConstructedObject instance.
     */
    public static KindOfIntentionallyConstructedObject 
            createKindOfIntentionallyConstructedObject(final IRI iri) {
        return new KindOfIntentionallyConstructedObjectImpl(iri);
    }

    /**
     * Create a KindOfOrdinaryBiologicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfOrdinaryBiologicalObject instance.
     */
    public static KindOfOrdinaryBiologicalObject 
            createKindOfOrdinaryBiologicalObject(final IRI iri) {
        return new KindOfOrdinaryBiologicalObjectImpl(iri);
    }

    /**
     * Create a KindOfOrdinaryFunctionalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfOrdinaryFunctionalObject instance.
     */
    public static KindOfOrdinaryFunctionalObject 
            createKindOfOrdinaryFunctionalObject(final IRI iri) {
        return new KindOfOrdinaryFunctionalObjectImpl(iri);
    }

    /**
     * Create a KindOfOrdinaryPhysicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfOrdinaryPhysicalObject instance.
     */
    public static KindOfOrdinaryPhysicalObject 
            createKindOfOrdinaryPhysicalObject(final IRI iri) {
        return new KindOfOrdinaryPhysicalObjectImpl(iri);
    }

    /**
     * Create a KindOfOrganization with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfOrganization instance.
     */
    public static KindOfOrganization createKindOfOrganization(final IRI iri) {
        return new KindOfOrganizationImpl(iri);
    }

    /**
     * Create a KindOfOrganizationComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfOrganizationComponent instance.
     */
    public static KindOfOrganizationComponent 
            createKindOfOrganizationComponent(final IRI iri) {
        return new KindOfOrganizationComponentImpl(iri);
    }

    /**
     * Create a KindOfParty with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfParty instance.
     */
    public static KindOfParty createKindOfParty(final IRI iri) {
        return new KindOfPartyImpl(iri);
    }

    /**
     * Create a KindOfPerson with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfPerson instance.
     */
    public static KindOfPerson createKindOfPerson(final IRI iri) {
        return new KindOfPersonImpl(iri);
    }

    /**
     * Create a KindOfPhysicalObject with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfPhysicalObject instance.
     */
    public static KindOfPhysicalObject createKindOfPhysicalObject(final IRI iri) {
        return new KindOfPhysicalObjectImpl(iri);
    }

    /**
     * Create a KindOfPhysicalProperty with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfPhysicalProperty instance.
     */
    public static KindOfPhysicalProperty createKindOfPhysicalProperty(final IRI iri) {
        return new KindOfPhysicalPropertyImpl(iri);
    }

    /**
     * Create a KindOfPhysicalQuantity with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfPhysicalQuantity instance.
     */
    public static KindOfPhysicalQuantity createKindOfPhysicalQuantity(final IRI iri) {
        return new KindOfPhysicalQuantityImpl(iri);
    }

    /**
     * Create a KindOfPosition with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfPosition instance.
     */
    public static KindOfPosition createKindOfPosition(final IRI iri) {
        return new KindOfPositionImpl(iri);
    }

    /**
     * Create a KindOfRelationshipWithRestriction with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfRelationshipWithRestriction instance.
     */
    public static KindOfRelationshipWithRestriction 
            createKindOfRelationshipWithRestriction(final IRI iri) {
        return new KindOfRelationshipWithRestrictionImpl(iri);
    }

    /**
     * Create a KindOfRelationshipWithSignature with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfRelationshipWithSignature instance.
     */
    public static KindOfRelationshipWithSignature 
            createKindOfRelationshipWithSignature(final IRI iri) {
        return new KindOfRelationshipWithSignatureImpl(iri);
    }

    /**
     * Create a KindOfSociallyConstructedObject with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfSociallyConstructedObject instance.
     */
    public static KindOfSociallyConstructedObject 
            createKindOfSociallyConstructedObject(final IRI iri) {
        return new KindOfSociallyConstructedObjectImpl(iri);
    }

    /**
     * Create a KindOfSystem with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfSystem instance.
     */
    public static KindOfSystem createKindOfSystem(final IRI iri) {
        return new KindOfSystemImpl(iri);
    }

    /**
     * Create a KindOfSystemComponent with an IRI.
     *
     * @param iri the IRI.
     * @return a KindOfSystemComponent instance.
     */
    public static KindOfSystemComponent createKindOfSystemComponent(final IRI iri) {
        return new KindOfSystemComponentImpl(iri);
    }

    /**
     * Create a Role with an IRI.
     *
     * @param iri the IRI.
     * @return a Role instance.
     */
    public static Role createRole(final IRI iri) {
        return new RoleImpl(iri);
    }

}
