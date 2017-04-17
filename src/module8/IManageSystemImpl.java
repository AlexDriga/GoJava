package module8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Реализуйте интерфейс IManageSystem для работы с базой данных товаров.
 * Класс должен содержать поле: Map<Food, Double> database
 * Поле эмулирует базу данных, содержит в себе данные о продуктах и их цене.
 * Поле должно быть доступно только внутри данного класса.
 */

public class IManageSystemImpl implements IManageSystem<Food> {

    private Map <Food, Double> database;

    public Map<Food, Double> getDatabase() {
        return database;
    }

    public void setDatabase(Map<Food, Double> database) {
        this.database = database;
    }

    @Override
    public Food save(Food obj, double price) {
        this.database.put(obj, price);
        return obj;
    }



    @Override
    public Food save(Food obj) {
        Double price = this.database.get(obj);
        this.database.put(obj, price);
        return obj;
    }

    @Override
    public void delete(Food obj) {
        this.database.remove(obj);
    }

    @Override
    public void deleteById(int id) {
        Food food = get(id);
        this.database.remove(food);
    }

    @Override
    public Food get(int id) {
        Food food = null;
        Set <Food> foods = this.database.keySet();
        for (Food f : foods)
            if (f.getId() == id){
            food = f;
            }
        return food;
    }

    @Override
    public Double getPrice(Food obj) {
        return this.database.get(obj);
    }

    @Override
    public Set<Food> getProducts() {
        return this.database.keySet();
    }

    @Override
    public List<Double> getPrices() {
        return new ArrayList<>(this.database.values());
    }

//    @Override
//    public void printProductsSortedByName() {
//        Map <Food, Double> sortedMapByName = new TreeMap<Food, Double>(database);
//        System.out.println(sortedMapByName.toString());
//    }
//
//    @Override
//    public void printProductsSortedByPrice() {
//        List list = new LinkedList(database.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry <Food, Double>>() {
//            @Override
//            public int compare(Map.Entry<Food, Double> a, Map.Entry<Food, Double> b) {
//                return (a.getValue().compareTo(b.getValue()));
//            }
//        });

//        Map<Food, Double> result = new LinkedHashMap<>();
//        for (Map.Entry <Food, Double> entry : list)
//        {
//            result.put(entry.getKey(), entry.getValue());
//        }
//        return result;

//    }

}
