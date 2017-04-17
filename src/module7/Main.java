package module7;

import module4.Currency;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import static module7.TreeSetUtils.containsLastName;
import static module7.TreeSetUtils.removeCurrency;

/**
 В Main создайте 10 заказов с 10 пользователями и добавьте его в List.
 отсортируйте список за ценой заказа по убыванию
 отсортируйте список за ценой заказа по возрастанию и за городом пользователя
 отсортируйте список за наименованием и идентификатором заказа, и городом пользователя

 Создайте класс Main, где создайте 10 заказов с 10 пользователями и добавьте его в TreeSet.
 Создайте 8 уникальных и 2 дублированых заказа.
 -проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
 -выведите заказ с наибольшей ценой, исспользуя только один сет-метод - get
 -удалите заказы, где валюта доллар, используя Iterator

 Дополнительно (выполняется по желанию):
 удалите дублированные данные со списка
 удалите объекты, где цена меньше 1500
 разделите список на 2 списка - заказы в долларах и в гривнах
 разделите список на столько списков, сколько уникальных городов в User

 */

public class Main {
    public static void main(String[] args) {

        User user1 = new User(1001, "Tom", "Petrov", "NY", 10000);
        User user2 = new User(1002, "Bob", "User2", "London", 20000);
        User user3 = new User(1003, "Tim", "User3", "Kiev", 30000);
        User user4 = new User(1004, "Tod", "User4", "London", 40000);
        User user5 = new User(1005, "Ann", "User5", "Kiev", 50000);
        User user6 = new User(1006, "Meg", "User6", "NY", 60000);
        User user7 = new User(1007, "Ron", "User7", "Kiev", 70000);
        User user8 = new User(1008, "Ash", "User8", "London", 80000);
        User user9 = new User(1009, "Zet", "User9", "NY", 90000);
        User user10 = new User(1010, "Ori", "User10", "Kiev", 1000);

        Order order1 = new Order(1001, 1500, Currency.USD, "Item1", "Ebay", user1);
        Order order2 = new Order(1002, 3000, Currency.EUR, "Item2", "Amazon", user2);
        Order order3 = new Order(1003, 4500, Currency.USD, "Item3", "Alli", user3);
        Order order4 = new Order(1004, 5000, Currency.USD, "Item4", "Ebay", user4);
        Order order5 = new Order(1005, 7000, Currency.EUR, "Item5", "Alli", user5);
        Order order6 = new Order(1006, 1600, Currency.USD, "Item1", "Amazon", user6);
        Order order7 = new Order(1007, 2900, Currency.EUR, "Item2", "Amazon", user7);
        Order order8 = new Order(1008, 1400, Currency.EUR, "Item3", "Ebay", user8);
        Order order9 = new Order(1002, 3000, Currency.EUR, "Item2", "Amazon", user2);
        Order order10 = new Order(1003, 4500, Currency.USD, "Item3", "Alli", user3);

        List<Order> orderList = new ArrayList<>(10);
        orderList.add(order1);
        orderList.add(order2);
        orderList.add(order3);
        orderList.add(order4);
        orderList.add(order5);
        orderList.add(order6);
        orderList.add(order7);
        orderList.add(order8);
        orderList.add(order9);
        orderList.add(order10);

        System.out.println("\nDefault orderList");
        ListUtils.sortByPriceDown(orderList);
        System.out.println("\nSorted by price down");
        System.out.println(orderList);

        ListUtils.sortByPriceUpAndCity(orderList);
        System.out.println("\nSorted by price up and city");
        System.out.println(orderList);

        ListUtils.sortByItemIdCity(orderList);
        System.out.println("\nSorted by item/id/city");
        System.out.println(orderList);

        TreeSet <Order> orderTreeSet = new TreeSet<>(new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o1.getPrice()- o2.getPrice();
            }
        });

        orderTreeSet.add(order1);
        orderTreeSet.add(order2);
        orderTreeSet.add(order3);
        orderTreeSet.add(order4);
        orderTreeSet.add(order5);
        orderTreeSet.add(order6);
        orderTreeSet.add(order7);
        orderTreeSet.add(order8);
        orderTreeSet.add(order9);
        orderTreeSet.add(order10);

        System.out.println("\nDefault orderTreeSet");
        System.out.println(orderTreeSet);

        System.out.println("\nIf contains orderTreeSet last name");
        System.out.println(containsLastName(orderTreeSet, "Petrov"));

        System.out.println("\nOrder with MAX price");
        System.out.println(orderTreeSet.last());

        System.out.println("\nOrder without currency");
        removeCurrency(orderTreeSet, Currency.USD);
        System.out.println(orderTreeSet);













    }
}
