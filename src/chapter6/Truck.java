package chapter6;

public class Truck extends Car {
    float maxWeight;

    Truck(int year, float maxWeight) {
        super(year);
        this.maxWeight = maxWeight;
    }
}
