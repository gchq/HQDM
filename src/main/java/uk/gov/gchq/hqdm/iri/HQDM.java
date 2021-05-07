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
    public static final IriBase HQDM_PREFIX =
            new IriBase("hqdm", "http://www.semanticweb.org/magma-core/ontologies/hqdm#");

    /** */
    public static final HqdmIri ENTITY_NAME = new HqdmIri(HQDM_PREFIX, "data_EntityName");

    /** */
    public static final HqdmIri COMPONENT_BY_CLASS =
            new HqdmIri(HQDM_PREFIX, "component_by_class");

    /** */
    public static final HqdmIri SUPERCLASS = new HqdmIri(HQDM_PREFIX, "superclass");

    /** */
    public static final HqdmIri SUBCLASS = new HqdmIri(HQDM_PREFIX, "subclass");

    /** */
    public static final HqdmIri SPECIALIZATION = new HqdmIri(HQDM_PREFIX, "specialization");

    /** */
    public static final HqdmIri CLASSIFICATION = new HqdmIri(HQDM_PREFIX, "classification");

    /** */
    public static final HqdmIri CLASSIFIER = new HqdmIri(HQDM_PREFIX, "classifier");

    /** */
    public static final HqdmIri MEMBER = new HqdmIri(HQDM_PREFIX, "member");

    /** */
    public static final HqdmIri CLASS_OF_SOCIALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_socially_constructed_object");

    /** */
    public static final HqdmIri AGGREGATION = new HqdmIri(HQDM_PREFIX, "aggregation");

    /** */
    public static final HqdmIri COMPOSITION = new HqdmIri(HQDM_PREFIX, "composition");

    /** */
    public static final HqdmIri ORDINARY_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "ordinary_biological_object");

    /** */
    public static final HqdmIri PARTICIPANT_IN_ACTIVITY_OR_ASSOCIATION =
            new HqdmIri(HQDM_PREFIX, "participant_in_activity_or_association");

    /** */
    public static final HqdmIri PART = new HqdmIri(HQDM_PREFIX, "part");

    /** */
    public static final HqdmIri WHOLE = new HqdmIri(HQDM_PREFIX, "whole");

    /** */
    public static final HqdmIri TEMPORAL_COMPOSITION =
            new HqdmIri(HQDM_PREFIX, "temporal_composition");

    /** */
    public static final HqdmIri NATURAL_ROLE = new HqdmIri(HQDM_PREFIX, "natural_role");

    /** */
    public static final HqdmIri TEMPORAL_PART_OF_ = new HqdmIri(HQDM_PREFIX, "temporal_part_of_");

    /** */
    public static final HqdmIri PART__OF_BY_CLASS = new HqdmIri(HQDM_PREFIX, "part__of_by_class");

    /** */
    public static final HqdmIri CONSISTS__OF_BY_CLASS =
            new HqdmIri(HQDM_PREFIX, "consists__of_by_class");

    /** */
    public static final HqdmIri VALUE_ = new HqdmIri(HQDM_PREFIX, "value_");

    /** */
    public static final HqdmIri TEMPORAL__PART_OF = new HqdmIri(HQDM_PREFIX, "temporal__part_of");

    /** */
    public static final HqdmIri PART__OF = new HqdmIri(HQDM_PREFIX, "part__of");

    /** */
    public static final HqdmIri CONSISTS__OF = new HqdmIri(HQDM_PREFIX, "consists__of");

    /** */
    public static final HqdmIri MEMBER__OF = new HqdmIri(HQDM_PREFIX, "member__of");

    /** */
    public static final HqdmIri ABSTRACT_OBJECT = new HqdmIri(HQDM_PREFIX, "abstract_object");

    /** */
    public static final HqdmIri OWNER = new HqdmIri(HQDM_PREFIX, "owner");

    /** */
    public static final HqdmIri ENUMERATED_CLASS = new HqdmIri(HQDM_PREFIX, "enumerated_class");

    /** */
    public static final HqdmIri EMPLOYER = new HqdmIri(HQDM_PREFIX, "employer");

    /** */
    public static final HqdmIri EMPLOYEE = new HqdmIri(HQDM_PREFIX, "employee");

    /** */
    public static final HqdmIri ENDING_OF_OWNERSHIP =
            new HqdmIri(HQDM_PREFIX, "ending_of_ownership");

    /** */
    public static final HqdmIri BEGINNING_OF_OWNERSHIP =
            new HqdmIri(HQDM_PREFIX, "beginning_of_ownership");

    /** */
    public static final HqdmIri UPPER_BOUND = new HqdmIri(HQDM_PREFIX, "upper_bound");

    /** */
    public static final HqdmIri LOWER_BOUND = new HqdmIri(HQDM_PREFIX, "lower_bound");

    /** */
    public static final HqdmIri PHYSICAL_QUANTITY_RANGE =
            new HqdmIri(HQDM_PREFIX, "physical_quantity_range");

    /** */
    public static final HqdmIri RANGES_OVER = new HqdmIri(HQDM_PREFIX, "ranges_over");

    /** */
    public static final HqdmIri INTERSECTION_OF = new HqdmIri(HQDM_PREFIX, "intersection_of");

    /** */
    public static final HqdmIri DEFINED_BY = new HqdmIri(HQDM_PREFIX, "defined_by");

    /** */
    public static final HqdmIri PART_OF_PLAN = new HqdmIri(HQDM_PREFIX, "part_of_plan");

    /** */
    public static final HqdmIri REQUIREMENT = new HqdmIri(HQDM_PREFIX, "requirement");

    /** */
    public static final HqdmIri DEFINITION = new HqdmIri(HQDM_PREFIX, "definition");

    /** */
    public static final HqdmIri DESCRIPTION = new HqdmIri(HQDM_PREFIX, "description");

    /** */
    public static final HqdmIri CONSISTS_OF_IN_MEMBERS =
            new HqdmIri(HQDM_PREFIX, "consists_of_in_members");

    /** */
    public static final HqdmIri REPRESENTATION_BY_PATTERN =
            new HqdmIri(HQDM_PREFIX, "representation_by_pattern");

    /** */
    public static final HqdmIri CLASS_OF_REPRESENTATION =
            new HqdmIri(HQDM_PREFIX, "class_of_representation");

    /** */
    public static final HqdmIri MEMBER_OF_ = new HqdmIri(HQDM_PREFIX, "member_of_");

    /** */
    public static final HqdmIri ACTIVITY = new HqdmIri(HQDM_PREFIX, "activity");

    /** */
    public static final HqdmIri STATE_OF_SIGN = new HqdmIri(HQDM_PREFIX, "state_of_sign");

    /** */
    public static final HqdmIri PRODUCT_OFFERING = new HqdmIri(HQDM_PREFIX, "product_offering");

    /** */
    public static final HqdmIri PERIOD_OFFERED = new HqdmIri(HQDM_PREFIX, "period_offered");

    /** */
    public static final HqdmIri OFFEROR = new HqdmIri(HQDM_PREFIX, "offeror");

    /** */
    public static final HqdmIri CONSIDERATION_BY_CLASS =
            new HqdmIri(HQDM_PREFIX, "consideration_by_class");

    /** */
    public static final HqdmIri CLASS_OF_OFFERED = new HqdmIri(HQDM_PREFIX, "class_of_offered");

    /** */
    public static final HqdmIri OFFERING = new HqdmIri(HQDM_PREFIX, "offering");

    /** */
    public static final HqdmIri SUCCESSOR = new HqdmIri(HQDM_PREFIX, "successor");

    /** */
    public static final HqdmIri SOLD_AS = new HqdmIri(HQDM_PREFIX, "sold_as");

    /** */
    public static final HqdmIri SALES_PRODUCT_VERSION =
            new HqdmIri(HQDM_PREFIX, "sales_product_version");

    /** */
    public static final HqdmIri MEETS_SPECIFICATION =
            new HqdmIri(HQDM_PREFIX, "meets_specification");

    /** */
    public static final HqdmIri SOLD_UNDER = new HqdmIri(HQDM_PREFIX, "sold_under");

    /** */
    public static final HqdmIri SALES_PRODUCT = new HqdmIri(HQDM_PREFIX, "sales_product");

    /** */
    public static final HqdmIri ASSOCIATION = new HqdmIri(HQDM_PREFIX, "association");

    /** */
    public static final HqdmIri CLASS = new HqdmIri(HQDM_PREFIX, "class");

    /** */
    public static final HqdmIri CLASS_OF_ACTIVITY = new HqdmIri(HQDM_PREFIX, "class_of_activity");

    /** */
    public static final HqdmIri CLASS_OF_FUNCTIONAL_SYSTEM =
            new HqdmIri(HQDM_PREFIX, "class_of_functional_system");

    /** */
    public static final HqdmIri CLASS_OF_ORGANIZATION =
            new HqdmIri(HQDM_PREFIX, "class_of_organization");

    /** */
    public static final HqdmIri KIND_OF_ORGANIZATION =
            new HqdmIri(HQDM_PREFIX, "kind_of_organization");

    /** */
    public static final HqdmIri CLASS_OF_POSSIBLE_WORLD =
            new HqdmIri(HQDM_PREFIX, "class_of_possible_world");

    /** */
    public static final HqdmIri CLASS_OF_SYSTEM = new HqdmIri(HQDM_PREFIX, "class_of_system");

    /** */
    public static final HqdmIri FUNCTIONAL_SYSTEM = new HqdmIri(HQDM_PREFIX, "functional_system");

    /** */
    public static final HqdmIri IDENTIFICATION = new HqdmIri(HQDM_PREFIX, "identification");

    /** */
    public static final HqdmIri KIND_OF_ACTIVITY = new HqdmIri(HQDM_PREFIX, "kind_of_activity");

    /** */
    public static final HqdmIri KIND_OF_ASSOCIATION =
            new HqdmIri(HQDM_PREFIX, "kind_of_association");

    /** */
    public static final HqdmIri KIND_OF_INDIVIDUAL =
            new HqdmIri(HQDM_PREFIX, "kind_of_individual");

    /** */
    public static final HqdmIri ORGANIZATION = new HqdmIri(HQDM_PREFIX, "organization");

    /** */
    public static final HqdmIri PATTERN = new HqdmIri(HQDM_PREFIX, "pattern");

    /** */
    public static final HqdmIri PERSON = new HqdmIri(HQDM_PREFIX, "person");

    /** */
    public static final HqdmIri POINT_IN_TIME = new HqdmIri(HQDM_PREFIX, "point_in_time");

    /** */
    public static final HqdmIri POSSIBLE_WORLD = new HqdmIri(HQDM_PREFIX, "possible_world");

    /** */
    public static final HqdmIri RECOGNIZING_LANGUAGE_COMMUNITY =
            new HqdmIri(HQDM_PREFIX, "recognizing_language_community");

    /** */
    public static final HqdmIri REPRESENTATION_BY_SIGN =
            new HqdmIri(HQDM_PREFIX, "representation_by_sign");

    /** */
    public static final HqdmIri SIGN = new HqdmIri(HQDM_PREFIX, "sign");

    /** */
    public static final HqdmIri SPATIO_TEMPORAL_EXTENT =
            new HqdmIri(HQDM_PREFIX, "spatio_temporal_extent");

    /** */
    public static final HqdmIri THING = new HqdmIri(HQDM_PREFIX, "thing");

    /** */
    public static final HqdmIri PART_OF_BY_CLASS = new HqdmIri(HQDM_PREFIX, "part_of_by_class");

    /** */
    public static final HqdmIri CONSISTS_OF_BY_CLASS =
            new HqdmIri(HQDM_PREFIX, "consists_of_by_class");

    /** */
    public static final HqdmIri INTENDED_ROLE_BY_CLASS =
            new HqdmIri(HQDM_PREFIX, "intended_role_by_class");

    /** */
    public static final HqdmIri HAS_COMPONENT_BY_CLASS =
            new HqdmIri(HQDM_PREFIX, "has_component_by_class");

    /** */
    public static final HqdmIri NATURAL_ROLE_BY_CLASS =
            new HqdmIri(HQDM_PREFIX, "natural_role_by_class");

    /** */
    public static final HqdmIri USES = new HqdmIri(HQDM_PREFIX, "uses");

    /** */
    public static final HqdmIri REPRESENTED = new HqdmIri(HQDM_PREFIX, "represented");

    /** */
    public static final HqdmIri DOMAIN = new HqdmIri(HQDM_PREFIX, "domain");

    /** */
    public static final HqdmIri UNIT = new HqdmIri(HQDM_PREFIX, "unit");

    /** */
    public static final HqdmIri CONSISTS_OF_PARTICIPANT =
            new HqdmIri(HQDM_PREFIX, "consists_of_participant");

    /** */
    public static final HqdmIri CONSISTS_OF_PARTICIPANT_ =
            new HqdmIri(HQDM_PREFIX, "consists_of_participant_");

    /** */
    public static final HqdmIri DETERMINES = new HqdmIri(HQDM_PREFIX, "determines");

    /** */
    public static final HqdmIri ROLE = new HqdmIri(HQDM_PREFIX, "role");

    /** */
    public static final HqdmIri PART_OF_BY_CLASS_ = new HqdmIri(HQDM_PREFIX, "part_of_by_class_");

    /** */
    public static final HqdmIri CONSISTS_OF_BY_CLASS_ =
            new HqdmIri(HQDM_PREFIX, "consists_of_by_class_");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SOCIALLY_CONSTRUCTED_ACTIVITY = new HqdmIri(
            HQDM_PREFIX, "class_of_state_of_socially_constructed_activity");

    /** */
    public static final HqdmIri CAUSES_BY_CLASS = new HqdmIri(HQDM_PREFIX, "causes_by_class");

    /** */
    public static final HqdmIri REFERENCES_BY_CLASS =
            new HqdmIri(HQDM_PREFIX, "references_by_class");

    /** */
    public static final HqdmIri DETERMINES_BY_CLASS =
            new HqdmIri(HQDM_PREFIX, "determines_by_class");

    /** */
    public static final HqdmIri CLASS_OF_SOCIALLY_CONSTRUCTED_ACTIVITY =
            new HqdmIri(HQDM_PREFIX, "class_of_socially_constructed_activity");

    /** */
    public static final HqdmIri STATE_OF_SYSTEM = new HqdmIri(HQDM_PREFIX, "state_of_system");

    /** */
    public static final HqdmIri SYSTEM = new HqdmIri(HQDM_PREFIX, "system");

    /** */
    public static final HqdmIri CLASS_OF_BIOLOGICAL_SYSTEM =
            new HqdmIri(HQDM_PREFIX, "class_of_biological_system");

    /** */
    public static final HqdmIri CLASS_OF_PARTY = new HqdmIri(HQDM_PREFIX, "class_of_party");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_FUNCTIONAL_SYSTEM =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_functional_system");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_BIOLOGICAL_SYSTEM =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_biological_system");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_PARTY =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_party");

    /** */
    public static final HqdmIri STATE_OF_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "state_of_system_component");

    /** */
    public static final HqdmIri SYSTEM_COMPONENT = new HqdmIri(HQDM_PREFIX, "system_component");

    /** */
    public static final HqdmIri COMPONENT_OF = new HqdmIri(HQDM_PREFIX, "component_of");

    /** */
    public static final HqdmIri CLASS_OF_FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "class_of_functional_system_component");

    /** */
    public static final HqdmIri CLASS_OF_BIOLOGICAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "class_of_biological_system_component");

    /** */
    public static final HqdmIri CLASS_OF_ORGANIZATION_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "class_of_organization_component");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_FUNCTIONAL_SYSTEM_COMPONENT = new HqdmIri(
            HQDM_PREFIX, "class_of_state_of_functional_system_component");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_BIOLOGICAL_SYSTEM_COMPONENT = new HqdmIri(
            HQDM_PREFIX, "class_of_state_of_biological_system_component");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ORGANIZATION_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_organization_component");

    /** */
    public static final HqdmIri INSTALLED_OBJECT = new HqdmIri(HQDM_PREFIX, "installed_object");

    /** */
    public static final HqdmIri STATE_OF_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "state_of_biological_object");

    /** */
    public static final HqdmIri BIOLOGICAL_OBJECT = new HqdmIri(HQDM_PREFIX, "biological_object");

    /** */
    public static final HqdmIri STATE_OF_ORDINARY_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "state_of_ordinary_biological_object");

    /** */
    public static final HqdmIri CLASS_OF_IN_PLACE_BIOLOGICAL_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "class_of_in_place_biological_component");

    /** */
    public static final HqdmIri STATE_OF_BIOLOGICAL_SYSTEM =
            new HqdmIri(HQDM_PREFIX, "state_of_biological_system");

    /** */
    public static final HqdmIri BIOLOGICAL_SYSTEM = new HqdmIri(HQDM_PREFIX, "biological_system");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_PERSON =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_person");

    /** */
    public static final HqdmIri CLASS_OF_PERSON = new HqdmIri(HQDM_PREFIX, "class_of_person");

    /** */
    public static final HqdmIri STATE_OF_PERSON = new HqdmIri(HQDM_PREFIX, "state_of_person");

    /** */
    public static final HqdmIri KIND_OF_PERSON = new HqdmIri(HQDM_PREFIX, "kind_of_person");

    /** */
    public static final HqdmIri BIOLOGICAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "biological_system_component");

    /** */
    public static final HqdmIri IN_PLACE_BIOLOGICAL_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "in_place_biological_component");

    /** */
    public static final HqdmIri STATE_OF_INTENTIONALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM_PREFIX, "state_of_intentionally_constructed_object");

    /** */
    public static final HqdmIri INTENTIONALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM_PREFIX, "intentionally_constructed_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SOCIALLY_CONSTRUCTED_OBJECT = new HqdmIri(
            HQDM_PREFIX, "class_of_state_of_socially_constructed_object");

    /** */
    public static final HqdmIri CLASS_OF_SOCIALLY_CONTRUCTED_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_socially_contructed_object");

    /** */
    public static final HqdmIri STATE_OF_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "state_of_functional_object");

    /** */
    public static final HqdmIri FUNCTIONAL_OBJECT = new HqdmIri(HQDM_PREFIX, "functional_object");

    /** */
    public static final HqdmIri INTENDED_ROLE = new HqdmIri(HQDM_PREFIX, "intended_role");

    /** */
    public static final HqdmIri STATE_OF_ORDINARY_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "state_of_ordinary_functional_object");

    /** */
    public static final HqdmIri ORDINARY_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "ordinary_functional_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SALES_PRODUCT_INSTANCE =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_sales_product_instance");

    /** */
    public static final HqdmIri CLASS_OF_SALES_PRODUCT_INSTANCE =
            new HqdmIri(HQDM_PREFIX, "class_of_sales_product_instance");

    /** */
    public static final HqdmIri STATE_OF_FUNCTIONAL_SYSTEM =
            new HqdmIri(HQDM_PREFIX, "state_of_functional_system");

    /** */
    public static final HqdmIri STATE_OF_FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "state_of_functional_system_component");

    /** */
    public static final HqdmIri INSTALLED_FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "installed_functional_system_component");

    /** */
    public static final HqdmIri FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "functional_system_component");

    /** */
    public static final HqdmIri CLASS_OF_INSTALLED_FUNCTIONAL_SYSTEM_COMPONENT = new HqdmIri(
            HQDM_PREFIX, "class_of_installed_functional_system_component");

    /** */
    public static final HqdmIri STATE_OF_SOCIALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM_PREFIX, "state_of_socially_constructed_object");

    /** */
    public static final HqdmIri SOCIALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM_PREFIX, "socially_constructed_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ORGANIZATION =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_organization");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SIGN =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_sign");

    /** */
    public static final HqdmIri CLASS_OF_SIGN = new HqdmIri(HQDM_PREFIX, "class_of_sign");

    /** */
    public static final HqdmIri STATE_OF_PARTY = new HqdmIri(HQDM_PREFIX, "state_of_party");

    /** */
    public static final HqdmIri PARTY = new HqdmIri(HQDM_PREFIX, "party");

    /** */
    public static final HqdmIri STATE_OF_ORGANIZATION =
            new HqdmIri(HQDM_PREFIX, "state_of_organization");

    /** */
    public static final HqdmIri STATE_OF_LANGUAGE_COMMUNITY =
            new HqdmIri(HQDM_PREFIX, "state_of_language_community");

    /** */
    public static final HqdmIri LANGUAGE_COMMUNITY = new HqdmIri(HQDM_PREFIX, "language_community");

    /** */
    public static final HqdmIri EMPLOYMENT = new HqdmIri(HQDM_PREFIX, "employment");

    /** */
    public static final HqdmIri STATE_OF_ORGANIZATION_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "state_of_organization_component");

    /** */
    public static final HqdmIri ORGANIZATION_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "organization_component");

    /** */
    public static final HqdmIri STATE_OF_POSITION = new HqdmIri(HQDM_PREFIX, "state_of_position");

    /** */
    public static final HqdmIri PERSON_IN_POSITION = new HqdmIri(HQDM_PREFIX, "person_in_position");

    /** */
    public static final HqdmIri POSITION = new HqdmIri(HQDM_PREFIX, "position");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_POSITION =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_position");

    /** */
    public static final HqdmIri CLASS_OF_PERSON_IN_POSITION =
            new HqdmIri(HQDM_PREFIX, "class_of_person_in_position");

    /** */
    public static final HqdmIri CLASS_OF_POSITION = new HqdmIri(HQDM_PREFIX, "class_of_position");

    /** */
    public static final HqdmIri KIND_OF_POSITION = new HqdmIri(HQDM_PREFIX, "kind_of_position");

    /** */
    public static final HqdmIri STATE_OF_AMOUNT_OF_MONEY =
            new HqdmIri(HQDM_PREFIX, "state_of_amount_of_money");

    /** */
    public static final HqdmIri AMOUNT_OF_MONEY = new HqdmIri(HQDM_PREFIX, "amount_of_money");

    /** */
    public static final HqdmIri MEMBER_OF_CURRENCY = new HqdmIri(HQDM_PREFIX, "member_of_currency");

    /** */
    public static final HqdmIri CURRENCY = new HqdmIri(HQDM_PREFIX, "currency");

    /** */
    public static final HqdmIri PRICE = new HqdmIri(HQDM_PREFIX, "price");

    /** */
    public static final HqdmIri OWNERSHIP = new HqdmIri(HQDM_PREFIX, "ownership");

    /** */
    public static final HqdmIri MONEY_ASSET = new HqdmIri(HQDM_PREFIX, "money_asset");

    /** */
    public static final HqdmIri ASSET = new HqdmIri(HQDM_PREFIX, "asset");

    /** */
    public static final HqdmIri TRANSFER_OF_OWNERSHIP =
            new HqdmIri(HQDM_PREFIX, "transfer_of_ownership");

    /** */
    public static final HqdmIri CAUSES_BEGINNING = new HqdmIri(HQDM_PREFIX, "causes_beginning");

    /** */
    public static final HqdmIri CAUSES_ENDING = new HqdmIri(HQDM_PREFIX, "causes_ending");

    /** */
    public static final HqdmIri TRANSFEROR = new HqdmIri(HQDM_PREFIX, "transferor");

    /** */
    public static final HqdmIri TRANSFEREE = new HqdmIri(HQDM_PREFIX, "transferee");

    /** */
    public static final HqdmIri TRANSFER_OF_OWNERSHIP_OF_MONEY =
            new HqdmIri(HQDM_PREFIX, "transfer_of_ownership_of_money");

    /** */
    public static final HqdmIri REACHING_AGREEMENT =
            new HqdmIri(HQDM_PREFIX, "reaching_agreement");

    /** */
    public static final HqdmIri AGREEMENT_PROCESS = new HqdmIri(HQDM_PREFIX, "agreement_process");

    /** */
    public static final HqdmIri AGREEMENT_EXECUTION =
            new HqdmIri(HQDM_PREFIX, "agreement_execution");

    /** */
    public static final HqdmIri OFFER = new HqdmIri(HQDM_PREFIX, "offer");

    /** */
    public static final HqdmIri ACCEPTANCE_OF_OFFER =
            new HqdmIri(HQDM_PREFIX, "acceptance_of_offer");

    /** */
    public static final HqdmIri CLASS_OF_REACHING_AGREEMENT =
            new HqdmIri(HQDM_PREFIX, "class_of_reaching_agreement");

    /** */
    public static final HqdmIri CLASS_OF_AGREEMENT_PROCESS =
            new HqdmIri(HQDM_PREFIX, "class_of_agreement_process");

    /** */
    public static final HqdmIri CLASS_OF_AGREEMENT_EXECUTION =
            new HqdmIri(HQDM_PREFIX, "class_of_agreement_execution");

    /** */
    public static final HqdmIri CLASS_OF_OFFER = new HqdmIri(HQDM_PREFIX, "class_of_offer");

    /** */
    public static final HqdmIri AGREE_CONTRACT = new HqdmIri(HQDM_PREFIX, "agree_contract");

    /** */
    public static final HqdmIri CONTRACT_PROCESS = new HqdmIri(HQDM_PREFIX, "contract_process");

    /** */
    public static final HqdmIri CONTRACT_EXECUTION =
            new HqdmIri(HQDM_PREFIX, "contract_execution");

    /** */
    public static final HqdmIri CLASS_OF_AGREE_CONTRACT =
            new HqdmIri(HQDM_PREFIX, "class_of_agree_contract");

    /** */
    public static final HqdmIri CLASS_OF_CONTRACT_PROCESS =
            new HqdmIri(HQDM_PREFIX, "class_of_contract_process");

    /** */
    public static final HqdmIri CLASS_OF_CONTRACT_EXECUTION =
            new HqdmIri(HQDM_PREFIX, "class_of_contract_execution");

    /** */
    public static final HqdmIri CONSISTS_OF_ = new HqdmIri(HQDM_PREFIX, "consists_of_");

    /** */
    public static final HqdmIri OFFER_AND_ACCEPTANCE_FOR_GOODS =
            new HqdmIri(HQDM_PREFIX, "offer_and_acceptance_for_goods");

    /** */
    public static final HqdmIri SALE_OF_GOODS = new HqdmIri(HQDM_PREFIX, "sale_of_goods");

    /** */
    public static final HqdmIri EXCHANGE_OF_GOODS_AND_MONEY =
            new HqdmIri(HQDM_PREFIX, "exchange_of_goods_and_money");

    /** */
    public static final HqdmIri OFFER_FOR_GOODS = new HqdmIri(HQDM_PREFIX, "offer_for_goods");

    /** */
    public static final HqdmIri ACCEPTANCE_OF_OFFER_FOR_GOODS =
            new HqdmIri(HQDM_PREFIX, "acceptance_of_offer_for_goods");

    /** */
    public static final HqdmIri STATE_OF_SALES_PRODUCT_INSTANCE =
            new HqdmIri(HQDM_PREFIX, "state_of_sales_product_instance");

    /** */
    public static final HqdmIri SALES_PRODUCT_INSTANCE =
            new HqdmIri(HQDM_PREFIX, "sales_product_instance");

    /** */
    public static final HqdmIri PRODUCT_BRAND = new HqdmIri(HQDM_PREFIX, "product_brand");

    /** */
    public static final HqdmIri ROLES = new HqdmIri(HQDM_PREFIX, "roles");

    /** */
    public static final HqdmIri AGGREGATED_INTO = new HqdmIri(HQDM_PREFIX, "aggregated_into");

    /** */
    public static final HqdmIri AGGREGATE_OF_PART = new HqdmIri(HQDM_PREFIX, "aggregate_of");

    /** */
    public static final HqdmIri BEGINNING = new HqdmIri(HQDM_PREFIX, "beginning");

    /** */
    public static final HqdmIri CAUSES = new HqdmIri(HQDM_PREFIX, "causes");

    /** */
    public static final HqdmIri CONSISTS_OF = new HqdmIri(HQDM_PREFIX, "consists_of");

    /** */
    public static final HqdmIri CONSISTS_OF_PART = new HqdmIri(HQDM_PREFIX, "consists_of_part");

    /** */
    public static final HqdmIri ENDING = new HqdmIri(HQDM_PREFIX, "ending");

    /** */
    public static final HqdmIri ENTITY_ID = new HqdmIri(HQDM_PREFIX, "data_uniqueID");

    /** */
    public static final HqdmIri HAS_CLASS_MEMBER = new HqdmIri(HQDM_PREFIX, "has_class_member");

    /** */
    public static final HqdmIri HAS_KIND_MEMBER = new HqdmIri(HQDM_PREFIX, "has_kind_member");

    /** */
    public static final HqdmIri HAS_SUBCLASS = new HqdmIri(HQDM_PREFIX, "has_subclass");

    /** */
    public static final HqdmIri HAS_SUPERCLASS = new HqdmIri(HQDM_PREFIX, "has_superclass");

    /** */
    public static final HqdmIri MEMBER_OF = new HqdmIri(HQDM_PREFIX, "member_of");

    /** */
    public static final HqdmIri MEMBER_OF_KIND = new HqdmIri(HQDM_PREFIX, "member_of_kind");

    /** */
    public static final HqdmIri PARTICIPANT_IN = new HqdmIri(HQDM_PREFIX, "participant_in");

    /** */
    public static final HqdmIri PART_OF = new HqdmIri(HQDM_PREFIX, "part_of");

    /** */
    public static final HqdmIri PART_OF_ = new HqdmIri(HQDM_PREFIX, "part_of_");

    /** */
    public static final HqdmIri PART_OF_POSSIBLE_WORLD =
            new HqdmIri(HQDM_PREFIX, "part_of_possible_world");

    /** */
    public static final HqdmIri POSSIBLE_WORLD_PART =
            new HqdmIri(HQDM_PREFIX, "possible_world_part");

    /** */
    public static final HqdmIri REFERENCES = new HqdmIri(HQDM_PREFIX, "references");

    /** */
    public static final HqdmIri REPRESENTS = new HqdmIri(HQDM_PREFIX, "represents");

    /** */
    public static final HqdmIri SIGN_VALUE = new HqdmIri(HQDM_PREFIX, "sign_value");

    /** */
    public static final HqdmIri TEMPORAL_CONSISTS_OF =
            new HqdmIri(HQDM_PREFIX, "temporal_consists_of");

    /** */
    public static final HqdmIri TEMPORAL_PART_OF = new HqdmIri(HQDM_PREFIX, "temporal_part_of");

    /** */
    public static final HqdmIri REQUIRED_ROLE_PLAYER =
            new HqdmIri(HQDM_PREFIX, "required_role_player");

    /** */
    public static final HqdmIri INVOLVES = new HqdmIri(HQDM_PREFIX, "involves");

    /** */
    public static final HqdmIri STATE_OF_BIOLOGICAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "state_of_biological_system_component");

    /** */
    public static final HqdmIri UNIT_OF_MEASURE = new HqdmIri(HQDM_PREFIX, "unit_of_measure");

    /** */
    public static final HqdmIri STATE_OF_SOCIALLY_CONSTRUCTED_ACTIVITY =
            new HqdmIri(HQDM_PREFIX, "state_of_socially_constructed_activity");

    /** */
    public static final HqdmIri STATE_OF_PHYSICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "state_of_physical_object");

    /** */
    public static final HqdmIri STATE_OF_ORDINARY_PHYSICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "state_of_ordinary_physical_object");

    /** */
    public static final HqdmIri STATE_OF_ASSOCIATION =
            new HqdmIri(HQDM_PREFIX, "state_of_association");

    /** */
    public static final HqdmIri STATE_OF_ACTIVITY = new HqdmIri(HQDM_PREFIX, "state_of_activity");

    /** */
    public static final HqdmIri STATE = new HqdmIri(HQDM_PREFIX, "state");

    /** */
    public static final HqdmIri SOCIALLY_CONSTRUCTED_ACTIVITY =
            new HqdmIri(HQDM_PREFIX, "socially_constructed_activity");

    /** */
    public static final HqdmIri SCALE = new HqdmIri(HQDM_PREFIX, "scale");

    /** */
    public static final HqdmIri REQUIREMENT_SPECIFICATION =
            new HqdmIri(HQDM_PREFIX, "requirement_specification");

    /** */
    public static final HqdmIri RELATIONSHIP = new HqdmIri(HQDM_PREFIX, "relationship");

    /** */
    public static final HqdmIri PLAN = new HqdmIri(HQDM_PREFIX, "plan");

    /** */
    public static final HqdmIri PHYSICAL_QUANTITY = new HqdmIri(HQDM_PREFIX, "physical_quantity");

    /** */
    public static final HqdmIri PHYSICAL_PROPERTY_RANGE =
            new HqdmIri(HQDM_PREFIX, "physical_property_range");

    /** */
    public static final HqdmIri PHYSICAL_PROPERTY = new HqdmIri(HQDM_PREFIX, "physical_property");

    /** */
    public static final HqdmIri PHYSICAL_OBJECT = new HqdmIri(HQDM_PREFIX, "physical_object");

    /** */
    public static final HqdmIri PERIOD_OF_TIME = new HqdmIri(HQDM_PREFIX, "period_of_time");

    /** */
    public static final HqdmIri ORDINARY_PHYSICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "ordinary_physical_object");

    /** */
    public static final HqdmIri KIND_OF_SYSTEM = new HqdmIri(HQDM_PREFIX, "kind_of_system");

    /** */
    public static final HqdmIri KIND_OF_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "kind_of_system_component");

    /** */
    public static final HqdmIri KIND_OF_SOCIALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM_PREFIX, "kind_of_socially_constructed_object");

    /** */
    public static final HqdmIri KIND_OF_RELATIONSHIP_WITH_SIGNATURE =
            new HqdmIri(HQDM_PREFIX, "kind_of_relationship_with_signature");

    /** */
    public static final HqdmIri KIND_OF_RELATIONSHIP_WITH_RESTRICTION =
            new HqdmIri(HQDM_PREFIX, "kind_of_relationship_with_restriction");

    /** */
    public static final HqdmIri KIND_OF_PHYSICAL_QUANTITY =
            new HqdmIri(HQDM_PREFIX, "kind_of_physical_quantity");

    /** */
    public static final HqdmIri KIND_OF_PHYSICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "kind_of_physical_object");

    /** */
    public static final HqdmIri KIND_OF_PHYSICAL_PROPERTY =
            new HqdmIri(HQDM_PREFIX, "kind_of_physical_property");

    /** */
    public static final HqdmIri KIND_OF_ORGANIZATION_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "kind_of_organization_component");

    /** */
    public static final HqdmIri KIND_OF_PARTY = new HqdmIri(HQDM_PREFIX, "kind_of_party");

    /** */
    public static final HqdmIri KIND_OF_ORDINARY_PHYSICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "kind_of_ordinary_physical_object");

    /** */
    public static final HqdmIri KIND_OF_ORDINARY_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "kind_of_ordinary_functional_object");

    /** */
    public static final HqdmIri KIND_OF_INTENTIONALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM_PREFIX, "kind_of_intentionally_constructed_object");

    /** */
    public static final HqdmIri KIND_OF_ORDINARY_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "kind_of_ordinary_biological_object");

    /** */
    public static final HqdmIri KIND_OF_FUNCTIONAL_SYSTEM =
            new HqdmIri(HQDM_PREFIX, "kind_of_functional_system");

    /** */
    public static final HqdmIri KIND_OF_FUNCTIONAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "kind_of_functional_system_component");

    /** */
    public static final HqdmIri KIND_OF_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "kind_of_functional_object");

    /** */
    public static final HqdmIri KIND_OF_BIOLOGICAL_SYSTEM =
            new HqdmIri(HQDM_PREFIX, "kind_of_biological_system");

    /** */
    public static final HqdmIri KIND_OF_BIOLOGICAL_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "kind_of_biological_system_component");

    /** */
    public static final HqdmIri KIND_OF_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "kind_of_biological_object");

    /** */
    public static final HqdmIri INDIVIDUAL = new HqdmIri(HQDM_PREFIX, "individual");

    /** */
    public static final HqdmIri IDENTIFICATION_OF_PHYSICAL_QUANTITY =
            new HqdmIri(HQDM_PREFIX, "identification_of_physical_quantity");

    /** */
    public static final HqdmIri FUNCTION_ = new HqdmIri(HQDM_PREFIX, "function_");

    /** */
    public static final HqdmIri EVENT = new HqdmIri(HQDM_PREFIX, "event");

    /** */
    public static final HqdmIri DEFINED_RELATIONSHIP =
            new HqdmIri(HQDM_PREFIX, "defined_relationship");

    /** */
    public static final HqdmIri CLASS_OF_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "class_of_system_component");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SYSTEM =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_system");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_SYSTEM_COMPONENT =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_system_component");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_PHYSICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_physical_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ORDINARY_PHYSICAL_OBJECT = new HqdmIri(
            HQDM_PREFIX, "class_of_state_of_ordinary_physical_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ORDINARY_FUNCTIONAL_OBJECT = new HqdmIri(
            HQDM_PREFIX, "class_of_state_of_ordinary_functional_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ORDINARY_BIOLOGICAL_OBJECT = new HqdmIri(
            HQDM_PREFIX, "class_of_state_of_ordinary_biological_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_INTENTIONALLY_CONSTRUCTED_OBJECT = new HqdmIri(
            HQDM_PREFIX, "class_of_state_of_intentionally_constructed_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_functional_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_biological_object");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ASSOCIATION =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_association");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_AMOUNT_OF_MONEY =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_amount_of_money");

    /** */
    public static final HqdmIri CLASS_OF_STATE_OF_ACTIVITY =
            new HqdmIri(HQDM_PREFIX, "class_of_state_of_activity");

    /** */
    public static final HqdmIri CLASS_OF_STATE = new HqdmIri(HQDM_PREFIX, "class_of_state");

    /** */
    public static final HqdmIri CLASS_OF_SPATIO_TEMPORAL_EXTENT =
            new HqdmIri(HQDM_PREFIX, "class_of_spatio_temporal_extent");

    /** */
    public static final HqdmIri CLASS_OF_RELATIONSHIP =
            new HqdmIri(HQDM_PREFIX,
                    "class_of_relationship");

    /** */
    public static final HqdmIri CLASS_OF_POINT_IN_TIME =
            new HqdmIri(HQDM_PREFIX, "class_of_point_in_time");

    /** */
    public static final HqdmIri CLASS_OF_PHYSICAL_QUANTITY =
            new HqdmIri(HQDM_PREFIX, "class_of_physical_quantity");

    /** */
    public static final HqdmIri CLASS_OF_PHYSICAL_PROPERTY =
            new HqdmIri(HQDM_PREFIX, "class_of_physical_property");

    /** */
    public static final HqdmIri CLASS_OF_PHYSICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_physical_object");

    /** */
    public static final HqdmIri CLASS_OF_PERIOD_OF_TIME =
            new HqdmIri(HQDM_PREFIX, "class_of_period_of_time");

    /** */
    public static final HqdmIri CLASS_OF_PARTICIPANT =
            new HqdmIri(HQDM_PREFIX, "class_of_participant");

    /** */
    public static final HqdmIri CLASS_OF_ORDINARY_PHYSICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_ordinary_physical_object");

    /** */
    public static final HqdmIri CLASS_OF_ORDINARY_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_ordinary_functional_object");

    /** */
    public static final HqdmIri CLASS_OF_ORDINARY_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_ordinary_biological_object");

    /** */
    public static final HqdmIri CLASS_OF_INTENTIONALLY_CONSTRUCTED_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_intentionally_constructed_object");

    /** */
    public static final HqdmIri CLASS_OF_INSTALLED_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_installed_object");

    /** */
    public static final HqdmIri CLASS_OF_INDIVIDUAL =
            new HqdmIri(HQDM_PREFIX, "class_of_individual");

    /** */
    public static final HqdmIri CLASS_OF_EVENT =
            new HqdmIri(HQDM_PREFIX, "class_of_event");

    /** */
    public static final HqdmIri CLASS_OF_FUNCTIONAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_functional_object");

    /** */
    public static final HqdmIri CLASS_OF_CLASS_OF_SPATIO_TEMPORAL_EXTENT =
            new HqdmIri(HQDM_PREFIX, "class_of_class_of_spatio_temporal_extent");

    /** */
    public static final HqdmIri CLASS_OF_CLASS = new HqdmIri(HQDM_PREFIX, "class_of_class");

    /** */
    public static final HqdmIri CLASS_OF_BIOLOGICAL_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_biological_object");

    /** */
    public static final HqdmIri CLASS_OF_ASSOCIATION =
            new HqdmIri(HQDM_PREFIX, "class_of_association");

    /** */
    public static final HqdmIri CLASS_OF_AMOUNT_OF_MONEY =
            new HqdmIri(HQDM_PREFIX, "class_of_amount_of_money");

    /** */
    public static final HqdmIri CLASS_OF_ABSTRACT_OBJECT =
            new HqdmIri(HQDM_PREFIX, "class_of_abstract_object");

    /** */
    public static final HqdmIri PARTICIPANT = new HqdmIri(HQDM_PREFIX, "participant");
}
