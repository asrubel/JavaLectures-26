package com.khai.dict._10_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class GenericBox<T> {
    // T (type parameter) stands for "Type"
    // A type variable can be any non-primitive type you specify: any class type, any interface type, any array type.
    // By convention, type parameter names are single, uppercase letters.
    // The most commonly used type parameter names are:
    //     E - Element (used extensively by the Java Collections Framework)
    //     K - Key
    //     N - Number
    //     T - Type
    //     V - Value
    //     S,U,V etc. - 2nd, 3rd, 4th types
    private T t;

    // public static T data;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());

        // Bounded type parameters allow you to invoke methods defined on the bounds:
        System.out.println(u.intValue());
    }

    public static void printRawCollection(Collection c) {
        Iterator i = c.iterator();
        for (int k = 0; k < c.size(); k++) {
            System.out.println(i.next());
        }
    }

    public static void printCollectionWithObject(Collection<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    public static void printCollectionWithUnknownType(Collection<?> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    public void printCollectionWithSpecificType(Collection<T> collection) {
        /*if (collection instanceof ArrayList<String>) {    // Error
          for (T item : collection) {
            System.out.println(collection);
          }
        }*/

        if (collection instanceof ArrayList<?>) {         // Ok
            // ...
        }
    }

    public void boxTest(GenericBox<Number> n) {
    }

    public static <E> void append(List<E> list) {
        // E elem = new E();   // compile-time error, during type erasure type will be replaced
        // by object so you will not be able to create what you need
    }

    public static <E> void append(List<E> list, Class<E> cls) throws Exception {
        E elem = cls.newInstance();   // OK
        list.add(elem);
    }

    public static <K, V> boolean compare(
            KeyAndValue<K, V> p1,
            KeyAndValue<K, V> p2) {

        return p1.getKey().equals(p2.getKey())
                && p1.getValue().equals(p2.getValue());
    }
}
