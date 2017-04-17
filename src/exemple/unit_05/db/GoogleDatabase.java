package exemple.unit_05.db;

import unit_05.domain.Room;

import java.util.GregorianCalendar;

/**
 * Created by Vitalii on 06.03.2017.
 */
public class GoogleDatabase extends Database {
    {
        rooms.add(new Room(10L, 100, 10, new GregorianCalendar(2003, 6, 12).getTime(), "Dream", "Manchester"));
        rooms.add(new Room(20L, 200, 20, new GregorianCalendar(2004, 7, 1).getTime(), "Five lions", "Rome"));
        rooms.add(new Room(30L, 300, 30, new GregorianCalendar(2005, 8, 22).getTime(), "Hey bro", "Venice"));
        rooms.add(new Room(40L, 400, 40, new GregorianCalendar(2006, 9, 20).getTime(), "Hello", "Frankfurt"));
        rooms.add(new Room(50L, 500, 50, new GregorianCalendar(2007, 10, 9).getTime(), "White scheme", "Stockholm"));
    }
}
