package module5;

import module5.apiPackage.API;
import module5.apiPackage.BookingComAPI;
import module5.apiPackage.GoogleAPI;
import module5.apiPackage.TripAdvisorAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**     Задание 6

        Создайте класс Controller, в котором есть глобальная переменная api apis[] = new api[3], которая содержит все реализации интерфейса api.
        Также у Controller есть 2 метода:
        room[] requestRooms(int price, int persons, String city, String hotel)
        ищет все номера с запрашиваемыми параметрами.

        Все методы используют доступные методы api для поиска.
        Найденные номера формируют новую DB.

        room[] check(api api1, api api2)

        Проверить, сколько одинаковых номеров возвращают две разные api.
*/

 public class Controller {

    private Model model;

    private API apis [] = new API[3];
  {
      apis [0] = new BookingComAPI();
      apis [1] = new GoogleAPI();
      apis [2] = new TripAdvisorAPI();
  }

    public Controller(Model model) {
        this.model = model;
    }

    public Room[] requestRooms(int price, int persons, String city) {
        List <Room> requestRoomsList = model.getControllerDB().getRoomDB();
        requestRoomsList.clear();
        for (API api: apis) {
            Room [] roomsForRequest = api.findRooms(price, persons, city);
            if (roomsForRequest.length != 0) {
                requestRoomsList.addAll(Arrays.asList(roomsForRequest));
            }
        }
        return requestRoomsList.toArray(new Room[requestRoomsList.size()]);
    }

    public Room[] check(API api1, API api2){
        List <Room> checkRoomList = new ArrayList<>();
        Room [] roomsAPI1 = api1.getDAO().getAll();
        Room [] roomsAPI2 = api2.getDAO().getAll();

        for (Room roomAPI1 : roomsAPI1) {
            for (Room roomAPI2 : roomsAPI2) {
                if (roomAPI1.equals(roomAPI2)){
                    checkRoomList.add(roomAPI1);
                }
            }
        }
        return checkRoomList.toArray(new Room[checkRoomList.size()]);
    }

//  public room save(room room){
//      List <room> controllerDB = model.getControllerDB().getRoomDB();
//      controllerDB.add(room);
//      return room;
//  }

// public boolean delete(room room){
//     List <room> controllerDB = model.getControllerDB().getRoomDB();
//     controllerDB.remove(room);
//     return true;
// }




}
