package main.java.com.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class UC26 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 6, 2, 8, 9, 10);

        Optional<Integer> minEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Comparator.naturalOrder());

        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Comparator.naturalOrder());

        minEven.ifPresent(n -> System.out.println("Min Even: " + n));
        maxEven.ifPresent(n -> System.out.println("Max Even: " + n));
    }
}