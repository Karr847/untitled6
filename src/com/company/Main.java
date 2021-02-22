package com.company;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        int input = 7;
        int limit = 10;
        Supplier<Integer> supply7 = () -> input;
        Predicate<Integer> isLessThan10 = i -> i < limit;
        Consumer<String> printResult = printWithPrefixAndPostfix("is" + input + "is smaller than " + limit
                + "?", "Great!");
        printResult.accept(String.valueOf(isLessThan10.test(supply7.get())));


    }

    private static Consumer<String> printWithPrefixAndPostfix(String prefix, String postfix) {
        return (s) -> {
            System.out.println(prefix + s + postfix);

        };
    }
}



