package module6.task3;

import module6.task2.User;

import java.util.ArrayList;

/**
 * Создайте класс UserUtils с последующими методами:
 User[] uniqueUsers(User[] users) – находит и возвращает уникальных пользователей (пользователи одинаковы, когда все их поля совпадают)
 User[] usersWithContitionalBalance(User[] users, int balance) – находит и возвращает пользователей, чей баланс равен заданному
 User[]  paySalaryToUsers(User[] users) – начисляет зарплату в баланс каждому пользователю
 long[] getUsersId(User[] users) – возвращает массив идентификаторов пользователей
 User[] deleteEmptyUsers(User[] users) – находит и удаляет пустые элементы из массива (в результате возвращается новый массив с меньшим размером)

 Удостоверьтесь, что методы paySalaryToUsers и getUsersId не могут быть перезаписаны в других классах.

 Создайте класс UsersMain с методом main, где создайте несколько тестовых пользователей  и продемонстрируйте, как работает каждый метод из UserUtils.
 */

public class UserUtils {

     protected User[] uniqueUsers(User[] users) {
         ArrayList <User> uniqueUsers = new ArrayList<>();

         if (users == null) {
             throw new NullPointerException();
         }

         for (int i = 0; i < users.length; i++) {
             if (users[i] == null) {
                 continue;
             }

             for (User user : users) {
                 if (users[i] != user) {
                     uniqueUsers.add(users[i]);
                 }
                 break;
             }
         }
         return uniqueUsers.toArray(new User[uniqueUsers.size()]);
     }

     protected User[] usersWithContitionalBalance(User[] users, int balance) {
         ArrayList <User> usersWithContitionalBalance = new ArrayList<>();

         if (users == null) {
             throw new NullPointerException();
         }

         for (User user : users) {
             if (user != null && user.getBalance() == balance) {
                 usersWithContitionalBalance.add(user);
             }
         }
         return usersWithContitionalBalance.toArray(new User[usersWithContitionalBalance.size()]);
     }

     protected final User[]  paySalaryToUsers(User[] users) {
         ArrayList <User> usersGotSalary = new ArrayList<>();

         if (users == null) {
             throw new NullPointerException();
         }

         for (User user : users) {
             if (user != null) {
                 long id = user.getId();
                 String firstName = user.getFirstName();
                 String lastName = user.getLastName();
                 int salary = user.getSalary();
                 int balance = user.getBalance() + salary;

                 usersGotSalary.add(new User(id, firstName, lastName, salary, balance));
             }
         }
         return usersGotSalary.toArray(new User[usersGotSalary.size()]);
     }

     protected final Long[] getUsersId(User[] users) {
         ArrayList <Long> usersId = new ArrayList();

         if (users == null) {
             throw new NullPointerException();
         }

         for (User user : users) {
             if (user != null) {
                 long id = user.getId();
                 usersId.add(id);
             }
         }
         return usersId.toArray(new Long[usersId.size()]);
     }

     protected User[] deleteEmptyUsers(User[] users) {
         ArrayList <User> withoutEmptyUsers = new ArrayList<>();

         if (users == null) {
             throw new NullPointerException();
         }

         for (User user : users) {
             if (user != null) {
                 withoutEmptyUsers.add(user);
             }
         }
         return withoutEmptyUsers.toArray(new User[withoutEmptyUsers.size()]);
     }





}
