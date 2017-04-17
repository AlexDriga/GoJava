package exemple.unit_03.lesson_02;

import java.util.Random;

/**
 * Created by Vitalii on 17.02.2017.
 *
 * Write class named Arithmetic with a method named add that takes  integers as parameters and returns
 an integer denoting their sum. Write class named Adder that inherits from a superclass named Arithmetic.
 Also class Adder must contain method check that compare two numbers and returns
 true if a>=b and false in other cases.
 Methods signature:
 int add(Integer a, Integer b)
 boolean check(Integer a, Integer b)
 */
public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Random random = new Random();

        int bound = 1000;

        for (int i = 0; i < 5; i++) {
            int first = random.nextInt(bound);
            int second = random.nextInt(bound);
            System.out.println("first = " + first + ", second = " + second);
            System.out.println("sum = " + adder.add(first, second));
            System.out.println("first >= second: " + adder.check(first, second));
        }
    }
}
