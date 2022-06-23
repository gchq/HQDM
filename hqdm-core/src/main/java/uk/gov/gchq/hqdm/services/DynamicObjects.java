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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

import uk.gov.gchq.hqdm.model.Thing;
import uk.gov.gchq.hqdm.model.impl.ThingImpl;
import uk.gov.gchq.hqdm.pojo.Top;

/**
 * Services to create dynamic proxies.
 */
public class DynamicObjects {

    /**
     * Try to create a Proxy that implements the set of specified interfaces.
     *
     * @param <T> The subtypes of {@link Thing} that we want to implement.
     * @param <U> The subtype of {@link Thing} that we want to return.
     * @param id the {@link Thing} id {@link String}
     * @param returnType the type to cast the return value to.
     * @param c the array of classes we need to implement.
     * @return an object of type U.
    */
    public static <T extends Thing, U extends Thing> U create(
            final String id, 
            final java.lang.Class<U> returnType, 
            final java.lang.Class<T>[] c) {
        
        return (U) implementInterfaces((T) new ThingImpl(id), returnType, c);
    }

    /**
     * Try to create a Proxy that implements the set of specified interfaces,
     * for an existing object.
     *
     * @param <T> The subtypes of {@link Thing} that we want to implement.
     * @param <U> The subtype of {@link Thing} that we want to return.
     * @param t the {@link Thing} to delegate the interfaces to.
     * @param returnType the type to cast the return value to.
     * @param c the array of classes we need to implement.
     * @return a U
    */
    public static <T extends Thing, U extends Thing> U implementInterfaces(
            final T t, 
            final java.lang.Class<U> returnType, 
            final java.lang.Class<T>[] c) {
        
        try {
        
            return (U) Proxy.newProxyInstance(
                        ClassServices.class.getClassLoader(), 
                        c, 
                        new ThingHandler(t));
        
        } catch (final Exception e) {
            return null;
        }
    }

    /**
     * Proxy method calls to {@link Object}.
     *
     * */
    private static class ThingHandler implements InvocationHandler {

        // The methods to be proxied.
        private final Map<String, Method> methods = new HashMap<>();

        // The object to be proxied.
        private Object target;

        /**
         * Constructor accepting the thing to be proxied.
         *
         * @param target the Object to be proxied.
        */
        public ThingHandler(final Object target) {
            this.target = target;

            // Cache the methods to be proxied.
            for (final Method method : Top.class.getDeclaredMethods()) {
                this.methods.put(method.getName(), method);
            }
        }

        /**
         * Call the requested method.
         *
         * */
        @Override
        public Object invoke(final Object proxy, final Method method, final Object[] args)
            throws Throwable {
            return methods.get(method.getName()).invoke(target, args);
        }
    }
}
