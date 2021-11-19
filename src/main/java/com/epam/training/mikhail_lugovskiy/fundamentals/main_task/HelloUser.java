package com.epam.training.mikhail_lugovskiy.fundamentals.main_task;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;

        System.out.println("Enter your name for greeting, please:");
        name = scanner.nextLine();
        if (name.isBlank()) System.out.println("You didn't enter a name!");
        else System.out.println("Hello, " + name + "!");
    }
}
