package module5;


import java.util.Date;


/**Класс room должен содержать следующие поля:
        long id
        int price
        int persons
        Date dateAvailableFrom
        String hotelName
        String cityName

        Создайте get-,set-методы и конструктор с аргументами - всеми полями.

        Перегрузите методы equals и hashCode (2 объекты room равны, когда поля price, persons и cityName равны).
*/

public class Room {
    long id;
    int price;
    int persons;
    Date dateAvailableFrom;
    String hotelName;
    String cityName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public Room(int price, int persons, String cityName) {
        this.price = price;
        this.persons = persons;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }
    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }
    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "room{" +
                "id=" + id +
                ", price='" + price +
                "', persons=" + persons +
                ", dateAvailableForm=" + dateAvailableFrom +
                ", hotelName='" + hotelName +
                "', cityName=" + cityName + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (getPrice() != room.getPrice()) return false;
        if (getPersons() != room.getPersons()) return false;
        return getCityName() != null ? getCityName().equals(room.getCityName()) : room.getCityName() == null;
    }

    @Override
    public int hashCode() {
        int result = getPrice();
        result = 31 * result + getPersons();
        result = 31 * result + (getCityName() != null ? getCityName().hashCode() : 0);
        return result;
    }
}
