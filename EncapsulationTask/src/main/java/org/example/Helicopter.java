package org.example;

public final class Helicopter extends Aircraft {


    private static final double PI=3.14;
    private static int range=100;

    private static int amountInstance;

    private double diameterTailRotor;

    private double lengthRotorBlade;

    public Helicopter() {
        amountInstance++;
    }

    public Helicopter(String name, int countEngines, double height, double weight, double length,
                      int maxFlyRange, int maxSpeed, int countCrew,
                      double diameterTailRotor, double lengthRotorBlade) {

        super(name, countEngines, height, weight, length, maxFlyRange, maxSpeed, countCrew);


        this.diameterTailRotor = diameterTailRotor;
        this.lengthRotorBlade = lengthRotorBlade;
        amountInstance++;
    }

    public void startEngine() {
        System.out.println("Engines turn on");
    }

    public static int getRange() {
        return range;
    }

    public static void setRange(int range) {
        if(range>0) Helicopter.range = range;
    }

    public void takeOff() {
        System.out.println("Helicopter " + this.name + " take off");

    }

    public void fly(){
        System.out.println("Flying");
    }
    public void OffEngine() {
        System.out.println("Engines turn off");
    }

    public void landed() {
        System.out.println("Helicopter " + this.name + " landed");
    }


    public double getDiameterTailRotor() {

        return diameterTailRotor;
    }

    public static int getCountInstances(){
        return amountInstance;

    }
    public void setDiameterTailRotor(double diameterTailRotor) {
        if (diameterTailRotor <= 0) {
            System.out.println("Incorrect value for diameter tail rotor");
        } else {
            this.diameterTailRotor = diameterTailRotor;
        }

    }

    public double getLengthRotorBlade() {

        return lengthRotorBlade;
    }

    public void setLengthRotorBlade(double lengthRotorBlade) {

        if (lengthRotorBlade < 1) {
            System.out.println("Incorrect given value for rotor blade");
        } else {
            this.lengthRotorBlade = lengthRotorBlade;
        }


    }


    public static double calculateDistanceUsingFuel(double fuelUsed, int rangeRoad ){

       double result=(fuelUsed/rangeRoad)*range;

       return result;

    }

    public static double motorCrossSectionalArea(double diameter){

        return (PI*(diameter*diameter))/4;

    }



    @Override
    public String toString() {
        return super.toString() +
                "Diameter tail rotor : " + diameterTailRotor + " m" +
                "\nLengthRotorBlade : " + lengthRotorBlade + " m\n";
    }


}
