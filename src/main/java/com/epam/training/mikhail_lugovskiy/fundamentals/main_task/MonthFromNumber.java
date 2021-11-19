package com.epam.training.mikhail_lugovskiy.fundamentals.main_task;

import java.time.Month;
import java.util.Scanner;

public class MonthFromNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter month number (from 1 to 12):");

        //check user enter a valid integer
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }
        else{
            System.out.println("Input is not a valid integer!");
            return;
        }

        if (number >= 1 && number <= 12) {
            System.out.println(Month.of(number));
        }
        else System.out.println("You entered number " + number + ", but month number should be from 1 to 12!");
    }
}
