package module5.apiPackage;

import module5.Room;
import module5.dao.DAOimpl;

import java.util.ArrayList;
import java.util.List;

public abstract class APIimpl implements API {

    protected DAOimpl dao;

    @Override
    public DAOimpl getDAO() {
        return dao;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city) {

        List <Room> foundedRooms = new ArrayList<>();
        Room room = new Room(price, persons, city);
        Room[] rooms = dao.getAll();

        for (Room getRoom: rooms) {
            if (getRoom.equals(room)){
                foundedRooms.add(room);
            }
        }
        return foundedRooms.toArray(new Room[foundedRooms.size()]);
    }

}
