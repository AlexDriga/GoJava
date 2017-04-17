package module6.task3;


import module6.task2.User;

import java.util.Arrays;

public class UserMain {
    public static void main(String[] args) {

        UserUtils userUtils = new UserUtils();
        User [] usersArray = new User[7];

        usersArray [0] = new User(1001, "Alex", "First", 8700, 30000);
        usersArray [1] = new User(1002, "Leo", "Second", 7900, 19000);
        usersArray [2] = new User(1003, "Alice", "Third", 6300, 21000);
        usersArray [3] = new User(1004, "Bob", "Fourth", 5100, 26000);
        usersArray [4] = new User(1005, "Anna", "Fifth", 8500, 30000);
        usersArray [5] = new User(1005, "Anna", "Fifth", 8500, 30000);
        usersArray [6] = null;

        System.out.println("Our users array " + Arrays.toString(usersArray) + "\n");

        System.out.println("Contitional balance \n" + Arrays.toString(userUtils.usersWithContitionalBalance(usersArray,30000))+ "\n");
        System.out.println("+Salary \n" + Arrays.toString(userUtils.paySalaryToUsers(usersArray))+ "\n");
        System.out.println("Deleted empty users \n" + Arrays.toString(userUtils.deleteEmptyUsers(usersArray))+ "\n");
        System.out.println("Unique users \n" + Arrays.toString(userUtils.uniqueUsers(usersArray)) + "\n");
        System.out.println("Users Id arrays \n" + Arrays.toString(userUtils.getUsersId(usersArray))+ "\n");


    }
}
