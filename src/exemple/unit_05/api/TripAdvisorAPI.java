package exemple.unit_05.api;

import unit_05.dao.DAOImpl;
import unit_05.db.TripAdvisorDatabase;

/**
 * Created by Vitalii on 06.03.2017.
 */
public class TripAdvisorAPI extends AbstractAPI {

    {
        dao = new DAOImpl(new TripAdvisorDatabase());
    }
}
