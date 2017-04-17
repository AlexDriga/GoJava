package exemple.unit_07;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vitalii on 25.03.2017.
 */
public class ListEx {

    private static final int SMALL_SIZE = 1000;
    private static final int BIG_SIZE = 10000;

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> smallAL = new ArrayList<>();
        List<Integer> smallLL = new LinkedList<>();

        List<Integer> bigAL = new ArrayList<>();
        List<Integer> bigLL = new LinkedList<>();

        for (int i = 0; i < SMALL_SIZE; i++) {
            smallAL.add(i);
            smallLL.add(i);
        }

        for (int i = 0; i < BIG_SIZE; i++) {
            bigAL.add(i);
            bigLL.add(i);
        }

        check("small ArrayList", smallAL, 0, -1000);
        check("small LinkedList", smallLL, 0, -1000);
        check("big ArrayList", bigAL, 0, -10000);
        check("big LinkedList", bigLL, 0, -10000);
    }

    private static void check(String name, List<Integer> list, Integer... args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        long addTimeAL = getExecTime(list.getClass().getMethod("add", int.class, Object.class), list, 0, -args[1]);
        long setTimeAL = getExecTime(list.getClass().getMethod("set", int.class, Object.class), list, 0, -args[1]);
        long getTimeAl = getExecTime(list.getClass().getMethod("get", int.class), list, 0);
        long removeTimeAl = getExecTime(list.getClass().getMethod("remove", int.class), list, 0);

        System.out.printf("%-16s:    %-6s%-10d | %-6s%-10d | %-6s%-10d | %-6s     %-10d\n",
                name, "add", addTimeAL, "set", setTimeAL, "get", getTimeAl, "remove", removeTimeAl);
    }

    private static long getExecTime(Method method, Object obj, Object... args) throws InvocationTargetException, IllegalAccessException {
        long before = System.nanoTime();
        method.invoke(obj, args);
        return System.nanoTime() - before;
    }
}
