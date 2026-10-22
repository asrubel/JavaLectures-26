package com.khai.dict._08_collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //compareMutableVsImmutable();
        //workingWithLists();
        workingWithSets();
    }

    public static void compareMutableVsImmutable() {
        List<String> emptyList = Collections.emptyList();
        Set<Integer> emptySet = Collections.emptySet();

        List<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        System.out.println(numList);

        List<Integer> immutableList = Collections.unmodifiableList(numList);
        //immutableList.add(3);
        System.out.println(immutableList);

        List<Integer> numbers = new ArrayList<>(List.of(8, 6, 9, 1, 0, 2, 10, 7, 1));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        Collections.shuffle(numbers);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
        System.out.println(Collections.frequency(numbers, 1));
    }

    public static void workingWithLists() {
        List<String> emptyList = List.of();
        List<String> titles = List.of("Java", "Python", "Kotlin");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(numbers.size());
        System.out.println(numbers.get(1));
        System.out.println(numbers.indexOf(4));
        // numbers.add(4);

        List<Integer> mutableNumbers = new ArrayList<>(numbers);
        mutableNumbers.add(1);
        System.out.println(mutableNumbers);

        List<Integer> linkedList = new LinkedList<>(numbers);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        System.out.println(linkedList);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        for (Integer i : numbers) {
            System.out.println(i);
        }

        System.out.println(Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3)));
        System.out.println(Objects.equals(List.of(1, 2, 3), List.of(1, 3, 2)));
        System.out.println(Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3, 4)));
    }

    public static void workingWithSets() {
        Set<String> emptySet = Set.of();
        Set<String> titles = Set.of("Java", "Python", "Kotlin");
        Set<Integer> integers = Set.of(1, 2, 3, 4, 5, 10);

        Set<Integer> numbers = new HashSet<>(integers);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        System.out.println(integers);
        System.out.println(numbers);
        numbers.add(3);
        numbers.add(5);
        System.out.println(numbers);

        SortedSet<String> sortedSet = new TreeSet<>(titles);
        System.out.println(sortedSet);
        sortedSet.add("Java");
        sortedSet.add("C++");
        sortedSet.add("C#");
        System.out.println(sortedSet);
    }
}
