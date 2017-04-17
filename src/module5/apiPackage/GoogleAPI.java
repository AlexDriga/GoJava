package module5.apiPackage;

import module5.dao.DAOimpl;
import module5.database.GoogleDB;


public class GoogleAPI extends APIimpl {

    {
        dao = new DAOimpl(new GoogleDB());
    }

}
