package main.java.com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UC23 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> doubledList = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(doubledList);
    }
}