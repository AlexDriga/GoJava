package module5.dao;


import module5.Room;

/** Создать интерфейс dao и его реализацию.
 * Методы выводят название операции и объекта, над которым она произведена.
        room save(room room)
        boolean delete(room room)
        room update(room room)
        room findById(long id)
 */

public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    Room[] getAll();

}
