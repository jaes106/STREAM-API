package main.java.com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UC29 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        List<Integer> sortedList = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}