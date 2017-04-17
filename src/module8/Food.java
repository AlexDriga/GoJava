package module8;

import java.time.Period;

/**
 * Создайте класс Food со следующими полями:
 id (уникальный идентификатор товара)
 name (наименование товара)
 country (страна производитель)
 expiration (срок годности в днях)
 Реализуйте доступ к полям. Идентификатор id должен быть недоступен для изменения и генерироваться с помощью IdGenerator при создании товара.
 Товары считаются одинаковыми, если их id одинаковы. Переопределите методы hashCode и equals соответственно.
 */
public class Food {
    private final long id;
    private String name;
    private Country country;
    private Period expiration;

    public Food(String name, Country country, Period expiration) {
        this.id = IdGenerator.generetedId();
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public Period getExpiration() {
        return expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return getId() == food.getId();
    }

    @Override
    public int hashCode() {
        return (int) (getId() ^ (getId() >>> 32));
    }

    @Override
    public String toString() {
        return "\nFood{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", expiration=" + expiration +
                '}';
    }


}