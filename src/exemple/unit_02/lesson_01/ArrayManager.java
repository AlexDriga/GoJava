package exemple.unit_02.lesson_01;

/**
 * Created by Vitalii on 16.02.2017.
 *
 * Input: array with size = 10 can be of one of two data types: int and double. Calculate:
 sum
 min/max
 max positive
 multiplication
 modulus of first and last element
 second largest element

 As a result you should have methods with following names :

 sum(int array[]), sum(double[])
 min(int array[]), min(double[])
 max(int array[]), max(double[])
 maxPositive(int array[]), maxPositive(double array[]),
 multiplication  (int array[]), multiplication (double[])
 modulus(int array[]), modulus(double[])
 secondLargest(int array[]), secondLargest(double[])
 */
public class ArrayManager {
    public int sum(int[] array) {
        int result = 0;
        for (int a : array) {
            result += a;
        }
        return result;
    }

    public double sum(double[] array) {
        double result = 0;
        for (double d : array) {
            result += d;
        }
        return result;
    }

    public int min(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public double min(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            double element = array[i];
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public int max(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public double max(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            double element = array[i];
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int maxPositive(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        int max = -1;
        for (int element : array) {
            if (element > max && element > 0) {
                max = element;
            }
        }
        return max;
    }

    public double maxPositive(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        double max = -1;
        for (double element : array) {
            if (element > max && element > 0) {
                max = element;
            }
        }
        return max;
    }

    public int multiplication(int[] array) {
        int result = 1;
        for (int a : array) {
            result *= a;
        }
        return result;
    }

    public double multiplication(double[] array) {
        double result = 1;
        for (double a : array) {
            result *= a;
        }
        return result;
    }

    public int modulus(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        int first = array[0];
        int last = array[array.length - 1];

        return first % last;
    }

    public double modulus(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        double first = array[0];
        double last = array[array.length - 1];

        return first % last;
    }

    public int secondLargest(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        int largest = array[0];
        int secondLargest = array[0];

        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            if ((element != largest) && (element != secondLargest) && (element > secondLargest)) {
                if (element > largest) {
                    secondLargest = largest;
                    largest = element;
                } else {
                    secondLargest = element;
                }
            }
        }

        return secondLargest;
    }

    public double secondLargest(double[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }

        double largest = array[0];
        double secondLargest = array[0];

        for (int i = 1; i < array.length; i++) {
            double element = array[i];
            if ((element != largest) && (element != secondLargest) && (element > secondLargest)) {
                if (element > largest) {
                    secondLargest = largest;
                    largest = element;
                } else {
                    secondLargest = element;
                }
            }
        }

        return secondLargest;
    }
}
