package module5.apiPackage;

import module5.dao.DAOimpl;
import module5.database.TripAdvisorDB;


public class TripAdvisorAPI extends APIimpl {

    {
        dao = new DAOimpl(new TripAdvisorDB());
    }


}
