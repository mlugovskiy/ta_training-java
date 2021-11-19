package com.epam.training.mikhail_lugovskiy.fundamentals.main_task;

import java.util.Arrays;

public class ArgsInReverseOrder {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
