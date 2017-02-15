package Module2;
import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args)    {
        int[] intArray = {-13, 9, 11, -6, -1, 5, 17, 21, 19, 14};
        double[] doubleArray = {11.7, -9.3, 5.8, -8.1, 3.1, 19.3, -13.7, 27.5, 19.8, 10.5};

        System.out.println("Int array: " + Arrays.toString(intArray));
        System.out.println("Double array: " + Arrays.toString(doubleArray));
        System.out.println("=================================");
        System.out.println("Int array sum: " + sum(intArray));
        System.out.println("Double array sum: " + sum(doubleArray));
        System.out.println("Min int array: " + min(intArray));
        System.out.println("Min double array: " + min(doubleArray));
        System.out.println("Max int array: " + max(intArray));
        System.out.println("Max double array: " + max(doubleArray));
        System.out.println("Max positive number in int array: " + maxPositive(intArray));
        System.out.println("Max positive number in double array: " + maxPositive(doubleArray));
        System.out.println("Multiplication int array: " + multiplication(intArray));
        System.out.println("Multiplication double array: " + multiplication(doubleArray));
        System.out.println("Modulus first and last num int array: " + modulus(intArray));
        System.out.println("Modulus first and last num double array: " + modulus(doubleArray));
        System.out.println("Second largest num int array: " + secondLargest(intArray));
        System.out.println("Second largest num double array: " + secondLargest(doubleArray));
    }

    public static int sum(int array[]) {                    // сумма массива int
        int sumInt = 0;
        for (int i = 0; i < array.length; i++){
            sumInt += array[i];
        }
        return sumInt;
    }

    public static double sum(double array[])             // сумма массива double
    {
        double sumDouble = 0;
        for (int i = 0; i < array.length; i++)
        {
            sumDouble += array[i];
        }
        return sumDouble;
    }

    public static int min(int array[])                   // min int
    {
        int minIntArr = array[0];


        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < minIntArr)
            {
                minIntArr = array[i];
            }

        }
        return minIntArr;
    }

    public static int max(int array[])                   // max int
    {
        int maxIntArr = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > maxIntArr)
            {
                maxIntArr = array[i];
            }
        }
        return maxIntArr;
    }

    public static double min(double array[])          // min double
    {
        double minDoubleArr = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < minDoubleArr)
            {
                minDoubleArr = array[i];
            }
        }
        return minDoubleArr;
    }

    public static double max(double array[])           // max double
    {
        double maxDoubleArr = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > maxDoubleArr)
            {
                maxDoubleArr = array[i];
            }

        }
        return maxDoubleArr;
    }
    public static int maxPositive (int array[])           // max positive int number
    {
        int maxPositiveIntArr = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > 0)
            {
                if (array[i] > maxPositiveIntArr)
                {
                    maxPositiveIntArr = array[i];
                }
            }
        }
        return maxPositiveIntArr;
    }
    public static double maxPositive (double array[])          //max positive double number
    {
        double maxDouPositive = array[0];

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > 0) {
                if (array[i] > maxDouPositive)
                {
                    maxDouPositive = array[i];
                }
            }
        }
        return maxDouPositive;
    }
    public static int multiplication (int array[])                    // multiplication int array
    {
        int mulIntArr = array[0];

        for (int i = 1; i < array.length; i++)
        {
            mulIntArr *= array[i];
        }
        return mulIntArr;
    }
    public static double multiplication (double array[])            // multiplication double array
    {
        double mulDouArr = array[0];

        for (int i = 1; i < array.length; i++)
        {
            mulDouArr *= array [i];
        }
        return mulDouArr;
    }
    public static int modulus (int array [])                        // modulus first/last numbers int array
    {
        int modIntNum = array[0] % array [9];
        return modIntNum;
    }
    public static double modulus (double array[])                   // modulus first/last numbers double array
    {
        double modDouNum = array[0] % array[9];
        return modDouNum;
    }
     public static int secondLargest (int array[])                   // second largest number in int array
     {
         int maxInt = array[0];
         int secondMaxInt = array[0];
         for (int i = 0; i < array.length; i++)
         {
             if (array[i] > maxInt )
             {
                 maxInt = array[i];

             }
             if ((array[i] > secondMaxInt) && (array[i]!= maxInt))
                 secondMaxInt = array[i];
         }
         return secondMaxInt;
     }
     public static double secondLargest (double array[])             // second largest number in double array
     {
         double maxDouble = array[0];
         double secondMaxDouble = array[0];
         for (int i = 0; i < array.length; i++)
         {
             if (array[i] > maxDouble )
             {
                 maxDouble = array[i];

             }
             if ((array[i] > secondMaxDouble) && (array[i]!= maxDouble))
                 secondMaxDouble = array[i];
         }
         return secondMaxDouble;
     }






}
