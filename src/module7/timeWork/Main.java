package module7.timeWork;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 
 Сгенерируйте Integer и String ArrayList и LinkedList с 1000 и 10000 элементами.
 Измерьте время выполнения этих методов и выведите их в консоль:

 - add
 - set
 - get
 - remove
 */
public class Main {
    public static void main(String[] args) {

        ArrayList <Integer> integerArrayList = new ArrayList <> ();
        LinkedList <Integer> integerLinkedList = new LinkedList <> ();

        ArrayList <String> stringArrayList = new ArrayList<>();
        LinkedList <String> stringLinkedList = new LinkedList<>();

        long start, finish;

        System.out.println("Use Integer methods\n");
        start = System.nanoTime();
        for (int i = 0; i<1000; i++){
            integerArrayList.add(i);
        }
        finish = System.nanoTime();
        System.out.println("ArrayList (Integer) time for add = " + (finish - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++){
            integerLinkedList.add(i);
        }
        finish = System.nanoTime();
        System.out.println("LinkedList (Integer) time for add = " + (finish - start) + " ns\n");

        start = System.nanoTime();
        integerArrayList.set(500, 500);
        finish = System.nanoTime();
        System.out.println("ArrayList (Integer) time for set = " + (finish - start) + " ns");

        start = System.nanoTime();
        integerLinkedList.set(500, 500);
        finish = System.nanoTime();
        System.out.println("LinkedList (Integer) time for set = " + (finish - start) + " ns\n");

        start = System.nanoTime();
        integerArrayList.get(500);
        finish = System.nanoTime();
        System.out.println("ArrayList (Integer) time for get = " + (finish - start) + " ns");

        start = System.nanoTime();
        integerLinkedList.get(500);
        finish = System.nanoTime();
        System.out.println("LinkedList (Integer) time for get = " + (finish - start) + " ns\n");

        start = System.nanoTime();
        integerArrayList.remove(500);
        finish = System.nanoTime();
        System.out.println("ArrayList (Integer) time for remove = " + (finish - start) + " ns");

        start = System.nanoTime();
        integerLinkedList.remove(500);
        finish = System.nanoTime();
        System.out.println("LinkedList (Integer) time for remove = " + (finish - start) + " ns\n");

        System.out.println("Use String methods\n");
        start = System.nanoTime();
        for (int i = 0; i < 10000; i++){
            stringArrayList.add(i, "string");
        }
        finish = System.nanoTime();
        System.out.println("ArrayList (String) time for add = " + (finish - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++){
            stringLinkedList.add(i, "string");
        }
        finish = System.nanoTime();
        System.out.println("LinkedList (String) time for add = " + (finish - start) + " ns\n");

        start = System.nanoTime();
        stringArrayList.set(500, "string");
        finish = System.nanoTime();
        System.out.println("ArrayList (String) time for set = " + (finish - start) + " ns");

        start = System.nanoTime();
        stringLinkedList.set(500, "string");
        finish = System.nanoTime();
        System.out.println("LinkedList (String) time for set = " + (finish - start) + " ns\n");

        start = System.nanoTime();
        stringArrayList.get(5000);
        finish = System.nanoTime();
        System.out.println("ArrayList (String) time for get = " + (finish - start) + " ns");

        start = System.nanoTime();
        stringLinkedList.get(5000);
        finish = System.nanoTime();
        System.out.println("LinkedList (String) time for get = " + (finish - start) + " ns\n");

        start = System.nanoTime();
        stringArrayList.remove(5000);
        finish = System.nanoTime();
        System.out.println("ArrayList (String) time for remove = " + (finish - start) + " ns");

        start = System.nanoTime();
        stringLinkedList.remove(5000);
        finish = System.nanoTime();
        System.out.println("LinkedList (String) time for remove = " + (finish - start) + " ns\n");














    }
}




