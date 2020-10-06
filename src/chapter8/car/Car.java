package chapter8.car;

public class Car implements Vehicle {

    protected float speed = 0;

    @Override
    public void drive() {
        speed = 100;
    }
}
