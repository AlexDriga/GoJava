package Practice;

/**
 * Created by Alex-Plut on 20.04.2017.
 */

public class test {
    public static void main(String[] args) {

        try {
            int [] ar = {1, 2, 3};
            System.out.println(ar [3]);
        } catch (IndexOutOfBoundsException a){
            System.out.println(10);
        } catch (Exception e){
            System.out.println(11);
        }

        try {
            int a = 0;
            System.out.println("a = " + a + "\n");
            int b = 20/a;
            System.out.println("b = " + b);
        }
        catch (ArithmeticException e){
            System.out.println("1");
        }
        finally {
            System.out.println("2");
        }

        try {
            int a[]= {1, 2, 3, 4};
            for (int i = 1; i <=4; i++)
            {
                System.out.println("a [" + i + "]=" + a [i] + "\n");
            }
        }
        catch (Exception e)
        {
            System.out.println("error = " + e);
        }
//        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
}
