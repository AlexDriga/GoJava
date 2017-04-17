package exemple.unit_06.array;

import java.util.Arrays;

/**
 * Created by Vitalii on 19.03.2017.
 */
public final class ArrayUtils {

    public static int sum(int array[]) {
        validate(array);
        return Arrays.stream(array).sum();
    }

    public static int min(int array[]) {
        validate(array);
        return Arrays.stream(array).min().getAsInt();
    }

    public static int max(int array[]) {
        validate(array);
        return Arrays.stream(array).max().getAsInt();
    }

    public static int maxPositive(int array[]) {
        validate(array);
        return Arrays.stream(array).filter(i -> (i > 0)).max().orElse(-1);
    }

    public static long multiplication(int array[]) {
        validate(array);
        return Arrays.stream(array).reduce(Math::multiplyExact).getAsInt();
    }

    public static int modulus(int array[]) {
        validate(array);

        int first = array[0];
        int last = array[array.length - 1];

        return first % last;
    }

    public static int secondLargest(int array[]) {
        int largest = max(array);
        return Arrays.stream(array).filter(i -> i != largest).max().getAsInt();
    }

    public static int[] reverse(int[] array) {
        validate(array);

        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, copy.length);

        int bound = (copy.length % 2) == 0 ? copy.length / 2 : copy.length / 2 - 1;
        for (int i = 0; i < bound; i++) {
            int temp = copy[i];
            copy[i] = copy[copy.length - 1 - i];
            copy[copy.length - 1 - i] = temp;
        }

        return copy;
    }

    public static int[] findEvenElements(int[] array) {
        validate(array);

        int[] copy = new int[array.length];
        System.arraycopy(array, 0, copy, 0, copy.length);

        return Arrays.stream(copy).filter(i -> i % 2 == 0).toArray();
    }

    private static void validate(int array[]) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
    }
}
