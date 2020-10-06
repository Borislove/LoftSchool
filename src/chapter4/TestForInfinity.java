package chapter4;

public class TestForInfinity {
    public static void main(String[] args) {

        // System.out.println(Integer.MAX_VALUE); //2147483647
        //  System.out.println(Integer.MIN_VALUE); //    -2147483648

        for (int i = 0; i < 1; i--) {
            System.out.println(" i = " + i);
            i -=10000;
        }
    }
}
