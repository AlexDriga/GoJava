package exemple.unit_07;

/**
 * Created by Vitalii on 25.03.2017.
 */
public class Order implements Comparable<Order> {

    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getItemName() {
        return itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (price != order.price) return false;
        if (currency != order.currency) return false;
        if (!itemName.equals(order.itemName)) return false;
        if (!shopIdentificator.equals(order.shopIdentificator)) return false;
        return user.equals(order.user);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + currency.hashCode();
        result = 31 * result + itemName.hashCode();
        result = 31 * result + shopIdentificator.hashCode();
        result = 31 * result + user.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n");
        sb.append("id=").append(id);
        sb.append(", price=").append(price);
        sb.append(", currency=").append(currency);
        sb.append(", itemName='").append(itemName).append('\'');
        sb.append(", shopIdentificator='").append(shopIdentificator).append('\'');
        sb.append(", user=").append(user);
        return sb.toString();
    }

    @Override
    public int compareTo(Order o) {
        return (int) (id - o.getId());
    }
}
