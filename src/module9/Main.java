package module9;

import module4.Currency;
import module7.Order;
import module7.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        Order order11 = new Order(1009, 7000, Currency.USD, "Item5", "Alli", user9);
        Order order12 = new Order(1010, 1400, Currency.USD, "Item3", "Ebay", user10);

        List<Order> orderList = new ArrayList<>();
        orderList.addAll(Arrays.asList(order1, order2, order3, order4, order5,
                order6, order7, order8, order9, order10, order11, order12));

        System.out.println("\nDefault orderList" + "\n" + orderList);
        ListUtils.sortByPriceDown(orderList);
        System.out.println("\nSorted by price down" + "\n" + orderList);

        ListUtils.sortByPriceUpAndCity(orderList);
        System.out.println("\nSorted by price up and city" + "\n" + orderList);

        ListUtils.sortByItemIdCity(orderList);
        System.out.println("\nSorted by item/id/city" + "\n" + orderList);

        ListUtils.deletedDuplicatedOrder(orderList);
        System.out.println("\nDeleted dupliczted Order" + "\n" + orderList);



    }
}




