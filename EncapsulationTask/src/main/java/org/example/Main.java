package org.example;

public class Main {
    public static void main(String[] args) {


        Helicopter helicopter1 = new Helicopter("Denel Ah-2", 2, 5.185, 5730,
                18.73, 704, 309, 2,   3.05,
                31.16);

        Helicopter helicopter2 = new Helicopter("ec-145", 2, 3.96, 1792,
                13.03, 705, 278, 2,   1.96,
                20);

        helicopter2.setName("EC-145");

        helicopter2.setLength(22);

        helicopter2.setDiameterTailRotor(-12);

        helicopter1.startEngine();

        helicopter1.takeOff();

        helicopter1.landed();


        helicopter1.OffEngine();


        System.out.println("\nAbout " + helicopter1.getName() + "\n" + helicopter1);
        System.out.println("About " + helicopter2.getName() + "\n" + helicopter2);

        System.out.println("Amount created instances of Helicopter = "+Helicopter.getCountInstances());
    }
}