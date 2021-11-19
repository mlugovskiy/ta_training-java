package com.epam.training.mikhail_lugovskiy.fundamentals.main_task;

public class ArgsSumAndMultiplication {
    public static void main(String[] args) {
        int sum;
        int multiplication;

        if (args.length == 0) {
            System.out.println("You didn't enter any command line arguments.");
            return;
        }
        else {
            sum = 0;
            multiplication = 1 ;
        }

        for (String str : args) {
            sum += Integer.parseInt(str);
            multiplication *= Integer.parseInt(str);
        }
        System.out.println("Sum of command line arguments:");
        System.out.println(sum);
        System.out.println("Multiplication of command line arguments:");
        System.out.println(multiplication);
    }
}
