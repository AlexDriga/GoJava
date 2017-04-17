package exemple.unit_06.array;

import org.apache.commons.lang3.text.StrBuilder;

import java.util.Arrays;

/**
 * Created by Vitalii on 19.03.2017.
 */
public class ArrayUtilsEx {
    public static void main(String[] args) {
        int[] ar = {5, -4, 3, -2, 1, 0, 1, 2, 3, 4, 5};

        int min = ArrayUtils.min(ar);
        int max = ArrayUtils.max(ar);
        int sum = ArrayUtils.sum(ar);
        int maxPositive = ArrayUtils.maxPositive(ar);
        long multiplication = ArrayUtils.multiplication(ar);
        int modulus = ArrayUtils.modulus(ar);
        int secondLargest = ArrayUtils.secondLargest(ar);
        int[] reversed = ArrayUtils.reverse(ar);
        int[] evenElements = ArrayUtils.findEvenElements(ar);

        StrBuilder builder = new StrBuilder();
        builder.append("min: ").append(min);
        builder.append("\nmax: ").append(max);
        builder.append("\nsum: ").append(sum);
        builder.append("\nmax+: ").append(maxPositive);
        builder.append("\nmultiplication: ").append(multiplication);
        builder.append("\nmodulus: ").append(modulus);
        builder.append("\nsecond largest: ").append(secondLargest);
        builder.append("\nreversed: ").append(Arrays.toString(reversed));
        builder.append("\nevenElements: ").append(Arrays.toString(evenElements));

        System.out.println(builder.toString());
    }
}
