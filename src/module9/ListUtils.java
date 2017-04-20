package module9;

import module4.Currency;
import module7.Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

    public static void sortByPriceDownVer1 (List <Order> list){
        Collections.sort(list, (o1, o2) -> -(o1.getPrice() - o2.getPrice()));
    }

    public static void sortByPriceDownVer2 (List <Order> list){
        list.stream().sorted((o1, o2) -> -(o1.getPrice() - o2.getPrice()));
    }

    public static void sortByPriceUpAndCityVer1 (List <Order> list) {
        Collections.sort(list, (o1, o2) -> o1.getPrice() - o2.getPrice() !=0
                    ? o1.getPrice() - o2.getPrice() : o1.getUser().getCity().compareTo(o2.getUser().getCity()));
    }

    public static void sortByPriceUpAndCityVer2 (List <Order> list){
        list.stream().sorted((o1, o2) -> o1.getPrice() - o2.getPrice() !=0
                ? o1.getPrice() - o2.getPrice() : o1.getUser().getCity().compareTo(o2.getUser().getCity()));
    }

    public static void sortByItemIdCityVer1 (List <Order> list) {
        Collections.sort(list, (o1, o2) -> {
            int sortItemNameOrShopIdentificator = o1.getItemName().compareTo(o2.getItemName()) !=0
                    ? o1.getItemName().compareTo(o2.getItemName()) : o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            int cityComparision = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            return sortItemNameOrShopIdentificator !=0 ? sortItemNameOrShopIdentificator : cityComparision;
        });
    }


    public static List <Order> deletedDuplicatedOrder (List <Order> list){
       return list.stream().distinct().collect(Collectors.toList());
    }

    public static List <Order> deletedBelowPrice (List <Order> list, int price){
        return list.stream().filter(order -> order.getPrice() > price).collect(Collectors.toList());
    }

    public static List <Order> listCurrency (List <Order> orderList, Currency currency){
        return orderList.stream().distinct().filter(order -> order.getCurrency().equals(currency)).collect(Collectors.toList());
    }

    public static List <List<Order>> listsOfCurrency (List <Order> list){
        List <List<Order>> result = new ArrayList<>();

        result.add(list.stream().distinct().filter(order -> order.getCurrency().equals(Currency.EUR)).collect(Collectors.toList()));
        result.add(list.stream().distinct().filter(order -> order.getCurrency().equals(Currency.USD)).collect(Collectors.toList()));
        return result;
    }

    public static List <Order> listOFUniqeCity (List <Order> list, String city){
        return list.stream().distinct().filter(order -> order.getUser().getCity().equals(city)).collect(Collectors.toList());
    }

//    public static List <List <Order>> listsOfUniqeCitys (List <Order> list){
//        List <List<Order>> result = new ArrayList<>();
//
//        result.add(list.stream().distinct().filter(order -> order.getUser().getCity().equals(Currency.EUR)).collect(Collectors.toList()));
//
//        return result;
//    }

//    public static boolean ifContainsLastName (List <Order> list, String lastName){
//        return list.stream().anyMatch(order -> order.getUser().getLastName().equals(lastName));
//    }
//
//    public static List <Order> listWithoutCurrency (List <Order> list, Currency currency){
//        return list.stream().distinct().filter(order -> !order.getCurrency().equals(currency)).collect(Collectors.toList());
//    }

}
