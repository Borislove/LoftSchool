package chapter8;

import chapter8.war.Tank;

public class Main {
    public static void main(String[] args) {


        Tank tank = new Tank();
        tank.receiveComman();
        tank.move();
        tank.shoot();
    }
}
