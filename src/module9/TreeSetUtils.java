package module9;

import module4.Currency;
import module7.Order;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetUtils {

    public static boolean ifContainsLastName (TreeSet<Order> treeSet, String lastName){
        return treeSet.stream().anyMatch(order -> order.getUser().getLastName().equals(lastName));
    }

    public static Set<Order> removeCurrency (TreeSet<Order> treeSet, Currency currency){
       return treeSet.stream().distinct().filter(order -> !order.getCurrency().equals(currency)).collect(Collectors.toSet());
    }
}
