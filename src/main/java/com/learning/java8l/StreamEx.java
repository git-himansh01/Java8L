package com.learning.java8l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        Stream<String> stream1 = list1.stream();

        List<String> list2 = Arrays.asList("Alpha", "Beta", "Gamma");
        Stream<String> stream2 = list2.stream();

//        String[] nameArray1 = list1.toArray(new String[list1.size()]);
//        Stream<String> stream3 = Arrays.stream(nameArray1);

        String[] nameArray2 = {"Alpha", "Beta", "Gamma", "Delta", "Boston"};
        Stream<String> stream4 = Arrays.stream(nameArray2);

        Stream<String> stream5 = Stream.of("Alpha", "Beta", "Gamma", "Delta", "Chi", "Pi", "Psi");
        List<String> filteredPlaces = Arrays.stream(nameArray2).filter(places->places.startsWith("B")).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Filtered Places: " + filteredPlaces);
    }
}
