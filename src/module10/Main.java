package module10;

import javacore.module7.Order;

/**
 * Created by Plutus on 21.04.2017.
 */
public class Main {
    public static void main(String[] args) {

        String s = "Catch the rainbow!";

        Order order = null;

        OwnException exception = new OwnException("Own Exception");


        try {
            throw new Exception();
        } catch (Exception e){
            System.err.println("Task 1: \n" + s);
        } finally {
            System.err.println("Finally!\n");
        }

        try {
            exception.testOwnException();
        } catch (OwnException e) {
            System.err.println("Task 2: \nCatch own Exception\n");
        }

        try {
            order.getUser();
        } catch (NullPointerException e){
            System.err.println("Task 3: \nOops! BookingInfo is NULL!\n");
        }


    }
}
