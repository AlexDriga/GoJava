package module8;

import java.util.List;
import java.util.Set;

/**
 * Создайте универсальный интерфейс IManageSystem(T) с такими методами:
 T save(T obj, double price);
 T save(T obj);
 void delete(T obj) ;
 void deleteById(int id);
 T get(int id);
 Double getPrice(T obj);
 Set<T> getProducts();
 List<Double> getPrices();
 */

public interface IManageSystem <T> {

    T save(T obj, double price);
    T save(T obj);
    void delete(T obj) ;
    void deleteById(int id);
    T get(int id);
    Double getPrice(T obj);
    Set<T> getProducts();
    List<Double> getPrices();

//    void printProductsSortedByName();
//    void printProductsSortedByPrice();

}
