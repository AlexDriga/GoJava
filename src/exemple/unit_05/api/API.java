package exemple.unit_05.api;

import unit_05.domain.Room;

/**
 * Created by Vitalii on 06.03.2017.
 */
public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}
