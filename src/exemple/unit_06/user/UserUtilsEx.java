package exemple.unit_06.user;

import java.util.Arrays;

/**
 * Created by Vitalii on 19.03.2017.
 */
public class UserUtilsEx {

    public static void main(String[] args) {
        User[] users = {
                new User(1L, "fn-1", "ln-1", 1000, 10000),
                new User(1L, "fn-1", "ln-1", 1000, 10000),
                null,
                new User(2L, "fn-2", "ln-2", 2000, 5000),
                new User(3L, "fn-3", "ln-3", 3000, 2500),
                null,
                new User(4L, "fn-4", "ln-4", 4000, 1750),
                new User(4L, "fn-4", "ln-4", 4000, 1750),
                new User(5L, "fn-5", "ln-5", 5000, 875),
                new User(6L, "fn-6", "ln-6", 6000, 440),
                null
        };

        User[] uniqueUsers = UserUtils.uniqueUsers(users);
        User[] payedSalaryToUsers = UserUtils.paySalaryToUsers(users);
        User[] usersWithConditionalBalance = UserUtils.usersWithConditionalBalance(users, 1750);
        long[] ids = UserUtils.getUsersId(users);
        User[] deletedEmptyUsers = UserUtils.deleteEmptyUsers(users);

        StringBuilder builder = new StringBuilder();
        builder.append("unique users:\n***\n").append(Arrays.toString(uniqueUsers));
        builder.append("\nids:\n***\n").append(Arrays.toString(ids));
        builder.append("\ndeleted empty users:\n***\n").append(Arrays.toString(deletedEmptyUsers));
        builder.append("\nusers with conditional balance:\n***\n").append(Arrays.toString(usersWithConditionalBalance));
        builder.append("\narray of payed salary to users:\n***\n").append(Arrays.toString(payedSalaryToUsers));

        System.out.println(builder.toString());
    }
}
