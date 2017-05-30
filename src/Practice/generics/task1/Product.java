package Practice.generics.task1;

import java.util.Comparator;

/**
 * Created by Plutus on 17.04.2017.
 */
public class Product <T extends Product<T>> implements Comparable <T> {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    boolean compareSub(Product p) {
        return false;
    }

    @Override
    public int compareTo(T o) {
        return compareTo(o);
    }
}
