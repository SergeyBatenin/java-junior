package ru.homeworks.homework1.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        fillList(numbers);
        double avgFromMethod = findAvgEvenNumbers(numbers);
        double avgFromLambda = (double) numbers.stream()
                .filter(num -> num % 2 == 0)
                .reduce(Integer::sum)
                .get() / numbers.size();
        System.out.println(numbers);
        System.out.println(avgFromMethod);
        System.out.println(avgFromLambda);
    }

    private static double findAvgEvenNumbers(List<Integer> numbers) {
        double sum = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum / numbers.size();
    }

    private static void fillList(List<Integer> numbers) {
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            numbers.add(random.nextInt(-20, 20));
        }
    }
}
