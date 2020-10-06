package chapter6;

public class Main {
    public static void main(String[] args) {

        Car bus = new Bus(2011, 50);

        Truck truck = new Truck(2014, 100);
        truck.drive();
        truck.year = 2015;
        truck.maxWeight = 200;

        repairCar(truck);
    }

    static void repairCar(Car car) {
        car.year++;

        if (car instanceof Truck) {
            Truck truck = (Truck) car;
            truck.maxWeight += 20;
        }
    }
}
