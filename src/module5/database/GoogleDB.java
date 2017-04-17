package module5.database;

import module5.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleDB extends DataBase {

    private List<Room> googleDB = new ArrayList<>();

    {
        setRoomDB(googleDB);
        googleDB.add(new Room(2001, 250, 1, new Date(2017,12,01), "Google_room_0", "Kiev"));
        googleDB.add(new Room(2002, 350, 2, new Date(2017, 12, 02), "Google_room_1", "Vienna"));
        googleDB.add(new Room(2003, 450, 3, new Date(2017, 12, 03), "Google_room_2", "Tallinn"));
        googleDB.add(new Room(2004, 550, 4, new Date(2017, 12, 04), "Google_room_3", "Paris"));
        googleDB.add(new Room(2005, 650, 5, new Date(2017, 12, 05), "Google_room_4", "London"));
    }
}
