package com.epam.training.mikhail_lugovskiy.collections.main_task;

public class MainApp {
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet();

        bouquet.addFlowers(new Flower("Pink Rose", "30.11.2021", 30, 3), 5);
        bouquet.addFlowers(new Flower("White Rose", "29.11.2021", 25, 2), 3);
        bouquet.addFlowers(new Flower("White Chrysanthemum", "25.11.2021", 27, 3), 5);
        bouquet.addAccessory(new Accessory("Box", 2 ));
        bouquet.addAccessory(new Accessory("Pink Paper", 0.5));

        bouquet.sortFlowersByDateOfHarvest();
        System.out.print(bouquet);
        System.out.println("Total price of bouquet: " + bouquet.getFormattedPrice());
        System.out.println(bouquet.getFlowersNamesByLengthOfStem(23,26));
    }
}
