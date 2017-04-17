package exemple.unit_05.db;

import unit_05.domain.Room;

import java.util.GregorianCalendar;

/**
 * Created by Vitalii on 06.03.2017.
 */
public class BookingComDatabase extends Database {
    {
        rooms.add(new Room(1L, 100, 10, new GregorianCalendar(1992, 6, 12).getTime(), "Dream", "Manchester"));
        rooms.add(new Room(2L, 200, 20, new GregorianCalendar(1993, 7, 1).getTime(), "Five lions", "Rome"));
        rooms.add(new Room(3L, 300, 30, new GregorianCalendar(1994, 8, 22).getTime(), "Hey bro", "Venice"));
        rooms.add(new Room(4L, 400, 40, new GregorianCalendar(1995, 9, 20).getTime(), "Hello", "Oslo"));
        rooms.add(new Room(5L, 500, 50, new GregorianCalendar(1996, 10, 9).getTime(), "White scheme", "Paris"));
    }
}
