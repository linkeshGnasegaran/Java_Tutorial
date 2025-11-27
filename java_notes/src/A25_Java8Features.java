// Java 8 Features: Lambda & Streams
import java.util.*;

public class A25_Java8Features {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Lambda example
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.println();

        // Stream example: sum of even numbers
        int evenSum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers: " + evenSum);
    }
}
