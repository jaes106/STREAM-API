package main.java.com.streamapi;

import java.util.Arrays;
import java.util.List;

public class UC28 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);

        boolean allEven = numbers.stream()
                .allMatch(n -> n % 2 == 0);

        boolean anyEven = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println("All Even: " + allEven);
        System.out.println("Any Even: " + anyEven);
    }
}