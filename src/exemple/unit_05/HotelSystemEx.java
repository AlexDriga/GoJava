package exemple.unit_05;

import unit_05.domain.Room;

import java.util.Arrays;

/**
 * Created by Vitalii on 18.03.2017.
 */
public class HotelSystemEx {

    public static void main(String[] args) {

        Model model = new Model();

        Controller controller = new Controller(model);

        HotelSystemEx ex = new HotelSystemEx();
        ex.print(model.getDao().getAll());

        System.out.println("Request: 100, 10, \"Manchester\", \"Dream\"");
        controller.requestRooms(100, 10, "Manchester", "Dream");
        ex.print(model.getDao().getAll());

        System.out.println("Request: 400, 40, \"Oslo\", \"Hello\"");
        controller.requestRooms(400, 40, "Oslo", "Hello");
        ex.print(model.getDao().getAll());

        System.out.println("Request: 200, 20, \"Rome\", \"Five lions\"");
        controller.requestRooms(200, 20, "Rome", "Five lions");
        ex.print(model.getDao().getAll());

        System.out.println("Nothing to change: ");
        controller.requestRooms(0, 0, "NULL", "NULL");
        ex.print(model.getDao().getAll());

        System.out.println("List of the same available rooms: ");
        ex.print(controller.check(controller.getApis()[0], controller.getApis()[2]));
    }

    private void print(Room[] rooms) {
        System.out.println("Database: (" + rooms.length + " lines)");
        Arrays.stream(rooms).forEach(System.out::println);
    }
}
