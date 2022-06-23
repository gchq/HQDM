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

package uk.gov.gchq.hqdm.rdf;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.rdf.iri.IRI;

/**
 * Convert Things to Triple strings.
 */
public abstract class Triples {

    private static final Pattern DATE_PATTERN = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
    private static final Pattern DATE_TIME_PATTERN = Pattern.compile("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.*");

    /**
     * Convert Thing to triples.
     *
     * @param thing the {@link Thing} to convert.
     * @return a String of RDF triples.
     */
    public static String toTriples(final Thing thing) {
        final StringBuilder builder = new StringBuilder();
        builder.append('<');
        builder.append(thing.getId());
        builder.append('>');
        builder.append(' ');

        final String predicatesStr = thing.getPredicates().entrySet().stream().map(v -> {
            final String predicate = "<" + v.getKey().toString() + "> ";
            return v.getValue().stream().map(vv -> predicate + toTripleString(vv)).collect(Collectors.joining(";\n"));
        }).collect(Collectors.joining(";\n"));

        builder.append(predicatesStr);
        builder.append(".\n");
        return builder.toString();
    }

    /**
     * Convert an Object to a Triple String.
     *
     * @param object the Object to convert.
     * @return {@link String}
     */
    private static String toTripleString(final Object object) {
        final String stringValue = object.toString();
        if (object instanceof IRI) {
            return "<" + stringValue + ">";
        } else if (DATE_TIME_PATTERN.matcher(stringValue).matches()) {
            return "\"" + object + "\"^^<http://www.w3.org/2001/XMLSchema#dateTime>";
        } else if (DATE_PATTERN.matcher(stringValue).matches()) {
            return "\"" + object + "\"^^<http://www.w3.org/2001/XMLSchema#date>";
        } else if (object instanceof String) {
            return "\"\"\"" + object + "\"\"\"^^<http://www.w3.org/2001/XMLSchema#string>";
        } else if (object instanceof Integer || object instanceof Long) {
            return "\"" + object + "\"^^<http://www.w3.org/2001/XMLSchema#integer>";
        } else {
            return "\"\"\"" + stringValue + "\"\"\"";
        }
    }
}
