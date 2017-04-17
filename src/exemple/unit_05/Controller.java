package exemple.unit_05;

import unit_05.api.API;
import unit_05.api.BookingComAPI;
import unit_05.api.GoogleAPI;
import unit_05.api.TripAdvisorAPI;
import unit_05.domain.Room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Vitalii on 06.03.2017.
 */
public class Controller {
    private final API apis[] = new API[3];
    private final Model model;

    public Controller(Model model) {
        this.model = model;

        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        List<Room> rooms = new ArrayList<>();
        for (API api : apis) {
            Room[] array = api.findRooms(price, persons, city, hotel);
            if (array.length > 0) {
                rooms.addAll(Arrays.asList(array));
            }
        }

        for (Room r : rooms) {
            model.getDao().save(r);
        }

        return rooms.toArray(new Room[rooms.size()]);
    }

    public Room[] check(API api1, API api2) {

        List<Room> api1Rooms = Arrays.asList(api1.getAll());
        List<Room> api2Rooms = Arrays.asList(api2.getAll());

        List<Room> rooms = new ArrayList<>();
        for (Room room1 : api1Rooms) {
            for (Room room2 : api2Rooms) {
                if (room1.equals(room2)) {
                    rooms.add(room1);
                }
            }
        }

        return rooms.toArray(new Room[rooms.size()]);
    }

    public API[] getApis() {
        return apis;
    }
}
