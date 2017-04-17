package module7;

import module4.Currency;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Plutus on 02.04.2017.
 */
public class TreeSetUtils {

    public static boolean containsLastName (TreeSet <Order> orderTreeSet, String lastName){
        boolean contains = false;
        for (Order order : orderTreeSet) {
            if (order.getUser().getLastName().equals(lastName)){
                return contains = true;
            }
        }
        return contains;
    }

    public static void removeCurrency (TreeSet <Order> orderTreeSet, Currency currency){
        for (Iterator <Order> it = orderTreeSet.iterator(); it.hasNext();){
                Order order = it.next();
                if (order.getCurrency().equals(currency)){
                        it.remove();
                }
        }
    }

}
