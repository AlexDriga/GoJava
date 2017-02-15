package module3.hw1.hw2;

import java.util.Random;

/**
 Напишите класс с названием Arithmetic с методом add,
 который принимает целые числа как параметры и возвращает переменную типа integer, которая есть их суммой.

 Напишите класс Adder, который наследуется от класса Arithmetic.
 У класса Adder должен быть метод check, который сравнивает 2 номера и возвращает true, если а>=b и false в других случаях.

 Сигнатура методов:
 int add(Integer a, Integer b)
 boolean check(Integer a, Integer b)
 */
public class Main {
    public static void main(String[] args) {

        Random rand = new Random ();
        Integer a = rand.nextInt (11);
        Integer b = rand.nextInt(11);

        Arithmetic arithmetic = new Arithmetic();
        Adder adder = new Adder();

        System.out.println("Integer a = " + a);
        System.out.println("Integer b = " + b);
        System.out.println("==================");
        System.out.println(arithmetic.add(a, b));
        System.out.println(adder.add(a, b));
        System.out.println(adder.check(a, b));
    }
}
