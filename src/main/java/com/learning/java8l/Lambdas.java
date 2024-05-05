package com.learning.java8l;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
        Predicate<String> testLengthP= str->str.length()>5;

        boolean result = testLengthP.test("hello");
        System.out.println(result);

        Predicate<Integer> testLength2= num->num>5;
        System.out.println("The result is "+testLength2.test(10));


        testString(testLengthP);
        testString(s-> s.startsWith("h"));

       // Consumer<String> printUpperCase= System.out::println;
        Consumer<String> printUpperCase= s1->System.out.println(s1.toUpperCase());
       // Consumer<String> printLowerCase= s1->(s1.toLowerCase();
       // System.out.println(printLowerCase.accept("hELlo"));

        Consumer<Integer> addNumber= s1->System.out.println(s1+2);
        addNumber.accept(8);
        printUpperCase.accept("hello i am iron man");
    }

    public static void testString(Predicate<String> testStrLength) {
        System.out.println(testStrLength.test("hello himanshu"));

    }
}
