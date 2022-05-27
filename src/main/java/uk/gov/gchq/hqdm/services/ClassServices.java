package uk.gov.gchq.hqdm.services;

import uk.gov.gchq.hqdm.iri.IRI;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfAbstractObject;
import uk.gov.gchq.hqdm.model.ClassOfActivity;
import uk.gov.gchq.hqdm.model.ClassOfAgreeContract;
import uk.gov.gchq.hqdm.model.ClassOfAgreementExecution;
import uk.gov.gchq.hqdm.model.ClassOfAgreementProcess;
import uk.gov.gchq.hqdm.model.ClassOfAmountOfMoney;
import uk.gov.gchq.hqdm.model.ClassOfAssociation;
import uk.gov.gchq.hqdm.model.ClassOfBiologicalObject;
import uk.gov.gchq.hqdm.model.ClassOfBiologicalSystem;
import uk.gov.gchq.hqdm.model.ClassOfBiologicalSystemComponent;
import uk.gov.gchq.hqdm.model.ClassOfClass;
import uk.gov.gchq.hqdm.model.ClassOfClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfContractExecution;
import uk.gov.gchq.hqdm.model.ClassOfContractProcess;
import uk.gov.gchq.hqdm.model.ClassOfEvent;
import uk.gov.gchq.hqdm.model.ClassOfFunctionalObject;
import uk.gov.gchq.hqdm.model.ClassOfFunctionalSystem;
import uk.gov.gchq.hqdm.model.ClassOfFunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.ClassOfInPlaceBiologicalComponent;
import uk.gov.gchq.hqdm.model.ClassOfIndividual;
import uk.gov.gchq.hqdm.model.ClassOfInstalledFunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.ClassOfInstalledObject;
import uk.gov.gchq.hqdm.model.ClassOfIntentionallyConstructedObject;
import uk.gov.gchq.hqdm.model.ClassOfOffer;
import uk.gov.gchq.hqdm.model.ClassOfOrdinaryBiologicalObject;
import uk.gov.gchq.hqdm.model.ClassOfOrdinaryFunctionalObject;
import uk.gov.gchq.hqdm.model.ClassOfOrdinaryPhysicalObject;
import uk.gov.gchq.hqdm.model.ClassOfOrganization;
import uk.gov.gchq.hqdm.model.ClassOfOrganizationComponent;
import uk.gov.gchq.hqdm.model.ClassOfParticipant;
import uk.gov.gchq.hqdm.model.ClassOfParty;
import uk.gov.gchq.hqdm.model.ClassOfPeriodOfTime;
import uk.gov.gchq.hqdm.model.ClassOfPerson;
import uk.gov.gchq.hqdm.model.ClassOfPersonInPosition;
import uk.gov.gchq.hqdm.model.ClassOfPhysicalObject;
import uk.gov.gchq.hqdm.model.ClassOfPhysicalProperty;
import uk.gov.gchq.hqdm.model.ClassOfPhysicalQuantity;
import uk.gov.gchq.hqdm.model.ClassOfPointInTime;
import uk.gov.gchq.hqdm.model.ClassOfPosition;
import uk.gov.gchq.hqdm.model.ClassOfPossibleWorld;
import uk.gov.gchq.hqdm.model.ClassOfReachingAgreement;
import uk.gov.gchq.hqdm.model.ClassOfRelationship;
import uk.gov.gchq.hqdm.model.ClassOfRepresentation;
import uk.gov.gchq.hqdm.model.ClassOfSalesProductInstance;
import uk.gov.gchq.hqdm.model.ClassOfSign;
import uk.gov.gchq.hqdm.model.ClassOfSociallyConstructedActivity;
import uk.gov.gchq.hqdm.model.ClassOfSociallyConstructedObject;
import uk.gov.gchq.hqdm.model.ClassOfSpatioTemporalExtent;
import uk.gov.gchq.hqdm.model.ClassOfState;
import uk.gov.gchq.hqdm.model.ClassOfStateOfActivity;
import uk.gov.gchq.hqdm.model.ClassOfStateOfAmountOfMoney;
import uk.gov.gchq.hqdm.model.ClassOfStateOfAssociation;
import uk.gov.gchq.hqdm.model.ClassOfStateOfBiologicalObject;
import uk.gov.gchq.hqdm.model.ClassOfStateOfBiologicalSystem;
import uk.gov.gchq.hqdm.model.ClassOfStateOfBiologicalSystemComponent;
import uk.gov.gchq.hqdm.model.ClassOfStateOfFunctionalObject;
import uk.gov.gchq.hqdm.model.ClassOfStateOfFunctionalSystem;
import uk.gov.gchq.hqdm.model.ClassOfStateOfFunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.ClassOfStateOfIntentionallyConstructedObject;
import uk.gov.gchq.hqdm.model.ClassOfStateOfOrdinaryBiologicalObject;
import uk.gov.gchq.hqdm.model.ClassOfStateOfOrdinaryFunctionalObject;
import uk.gov.gchq.hqdm.model.ClassOfStateOfOrdinaryPhysicalObject;
import uk.gov.gchq.hqdm.model.ClassOfStateOfOrganization;
import uk.gov.gchq.hqdm.model.ClassOfStateOfOrganizationComponent;
import uk.gov.gchq.hqdm.model.ClassOfStateOfParty;
import uk.gov.gchq.hqdm.model.ClassOfStateOfPerson;
import uk.gov.gchq.hqdm.model.ClassOfStateOfPhysicalObject;
import uk.gov.gchq.hqdm.model.ClassOfStateOfPosition;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSalesProductInstance;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSign;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSociallyConstructedActivity;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSociallyConstructedObject;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSystem;
import uk.gov.gchq.hqdm.model.ClassOfStateOfSystemComponent;
import uk.gov.gchq.hqdm.model.ClassOfSystem;
import uk.gov.gchq.hqdm.model.ClassOfSystemComponent;
import uk.gov.gchq.hqdm.model.Classification;
import uk.gov.gchq.hqdm.model.impl.ClassImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfAbstractObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfActivityImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfAgreeContractImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfAgreementExecutionImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfAgreementProcessImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfAmountOfMoneyImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfAssociationImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfBiologicalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfBiologicalSystemComponentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfBiologicalSystemImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfClassImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfClassOfSpatioTemporalExtentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfContractExecutionImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfContractProcessImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfEventImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfFunctionalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfFunctionalSystemComponentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfFunctionalSystemImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfInPlaceBiologicalComponentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfIndividualImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfInstalledFunctionalSystemComponentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfInstalledObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfIntentionallyConstructedObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfOfferImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfOrdinaryBiologicalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfOrdinaryFunctionalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfOrdinaryPhysicalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfOrganizationComponentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfOrganizationImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfParticipantImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfPartyImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfPeriodOfTimeImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfPersonImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfPersonInPositionImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfPhysicalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfPhysicalPropertyImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfPhysicalQuantityImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfPointInTimeImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfPositionImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfPossibleWorldImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfReachingAgreementImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfRelationshipImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfRepresentationImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfSalesProductInstanceImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfSignImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfSociallyConstructedActivityImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfSociallyConstructedObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfSpatioTemporalExtentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfActivityImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfAmountOfMoneyImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfAssociationImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfBiologicalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfBiologicalSystemComponentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfBiologicalSystemImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfFunctionalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfFunctionalSystemComponentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfFunctionalSystemImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfIntentionallyConstructedObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfOrdinaryBiologicalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfOrdinaryFunctionalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfOrdinaryPhysicalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfOrganizationComponentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfOrganizationImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfPartyImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfPersonImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfPhysicalObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfPositionImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfSalesProductInstanceImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfSignImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfSociallyConstructedActivityImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfSociallyConstructedObjectImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfSystemComponentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfStateOfSystemImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfSystemComponentImpl;
import uk.gov.gchq.hqdm.model.impl.ClassOfSystemImpl;
import uk.gov.gchq.hqdm.model.impl.ClassificationImpl;

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

}
