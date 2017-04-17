package module5.database;

import module5.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComDB extends DataBase {

    private List<Room> bookingComDB = new ArrayList<>();

    {
        setRoomDB(bookingComDB);
        bookingComDB.add(new Room(1001, 250, 1, new Date(2017,12,01), "Booking_room_0", "Kiev"));
        bookingComDB.add(new Room(1002, 350, 2, new Date(2017, 12, 02), "Booking_room_1", "Mexico"));
        bookingComDB.add(new Room(1003, 450, 3, new Date(2017, 12, 03), "Booking_room_2", "Tartu"));
        bookingComDB.add(new Room(1004, 550, 4, new Date(2017, 12, 04), "Booking_room_3", "ManCity"));
        bookingComDB.add(new Room(1005, 650, 5, new Date(2017, 12, 05), "Booking_room_4", "New-York"));
    }
}
