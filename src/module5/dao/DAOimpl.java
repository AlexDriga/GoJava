package module5.dao;

import module5.Room;
import module5.database.DataBase;

import java.util.List;

public class DAOimpl implements DAO {

    private DataBase roomDB;

    public DAOimpl(DataBase dataBase) {
        this.roomDB = dataBase;
    }

    public DataBase getRoomDB() {
        return roomDB;
    }

    @Override
    public Room save(Room room) {
        if (room == null) {
            throw new NullPointerException();
        }else
            roomDB.getRoomDB().add(room);
            System.out.println(room + " was saved");
            return room;
    }

    @Override
    public boolean delete(Room room) {
        if (room == null){
            throw new NullPointerException();
        }else
            roomDB.getRoomDB().remove(room);
            System.out.println(room + " was deleted");
            return true;
    }

    @Override
    public Room update(Room room) {
        if (room == null){
            throw new NullPointerException();
        }
        int index = roomDB.getRoomDB().indexOf(room);
        roomDB.getRoomDB().set(index, room);
        System.out.println(room + " was updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        for (Room room : roomDB.getRoomDB()) {
            if (room != null && room.getId() == id ){
                return room;
            }
        }
        return null;
    }

    @Override
    public Room[] getAll() {

        List <Room> allRooms = roomDB.getRoomDB();
        return allRooms.toArray(new Room[allRooms.size()]);
    }
}
