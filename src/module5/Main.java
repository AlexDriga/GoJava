package module5;

import module5.apiPackage.API;
import module5.apiPackage.BookingComAPI;
import module5.apiPackage.GoogleAPI;
import module5.apiPackage.TripAdvisorAPI;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Model model = new Model();
        Controller controller = new Controller(model);

        API api1 = new BookingComAPI();
        API api2 = new GoogleAPI();
        API api3 = new TripAdvisorAPI();

        System.out.println("\nMethod - Request rooms");
        System.out.println(Arrays.toString(controller.requestRooms(250, 1, "Kiev")));
        System.out.println(Arrays.toString(controller.requestRooms(350, 2, "Bavaria")));
        System.out.println(Arrays.toString(controller.requestRooms(650, 5, "London")));

        System.out.println("\nMethod - Check");
        System.out.println(Arrays.toString(controller.check(api1, api2)));
        System.out.println(Arrays.toString(controller.check(api1, api3)));
        System.out.println(Arrays.toString(controller.check(api2, api3)));


    }
}
