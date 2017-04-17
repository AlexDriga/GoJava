package exemple.unit_05.api;

import unit_05.dao.DAOImpl;
import unit_05.db.BookingComDatabase;

/**
 * Created by Vitalii on 06.03.2017.
 */
public class BookingComAPI extends AbstractAPI {

    {
        dao = new DAOImpl(new BookingComDatabase());
    }
}
