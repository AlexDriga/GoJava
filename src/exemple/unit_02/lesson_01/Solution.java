package exemple.unit_02.lesson_01;

/**
 * Created by Vitalii on 16.02.2017.
 */
public class Solution {
    public static void main(String[] args) {
        int[] simpleInts = {-1, -2, -3, -4};
        double[] simpleDoubles = {1.0, 2.0, 3.0, 4.0};
        int[] ints = {11, 7, 9, 2, 6, 3, 10, 30, 21, 50, 1, 50, 3};
        double[] doubles = {-2.1, 4.3, 7.3, 2.3, 8.1, 0.4, 8, 3, -3, -1};

        ArrayManager manager = new ArrayManager();

        System.out.println("summary of ints: " + manager.sum(ints));
        System.out.println("summary of doubles: " + manager.sum(doubles));
        System.out.println("min of ints: " + manager.min(ints));
        System.out.println("min of doubles: " + manager.min(doubles));
        System.out.println("max of ints: " + manager.max(ints));
        System.out.println("max of doubles: " + manager.max(doubles));
        System.out.println("max positive of ints: " + manager.maxPositive(ints));
        System.out.println("max positive of simple ints (no positive elements): " + manager.maxPositive(simpleInts));
        System.out.println("max positive of doubles: " + manager.maxPositive(doubles));
        System.out.println("multiplication of simple ints " + manager.multiplication(simpleInts));
        System.out.println("multiplication of simple doubles: " + manager.multiplication(simpleDoubles));
        System.out.println("modulus of ints: " + manager.modulus(ints));
        System.out.println("modulus of ints: " + manager.modulus(doubles));
        System.out.println("secondLargest of ints: " + manager.secondLargest(ints));
        System.out.println("secondLarges of doubles: " + manager.secondLargest(doubles));
    }
}
