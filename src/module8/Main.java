package module8;

import java.time.Period;
import java.util.HashMap;
import java.util.Map;

/**
 * ДЗ №08.5
 * Проверьте работу Manage System в классе Main (на примере 5+ продуктов).
 */


public class Main {
    public static void main(String[] args) {

        Map <Food, Double> testDB = new HashMap<>();

        Food food1 = (new Food("food1", Country.USA, Period.ofDays(90)));
        Food food2 = (new Food("food2", Country.CANADA, Period.ofDays(100)));
        Food food3 = (new Food("food3", Country.CHINA, Period.ofDays(110)));
        Food food4 = (new Food("food4", Country.FRANCE, Period.ofDays(120)));
        Food food5 = (new Food("food5", Country.GERMANY, Period.ofDays(130)));
        Food food6 = (new Food("food6", Country.ENGLAND, Period.ofDays(140)));


        IManageSystemImpl iManage = new IManageSystemImpl();

        iManage.setDatabase(testDB);

        iManage.save(food1, 100);
        iManage.save(food2, 200);
        iManage.save(food3, 300);
        iManage.save(food4, 400);
        iManage.save(food5, 500);

        System.out.println("Our database: \n" + iManage.getDatabase().toString() + "\n");

        iManage.save(food2);
        iManage.save(food6);

        System.out.println("Our database + food2(old price) + food6 (null price): \n" + iManage.getDatabase().toString() + "\n");

        iManage.delete(food6);

        System.out.println("Deleted food6: \n" + iManage.getDatabase().toString() + "\n");

        System.out.println("Get food by ID: \n" + iManage.get(1001) + "\n");

        iManage.deleteById(1002);
        System.out.println("Deleted by ID: \n" + iManage.getDatabase().toString() + "\n");

        System.out.println("Get price for food3: \n" + iManage.getPrice(food3) + "\n");

        System.out.println("Get products: \n" + iManage.getProducts() + "\n");
        System.out.println("Get prices: \n" + iManage.getPrices() + "\n");







    }
}
