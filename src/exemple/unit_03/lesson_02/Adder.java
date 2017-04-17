package exemple.unit_03.lesson_02;

/**
 * Created by Vitalii on 17.02.2017.
 */
public class Adder extends Arithmetic {
    public boolean check(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException();
        }

        return a >= b;
    }
}
