package module6.task1;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int [] testArray = {100, -21, 14, -13, 0, 31, 7, -16, 21, -27, 77};

        System.out.println("Sum " + ArraysUtils.sum(testArray));
        System.out.println("Max " + ArraysUtils.max(testArray));
        System.out.println("Min " + ArraysUtils.min(testArray));
        System.out.println("Max pos " + ArraysUtils.maxPositive (testArray));
        System.out.println("Mult " + ArraysUtils.multiplication(testArray));
        System.out.println("Mod " + ArraysUtils.modulus(testArray));
        System.out.println("second Largest " + ArraysUtils.secondLargest(testArray));
        System.out.println("rev Array " + Arrays.toString(ArraysUtils.reverse(testArray)));
        System.out.println("even Elements " + Arrays.toString(ArraysUtils.findEvenElements(testArray)));
    }
}
