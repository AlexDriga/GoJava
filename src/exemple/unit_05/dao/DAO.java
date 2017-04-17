package exemple.unit_05.dao;

import unit_05.domain.Room;

/**
 * Created by Vitalii on 06.03.2017.
 */
public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    Room[] getAll();
}
