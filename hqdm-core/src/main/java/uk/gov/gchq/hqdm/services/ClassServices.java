package uk.gov.gchq.hqdm.services;

import uk.gov.gchq.hqdm.model.*;
import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.impl.*;

/**
 * Services related to HQDM Classes.
 *
 * */
public class ClassServices {
    /**
     * Create a Class with an String.
     *
     * @param id the String.
     * @return a Class instance.
     */
    public static Class createClass(final String id) {
        return new ClassImpl(id);
    }

    /**
     * Create a ClassOfAbstractObject with an String.
     *
     * @param id the String.
     * @return a ClassOfAbstractObject instance.
     */
    public static ClassOfAbstractObject createClassOfAbstractObject(final String id) {
        return new ClassOfAbstractObjectImpl(id);
    }

    /**
     * Create a ClassOfActivity with an String.
     *
     * @param id the String.
     * @return a ClassOfActivity instance.
     */
    public static ClassOfActivity createClassOfActivity(final String id) {
        return new ClassOfActivityImpl(id);
    }

    /**
     * Create a ClassOfAgreeContract with an String.
     *
     * @param id the String.
     * @return a ClassOfAgreeContract instance.
     */
    public static ClassOfAgreeContract createClassOfAgreeContract(final String id) {
        return new ClassOfAgreeContractImpl(id);
    }

    /**
     * Create a ClassOfAgreementExecution with an String.
     *
     * @param id the String.
     * @return a ClassOfAgreementExecution instance.
     */
    public static ClassOfAgreementExecution createClassOfAgreementExecution(final String id) {
        return new ClassOfAgreementExecutionImpl(id);
    }

    /**
     * Create a ClassOfAgreementProcess with an String.
     *
     * @param id the String.
     * @return a ClassOfAgreementProcess instance.
     */
    public static ClassOfAgreementProcess createClassOfAgreementProcess(final String id) {
        return new ClassOfAgreementProcessImpl(id);
    }

    /**
     * Create a ClassOfAmountOfMoney with an String.
     *
     * @param id the String.
     * @return a ClassOfAmountOfMoney instance.
     */
    public static ClassOfAmountOfMoney createClassOfAmountOfMoney(final String id) {
        return new ClassOfAmountOfMoneyImpl(id);
    }

    /**
     * Create a ClassOfAssociation with an String.
     *
     * @param id the String.
     * @return a ClassOfAssociation instance.
     */
    public static ClassOfAssociation createClassOfAssociation(final String id) {
        return new ClassOfAssociationImpl(id);
    }

    /**
     * Create a ClassOfBiologicalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfBiologicalObject instance.
     */
    public static ClassOfBiologicalObject createClassOfBiologicalObject(final String id) {
        return new ClassOfBiologicalObjectImpl(id);
    }

    /**
     * Create a ClassOfBiologicalSystem with an String.
     *
     * @param id the String.
     * @return a ClassOfBiologicalSystem instance.
     */
    public static ClassOfBiologicalSystem createClassOfBiologicalSystem(final String id) {
        return new ClassOfBiologicalSystemImpl(id);
    }

    /**
     * Create a ClassOfBiologicalSystemComponent with an String.
     *
     * @param id the String.
     * @return a ClassOfBiologicalSystemComponent instance.
     */
    public static ClassOfBiologicalSystemComponent
        createClassOfBiologicalSystemComponent(final String id) {
            return new ClassOfBiologicalSystemComponentImpl(id);
        }

    /**
     * Create a ClassOfClass with an String.
     *
     * @param id the String.
     * @return a ClassOfClass instance.
     */
    public static ClassOfClass createClassOfClass(final String id) {
        return new ClassOfClassImpl(id);
    }

    /**
     * Create a ClassOfClassOfSpatioTemporalExtent with an String.
     *
     * @param id the String.
     * @return a ClassOfClassOfSpatioTemporalExtent instance.
     */
    public static ClassOfClassOfSpatioTemporalExtent
        createClassOfClassOfSpatioTemporalExtent(final String id) {
            return new ClassOfClassOfSpatioTemporalExtentImpl(id);
        }

    /**
     * Create a ClassOfContractExecution with an String.
     *
     * @param id the String.
     * @return a ClassOfContractExecution instance.
     */
    public static ClassOfContractExecution createClassOfContractExecution(final String id) {
        return new ClassOfContractExecutionImpl(id);
    }

    /**
     * Create a ClassOfContractProcess with an String.
     *
     * @param id the String.
     * @return a ClassOfContractProcess instance.
     */
    public static ClassOfContractProcess createClassOfContractProcess(final String id) {
        return new ClassOfContractProcessImpl(id);
    }

    /**
     * Create a ClassOfEvent with an String.
     *
     * @param id the String.
     * @return a ClassOfEvent instance.
     */
    public static ClassOfEvent createClassOfEvent(final String id) {
        return new ClassOfEventImpl(id);
    }

    /**
     * Create a ClassOfFunctionalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfFunctionalObject instance.
     */
    public static ClassOfFunctionalObject createClassOfFunctionalObject(final String id) {
        return new ClassOfFunctionalObjectImpl(id);
    }

    /**
     * Create a ClassOfFunctionalSystem with an String.
     *
     * @param id the String.
     * @return a ClassOfFunctionalSystem instance.
     */
    public static ClassOfFunctionalSystem createClassOfFunctionalSystem(final String id) {
        return new ClassOfFunctionalSystemImpl(id);
    }

    /**
     * Create a ClassOfFunctionalSystemComponent with an String.
     *
     * @param id the String.
     * @return a ClassOfFunctionalSystemComponent instance.
     */
    public static ClassOfFunctionalSystemComponent
        createClassOfFunctionalSystemComponent(final String id) {
            return new ClassOfFunctionalSystemComponentImpl(id);
        }

    /**
     * Create a ClassOfInPlaceBiologicalComponent with an String.
     *
     * @param id the String.
     * @return a ClassOfInPlaceBiologicalComponent instance.
     */
    public static ClassOfInPlaceBiologicalComponent
        createClassOfInPlaceBiologicalComponent(final String id) {
            return new ClassOfInPlaceBiologicalComponentImpl(id);
        }

    /**
     * Create a ClassOfIndividual with an String.
     *
     * @param id the String.
     * @return a ClassOfIndividual instance.
     */
    public static ClassOfIndividual createClassOfIndividual(final String id) {
        return new ClassOfIndividualImpl(id);
    }

    /**
     * Create a ClassOfInstalledFunctionalSystemComponent with an String.
     *
     * @param id the String.
     * @return a ClassOfInstalledFunctionalSystemComponent instance.
     */
    public static ClassOfInstalledFunctionalSystemComponent
        createClassOfInstalledFunctionalSystemComponent(final String id) {
            return new ClassOfInstalledFunctionalSystemComponentImpl(id);
        }

    /**
     * Create a ClassOfInstalledObject with an String.
     *
     * @param id the String.
     * @return a ClassOfInstalledObject instance.
     */
    public static ClassOfInstalledObject createClassOfInstalledObject(final String id) {
        return new ClassOfInstalledObjectImpl(id);
    }

    /**
     * Create a ClassOfIntentionallyConstructedObject with an String.
     *
     * @param id the String.
     * @return a ClassOfIntentionallyConstructedObject instance.
     */
    public static ClassOfIntentionallyConstructedObject
        createClassOfIntentionallyConstructedObject(final String id) {
            return new ClassOfIntentionallyConstructedObjectImpl(id);
        }

    /**
     * Create a ClassOfOffer with an String.
     *
     * @param id the String.
     * @return a ClassOfOffer instance.
     */
    public static ClassOfOffer createClassOfOffer(final String id) {
        return new ClassOfOfferImpl(id);
    }

    /**
     * Create a ClassOfOrdinaryBiologicalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfOrdinaryBiologicalObject instance.
     */
    public static ClassOfOrdinaryBiologicalObject
        createClassOfOrdinaryBiologicalObject(final String id) {
            return new ClassOfOrdinaryBiologicalObjectImpl(id);
        }

    /**
     * Create a ClassOfOrdinaryFunctionalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfOrdinaryFunctionalObject instance.
     */
    public static ClassOfOrdinaryFunctionalObject
        createClassOfOrdinaryFunctionalObject(final String id) {
            return new ClassOfOrdinaryFunctionalObjectImpl(id);
        }

    /**
     * Create a ClassOfOrdinaryPhysicalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfOrdinaryPhysicalObject instance.
     */
    public static ClassOfOrdinaryPhysicalObject
        createClassOfOrdinaryPhysicalObject(final String id) {
            return new ClassOfOrdinaryPhysicalObjectImpl(id);
        }

    /**
     * Create a ClassOfOrganization with an String.
     *
     * @param id the String.
     * @return a ClassOfOrganization instance.
     */
    public static ClassOfOrganization createClassOfOrganization(final String id) {
        return new ClassOfOrganizationImpl(id);
    }

    /**
     * Create a ClassOfOrganizationComponent with an String.
     *
     * @param id the String.
     * @return a ClassOfOrganizationComponent instance.
     */
    public static ClassOfOrganizationComponent createClassOfOrganizationComponent(final String id) {
        return new ClassOfOrganizationComponentImpl(id);
    }

    /**
     * Create a ClassOfParticipant with an String.
     *
     * @param id the String.
     * @return a ClassOfParticipant instance.
     */
    public static ClassOfParticipant createClassOfParticipant(final String id) {
        return new ClassOfParticipantImpl(id);
    }

    /**
     * Create a ClassOfParty with an String.
     *
     * @param id the String.
     * @return a ClassOfParty instance.
     */
    public static ClassOfParty createClassOfParty(final String id) {
        return new ClassOfPartyImpl(id);
    }

    /**
     * Create a ClassOfPeriodOfTime with an String.
     *
     * @param id the String.
     * @return a ClassOfPeriodOfTime instance.
     */
    public static ClassOfPeriodOfTime createClassOfPeriodOfTime(final String id) {
        return new ClassOfPeriodOfTimeImpl(id);
    }

    /**
     * Create a ClassOfPerson with an String.
     *
     * @param id the String.
     * @return a ClassOfPerson instance.
     */
    public static ClassOfPerson createClassOfPerson(final String id) {
        return new ClassOfPersonImpl(id);
    }

    /**
     * Create a ClassOfPersonInPosition with an String.
     *
     * @param id the String.
     * @return a ClassOfPersonInPosition instance.
     */
    public static ClassOfPersonInPosition createClassOfPersonInPosition(final String id) {
        return new ClassOfPersonInPositionImpl(id);
    }

    /**
     * Create a ClassOfPhysicalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfPhysicalObject instance.
     */
    public static ClassOfPhysicalObject createClassOfPhysicalObject(final String id) {
        return new ClassOfPhysicalObjectImpl(id);
    }

    /**
     * Create a ClassOfPhysicalProperty with an String.
     *
     * @param id the String.
     * @return a ClassOfPhysicalProperty instance.
     */
    public static ClassOfPhysicalProperty createClassOfPhysicalProperty(final String id) {
        return new ClassOfPhysicalPropertyImpl(id);
    }

    /**
     * Create a ClassOfPhysicalQuantity with an String.
     *
     * @param id the String.
     * @return a ClassOfPhysicalQuantity instance.
     */
    public static ClassOfPhysicalQuantity createClassOfPhysicalQuantity(final String id) {
        return new ClassOfPhysicalQuantityImpl(id);
    }

    /**
     * Create a ClassOfPointInTime with an String.
     *
     * @param id the String.
     * @return a ClassOfPointInTime instance.
     */
    public static ClassOfPointInTime createClassOfPointInTime(final String id) {
        return new ClassOfPointInTimeImpl(id);
    }

    /**
     * Create a ClassOfPosition with an String.
     *
     * @param id the String.
     * @return a ClassOfPosition instance.
     */
    public static ClassOfPosition createClassOfPosition(final String id) {
        return new ClassOfPositionImpl(id);
    }

    /**
     * Create a ClassOfPossibleWorld with an String.
     *
     * @param id the String.
     * @return a ClassOfPossibleWorld instance.
     */
    public static ClassOfPossibleWorld createClassOfPossibleWorld(final String id) {
        return new ClassOfPossibleWorldImpl(id);
    }

    /**
     * Create a ClassOfReachingAgreement with an String.
     *
     * @param id the String.
     * @return a ClassOfReachingAgreement instance.
     */
    public static ClassOfReachingAgreement createClassOfReachingAgreement(final String id) {
        return new ClassOfReachingAgreementImpl(id);
    }

    /**
     * Create a ClassOfRelationship with an String.
     *
     * @param id the String.
     * @return a ClassOfRelationship instance.
     */
    public static ClassOfRelationship createClassOfRelationship(final String id) {
        return new ClassOfRelationshipImpl(id);
    }

    /**
     * Create a ClassOfRepresentation with an String.
     *
     * @param id the String.
     * @return a ClassOfRepresentation instance.
     */
    public static ClassOfRepresentation createClassOfRepresentation(final String id) {
        return new ClassOfRepresentationImpl(id);
    }

    /**
     * Create a ClassOfSalesProductInstance with an String.
     *
     * @param id the String.
     * @return a ClassOfSalesProductInstance instance.
     */
    public static ClassOfSalesProductInstance createClassOfSalesProductInstance(final String id) {
        return new ClassOfSalesProductInstanceImpl(id);
    }

    /**
     * Create a ClassOfSign with an String.
     *
     * @param id the String.
     * @return a ClassOfSign instance.
     */
    public static ClassOfSign createClassOfSign(final String id) {
        return new ClassOfSignImpl(id);
    }

    /**
     * Create a ClassOfSociallyConstructedActivity with an String.
     *
     * @param id the String.
     * @return a ClassOfSociallyConstructedActivity instance.
     */
    public static ClassOfSociallyConstructedActivity
        createClassOfSociallyConstructedActivity(final String id) {
            return new ClassOfSociallyConstructedActivityImpl(id);
        }

    /**
     * Create a ClassOfSociallyConstructedObject with an String.
     *
     * @param id the String.
     * @return a ClassOfSociallyConstructedObject instance.
     */
    public static ClassOfSociallyConstructedObject
        createClassOfSociallyConstructedObject(final String id) {
            return new ClassOfSociallyConstructedObjectImpl(id);
        }

    /**
     * Create a ClassOfSpatioTemporalExtent with an String.
     *
     * @param id the String.
     * @return a ClassOfSpatioTemporalExtent instance.
     */
    public static ClassOfSpatioTemporalExtent
        createClassOfSpatioTemporalExtent(final String id) {
            return new ClassOfSpatioTemporalExtentImpl(id);
        }

    /**
     * Create a ClassOfState with an String.
     *
     * @param id the String.
     * @return a ClassOfState instance.
     */
    public static ClassOfState createClassOfState(final String id) {
        return new ClassOfStateImpl(id);
    }

    /**
     * Create a ClassOfStateOfActivity with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfActivity instance.
     */
    public static ClassOfStateOfActivity createClassOfStateOfActivity(final String id) {
        return new ClassOfStateOfActivityImpl(id);
    }

    /**
     * Create a ClassOfStateOfAmountOfMoney with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfAmountOfMoney instance.
     */
    public static ClassOfStateOfAmountOfMoney createClassOfStateOfAmountOfMoney(final String id) {
        return new ClassOfStateOfAmountOfMoneyImpl(id);
    }

    /**
     * Create a ClassOfStateOfAssociation with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfAssociation instance.
     */
    public static ClassOfStateOfAssociation createClassOfStateOfAssociation(final String id) {
        return new ClassOfStateOfAssociationImpl(id);
    }

    /**
     * Create a ClassOfStateOfBiologicalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfBiologicalObject instance.
     */
    public static ClassOfStateOfBiologicalObject
        createClassOfStateOfBiologicalObject(final String id) {
            return new ClassOfStateOfBiologicalObjectImpl(id);
        }

    /**
     * Create a ClassOfStateOfBiologicalSystem with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfBiologicalSystem instance.
     */
    public static ClassOfStateOfBiologicalSystem
        createClassOfStateOfBiologicalSystem(final String id) {
            return new ClassOfStateOfBiologicalSystemImpl(id);
        }

    /**
     * Create a ClassOfStateOfBiologicalSystemComponent with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfBiologicalSystemComponent instance.
     */
    public static ClassOfStateOfBiologicalSystemComponent
        createClassOfStateOfBiologicalSystemComponent(final String id) {
            return new ClassOfStateOfBiologicalSystemComponentImpl(id);
        }

    /**
     * Create a ClassOfStateOfFunctionalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfFunctionalObject instance.
     */
    public static ClassOfStateOfFunctionalObject
        createClassOfStateOfFunctionalObject(final String id) {
            return new ClassOfStateOfFunctionalObjectImpl(id);
        }

    /**
     * Create a ClassOfStateOfFunctionalSystem with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfFunctionalSystem instance.
     */
    public static ClassOfStateOfFunctionalSystem
        createClassOfStateOfFunctionalSystem(final String id) {
            return new ClassOfStateOfFunctionalSystemImpl(id);
        }

    /**
     * Create a ClassOfStateOfFunctionalSystemComponent with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfFunctionalSystemComponent instance.
     */
    public static ClassOfStateOfFunctionalSystemComponent
        createClassOfStateOfFunctionalSystemComponent(final String id) {
            return new ClassOfStateOfFunctionalSystemComponentImpl(id);
        }

    /**
     * Create a ClassOfStateOfIntentionallyConstructedObject with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfIntentionallyConstructedObject instance.
     */
    public static ClassOfStateOfIntentionallyConstructedObject
        createClassOfStateOfIntentionallyConstructedObject(final String id) {
            return new ClassOfStateOfIntentionallyConstructedObjectImpl(id);
        }

    /**
     * Create a ClassOfStateOfOrdinaryBiologicalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfOrdinaryBiologicalObject instance.
     */
    public static ClassOfStateOfOrdinaryBiologicalObject
        createClassOfStateOfOrdinaryBiologicalObject(final String id) {
            return new ClassOfStateOfOrdinaryBiologicalObjectImpl(id);
        }

    /**
     * Create a ClassOfStateOfOrdinaryFunctionalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfOrdinaryFunctionalObject instance.
     */
    public static ClassOfStateOfOrdinaryFunctionalObject
        createClassOfStateOfOrdinaryFunctionalObject(final String id) {
            return new ClassOfStateOfOrdinaryFunctionalObjectImpl(id);
        }

    /**
     * Create a ClassOfStateOfOrdinaryPhysicalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfOrdinaryPhysicalObject instance.
     */
    public static ClassOfStateOfOrdinaryPhysicalObject
        createClassOfStateOfOrdinaryPhysicalObject(final String id) {
            return new ClassOfStateOfOrdinaryPhysicalObjectImpl(id);
        }

    /**
     * Create a ClassOfStateOfOrganization with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfOrganization instance.
     */
    public static ClassOfStateOfOrganization
        createClassOfStateOfOrganization(final String id) {
            return new ClassOfStateOfOrganizationImpl(id);
        }

    /**
     * Create a ClassOfStateOfOrganizationComponent with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfOrganizationComponent instance.
     */
    public static ClassOfStateOfOrganizationComponent
        createClassOfStateOfOrganizationComponent(final String id) {
            return new ClassOfStateOfOrganizationComponentImpl(id);
        }

    /**
     * Create a ClassOfStateOfParty with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfParty instance.
     */
    public static ClassOfStateOfParty createClassOfStateOfParty(final String id) {
        return new ClassOfStateOfPartyImpl(id);
    }

    /**
     * Create a ClassOfStateOfPerson with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfPerson instance.
     */
    public static ClassOfStateOfPerson createClassOfStateOfPerson(final String id) {
        return new ClassOfStateOfPersonImpl(id);
    }

    /**
     * Create a ClassOfStateOfPhysicalObject with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfPhysicalObject instance.
     */
    public static ClassOfStateOfPhysicalObject createClassOfStateOfPhysicalObject(final String id) {
        return new ClassOfStateOfPhysicalObjectImpl(id);
    }

    /**
     * Create a ClassOfStateOfPosition with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfPosition instance.
     */
    public static ClassOfStateOfPosition createClassOfStateOfPosition(final String id) {
        return new ClassOfStateOfPositionImpl(id);
    }

    /**
     * Create a ClassOfStateOfSalesProductInstance with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfSalesProductInstance instance.
     */
    public static ClassOfStateOfSalesProductInstance
        createClassOfStateOfSalesProductInstance(final String id) {
            return new ClassOfStateOfSalesProductInstanceImpl(id);
        }

    /**
     * Create a ClassOfStateOfSign with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfSign instance.
     */
    public static ClassOfStateOfSign createClassOfStateOfSign(final String id) {
        return new ClassOfStateOfSignImpl(id);
    }

    /**
     * Create a ClassOfStateOfSociallyConstructedActivity with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfSociallyConstructedActivity instance.
     */
    public static ClassOfStateOfSociallyConstructedActivity
        createClassOfStateOfSociallyConstructedActivity(final String id) {
            return new ClassOfStateOfSociallyConstructedActivityImpl(id);
        }

    /**
     * Create a ClassOfStateOfSociallyConstructedObject with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfSociallyConstructedObject instance.
     */
    public static ClassOfStateOfSociallyConstructedObject
        createClassOfStateOfSociallyConstructedObject(final String id) {
            return new ClassOfStateOfSociallyConstructedObjectImpl(id);
        }

    /**
     * Create a ClassOfStateOfSystem with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfSystem instance.
     */
    public static ClassOfStateOfSystem createClassOfStateOfSystem(final String id) {
        return new ClassOfStateOfSystemImpl(id);
    }

    /**
     * Create a ClassOfStateOfSystemComponent with an String.
     *
     * @param id the String.
     * @return a ClassOfStateOfSystemComponent instance.
     */
    public static ClassOfStateOfSystemComponent
        createClassOfStateOfSystemComponent(final String id) {
            return new ClassOfStateOfSystemComponentImpl(id);
        }

    /**
     * Create a ClassOfSystem with an String.
     *
     * @param id the String.
     * @return a ClassOfSystem instance.
     */
    public static ClassOfSystem createClassOfSystem(final String id) {
        return new ClassOfSystemImpl(id);
    }

    /**
     * Create a ClassOfSystemComponent with an String.
     *
     * @param id the String.
     * @return a ClassOfSystemComponent instance.
     */
    public static ClassOfSystemComponent createClassOfSystemComponent(final String id) {
        return new ClassOfSystemComponentImpl(id);
    }

    /**
     * Create a KindOfActivity with an String.
     *
     * @param id the String.
     * @return a KindOfActivity instance.
     */
    public static KindOfActivity createKindOfActivity(final String id) {
        return new KindOfActivityImpl(id);
    }

    /**
     * Create a KindOfAssociation with an String.
     *
     * @param id the String.
     * @return a KindOfAssociation instance.
     */
    public static KindOfAssociation createKindOfAssociation(final String id) {
        return new KindOfAssociationImpl(id);
    }

    /**
     * Create a KindOfBiologicalObject with an String.
     *
     * @param id the String.
     * @return a KindOfBiologicalObject instance.
     */
    public static KindOfBiologicalObject createKindOfBiologicalObject(final String id) {
        return new KindOfBiologicalObjectImpl(id);
    }

    /**
     * Create a KindOfBiologicalSystem with an String.
     *
     * @param id the String.
     * @return a KindOfBiologicalSystem instance.
     */
    public static KindOfBiologicalSystem createKindOfBiologicalSystem(final String id) {
        return new KindOfBiologicalSystemImpl(id);
    }

    /**
     * Create a KindOfBiologicalSystemComponent with an String.
     *
     * @param id the String.
     * @return a KindOfBiologicalSystemComponent instance.
     */
    public static KindOfBiologicalSystemComponent
        createKindOfBiologicalSystemComponent(final String id) {
            return new KindOfBiologicalSystemComponentImpl(id);
        }

    /**
     * Create a KindOfFunctionalObject with an String.
     *
     * @param id the String.
     * @return a KindOfFunctionalObject instance.
     */
    public static KindOfFunctionalObject createKindOfFunctionalObject(final String id) {
        return new KindOfFunctionalObjectImpl(id);
    }

    /**
     * Create a KindOfFunctionalSystem with an String.
     *
     * @param id the String.
     * @return a KindOfFunctionalSystem instance.
     */
    public static KindOfFunctionalSystem createKindOfFunctionalSystem(final String id) {
        return new KindOfFunctionalSystemImpl(id);
    }

    /**
     * Create a KindOfFunctionalSystemComponent with an String.
     *
     * @param id the String.
     * @return a KindOfFunctionalSystemComponent instance.
     */
    public static KindOfFunctionalSystemComponent
        createKindOfFunctionalSystemComponent(final String id) {
            return new KindOfFunctionalSystemComponentImpl(id);
        }

    /**
     * Create a KindOfIndividual with an String.
     *
     * @param id the String.
     * @return a KindOfIndividual instance.
     */
    public static KindOfIndividual createKindOfIndividual(final String id) {
        return new KindOfIndividualImpl(id);
    }

    /**
     * Create a KindOfIntentionallyConstructedObject with an String.
     *
     * @param id the String.
     * @return a KindOfIntentionallyConstructedObject instance.
     */
    public static KindOfIntentionallyConstructedObject
        createKindOfIntentionallyConstructedObject(final String id) {
            return new KindOfIntentionallyConstructedObjectImpl(id);
        }

    /**
     * Create a KindOfOrdinaryBiologicalObject with an String.
     *
     * @param id the String.
     * @return a KindOfOrdinaryBiologicalObject instance.
     */
    public static KindOfOrdinaryBiologicalObject
        createKindOfOrdinaryBiologicalObject(final String id) {
            return new KindOfOrdinaryBiologicalObjectImpl(id);
        }

    /**
     * Create a KindOfOrdinaryFunctionalObject with an String.
     *
     * @param id the String.
     * @return a KindOfOrdinaryFunctionalObject instance.
     */
    public static KindOfOrdinaryFunctionalObject
        createKindOfOrdinaryFunctionalObject(final String id) {
            return new KindOfOrdinaryFunctionalObjectImpl(id);
        }

    /**
     * Create a KindOfOrdinaryPhysicalObject with an String.
     *
     * @param id the String.
     * @return a KindOfOrdinaryPhysicalObject instance.
     */
    public static KindOfOrdinaryPhysicalObject
        createKindOfOrdinaryPhysicalObject(final String id) {
            return new KindOfOrdinaryPhysicalObjectImpl(id);
        }

    /**
     * Create a KindOfOrganization with an String.
     *
     * @param id the String.
     * @return a KindOfOrganization instance.
     */
    public static KindOfOrganization createKindOfOrganization(final String id) {
        return new KindOfOrganizationImpl(id);
    }

    /**
     * Create a KindOfOrganizationComponent with an String.
     *
     * @param id the String.
     * @return a KindOfOrganizationComponent instance.
     */
    public static KindOfOrganizationComponent
        createKindOfOrganizationComponent(final String id) {
            return new KindOfOrganizationComponentImpl(id);
        }

    /**
     * Create a KindOfParty with an String.
     *
     * @param id the String.
     * @return a KindOfParty instance.
     */
    public static KindOfParty createKindOfParty(final String id) {
        return new KindOfPartyImpl(id);
    }

    /**
     * Create a KindOfPerson with an String.
     *
     * @param id the String.
     * @return a KindOfPerson instance.
     */
    public static KindOfPerson createKindOfPerson(final String id) {
        return new KindOfPersonImpl(id);
    }

    /**
     * Create a KindOfPhysicalObject with an String.
     *
     * @param id the String.
     * @return a KindOfPhysicalObject instance.
     */
    public static KindOfPhysicalObject createKindOfPhysicalObject(final String id) {
        return new KindOfPhysicalObjectImpl(id);
    }

    /**
     * Create a KindOfPhysicalProperty with an String.
     *
     * @param id the String.
     * @return a KindOfPhysicalProperty instance.
     */
    public static KindOfPhysicalProperty createKindOfPhysicalProperty(final String id) {
        return new KindOfPhysicalPropertyImpl(id);
    }

    /**
     * Create a KindOfPhysicalQuantity with an String.
     *
     * @param id the String.
     * @return a KindOfPhysicalQuantity instance.
     */
    public static KindOfPhysicalQuantity createKindOfPhysicalQuantity(final String id) {
        return new KindOfPhysicalQuantityImpl(id);
    }

    /**
     * Create a KindOfPosition with an String.
     *
     * @param id the String.
     * @return a KindOfPosition instance.
     */
    public static KindOfPosition createKindOfPosition(final String id) {
        return new KindOfPositionImpl(id);
    }

    /**
     * Create a KindOfRelationshipWithRestriction with an String.
     *
     * @param id the String.
     * @return a KindOfRelationshipWithRestriction instance.
     */
    public static KindOfRelationshipWithRestriction
        createKindOfRelationshipWithRestriction(final String id) {
            return new KindOfRelationshipWithRestrictionImpl(id);
        }

    /**
     * Create a KindOfRelationshipWithSignature with an String.
     *
     * @param id the String.
     * @return a KindOfRelationshipWithSignature instance.
     */
    public static KindOfRelationshipWithSignature
        createKindOfRelationshipWithSignature(final String id) {
            return new KindOfRelationshipWithSignatureImpl(id);
        }

    /**
     * Create a KindOfSociallyConstructedObject with an String.
     *
     * @param id the String.
     * @return a KindOfSociallyConstructedObject instance.
     */
    public static KindOfSociallyConstructedObject
        createKindOfSociallyConstructedObject(final String id) {
            return new KindOfSociallyConstructedObjectImpl(id);
        }

    /**
     * Create a KindOfSystem with an String.
     *
     * @param id the String.
     * @return a KindOfSystem instance.
     */
    public static KindOfSystem createKindOfSystem(final String id) {
        return new KindOfSystemImpl(id);
    }

    /**
     * Create a KindOfSystemComponent with an String.
     *
     * @param id the String.
     * @return a KindOfSystemComponent instance.
     */
    public static KindOfSystemComponent createKindOfSystemComponent(final String id) {
        return new KindOfSystemComponentImpl(id);
    }

    /**
     * Create a Role with an String.
     *
     * @param id the String.
     * @return a Role instance.
     */
    public static Role createRole(final String id) {
        return new RoleImpl(id);
    }

}
