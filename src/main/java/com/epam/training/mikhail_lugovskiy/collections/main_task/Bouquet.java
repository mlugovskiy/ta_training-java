package com.epam.training.mikhail_lugovskiy.collections.main_task;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Bouquet {
    List<Flower> flowers = new ArrayList<>();
    List<Accessory> accessories = new ArrayList<>();
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void addFlowers(Flower flower, int numberOfFlowers) {
        for (int i = 1; i <= numberOfFlowers; i++) {
            flowers.add(flower);
        }
    }

    public void addAccessory(Accessory accessory) {
        accessories.add(accessory);
    }

    public void addAccessories(Accessory accessory, int numberOfAccessories) {
        for (int i = 1; i <= numberOfAccessories; i++) {
            accessories.add(accessory);
        }
    }


    @Override
    public String toString() {
        StringBuilder strFlowers = new StringBuilder();
        StringBuilder strAccessories = new StringBuilder();
        for (Flower flower: flowers
             ) {
            strFlowers.append(flower.toString()).append("\n");
        }

        for (Accessory accessory: accessories
        ) {
            strAccessories.append(accessory.toString()).append("\n");
        }

        return  "flowers:" + "\n"+ strFlowers +"\n"+
                "accessories:" + "\n"+  strAccessories + "\n";
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void sortFlowersByDateOfHarvest() {
        flowers = flowers.stream().sorted(Comparator.comparing(Flower::getDateOfHarvest)).collect(Collectors.toCollection(ArrayList::new));
    }

    public List<String> getFlowersNamesByLengthOfStem(double minLength, double maxLength) {
        List<String> flowersNamesByLengthOfStem = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getStemLength() < maxLength & flower.getStemLength() > minLength) {
                if (!flowersNamesByLengthOfStem.contains(flower.getName())) flowersNamesByLengthOfStem.add(flower.getName());
            }
        }
        if (!flowersNamesByLengthOfStem.isEmpty()) {
            return flowersNamesByLengthOfStem;
        } else {
            return null;
        }
    }

    public double getPrice() {
        return flowers.stream().mapToDouble(Flower::getPrice).sum() + accessories.stream().mapToDouble(Accessory::getPrice).sum();
    }

    public String getFormattedPrice() {
        return currencyFormatter.format(this.getPrice());
    }
}