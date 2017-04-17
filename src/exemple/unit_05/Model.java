package exemple.unit_05;

import unit_05.dao.DAO;
import unit_05.dao.DAOImpl;
import unit_05.db.Database;

/**
 * Created by Vitalii on 06.03.2017.
 */
public class Model {

    private DAO dao = new DAOImpl(new Database());

    public DAO getDao() {
        return dao;
    }
}
