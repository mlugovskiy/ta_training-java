package com.epam.training.mikhail_lugovskiy.collections.main_task;

import java.text.NumberFormat;
import java.util.Locale;

public class Accessory {
    private String name;
    private double price;
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);

    public Accessory(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  "name=" + name +
                ", price=" + currencyFormatter.format(price);
    }
}
