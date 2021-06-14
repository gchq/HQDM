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

/**
*
*/
public final class HQDM {
    private HQDM() {}

    /** */
    public static final IriBase HQDM = new IriBase("hqdm", "http://www.semanticweb.org/hqdm#");

    /** */
    public static final HqdmIri ENTITY_ID = new HqdmIri(HQDM, "data_uniqueID");

    /** */
    public static final HqdmIri ENTITY_NAME = new HqdmIri(HQDM, "data_EntityName");

    /** */
    public static final HqdmIri ENTITY_CLASS_NAME = new HqdmIri(HQDM, "class_name");

    /** */
    public static final HqdmIri SUPERCLASS = new HqdmIri(HQDM, "superclass");

    /** */
    public static final HqdmIri SUBCLASS = new HqdmIri(HQDM, "subclass");

    /** */
    public static final HqdmIri SPECIALIZATION = new HqdmIri(HQDM, "specialization");

    /** */
    public static final HqdmIri CLASSIFICATION = new HqdmIri(HQDM, "classification");

    /** */
    public static final HqdmIri CLASSIFIER = new HqdmIri(HQDM, "classifier");

    /** */
    public static final HqdmIri MEMBER = new HqdmIri(HQDM, "member");

    /** */
    public static final HqdmIri AGGREGATION = new HqdmIri(HQDM, "aggregation");

    /** */
    public static final HqdmIri COMPOSITION = new HqdmIri(HQDM, "composition");

    /** */
    public static final HqdmIri ORDINARY_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM, "ordinary_biological_object");

    /** */
    public static final HqdmIri PARTICIPANT_IN_ACTIVITY_OR_ASSOCIATION =
            new HqdmIri(HQDM, "participant_in_activity_or_association");

    /** */
    public static final HqdmIri PART = new HqdmIri(HQDM, "part");

    /** */
    public static final HqdmIri WHOLE = new HqdmIri(HQDM, "whole");

    /** */
    public static final HqdmIri TEMPORAL_COMPOSITION = new HqdmIri(HQDM, "temporal_composition");

    /** */
    public static final HqdmIri NATURAL_ROLE = new HqdmIri(HQDM, "natural_role");

    /** */
    public static final HqdmIri TEMPORAL_PART_OF_ = new HqdmIri(HQDM, "temporal_part_of_");

    /** */
    public static final HqdmIri PART__OF_BY_CLASS = new HqdmIri(HQDM, "part__of_by_class");

    /** */
    public static final HqdmIri CONSISTS__OF_BY_CLASS = new HqdmIri(HQDM, "consists__of_by_class");

    /** */
    public static final HqdmIri VALUE_ = new HqdmIri(HQDM, "value_");

    /** */
    public static final HqdmIri TEMPORAL__PART_OF = new HqdmIri(HQDM, "temporal__part_of");

    /** */
    public static final HqdmIri PART__OF = new HqdmIri(HQDM, "part__of");

    /** */
    public static final HqdmIri CONSISTS__OF = new HqdmIri(HQDM, "consists__of");

    /** */
    public static final HqdmIri MEMBER__OF = new HqdmIri(HQDM, "member__of");

    /** */
    public static final HqdmIri ABSTRACT_OBJECT = new HqdmIri(HQDM, "abstract_object");

    /** */
    public static final HqdmIri OWNER = new HqdmIri(HQDM, "owner");

    /** */
    public static final HqdmIri ENUMERATED_CLASS = new HqdmIri(HQDM, "enumerated_class");

    /** */
    public static final HqdmIri EMPLOYER = new HqdmIri(HQDM, "employer");

    /** */
    public static final HqdmIri EMPLOYEE = new HqdmIri(HQDM, "employee");

    /** */
    public static final HqdmIri ENDING_OF_OWNERSHIP = new HqdmIri(HQDM, "ending_of_ownership");

    /** */
    public static final HqdmIri BEGINNING_OF_OWNERSHIP =
            new HqdmIri(HQDM, "beginning_of_ownership");

    /** */
    public static final HqdmIri UPPER_BOUND = new HqdmIri(HQDM, "upper_bound");

    /** */
    public static final HqdmIri LOWER_BOUND = new HqdmIri(HQDM, "lower_bound");

    /** */
    public static final HqdmIri PHYSICAL_QUANTITY_RANGE =
            new HqdmIri(HQDM, "physical_quantity_range");

    /** */
    public static final HqdmIri RANGES_OVER = new HqdmIri(HQDM, "ranges_over");

    /** */
    public static final HqdmIri INTERSECTION_OF = new HqdmIri(HQDM, "intersection_of");

    /** */
    public static final HqdmIri DEFINED_BY = new HqdmIri(HQDM, "defined_by");

    /** */
    public static final HqdmIri PART_OF_PLAN = new HqdmIri(HQDM, "part_of_plan");

    /** */
    public static final HqdmIri REQUIREMENT = new HqdmIri(HQDM, "requirement");

    /** */
    public static final HqdmIri DEFINITION = new HqdmIri(HQDM, "definition");

    /** */
    public static final HqdmIri DESCRIPTION = new HqdmIri(HQDM, "description");

    /** */
    public static final HqdmIri CONSISTS_OF_IN_MEMBERS =
            new HqdmIri(HQDM, "consists_of_in_members");

    /** */
    public static final HqdmIri REPRESENTATION_BY_PATTERN =
            new HqdmIri(HQDM, "representation_by_pattern");

    /** */
    public static final HqdmIri CLASS_OF_REPRESENTATION =
            new HqdmIri(HQDM, "class_of_representation");

    /** */
    public static final HqdmIri MEMBER_OF_ = new HqdmIri(HQDM, "member_of_");

    /** */
    public static final HqdmIri ACTIVITY = new HqdmIri(HQDM, "activity");

    /** */
    public static final HqdmIri STATE_OF_SIGN = new HqdmIri(HQDM, "state_of_sign");

    /** */
    public static final HqdmIri PRODUCT_OFFERING = new HqdmIri(HQDM, "product_offering");

    /** */
    public static final HqdmIri PERIOD_OFFERED = new HqdmIri(HQDM, "period_offered");

    /** */
    public static final HqdmIri OFFEROR = new HqdmIri(HQDM, "offeror");

    /** */
    public static final HqdmIri CONSIDERATION_BY_CLASS =
            new HqdmIri(HQDM, "consideration_by_class");

    /** */
    public static final HqdmIri CLASS_OF_OFFERED = new HqdmIri(HQDM, "class_of_offered");

    /** */
    public static final HqdmIri OFFERING = new HqdmIri(HQDM, "offering");

    /** */
    public static final HqdmIri SUCCESSOR = new HqdmIri(HQDM, "successor");

    /** */
    public static final HqdmIri SOLD_AS = new HqdmIri(HQDM, "sold_as");

    /** */
    public static final HqdmIri SALES_PRODUCT_VERSION = new HqdmIri(HQDM, "sales_product_version");

    /** */
    public static final HqdmIri MEETS_SPECIFICATION = new HqdmIri(HQDM, "meets_specification");

    /** */
    public static final HqdmIri SOLD_UNDER = new HqdmIri(HQDM, "sold_under");

    /** */
    public static final HqdmIri SALES_PRODUCT = new HqdmIri(HQDM, "sales_product");

    /** */
    public static final HqdmIri ASSOCIATION = new HqdmIri(HQDM, "association");

    /** */
    public static final HqdmIri CLASS = new HqdmIri(HQDM, "class");

    /** */
    public static final HqdmIri CLASS_OF_ACTIVITY = new HqdmIri(HQDM, "class_of_activity");

    /** */
    public static final HqdmIri CLASS_OF_FUNCTIONAL_SYSTEM =
            new HqdmIri(HQDM, "class_of_functional_system");

    /** */
    public static final HqdmIri CLASS_OF_ORGANIZATION = new HqdmIri(HQDM, "class_of_organization");

    /** */
    public static final HqdmIri KIND_OF_ORGANIZATION = new HqdmIri(HQDM, "kind_of_organization");

    /** */
    public static final HqdmIri CLASS_OF_POSSIBLE_WORLD =
            new HqdmIri(HQDM, "class_of_possible_world");

    /** */
    public static final HqdmIri CLASS_OF_SYSTEM = new HqdmIri(HQDM, "class_of_system");

    /** */
    public static final HqdmIri FUNCTIONAL_SYSTEM = new HqdmIri(HQDM, "functional_system");

    /** */
    public static final HqdmIri IDENTIFICATION = new HqdmIri(HQDM, "identification");

    /** */
    public static final HqdmIri KIND_OF_ACTIVITY = new HqdmIri(HQDM, "kind_of_activity");

    /** */
    public static final HqdmIri KIND_OF_ASSOCIATION = new HqdmIri(HQDM, "kind_of_association");

    /** */
    public static final HqdmIri KIND_OF_INDIVIDUAL = new HqdmIri(HQDM, "kind_of_individual");

    /** */
    public static final HqdmIri ORGANIZATION = new HqdmIri(HQDM, "organization");

    /** */
    public static final HqdmIri PATTERN = new HqdmIri(HQDM, "pattern");

    /** */
    public static final HqdmIri PERSON = new HqdmIri(HQDM, "person");

    /** */
    public static final HqdmIri POINT_IN_TIME = new HqdmIri(HQDM, "point_in_time");

    /** */
    public static final HqdmIri POSSIBLE_WORLD = new HqdmIri(HQDM, "possible_world");

    /** */
    public static final HqdmIri RECOGNIZING_LANGUAGE_COMMUNITY =
            new HqdmIri(HQDM, "recognizing_language_community");

    /** */
    public static final HqdmIri REPRESENTATION_BY_SIGN =
            new HqdmIri(HQDM, "representation_by_sign");

    /** */
    public static final HqdmIri SIGN = new HqdmIri(HQDM, "sign");

    /** */
    public static final HqdmIri SPATIO_TEMPORAL_EXTENT =
            new HqdmIri(HQDM, "spatio_temporal_extent");

    /** */
    public static final HqdmIri THING = new HqdmIri(HQDM, "thing");

    /** */
    public static final HqdmIri PART_OF_BY_CLASS = new HqdmIri(HQDM, "part_of_by_class");

    /** */
    public static final HqdmIri CONSISTS_OF_BY_CLASS = new HqdmIri(HQDM, "consists_of_by_class");

    /** */
    public static final HqdmIri INTENDED_ROLE_BY_CLASS =
            new HqdmIri(HQDM, "intended_role_by_class");

    /** */
    public static final HqdmIri HAS_COMPONENT_BY_CLASS =
            new HqdmIri(HQDM, "has_component_by_class");

    /** */
    public static final HqdmIri NATURAL_ROLE_BY_CLASS = new HqdmIri(HQDM, "natural_role_by_class");

    /** */
    public static final HqdmIri USES = new HqdmIri(HQDM, "uses");

    /** */
    public static final HqdmIri REPRESENTED = new HqdmIri(HQDM, "represented");

    /** */
    public static final HqdmIri DOMAIN = new HqdmIri(HQDM, "domain");

    /** */
    public static final HqdmIri UNIT = new HqdmIri(HQDM, "unit");

    /** */
    public static final HqdmIri CONSISTS_OF_PARTICIPANT =
            new HqdmIri(HQDM, "consists_of_participant");

    /** */
    public static final HqdmIri CONSISTS_OF_PARTICIPANT_ =
            new HqdmIri(HQDM, "consists_of_participant_");

    /** */
    public static final HqdmIri DETERMINES = new HqdmIri(HQDM, "determines");

    /** */
    public static final HqdmIri ROLE = new HqdmIri(HQDM, "role");

    /** */
    public static final HqdmIri PART_OF_BY_CLASS_ = new HqdmIri(HQDM, "part_of_by_class_");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SOCIALLY_CONSTRUCTED_ACTIVITY =
            new HqdmIri(HQDM, "class_of_state_of_socially_constructed_activity");

    /** */
    public static final HqdmIri CAUSES_BY_CLASS = new HqdmIri(HQDM, "causes_by_class");

    /** */
    public static final HqdmIri REFERENCES_BY_CLASS = new HqdmIri(HQDM, "references_by_class");

    /** */
    public static final HqdmIri DETERMINES_BY_CLASS = new HqdmIri(HQDM, "determines_by_class");

    /** */
    public static final HqdmIri CLASS_OF_SOCIALLY_CONSTRUCTED_ACTIVITY =
            new HqdmIri(HQDM, "class_of_socially_constructed_activity");

    /** */
    public static final HqdmIri STATE_OF_SYSTEM = new HqdmIri(HQDM, "state_of_system");

    /** */
    public static final HqdmIri SYSTEM = new HqdmIri(HQDM, "system");

    /** */
    public static final HqdmIri CLASS_OF_BIOLOGICAL_SYSTEM =
            new HqdmIri(HQDM, "class_of_biological_system");

    /** */
    public static final HqdmIri CLASS_OF_PARTY = new HqdmIri(HQDM, "class_of_party");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_FUNCTIONAL_SYSTEM =
            new HqdmIri(HQDM, "class_of_state_of_functional_system");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_BIOLOGICAL_SYSTEM =
            new HqdmIri(HQDM, "class_of_state_of_biological_system");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_PARTY =
            new HqdmIri(HQDM, "class_of_state_of_party");

    /** */
    public static final HqdmIri STATE_OF_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "state_of_system_component");

    /** */
    public static final HqdmIri SYSTEM_COMPONENT = new HqdmIri(HQDM, "system_component");

    /** */
    public static final HqdmIri COMPONENT_OF = new HqdmIri(HQDM, "component_of");

    /** */
    public static final HqdmIri CLASS_OF_FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "class_of_functional_system_component");

    /** */
    public static final HqdmIri CLASS_OF_BIOLOGICAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "class_of_biological_system_component");

    /** */
    public static final HqdmIri CLASS_OF_ORGANIZATION_COMPONENT =
            new HqdmIri(HQDM, "class_of_organization_component");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "class_of_state_of_functional_system_component");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_BIOLOGICAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "class_of_state_of_biological_system_component");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ORGANIZATION_COMPONENT =
            new HqdmIri(HQDM, "class_of_state_of_organization_component");

    /** */
    public static final HqdmIri INSTALLED_OBJECT = new HqdmIri(HQDM, "installed_object");

    /** */
    public static final HqdmIri STATE_OF_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM, "state_of_biological_object");

    /** */
    public static final HqdmIri BIOLOGICAL_OBJECT = new HqdmIri(HQDM, "biological_object");

    /** */
    public static final HqdmIri STATE_OF_ORDINARY_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM, "state_of_ordinary_biological_object");

    /** */
    public static final HqdmIri CLASS_OF_IN_PLACE_BIOLOGICAL_COMPONENT =
            new HqdmIri(HQDM, "class_of_in_place_biological_component");

    /** */
    public static final HqdmIri STATE_OF_BIOLOGICAL_SYSTEM =
            new HqdmIri(HQDM, "state_of_biological_system");

    /** */
    public static final HqdmIri BIOLOGICAL_SYSTEM = new HqdmIri(HQDM, "biological_system");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_PERSON =
            new HqdmIri(HQDM, "class_of_state_of_person");

    /** */
    public static final HqdmIri CLASS_OF_PERSON = new HqdmIri(HQDM, "class_of_person");

    /** */
    public static final HqdmIri STATE_OF_PERSON = new HqdmIri(HQDM, "state_of_person");

    /** */
    public static final HqdmIri KIND_OF_PERSON = new HqdmIri(HQDM, "kind_of_person");

    /** */
    public static final HqdmIri BIOLOGICAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "biological_system_component");

    /** */
    public static final HqdmIri IN_PLACE_BIOLOGICAL_COMPONENT =
            new HqdmIri(HQDM, "in_place_biological_component");

    /** */
    public static final HqdmIri STATE_OF_INTENTIONALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM, "state_of_intentionally_constructed_object");

    /** */
    public static final HqdmIri INTENTIONALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM, "intentionally_constructed_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SOCIALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM, "class_of_state_of_socially_constructed_object");

    /** */
    public static final HqdmIri CLASS_OF_SOCIALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM, "class_of_socially_constructed_object");

    /** */
    public static final HqdmIri STATE_OF_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM, "state_of_functional_object");

    /** */
    public static final HqdmIri FUNCTIONAL_OBJECT = new HqdmIri(HQDM, "functional_object");

    /** */
    public static final HqdmIri INTENDED_ROLE = new HqdmIri(HQDM, "intended_role");

    /** */
    public static final HqdmIri STATE_OF_ORDINARY_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM, "state_of_ordinary_functional_object");

    /** */
    public static final HqdmIri ORDINARY_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM, "ordinary_functional_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SALES_PRODUCT_INSTANCE =
            new HqdmIri(HQDM, "class_of_state_of_sales_product_instance");

    /** */
    public static final HqdmIri CLASS_OF_SALES_PRODUCT_INSTANCE =
            new HqdmIri(HQDM, "class_of_sales_product_instance");

    /** */
    public static final HqdmIri STATE_OF_FUNCTIONAL_SYSTEM =
            new HqdmIri(HQDM, "state_of_functional_system");

    /** */
    public static final HqdmIri STATE_OF_FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "state_of_functional_system_component");

    /** */
    public static final HqdmIri INSTALLED_FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "installed_functional_system_component");

    /** */
    public static final HqdmIri FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "functional_system_component");

    /** */
    public static final HqdmIri CLASS_OF_INSTALLED_FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "class_of_installed_functional_system_component");

    /** */
    public static final HqdmIri STATE_OF_SOCIALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM, "state_of_socially_constructed_object");

    /** */
    public static final HqdmIri SOCIALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM, "socially_constructed_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ORGANIZATION =
            new HqdmIri(HQDM, "class_of_state_of_organization");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SIGN =
            new HqdmIri(HQDM, "class_of_state_of_sign");

    /** */
    public static final HqdmIri CLASS_OF_SIGN = new HqdmIri(HQDM, "class_of_sign");

    /** */
    public static final HqdmIri STATE_OF_PARTY = new HqdmIri(HQDM, "state_of_party");

    /** */
    public static final HqdmIri PARTY = new HqdmIri(HQDM, "party");

    /** */
    public static final HqdmIri STATE_OF_ORGANIZATION = new HqdmIri(HQDM, "state_of_organization");

    /** */
    public static final HqdmIri STATE_OF_LANGUAGE_COMMUNITY =
            new HqdmIri(HQDM, "state_of_language_community");

    /** */
    public static final HqdmIri LANGUAGE_COMMUNITY = new HqdmIri(HQDM, "language_community");

    /** */
    public static final HqdmIri EMPLOYMENT = new HqdmIri(HQDM, "employment");

    /** */
    public static final HqdmIri STATE_OF_ORGANIZATION_COMPONENT =
            new HqdmIri(HQDM, "state_of_organization_component");

    /** */
    public static final HqdmIri ORGANIZATION_COMPONENT =
            new HqdmIri(HQDM, "organization_component");

    /** */
    public static final HqdmIri STATE_OF_POSITION = new HqdmIri(HQDM, "state_of_position");

    /** */
    public static final HqdmIri PERSON_IN_POSITION = new HqdmIri(HQDM, "person_in_position");

    /** */
    public static final HqdmIri POSITION = new HqdmIri(HQDM, "position");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_POSITION =
            new HqdmIri(HQDM, "class_of_state_of_position");

    /** */
    public static final HqdmIri CLASS_OF_PERSON_IN_POSITION =
            new HqdmIri(HQDM, "class_of_person_in_position");

    /** */
    public static final HqdmIri CLASS_OF_POSITION = new HqdmIri(HQDM, "class_of_position");

    /** */
    public static final HqdmIri KIND_OF_POSITION = new HqdmIri(HQDM, "kind_of_position");

    /** */
    public static final HqdmIri STATE_OF_AMOUNT_OF_MONEY =
            new HqdmIri(HQDM, "state_of_amount_of_money");

    /** */
    public static final HqdmIri AMOUNT_OF_MONEY = new HqdmIri(HQDM, "amount_of_money");

    /** */
    public static final HqdmIri MEMBER_OF_CURRENCY = new HqdmIri(HQDM, "member_of_currency");

    /** */
    public static final HqdmIri CURRENCY = new HqdmIri(HQDM, "currency");

    /** */
    public static final HqdmIri PRICE = new HqdmIri(HQDM, "price");

    /** */
    public static final HqdmIri OWNERSHIP = new HqdmIri(HQDM, "ownership");

    /** */
    public static final HqdmIri MONEY_ASSET = new HqdmIri(HQDM, "money_asset");

    /** */
    public static final HqdmIri ASSET = new HqdmIri(HQDM, "asset");

    /** */
    public static final HqdmIri TRANSFER_OF_OWNERSHIP = new HqdmIri(HQDM, "transfer_of_ownership");

    /** */
    public static final HqdmIri CAUSES_BEGINNING = new HqdmIri(HQDM, "causes_beginning");

    /** */
    public static final HqdmIri CAUSES_ENDING = new HqdmIri(HQDM, "causes_ending");

    /** */
    public static final HqdmIri TRANSFEROR = new HqdmIri(HQDM, "transferor");

    /** */
    public static final HqdmIri TRANSFEREE = new HqdmIri(HQDM, "transferee");

    /** */
    public static final HqdmIri TRANSFER_OF_OWNERSHIP_OF_MONEY =
            new HqdmIri(HQDM, "transfer_of_ownership_of_money");

    /** */
    public static final HqdmIri REACHING_AGREEMENT = new HqdmIri(HQDM, "reaching_agreement");

    /** */
    public static final HqdmIri AGREEMENT_PROCESS = new HqdmIri(HQDM, "agreement_process");

    /** */
    public static final HqdmIri AGREEMENT_EXECUTION = new HqdmIri(HQDM, "agreement_execution");

    /** */
    public static final HqdmIri OFFER = new HqdmIri(HQDM, "offer");

    /** */
    public static final HqdmIri ACCEPTANCE_OF_OFFER = new HqdmIri(HQDM, "acceptance_of_offer");

    /** */
    public static final HqdmIri CLASS_OF_REACHING_AGREEMENT =
            new HqdmIri(HQDM, "class_of_reaching_agreement");

    /** */
    public static final HqdmIri CLASS_OF_AGREEMENT_PROCESS =
            new HqdmIri(HQDM, "class_of_agreement_process");

    /** */
    public static final HqdmIri CLASS_OF_AGREEMENT_EXECUTION =
            new HqdmIri(HQDM, "class_of_agreement_execution");

    /** */
    public static final HqdmIri CLASS_OF_OFFER = new HqdmIri(HQDM, "class_of_offer");

    /** */
    public static final HqdmIri AGREE_CONTRACT = new HqdmIri(HQDM, "agree_contract");

    /** */
    public static final HqdmIri CONTRACT_PROCESS = new HqdmIri(HQDM, "contract_process");

    /** */
    public static final HqdmIri CONTRACT_EXECUTION = new HqdmIri(HQDM, "contract_execution");

    /** */
    public static final HqdmIri CLASS_OF_AGREE_CONTRACT =
            new HqdmIri(HQDM, "class_of_agree_contract");

    /** */
    public static final HqdmIri CLASS_OF_CONTRACT_PROCESS =
            new HqdmIri(HQDM, "class_of_contract_process");

    /** */
    public static final HqdmIri CLASS_OF_CONTRACT_EXECUTION =
            new HqdmIri(HQDM, "class_of_contract_execution");

    /** */
    public static final HqdmIri CONSISTS_OF_ = new HqdmIri(HQDM, "consists_of_");

    /** */
    public static final HqdmIri OFFER_AND_ACCEPTANCE_FOR_GOODS =
            new HqdmIri(HQDM, "offer_and_acceptance_for_goods");

    /** */
    public static final HqdmIri SALE_OF_GOODS = new HqdmIri(HQDM, "sale_of_goods");

    /** */
    public static final HqdmIri EXCHANGE_OF_GOODS_AND_MONEY =
            new HqdmIri(HQDM, "exchange_of_goods_and_money");

    /** */
    public static final HqdmIri OFFER_FOR_GOODS = new HqdmIri(HQDM, "offer_for_goods");

    /** */
    public static final HqdmIri ACCEPTANCE_OF_OFFER_FOR_GOODS =
            new HqdmIri(HQDM, "acceptance_of_offer_for_goods");

    /** */
    public static final HqdmIri STATE_OF_SALES_PRODUCT_INSTANCE =
            new HqdmIri(HQDM, "state_of_sales_product_instance");

    /** */
    public static final HqdmIri SALES_PRODUCT_INSTANCE =
            new HqdmIri(HQDM, "sales_product_instance");

    /** */
    public static final HqdmIri PRODUCT_BRAND = new HqdmIri(HQDM, "product_brand");

    /** */
    public static final HqdmIri ROLES = new HqdmIri(HQDM, "roles");

    /** */
    public static final HqdmIri AGGREGATED_INTO = new HqdmIri(HQDM, "aggregated_into");

    /** */
    public static final HqdmIri BEGINNING = new HqdmIri(HQDM, "beginning");

    /** */
    public static final HqdmIri CAUSES = new HqdmIri(HQDM, "causes");

    /** */
    public static final HqdmIri CONSISTS_OF = new HqdmIri(HQDM, "consists_of");

    /** */
    public static final HqdmIri ENDING = new HqdmIri(HQDM, "ending");

    /** */
    public static final HqdmIri HAS_CLASS_MEMBER = new HqdmIri(HQDM, "has_class_member");

    /** */
    public static final HqdmIri HAS_SUPERCLASS = new HqdmIri(HQDM, "has_superclass");

    /** */
    public static final HqdmIri MEMBER_OF = new HqdmIri(HQDM, "member_of");

    /** */
    public static final HqdmIri MEMBER_OF_KIND = new HqdmIri(HQDM, "member_of_kind");

    /** */
    public static final HqdmIri PARTICIPANT_IN = new HqdmIri(HQDM, "participant_in");

    /** */
    public static final HqdmIri PART_OF = new HqdmIri(HQDM, "part_of");

    /** */
    public static final HqdmIri PART_OF_ = new HqdmIri(HQDM, "part_of_");

    /** */
    public static final HqdmIri PART_OF_POSSIBLE_WORLD =
            new HqdmIri(HQDM, "part_of_possible_world");

    /** */
    public static final HqdmIri REFERENCES = new HqdmIri(HQDM, "references");

    /** */
    public static final HqdmIri REPRESENTS = new HqdmIri(HQDM, "represents");

    /** */
    public static final HqdmIri TEMPORAL_PART_OF = new HqdmIri(HQDM, "temporal_part_of");

    /** */
    public static final HqdmIri REQUIRED_ROLE_PLAYER = new HqdmIri(HQDM, "required_role_player");

    /** */
    public static final HqdmIri INVOLVES = new HqdmIri(HQDM, "involves");

    /** */
    public static final HqdmIri STATE_OF_BIOLOGICAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "state_of_biological_system_component");

    /** */
    public static final HqdmIri UNIT_OF_MEASURE = new HqdmIri(HQDM, "unit_of_measure");

    /** */
    public static final HqdmIri STATE_OF_SOCIALLY_CONSTRUCTED_ACTIVITY =
            new HqdmIri(HQDM, "state_of_socially_constructed_activity");

    /** */
    public static final HqdmIri STATE_OF_PHYSICAL_OBJECT =
            new HqdmIri(HQDM, "state_of_physical_object");

    /** */
    public static final HqdmIri STATE_OF_ORDINARY_PHYSICAL_OBJECT =
            new HqdmIri(HQDM, "state_of_ordinary_physical_object");

    /** */
    public static final HqdmIri STATE_OF_ASSOCIATION = new HqdmIri(HQDM, "state_of_association");

    /** */
    public static final HqdmIri STATE_OF_ACTIVITY = new HqdmIri(HQDM, "state_of_activity");

    /** */
    public static final HqdmIri STATE = new HqdmIri(HQDM, "state");

    /** */
    public static final HqdmIri SOCIALLY_CONSTRUCTED_ACTIVITY =
            new HqdmIri(HQDM, "socially_constructed_activity");

    /** */
    public static final HqdmIri SCALE = new HqdmIri(HQDM, "scale");

    /** */
    public static final HqdmIri REQUIREMENT_SPECIFICATION =
            new HqdmIri(HQDM, "requirement_specification");

    /** */
    public static final HqdmIri RELATIONSHIP = new HqdmIri(HQDM, "relationship");

    /** */
    public static final HqdmIri PLAN = new HqdmIri(HQDM, "plan");

    /** */
    public static final HqdmIri PHYSICAL_QUANTITY = new HqdmIri(HQDM, "physical_quantity");

    /** */
    public static final HqdmIri PHYSICAL_PROPERTY_RANGE =
            new HqdmIri(HQDM, "physical_property_range");

    /** */
    public static final HqdmIri PHYSICAL_PROPERTY = new HqdmIri(HQDM, "physical_property");

    /** */
    public static final HqdmIri PHYSICAL_OBJECT = new HqdmIri(HQDM, "physical_object");

    /** */
    public static final HqdmIri PERIOD_OF_TIME = new HqdmIri(HQDM, "period_of_time");

    /** */
    public static final HqdmIri ORDINARY_PHYSICAL_OBJECT =
            new HqdmIri(HQDM, "ordinary_physical_object");

    /** */
    public static final HqdmIri KIND_OF_SYSTEM = new HqdmIri(HQDM, "kind_of_system");

    /** */
    public static final HqdmIri KIND_OF_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "kind_of_system_component");

    /** */
    public static final HqdmIri KIND_OF_SOCIALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM, "kind_of_socially_constructed_object");

    /** */
    public static final HqdmIri KIND_OF_RELATIONSHIP_WITH_SIGNATURE =
            new HqdmIri(HQDM, "kind_of_relationship_with_signature");

    /** */
    public static final HqdmIri KIND_OF_RELATIONSHIP_WITH_RESTRICTION =
            new HqdmIri(HQDM, "kind_of_relationship_with_restriction");

    /** */
    public static final HqdmIri KIND_OF_PHYSICAL_QUANTITY =
            new HqdmIri(HQDM, "kind_of_physical_quantity");

    /** */
    public static final HqdmIri KIND_OF_PHYSICAL_OBJECT =
            new HqdmIri(HQDM, "kind_of_physical_object");

    /** */
    public static final HqdmIri KIND_OF_PHYSICAL_PROPERTY =
            new HqdmIri(HQDM, "kind_of_physical_property");

    /** */
    public static final HqdmIri KIND_OF_ORGANIZATION_COMPONENT =
            new HqdmIri(HQDM, "kind_of_organization_component");

    /** */
    public static final HqdmIri KIND_OF_PARTY = new HqdmIri(HQDM, "kind_of_party");

    /** */
    public static final HqdmIri KIND_OF_ORDINARY_PHYSICAL_OBJECT =
            new HqdmIri(HQDM, "kind_of_ordinary_physical_object");

    /** */
    public static final HqdmIri KIND_OF_ORDINARY_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM, "kind_of_ordinary_functional_object");

    /** */
    public static final HqdmIri KIND_OF_INTENTIONALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM, "kind_of_intentionally_constructed_object");

    /** */
    public static final HqdmIri KIND_OF_ORDINARY_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM, "kind_of_ordinary_biological_object");

    /** */
    public static final HqdmIri KIND_OF_FUNCTIONAL_SYSTEM =
            new HqdmIri(HQDM, "kind_of_functional_system");

    /** */
    public static final HqdmIri KIND_OF_FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "kind_of_functional_system_component");

    /** */
    public static final HqdmIri KIND_OF_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM, "kind_of_functional_object");

    /** */
    public static final HqdmIri KIND_OF_BIOLOGICAL_SYSTEM =
            new HqdmIri(HQDM, "kind_of_biological_system");

    /** */
    public static final HqdmIri KIND_OF_BIOLOGICAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "kind_of_biological_system_component");

    /** */
    public static final HqdmIri KIND_OF_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM, "kind_of_biological_object");

    /** */
    public static final HqdmIri INDIVIDUAL = new HqdmIri(HQDM, "individual");

    /** */
    public static final HqdmIri IDENTIFICATION_OF_PHYSICAL_QUANTITY =
            new HqdmIri(HQDM, "identification_of_physical_quantity");

    /** */
    public static final HqdmIri FUNCTION_ = new HqdmIri(HQDM, "function_");

    /** */
    public static final HqdmIri EVENT = new HqdmIri(HQDM, "event");

    /** */
    public static final HqdmIri DEFINED_RELATIONSHIP = new HqdmIri(HQDM, "defined_relationship");

    /** */
    public static final HqdmIri CLASS_OF_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "class_of_system_component");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SYSTEM =
            new HqdmIri(HQDM, "class_of_state_of_system");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SYSTEM_COMPONENT =
            new HqdmIri(HQDM, "class_of_state_of_system_component");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_PHYSICAL_OBJECT =
            new HqdmIri(HQDM, "class_of_state_of_physical_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ORDINARY_PHYSICAL_OBJECT =
            new HqdmIri(HQDM, "class_of_state_of_ordinary_physical_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ORDINARY_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM, "class_of_state_of_ordinary_functional_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ORDINARY_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM, "class_of_state_of_ordinary_biological_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_INTENTIONALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM, "class_of_state_of_intentionally_constructed_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM, "class_of_state_of_functional_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM, "class_of_state_of_biological_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ASSOCIATION =
            new HqdmIri(HQDM, "class_of_state_of_association");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_AMOUNT_OF_MONEY =
            new HqdmIri(HQDM, "class_of_state_of_amount_of_money");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ACTIVITY =
            new HqdmIri(HQDM, "class_of_state_of_activity");

    /** */
    public static final HqdmIri CLASS_OF_STATE = new HqdmIri(HQDM, "class_of_state");

    /** */
    public static final HqdmIri CLASS_OF_SPATIO_TEMPORAL_EXTENT =
            new HqdmIri(HQDM, "class_of_spatio_temporal_extent");

    /** */
    public static final HqdmIri CLASS_OF_RELATIONSHIP = new HqdmIri(HQDM, "class_of_relationship");

    /** */
    public static final HqdmIri CLASS_OF_POINT_IN_TIME =
            new HqdmIri(HQDM, "class_of_point_in_time");

    /** */
    public static final HqdmIri CLASS_OF_PHYSICAL_QUANTITY =
            new HqdmIri(HQDM, "class_of_physical_quantity");

    /** */
    public static final HqdmIri CLASS_OF_PHYSICAL_PROPERTY =
            new HqdmIri(HQDM, "class_of_physical_property");

    /** */
    public static final HqdmIri CLASS_OF_PHYSICAL_OBJECT =
            new HqdmIri(HQDM, "class_of_physical_object");

    /** */
    public static final HqdmIri CLASS_OF_PERIOD_OF_TIME =
            new HqdmIri(HQDM, "class_of_period_of_time");

    /** */
    public static final HqdmIri CLASS_OF_PARTICIPANT = new HqdmIri(HQDM, "class_of_participant");

    /** */
    public static final HqdmIri CLASS_OF_ORDINARY_PHYSICAL_OBJECT =
            new HqdmIri(HQDM, "class_of_ordinary_physical_object");

    /** */
    public static final HqdmIri CLASS_OF_ORDINARY_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM, "class_of_ordinary_functional_object");

    /** */
    public static final HqdmIri CLASS_OF_ORDINARY_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM, "class_of_ordinary_biological_object");

    /** */
    public static final HqdmIri CLASS_OF_INTENTIONALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM, "class_of_intentionally_constructed_object");

    /** */
    public static final HqdmIri CLASS_OF_INSTALLED_OBJECT =
            new HqdmIri(HQDM, "class_of_installed_object");

    /** */
    public static final HqdmIri CLASS_OF_INDIVIDUAL = new HqdmIri(HQDM, "class_of_individual");

    /** */
    public static final HqdmIri CLASS_OF_EVENT = new HqdmIri(HQDM, "class_of_event");

    /** */
    public static final HqdmIri CLASS_OF_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM, "class_of_functional_object");

    /** */
    public static final HqdmIri CLASS_OF_CLASS_OF_SPATIO_TEMPORAL_EXTENT =
            new HqdmIri(HQDM, "class_of_class_of_spatio_temporal_extent");

    /** */
    public static final HqdmIri CLASS_OF_CLASS = new HqdmIri(HQDM, "class_of_class");

    /** */
    public static final HqdmIri CLASS_OF_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM, "class_of_biological_object");

    /** */
    public static final HqdmIri CLASS_OF_ASSOCIATION = new HqdmIri(HQDM, "class_of_association");

    /** */
    public static final HqdmIri CLASS_OF_AMOUNT_OF_MONEY =
            new HqdmIri(HQDM, "class_of_amount_of_money");

    /** */
    public static final HqdmIri CLASS_OF_ABSTRACT_OBJECT =
            new HqdmIri(HQDM, "class_of_abstract_object");

    /** */
    public static final HqdmIri PARTICIPANT = new HqdmIri(HQDM, "participant");
}
