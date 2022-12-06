package org.example;

public class Aircraft {



    protected String name;

    protected int countEngines;

    protected double height;

    protected double weight;

    protected double length;

    protected int maxFlyRange;

    protected int maxSpeed;

    protected int countCrew;

    public Aircraft() {
    }


    public Aircraft(String name, int countEngines, double height, double weight, double length, int maxFlyRange, int maxSpeed, int countCrew) {
        this.name = name;
        this.countEngines = countEngines;
        this.height = height;
        this.weight = weight;
        this.length = length;
        this.maxFlyRange = maxFlyRange;
        this.maxSpeed = maxSpeed;
        this.countCrew = countCrew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountEngines() {
        return countEngines;
    }

    public void setCountEngines(int countEngines) {
        this.countEngines = countEngines;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getMaxFlyRange() {
        return maxFlyRange;
    }

    public void setMaxFlyRange(int maxFlyRange) {
        this.maxFlyRange = maxFlyRange;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCountCrew() {
        return countCrew;
    }

    public void setCountCrew(int countCrew) {
        this.countCrew = countCrew;
    }

    @Override
    public String toString() {
        return

                "Name : " + name +
                        "\nCount engines : " + countEngines +
                        "\nWeight : " + weight +
                        "\nHeight : " + height +
                        "\nLength : " + length +
                        "\nMax fly range : " + maxFlyRange +
                        "\nMax speed : " + maxSpeed +
                        "\nCount crew : " + countCrew + "\n";

    }
}
