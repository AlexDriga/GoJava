package module6.task1;

import java.util.ArrayList;

public final class ArraysUtils {

    public static int sum(int array[]) {
        int sumInt = 0;

        for (int i = 0; i < array.length; i++){
            sumInt += array[i];
        }
        return sumInt ;
    }

    public static int min(int array[]) {
        int minIntArr = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minIntArr) {
                minIntArr = array[i];
            }
        }
        return minIntArr;
    }

    public static int max(int array[]) {
        int maxIntArr = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxIntArr) {
                maxIntArr = array[i];
            }
        }
        return maxIntArr;
    }

    public static int maxPositive (int array[]) {
        int maxPositiveIntArr = array[0];

        for (int i = 1; i < array.length; i++) {
            if ((array[i] > 0 ) && (array[i] > maxPositiveIntArr)) {
                maxPositiveIntArr = array[i];
            }
        }
        if (maxPositiveIntArr <= 0){
            System.out.println("Массив не имеет позитивных значений");
        }
        return maxPositiveIntArr;
    }

    public static int multiplication (int array[]) {
        int mulIntArr = array[0];

        for (int i = 1; i < array.length; i++){
            mulIntArr *= array[i];
        }
        return mulIntArr;
    }

    public static int modulus (int array []) {
        int modIntNum = array[0] % array[array.length-1];
        return modIntNum;
    }

    public static int secondLargest (int array[]) {
        int maxInt = array[0];
        int secondMaxInt = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxInt) {
                maxInt = array[i];
            }
            if ((array[i] != maxInt) && (array[i] > secondMaxInt)) {
                secondMaxInt = array[i];
            }
        }
        return secondMaxInt;
    }

    public static int[] reverse(int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static int[] findEvenElements(int[] array){
        ArrayList <Integer> evenElements = new ArrayList<>();

        for (int i : array) {
            if (i % 2 == 0){
                evenElements.add(i);
            }
        }

        int [] evenArray = new int [evenElements.size()];
        for (int i = 0; i < evenElements.size(); i++) {
            evenArray[i] = evenElements.get(i);
        }
        return evenArray;
    }

}
