package module7;

import module4.Currency;

/**
 * Класс Order:
 long id
 int price
 Currency currency
 String itemName
 String shopIdentificator
 User user
 */

public class Order {
    private long id;
    private int price;
    Currency currency;
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

        if (getId() != order.getId()) return false;
        if (getPrice() != order.getPrice()) return false;
        if (getCurrency() != order.getCurrency()) return false;
        if (getItemName() != null ? !getItemName().equals(order.getItemName()) : order.getItemName() != null)
            return false;
        if (getShopIdentificator() != null ? !getShopIdentificator().equals(order.getShopIdentificator()) : order.getShopIdentificator() != null)
            return false;
        return getUser() != null ? getUser().equals(order.getUser()) : order.getUser() == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getPrice();
        result = 31 * result + (getCurrency() != null ? getCurrency().hashCode() : 0);
        result = 31 * result + (getItemName() != null ? getItemName().hashCode() : 0);
        result = 31 * result + (getShopIdentificator() != null ? getShopIdentificator().hashCode() : 0);
        result = 31 * result + (getUser() != null ? getUser().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "id=" + id +
                ", price=" + price +
                ", currency=" + currency +
                ", itemName='" + itemName + '\'' +
                ", shopIdentificator='" + shopIdentificator + '\'' +
                ", user=" + user +
                '}';
    }

}
