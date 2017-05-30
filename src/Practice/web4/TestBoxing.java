package Practice.web4;

/**
 * Created by Alex-Plut on 17.02.2017.
 */
public class TestBoxing {
    public static void main(String[] args) {
        int i = 150;
  //      Integer v = i;
        Integer v1 = Integer.valueOf(i);
        Integer v2 = Integer.valueOf(i);

        i = v1.intValue();

        long a = 10;
        Long b = 10L;

        if(a == b){
            System.out.println("Hello");
        }


        System.out.println(v1);

    }
}
