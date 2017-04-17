package module5.database;

import module5.Room;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    protected List<Room> roomDB = new ArrayList<>();

    public List<Room> getRoomDB() {
        return roomDB;
    }

    public void setRoomDB(List<Room> roomDB) {
        this.roomDB = roomDB;
    }
}
