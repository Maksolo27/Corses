package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 10));
        }
        System.out.println(numbers);
        List<Integer> numbers2 = numbers.stream()
                .map(x -> (x * x))
                .collect(Collectors.toList());
        System.out.println(numbers2);
        int sum = numbers2.stream().reduce(0,(x, y) -> x + y);
        System.out.println(sum);
    }
}
