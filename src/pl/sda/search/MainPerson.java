package pl.sda.search;

import java.util.List;

public class MainPerson {

    public static void main(String[] args) {

        Person[] personArray = new Person[]{
                new Person("A", "B", 12L),
                new Person("C", "D", 14L),
                new Person("E", "F", 14L),
                new Person("G", "H", 15L),
                new Person("I", "J", 16L),
                new Person("K", "L", 14L)
        };

//        SearchAlgorithm<Person> binarySearch =
//                new BinarySearchRec<>();
//
//
//        int result = binarySearch.search(
//                new Person("E", "F", 14L),
//                personArray);
//
//        System.out.println("Result: " + result);

        LinearSearch<Person> linearSearch =
                new LinearSearch<>();

        List<Integer> result = linearSearch.searchAll(
                new Person("E", "F", 14L),
                personArray);

        System.out.println("Result: " + result);
    }



}
