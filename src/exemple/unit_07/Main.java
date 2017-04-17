package exemple.unit_07;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Vitalii on 25.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        fill(orderList);
        testOrderList(orderList);

        Set<Order> orderSet = new TreeSet<>();
        fill(orderSet);

        System.out.println("\nDoest it contain Кононов: " + isContainsLastName(orderSet, "Кононов"));
        System.out.println("Doest it contain Кононова: " + isContainsLastName(orderSet, "Кононова"));

        System.out.println("Order with max price: " + getMaxPriceOrder(orderSet));

        deleteOrdersByCurrency(orderSet, Currency.UAH);
        System.out.println(orderSet);
    }

    private static boolean isContainsLastName(Set<Order> orders, String lastName) {
        return orders.stream().anyMatch(o -> o.getUser().getLastName().equals(lastName));
    }

    @NotNull
    private static Order getMaxPriceOrder(Set<Order> orders) {
        return orders.stream().max(Comparator.comparingInt(Order::getPrice)).get();
    }

    private static void deleteOrdersByCurrency(Set<Order> orders, Currency currency) {
        //  Java 8 implementation
        orders.removeIf(order -> order.getCurrency() == currency);

        /*
        Java 7 implementation
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();

            if (order.getCurrency() == currency) {
                iterator.remove();
            }
        }*/
    }

    private static void testOrderList(List<Order> orders) {
        orders.sort(new SoloComparator());
        System.out.println("Solo comparator:\n" + orders);

        orders.sort(new DuoComparator());
        System.out.println("Duo comparator:\n" + orders);

        orders.sort(new TrioComparator());
        System.out.println("Trio comparator:\n" + orders);

        orders = deleteDuplicates(orders);
        System.out.println("Delete duplicates:\n" + orders);

        orders = filterByPriceCondition(orders, 1500);
        System.out.println("Filtered by price:\n" + orders);

        List<Order> ordersUSD = getOrdersByCurrency(orders, Currency.USD);
        System.out.println("USD orders:\n" + ordersUSD);

        List<Order> ordersUAH = getOrdersByCurrency(orders, Currency.UAH);
        System.out.println("USD orders:\n" + ordersUAH);

        List<List<Order>> uniqueCitiesOrders = getOrdersByUniqueCities(orders);
        uniqueCitiesOrders.forEach(System.out::println);
    }

    private static List<Order> deleteDuplicates(List<Order> orders) {
        return orders.stream().distinct().collect(Collectors.toList());
    }

    private static List<Order> filterByPriceCondition(List<Order> orders, int pivotPrice) {
        return orders.stream().filter(order -> order.getPrice() > pivotPrice).collect(Collectors.toList());
    }

    private static void fill(Collection<Order> orders) {

        User user0 = new User(2446, "Виктор", "Суханов", "Киев", 54897);
        User user1 = new User(5657, "Антонина", "Пахомова", "Львов", 5679);
        User user2 = new User(32545, "Анна", "Третьякова", "Чернигов", 12345);
        User user3 = new User(45676, "Михаил", "Яковлев", "Черкасы", 8879);
        User user4 = new User(343465, "Нинель", "Авдеева", "Кропивницкий", 7526);
        User user5 = new User(6865, "Нина", "Блинова", "Киев", 79532);
        User user6 = new User(34665, "Ангелина", "Матвеева", "Ровно", 5413);
        User user7 = new User(34546, "Екатерина", "Денисова", "Чернигов", 2036);
        User user8 = new User(3466557, "Бронислав", "Кононов", "Чернигов", 7104);
        User user9 = new User(8875656, "Алина", "Афанасьева", "Киев", 9605);

        Order order0 = new Order(214, 785432, Currency.USD, "itemName0", "qwe", user0);
        Order order1 = new Order(89446, 875421, Currency.USD, "itemName1", "asd", user1);
        Order order2 = new Order(87213, 54487, Currency.USD, "itemName2", "zxc", user2);
        Order order3 = new Order(89791, 326598, Currency.USD, "itemName3", "rty", user3);
        Order order4 = new Order(98711, 894512, Currency.USD, "itemName4", "fgh", user4);
        Order order5 = new Order(872, 329841, Currency.UAH, "itemName5", "vbn", user5);
        Order order6 = new Order(78945, 7841, Currency.UAH, "itemName6", "uio", user6);
        Order order7 = new Order(3214, 9852, Currency.UAH, "itemName7", "jkl", user7);
        Order order8 = new Order(684123, 987, Currency.UAH, "itemName8", "mnb", user8);
        Order order9 = new Order(87214, 153, Currency.UAH, "duplicate", "dup", user9);
        Order order10 = new Order(765, 153, Currency.UAH, "duplicate", "dup", user9);
        Order order11 = new Order(766, 153, Currency.UAH, "duplicate", "dup", user9);

        orders.addAll(Arrays.asList(order0, order1, order2, order3, order4, order5, order6, order7, order8, order9, order10, order11));
    }

    private static List<List<Order>> getOrdersByUniqueCities(List<Order> orders) {
        List<List<Order>> result = new ArrayList<>();

        List<String> uniqueCities = orders.stream().map(o -> o.getUser().getCity()).distinct().collect(Collectors.toList());
        for (String s : uniqueCities) {
            result.add(orders.stream().filter(o -> o.getUser().getCity().equals(s)).collect(Collectors.toList()));
        }

        return result;
    }

    private static List<Order> getOrdersByCurrency(List<Order> orders, Currency currency) {
        return orders.stream().filter(order -> order.getCurrency() == currency).collect(Collectors.toList());
    }

    private static class SoloComparator implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            return o2.getPrice() - o1.getPrice();
        }
    }

    private static class DuoComparator implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            int result = o1.getPrice() - o2.getPrice();
            if (result == 0) {
                return o1.getUser().getCity().compareTo(o2.getUser().getCity());
            }
            return result;
        }
    }

    private static class TrioComparator implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            int itemNameResult = o1.getItemName().compareTo(o2.getItemName());
            if (itemNameResult == 0) {
                int shopIdResult = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                if (shopIdResult == 0) {
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                }
                return shopIdResult;
            }
            return itemNameResult;
        }
    }
}
