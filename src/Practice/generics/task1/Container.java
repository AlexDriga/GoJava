package Practice.generics.task1;

import java.util.List;

/**
 * Created by Plutus on 17.04.2017.
 */
public class Container <T extends Product, A extends Product, B extends Product & Comparable <T>> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    void copy (List <? extends Product> src, List <? super Product> dest){
        for (Product p: src){
            dest.add(p);
        }
    }
}
