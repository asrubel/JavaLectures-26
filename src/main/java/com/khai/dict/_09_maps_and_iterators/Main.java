package com.khai.dict._09_maps_and_iterators;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        tryMaps();
        tryForEach();
        tryIterator();
    }

    public static void tryMaps() {
        Map<String, Integer> emptyMap = Map.of();
        Map<String, Integer> map = Map.of(
                "a", 1,
                "b", 2,
                "c", 3,
                "d", 4
        );
        System.out.println(map.size());
        System.out.println(map.get("b"));
        System.out.println(map.getOrDefault("e", 0));
        System.out.println(map.keySet());
        System.out.println(map.values());

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "a");
        hashMap.put(2, "b");
        hashMap.put(3, "c");
        hashMap.put(4, "d");
        System.out.println(hashMap);
        System.out.println(hashMap.get(3));

        hashMap.remove(3);
        System.out.println(hashMap.get(3));

        hashMap.putIfAbsent(4, "e");
        System.out.println(hashMap.get(4));

        hashMap.putIfAbsent(5, "e");
        System.out.println(hashMap.get(5));
    }

    public static void tryForEach() {
        List<String> myList = List.of("a", "b", "c", "d", "e", "f", "g", "h");
        for (String s : myList) {
            System.out.println(s);
        }
        myList.forEach(System.out::println);

        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(7);
        set.add(20);
        set.add(30);
        set.forEach(System.out::println);

        Set<Character> charSet = new LinkedHashSet<>();
        charSet.add('a');
        charSet.add('w');
        charSet.add('e');
        charSet.add('z');
        charSet.forEach(System.out::println);
    }

    public static void tryIterator() {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(5);
        set.add(7);
        set.add(20);
        set.add(30);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next < 10) {
                iterator.remove();
            }
        }
        System.out.println(set);

        List<Integer> list = List.of(1, 2, 3, 4, 5);
        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            int previousIndex = listIterator.previousIndex();
            int previousValue = listIterator.previous();
            System.out.println(previousValue + " on " + previousIndex);
        }
    }
}
