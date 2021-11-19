package com.epam.training.mikhail_lugovskiy.fundamentals.main_task;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumbers {
    public static void main(String[] args) {

        int count = 10;
        int min = 0;
        int max = 100;
        int[] numbers = new int[count];

        //generate array of random numbers from min to max included bounds
        for (int i = 0; i < count; i++) {
            numbers[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }

        //output each number on next line
        System.out.println("Random numbers from " + min + " to " + max + ", each on a next line:");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println(); //blank line

        //output numbers in one line
        System.out.println("Random numbers from " + min + " to " + max + ", in one line:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
