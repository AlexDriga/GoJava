package module5;

import module5.database.DataBase;


public class Model {

    private DataBase controllerDB = new DataBase();

    public DataBase getControllerDB() {
        return controllerDB;
    }

}
