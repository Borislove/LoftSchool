package chapter8.war;

import chapter8.car.Vehicle;

public class Tank extends Unit implements Vehicle,HasGun {
    @Override
    public void drive() {

    }

    @Override
    public void move() {
        drive();
    }

    @Override
    public void shoot() {

    }
}
