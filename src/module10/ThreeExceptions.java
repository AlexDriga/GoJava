package module10;

/**
 * Created by Plutus on 21.04.2017.
 */
public class ThreeExceptions {

    public static int test (int [] a, int b, int c){
        int d = (a[4] + b)/c;
        return d;
    }


    public static class FirstException extends NullPointerException {
        public FirstException(String s) {
            super("Catch FirstException: NullPointerException");
        }
    }

    public static class SecondException extends ArithmeticException {
        public SecondException(String s) {
            super("Catch SecondException: ArithmeticException");
        }
    }

    public static class ThirdException extends IndexOutOfBoundsException {
        public ThirdException(String s) {
            super("Catch ThirdException: IndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {

        int [] a = {1, 2, 3};
        int b = 0;
        Integer s = null;

        try {
            test(a, s, b);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
