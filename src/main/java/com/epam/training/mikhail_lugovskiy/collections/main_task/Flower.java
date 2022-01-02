package com.epam.training.mikhail_lugovskiy.collections.main_task;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Flower {
    private String name;
    private Calendar dateOfHarvest;
    private double stemLength;
    private double price;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);

    public Flower(String name, String dateOfFreshnessInString, double stemLength, double price) {
        this.name = name;

        this.stemLength = stemLength;
        this.price = price;

        dateOfHarvest = Calendar.getInstance();
        try {
            this.dateOfHarvest.setTime(dateFormat.parse(dateOfFreshnessInString));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getName() {
        return name;
    }

    public Calendar getDateOfHarvest() {
        return dateOfHarvest;
    }

    public double getStemLength() {
        return stemLength;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "name ='" + name + '\'' +
                ", date of harvest = " + dateFormat.format(dateOfHarvest.getTime()) +
                ", stem length = " + stemLength + " cm"+
                ", price = " + currencyFormatter.format(price);
    }
}
