package exemple.unit_05.dao;

import unit_05.db.Database;
import unit_05.domain.Room;

import java.util.List;

/**
 * Created by Vitalii on 06.03.2017.
 */
public class DAOImpl implements DAO {

    private Database database;

    public DAOImpl(Database database) {
        this.database = database;
    }

    @Override
    public Room save(Room room) {

        if (room != null && database.getRooms().add(room)) {
            return room;
        }
        return null;
    }

    @Override
    public boolean delete(Room room) {
        return database.getRooms().remove(room);
    }

    @Override
    public Room update(Room room) {

        Room foundRoom = findById(room.getId());
        if (foundRoom == null) {
            return null;
        }
        foundRoom.setPersons(room.getPersons());
        foundRoom.setPrice(room.getPrice());
        foundRoom.setCityName(room.getCityName());
        foundRoom.setDateAvailableFrom(room.getDateAvailableFrom());
        foundRoom.setHotelName(room.getHotelName());
        return foundRoom;
    }

    @Override
    public Room findById(long id) {

        List<Room> rooms = database.getRooms();
        for (int i = 0; i < rooms.size(); i++) {
            Room room = rooms.get(i);
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    @Override
    public Room[] getAll() {
        return database.getRooms().toArray(new Room[database.getRooms().size()]);
    }
}
