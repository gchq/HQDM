# The High Quality Data Model for Data Integration in Java

Wouldn’t it be good to be able to use data in a way that was seamless? In the quest for integrating data within and between systems we piloted the use of a data model designed to support the consistent representation of whatever is of interest to the users of systems in a dynamic environment. A prototype system used this code to allow stable model extension based on user need in a way that didn’t require many code updates. In an era of increased need for decisions supported by information from many systems this repo is offered to allow others to explore and get value from the techniques enabled by this sort of data model implementation.

HQDM contains the replication of an openly available data model based on key ontological foundations to enable the consistent integration of data. The HQDM Java package comprises a set of Java classes and respective interfaces, 230 in total, to replicate the entity-relationship model published by Dr Matthew West as the [High Quality Data Model Framework](http://www.informationjunction.co.uk/hqdm_framework/). This class model can be used to create extensions of the entity types, based on the founding ontological commitments and logical restrictions (such as cardinalities), and instances of those types all in Java application code. This, in theory at least, provides a framework for the consistent representation of almost anything that is, or could be, real\*. All the data model patterns published in the HQDM framework are supported by the HQDM package. The object properties are constructed around a top-level Java HQDM Object class with some root attributes to enable class-instances to be managed in a database. The choice of database can be left to the user but the structure of the attributes is optimised for the use of [Linked Data IRIs](https://www.w3.org/TR/rdf11-concepts/#section-IRIs) and [RDF triples](https://www.w3.org/TR/rdf11-concepts/#section-triples) to represent HQDM object relationships and other object properties as predicates. All of the HQDM objects can be created and searched using the HQDMObject methods and collections can be handled using the Object Factory. To complement this there is an OWL version of the HQDM data model that is a close match for the original EXPRESS model and the HQDM Java package.

\* This is a gross simplification, but it characterises the goal of the model and in use it has proved to be very capable. The UK's National Digital Twin programme is developing a model that aims to address this goal with even more rigour, called the Foundation Data Model (FDM). Data created using HQDM is likely to be mappable to the FDM with low mapping (due to similar ontological commitments).

## Getting Started

An introduction to [Magma Core](https://github.com/gchq/MagmaCore) and the HQDM Java object library is provided in the [Magma Core Wiki](https://github.com/gchq/MagmaCore/wiki).

### Prerequisites

- [Java 15](https://openjdk.java.net/projects/jdk/15/) - Core language
- [Maven](https://maven.apache.org/) - Dependency management

## Contributing

We welcome contributions to the project. Detailed information on our ways of working can be found [here](CONTRIBUTING.md).

In brief:

- Sign the [GCHQ Contributor Licence Agreement](https://cla-assistant.io/gchq/HQDM).
- Push your changes to new branch.
- Submit a pull request.

## License

HQDM is released under the [Apache 2.0 Licence](https://www.apache.org/licenses/LICENSE-2.0) and is covered by [Crown Copyright](https://www.nationalarchives.gov.uk/information-management/re-using-public-sector-information/copyright-and-re-use/crown-copyright/).
