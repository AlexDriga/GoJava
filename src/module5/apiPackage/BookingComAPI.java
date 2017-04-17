package module5.apiPackage;

import module5.dao.DAOimpl;
import module5.database.BookingComDB;


public class BookingComAPI extends APIimpl {

    {
        dao = new DAOimpl(new BookingComDB());
    }

}


