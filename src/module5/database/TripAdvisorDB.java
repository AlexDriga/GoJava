package module5.database;

import module5.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorDB extends DataBase {

    private List<Room> tripAdvisorDB = new ArrayList<>();

    {
        setRoomDB(tripAdvisorDB);
        tripAdvisorDB.add(new Room(3001, 250, 1, new Date(2017,12,01), "Trip_room_0", "Ottawa"));
        tripAdvisorDB.add(new Room(3002, 350, 2, new Date(2017, 12, 02), "Trip_room_1", "Bavaria"));
        tripAdvisorDB.add(new Room(3003, 450, 3, new Date(2017, 12, 03), "Trip_room_2", "Rome"));
        tripAdvisorDB.add(new Room(3004, 550, 4, new Date(2017, 12, 04), "Trip_room_3", "Paris"));
        tripAdvisorDB.add(new Room(3005, 650, 5, new Date(2017, 12, 05), "Trip_room_4", "Dublin"));
    }
}
