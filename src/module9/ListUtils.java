package module9;

import module7.Order;

import java.util.Collections;
import java.util.List;

/**
 *  -отсортируйте список за ценой заказа по убыванию
 *  -отсортируйте список за ценой заказа по возрастанию и за городом пользователя
 *  -отсортируйте список за наименованием товара, идентификатором заказа, и городом пользователя
 *  -удалите дублированные данные со списка
 *  -удалите объекты, где цена меньше 1500
 *  -разделите список на 2 списка - заказы в долларах и в гривнах
 *  -разделите список на столько списков, сколько уникальных городов в User
 */

public class ListUtils {

    public static void sortByPriceDown (List<Order> orderList){
        Collections.sort(orderList, (o1, o2) -> {
            return -(o1.getPrice() - o2.getPrice());
        });
    }

    public static void sortByPriceUpAndCity (List<Order> orderList) {
        Collections.sort(orderList, (o1, o2) -> {
            return o1.getPrice() - o2.getPrice() !=0
                    ? o1.getPrice() - o2.getPrice() : o1.getUser().getCity().compareTo(o2.getUser().getCity());
        });
    }

    public static void sortByItemIdCity (List<Order> orderList) {
        Collections.sort(orderList, (o1, o2) -> {
            int sortItemNameOrShopIdentificator = o1.getItemName().compareTo(o2.getItemName()) !=0
                    ? o1.getItemName().compareTo(o2.getItemName()) : o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            int cityComparision = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            return sortItemNameOrShopIdentificator !=0 ? sortItemNameOrShopIdentificator : cityComparision;
        });
    }

    public static void deletedDuplicatedOrder (List <Order> orderList){
//        orderList.stream().distinct().
    }


}
