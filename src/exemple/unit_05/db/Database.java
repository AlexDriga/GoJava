package exemple.unit_05.db;

import unit_05.domain.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vitalii on 06.03.2017.
 */
public class Database {
    protected List<Room> rooms = new ArrayList<>();

    public List<Room> getRooms() {
        return rooms;
    }
}
