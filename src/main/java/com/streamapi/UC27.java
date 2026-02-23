package main.java.com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class UC27 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        OptionalDouble avg = numbers.stream()
                .mapToInt(Integer::intValue)
                .average();

        System.out.println("Sum: " + sum);
        avg.ifPresent(a -> System.out.println("Average: " + a));
    }
}
