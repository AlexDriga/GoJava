package src.module4;

import module4.BankBody.Bank;
import module4.BankBody.ChinaBank;
import module4.BankBody.EUBank;
import module4.BankBody.USBank;
import module4.CurrencyEnum.Currency;
import module4.UserBody.User;

public class Main {
    public static void main(String[] args) {

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

//===========================================================================================================
//                      USER 1 block
//===========================================================================================================
        System.out.println("==========================");
        System.out.println("User1 " + user1);
        System.out.println("\n");

        user1.withdrawOfUser(user1, 1000);
        user1.fundUser(user1, 12000);
        user1.transferMoney(user1, user2, 5000);
        user1.paySalary(user1);

//===========================================================================================================
//                      USER 2 block
//===========================================================================================================
        System.out.println("==========================");
        System.out.println("User2 " + user2.toString());
        System.out.println("\n");

        user2.withdrawOfUser(user2, 5000);
        user2.fundUser(user2, 9000);
        user2.transferMoney(user2, user1, 7000);
        user2.paySalary(user2);

//===========================================================================================================
//                      USER 3 block
//===========================================================================================================
        System.out.println("==========================");
        System.out.println("User3 " + user3.toString());
        System.out.println("\n");

        user3.withdrawOfUser(user3, 5000);
        user3.fundUser(user3, 9000);
        user3.transferMoney(user3, user4, 7000);
        user3.paySalary(user3);

//===========================================================================================================
//                      USER 4 block
//===========================================================================================================
        System.out.println("==========================");
        System.out.println("User4 " + user4.toString());
        System.out.println("\n");

        user4.withdrawOfUser(user4, 5000);
        user4.fundUser(user4, 9000);
        user4.transferMoney(user4, user3, 7000);
        user4.paySalary(user4);

//===========================================================================================================
//                      USER 5 block
//===========================================================================================================
        System.out.println("==========================");
        System.out.println("User5 " + user5.toString());
        System.out.println("\n");

        user5.withdrawOfUser(user5, 5000);
        user5.fundUser(user5, 9000);
        user5.transferMoney(user5, user6, 7000);
        user5.paySalary(user5);

//===========================================================================================================
//                      USER 6 block
//===========================================================================================================

        System.out.println("==========================");
        System.out.println("User6 " + user6.toString());
        System.out.println("\n");

        user6.withdrawOfUser(user6, 5000);
        user6.fundUser(user6, 9000);
        user6.transferMoney(user6, user5, 7000);
        user6.paySalary(user6);

    }
}
