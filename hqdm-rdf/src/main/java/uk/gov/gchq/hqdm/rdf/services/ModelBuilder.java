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

package uk.gov.gchq.hqdm.rdf.services;

import static uk.gov.gchq.hqdm.rdf.iri.HQDM.ENTITY_NAME;

import java.util.ArrayList;
import java.util.List;

import uk.gov.gchq.hqdm.model.Class;
import uk.gov.gchq.hqdm.model.ClassOfStateOfFunctionalSystem;
import uk.gov.gchq.hqdm.model.ClassOfStateOfPerson;
import uk.gov.gchq.hqdm.model.KindOfAssociation;
import uk.gov.gchq.hqdm.model.KindOfBiologicalSystemComponent;
import uk.gov.gchq.hqdm.model.KindOfFunctionalSystem;
import uk.gov.gchq.hqdm.model.KindOfFunctionalSystemComponent;
import uk.gov.gchq.hqdm.model.KindOfPerson;
import uk.gov.gchq.hqdm.model.KindOfSystem;
import uk.gov.gchq.hqdm.model.KindOfSystemComponent;
import uk.gov.gchq.hqdm.model.Role;
import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.rdf.iri.HQDM;
import uk.gov.gchq.hqdm.rdf.iri.IRI;
import uk.gov.gchq.hqdm.services.ClassServices;

/**
 * Class for building HQDM models.
 */
public class ModelBuilder {
    private List<Thing> objects;

    /**
     * Constructor.
     *
     * */
    public ModelBuilder() {
        objects = new ArrayList<>();
    }

    /**
     * Get the model objects.
     *
     * @return a {@link List} of {@link Thing}
    */
    public List<Thing> getObjects() {
        return objects;
    }

    /**
     * Create a new Class.
     *
     * @param iri {@link IRI}
     * @param name {@link String}
     * @return a {@link Class}
     * */
    public Class createClass(final IRI iri, final String name) {
        final Class c = ClassServices.createClass(iri.getIri());
        c.addStringValue(ENTITY_NAME.getIri(), name);
        objects.add(c);
        return c;
    }

    /**
     * Create a new ClassOfStateOfFunctionalSystem.
     *
     * @param iri {@link IRI}
     * @param name {@link String}
     * @return a {@link ClassOfStateOfFunctionalSystem}
     * */
    public ClassOfStateOfFunctionalSystem createClassOfStateOfFunctionalSystem(final IRI iri, final String name) {
        final ClassOfStateOfFunctionalSystem c = 
            ClassServices.createClassOfStateOfFunctionalSystem(iri.getIri());
        c.addStringValue(ENTITY_NAME.getIri(), name);
        objects.add(c);
        return c;
    }

    /**
     * Create a new ClassOfStateOfPerson.
     *
     * @param iri {@link IRI}
     * @param name {@link String}
     * @return a {@link ClassOfStateOfPerson}
     * */
    public ClassOfStateOfPerson createClassOfStateOfPerson(final IRI iri, final String name) {
        final ClassOfStateOfPerson c = ClassServices.createClassOfStateOfPerson(iri.getIri());
        c.addStringValue(ENTITY_NAME.getIri(), name);
        objects.add(c);
        return c;
    }

    /**
     * Create a new KindOfAssociation.
     *
     * @param iri {@link IRI}
     * @param name {@link String}
     * @return a {@link KindOfAssociation}
     * */
    public KindOfAssociation createKindOfAssociation(final IRI iri, final String name) {
        final KindOfAssociation c = ClassServices.createKindOfAssociation(iri.getIri());
        c.addStringValue(ENTITY_NAME.getIri(), name);
        objects.add(c);
        return c;
    }

    /**
     * Create a new Role.
     *
     * @param iri {@link IRI}
     * @param name {@link String}
     * @return a {@link Role}
     * */
    public Role createRole(final IRI iri, final String name) {
        final Role c = ClassServices.createRole(iri.getIri());
        c.addStringValue(ENTITY_NAME.getIri(), name);
        objects.add(c);
        return c;
    }

    /**
     * Create a new {@link KindOfBiologicalSystemComponent}.
     *
     * @param iri {@link IRI}
     * @param name the name {@link String}
     * @return {@link KindOfBiologicalSystemComponent}
    */
    public KindOfBiologicalSystemComponent createKindOfBiologicalSystemComponent(final IRI iri, final String name) {
        final KindOfBiologicalSystemComponent c = 
                ClassServices.createKindOfBiologicalSystemComponent(iri.getIri());
        c.addStringValue(ENTITY_NAME.getIri(), name);
        objects.add(c);
        return c;
    }

    /**
     * Create a new {@link KindOfFunctionalSystem}.
     *
     * @param iri {@link IRI}
     * @param name the name {@link String}
     * @return {@link KindOfFunctionalSystem}
    */
    public KindOfFunctionalSystem createKindOfFunctionalSystem(final IRI iri, final String name) {
        final KindOfFunctionalSystem c = ClassServices.createKindOfFunctionalSystem(iri.getIri());
        c.addStringValue(ENTITY_NAME.getIri(), name);
        objects.add(c);
        return c;
    }

    /**
     * Create a new {@link KindOfFunctionalSystemComponent}.
     *
     * @param iri {@link IRI}
     * @param name the name {@link String}
     * @return {@link KindOfFunctionalSystemComponent}
    */
    public KindOfFunctionalSystemComponent createKindOfFunctionalSystemComponent(final IRI iri, final String name) {
        final KindOfFunctionalSystemComponent c = 
            ClassServices.createKindOfFunctionalSystemComponent(iri.getIri());
        c.addStringValue(ENTITY_NAME.getIri(), name);
        objects.add(c);
        return c;
    }

    /**
     * Create a new {@link KindOfPerson}.
     *
     * @param iri {@link IRI}
     * @param name the name {@link String}
     * @return {@link KindOfPerson}
    */
    public KindOfPerson createKindOfPerson(final IRI iri, final String name) {
        final KindOfPerson c = ClassServices.createKindOfPerson(iri.getIri());
        c.addStringValue(ENTITY_NAME.getIri(), name);
        objects.add(c);
        return c;
    }

    /**
     * Create a subclass relationship.
     *
     * @param superclass {@link Class}
     * @param subclass {@link Class}
     * @return {@link ModelBuilder}
    */
    public ModelBuilder addSubclass(final Class superclass, final Class subclass) {
        subclass.addValue(HQDM.HAS_SUPERCLASS.getIri(), superclass.getId());
        return this;
    }

    /**
     * Add a {@link Class} as a member__of another {@link Class}.
     *
     * @param set the {@link Class} that the member is a member__of.
     * @param member the {@link Class} that is the member of the set.
     * @return {@link ModelBuilder}
    */
    public ModelBuilder addClassMember(final Class set, final Class member) {
        member.addValue(HQDM.MEMBER__OF.getIri(), set.getId());
        return this;
    }

    /**
     * Add a HAS_COMPONENT_BY_CLASS relationship.
     *
     * @param system a {@link KindOfSystem}
     * @param component a {@link KindOfSystemComponent}
     * @return {@link ModelBuilder}
    */
    public ModelBuilder addHasComponentByClass(final KindOfSystem system, 
                                       final KindOfSystemComponent component) {
        system.addValue(HQDM.HAS_COMPONENT_BY_CLASS.getIri(), component.getId());
        return this;
    }

    /**
     * Add a CONSISTS_OF_BY_CLASS relationship.
     *
     * @param kindOfAssociation {@link KindOfAssociation}
     * @param role {@link Role}
     * @return {@link ModelBuilder}
    */
    public ModelBuilder addConsistsOfByClass(final KindOfAssociation kindOfAssociation, 
                                       final Role role) {
        kindOfAssociation.addValue(HQDM.CONSISTS_OF_BY_CLASS.getIri(), role.getId());
        return this;
    }

}
