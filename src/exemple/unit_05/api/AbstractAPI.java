package exemple.unit_05.api;

import unit_05.dao.DAO;
import unit_05.domain.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalii on 10.03.2017.
 */
public class AbstractAPI implements API {

    protected DAO dao;

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        List<Room> roomList = new ArrayList<>();

        for (Room room : dao.getAll()) {

            if (room.getPrice() == price &&
                    room.getPersons() == persons &&
                    room.getCityName().equals(city) &&
                    room.getHotelName().equals(hotel)) {

                roomList.add(room);
            }
        }

        return roomList.toArray(new Room[roomList.size()]);
    }

    @Override
    public Room[] getAll() {
        return dao.getAll();
    }
}
