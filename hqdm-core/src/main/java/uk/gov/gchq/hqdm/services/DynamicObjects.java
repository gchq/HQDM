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
 * Services related to HQDM Classes.
 *
 * */
public class DynamicObjects {

    /**
     * Try to create a Proxy that implements the set of specified interfaces.
     *
     * @param <T> The subtypes of {@link Thing} that we want to implement.
     * @param <U> The subtype of {@link Thing} that we want to return.
     * @param id the {@link Thing} id {@link String}
     * @param c the array of classes we need to implement.
     * @return a U
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
         * Constructor accetping the thing to be proxied.
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
