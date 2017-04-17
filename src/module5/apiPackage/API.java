package module5.apiPackage;

import module5.Room;
import module5.dao.DAOimpl;

/**
 * Создайте api интерфейс с одним методом
 * room[] findRooms(int price, int persons, String city, String hotel)
*/
public interface API {
    Room[] findRooms(int price, int persons, String city);
    DAOimpl getDAO();

}
