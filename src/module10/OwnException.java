package module10;

/**
 * Created by Plutus on 21.04.2017.
 */
public class OwnException extends Exception {

    public OwnException(String message) {
        String exceptionMessage = message;
    }

    public static void testOwnException () throws OwnException {
        throw  new OwnException("Own Exception");
    }
}
