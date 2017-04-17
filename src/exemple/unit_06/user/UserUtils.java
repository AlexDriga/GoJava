package exemple.unit_06.user;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Vitalii on 19.03.2017.
 */
public final class UserUtils {

    private UserUtils() {

    }

    public static User[] uniqueUsers(User[] users) {
        Set<User> userSet = new HashSet<>();
        userSet.addAll(Arrays.asList(users));
        userSet.removeIf(Objects::isNull);
        return userSet.toArray(new User[userSet.size()]);
    }

    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        return Arrays.stream(users).filter(n -> n != null && n.getBalance() == balance).toArray(User[]::new);
    }

    public static final User[] paySalaryToUsers(User[] users) {
        List<User> tempUsers = Arrays.stream(users).filter(Objects::nonNull).collect(Collectors.toList());
        List<User> resultList = new ArrayList<>();

        for (int i = 0; i < tempUsers.size(); i++) {
            User tempUser = tempUsers.get(i);
            User newUser = tempUser.setBalance(tempUser.getSalary());
            resultList.add(newUser);
        }

//        Arrays.stream(users).filter(Objects::nonNull).forEach(n -> n.setBalance(n.getBalance() + n.getSalary()));
        return resultList.toArray(new User[resultList.size()]);
    }

    public static final long[] getUsersId(User[] users) {
        List<Long> ids = Arrays.stream(users).filter(Objects::nonNull).map(User::getId).collect(Collectors.toList());
        long[] result = new long[ids.size()];

        for (int i = 0; i < ids.size(); i++) {
            result[i] = ids.get(i);
        }

        return result;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        return Arrays.stream(users).filter(Objects::nonNull).toArray(User[]::new);
    }
}
