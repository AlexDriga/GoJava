package exemple.unit_04;

import org.apache.commons.lang3.RandomStringUtils;
import unit_04.bank.Bank;
import unit_04.bank.ChinaBank;
import unit_04.bank.EUBank;
import unit_04.bank.USBank;

import java.util.Random;

/**
 * Created by Vitalii on 22.02.2017.
 */
public class Main {
    private Random random = new Random();

    public static void main(String[] args) {
        Main main = new Main();

        Bank[] banks = main.createBanks();
        User[] users = main.createUsers(banks);

        main.printUserDB(users);

        BankSystem bankSystem = new BankSystemImpl();

        for (int i = 0; i < users.length - 1; i++) {
            System.out.println("Before: " + users[i].getName() + "\n" + users[i]);
            bankSystem.withdrawOfUser(users[i], 3000);
            bankSystem.fundUser(users[i], 1000);
            bankSystem.transferMoney(users[i + 1], users[i], 500);
            bankSystem.paySalary(users[i]);
            System.out.println("After: " + users[i].getName() + " got money from user: " + users[i + 1].getName() + "\n" + users[i]);

            System.out.println("------------------------------------------------------------------------");
        }
    }

    private void printUserDB(User[] users) {
        System.out.println("============================= User database ==============================");
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println("==========================================================================\n");
    }

    private User[] createUsers(Bank[] banks) {
        User[] users = new User[6];
        for (int i = 0; i < users.length; i++) {
            users[i] = createUser(banks[i]);
        }

        return users;
    }

    private Bank[] createBanks() {
        Bank[] banks = new Bank[6];
        for (int i = 0; i < banks.length; i++) {
            banks[i] = createBank(i);
        }

        return banks;
    }

    private Bank createBank(int index) {
        long id = random.nextLong();
        String bankCountry = RandomStringUtils.randomAlphabetic(3);
        Currency currency = Currency.values()[random.nextInt(2)];
        int numberOfEmployees = random.nextInt(800) + 100;
        double avrSalaryOfEmployee = random.nextInt(45000) + 20000;
        long rating = random.nextInt(10) + 1;
        long totalCapital = random.nextInt(Integer.MAX_VALUE / 2) + 1_000_000;


        switch (index) {
            case 0:
            case 1:
                return new USBank(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
            case 2:
            case 3:
                return new EUBank(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
            default:
                return new ChinaBank(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
        }
    }

    private User createUser(Bank bank) {
        long id = random.nextLong();
        String name = RandomStringUtils.randomAlphabetic(10);
        double balance = random.nextInt(5000) + 1000;
        int monthsOfEmployment = random.nextInt(12) + 1;
        String companyName = RandomStringUtils.randomAlphabetic(5);
        int salary = random.nextInt(50000) + 20000;

        return new User(id, name, balance, monthsOfEmployment, companyName, salary, bank);
    }
}

