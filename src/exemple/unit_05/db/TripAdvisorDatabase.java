package exemple.unit_05.db;

import unit_05.domain.Room;

import java.util.GregorianCalendar;

/**
 * Created by Vitalii on 06.03.2017.
 */
public class TripAdvisorDatabase extends Database {
    {
        rooms.add(new Room(100L, 100, 10, new GregorianCalendar(2008, 6, 12).getTime(), "Dream", "Manchester"));
        rooms.add(new Room(200L, 200, 20, new GregorianCalendar(2009, 7, 1).getTime(), "Five lions", "Rome"));
        rooms.add(new Room(300L, 300, 30, new GregorianCalendar(2010, 8, 22).getTime(), "Hey bro", "Venice"));
        rooms.add(new Room(400L, 400, 40, new GregorianCalendar(2011, 9, 20).getTime(), "Hello", "Frankfurt"));
        rooms.add(new Room(500L, 500, 50, new GregorianCalendar(2012, 10, 9).getTime(), "White scheme", "Stockholm"));
    }
}
