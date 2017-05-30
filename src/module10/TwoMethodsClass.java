package module10;

/**
 * Created by Plutus on 21.04.2017.
 */
public class TwoMethodsClass {

    public static void g() throws OwnException {
        throw new OwnException("Class TwoMethodsClass - Method G");
    }

    public static void f() {
        try {
            g();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        f();
    }
}
