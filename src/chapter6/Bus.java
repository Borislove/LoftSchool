package chapter6;

public class Bus extends Car {
    int seatCount;

    Bus(int year, int seatCount) {
        super(year);
        this.seatCount = seatCount;
    }
}
