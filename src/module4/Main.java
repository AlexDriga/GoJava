package module4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random ();

        Bank euBankEUR = new EUBank(100_000_100, "Switzerland", Currency.EUR, 100,
                3200, 100, 99_000_000);
        Bank euBankUSD = new EUBank(100_000_200, "Switzerland", Currency.USD, 100,
                3200, 100, 99_000_000);

        Bank usBankUSD = new USBank(200_000_100, "USA", Currency.USD, 300,
                2500, 90, 50_000_000);
        Bank usBankEUR = new USBank(200_000_200, "USA", Currency.EUR, 300,
                2500, 90, 50_000_000);

        Bank chinaBankUSD = new ChinaBank(300_000_100, "PRC", Currency.USD, 500,
                1000, 95, 199_000_000);
        Bank chinaBankEUR = new ChinaBank(300_000_200, "PRC", Currency.EUR, 500,
                1000, 95, 199_000_000);


        User user1 = new User(111_111, "Donald", 19089.98,
                2, "Company1", 1900, usBankUSD);
        User user2 = new User(111_222, "Barack", 15057.11,
                24, "Company2", 2900, usBankEUR);

        User user3 = new User(222_111, "Theresa", 23479.54,
                9, "Company3", 2100, euBankUSD);
        User user4 = new User(222_222, "David", 27199.32,
                18, "Company4", 2600, euBankEUR);

        User user5 = new User(333_111, "Tsai Ing-wen", 32000.00,
                36, "Company5", 3000, chinaBankUSD);
        User user6 = new User(333_222, "Chen Shui-bian", 1800.00,
                12, "Company6", 1200, chinaBankEUR);

        User [] users = {user1, user2, user3, user4, user5, user6};

        BankSystemImpl bankSystem = new BankSystemImpl();

        for (User user : users) {
            System.out.println("User: " + user);
            System.out.println("===============================================");
            bankSystem.withdrawOfUser(user, 1000);
            bankSystem.fundUser(user, 11000);
            bankSystem.transferMoney(user, users[((int) ((random.nextInt(6))))], 1000);
            bankSystem.paySalary(user);
        }
    }
}







