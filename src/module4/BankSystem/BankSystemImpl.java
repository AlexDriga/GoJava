package src.module4.BankSystem;

import module4.CurrencyEnum.Currency;
import module4.UserBody.User;

public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {

        user.getBank().setLimitOfWithdrawal(user.getBank().getCurrency());
        user.getBank().setCommission(user.getBank().getCurrency(), amount);

        if (amount <= 0) {
            System.out.println("Error. Enter amount!");
        } else if (amount > user.getBank().getLimitOfWithdrawal()) {
            System.out.println("Error. Max amount " + user.getBank().getLimitOfWithdrawal());
        } else if (amount <= user.getBank().getLimitOfWithdrawal()){
            user.setBalance(user.getBalance() - (amount + ((amount * user.getBank().getCommission(amount)) / 100)));
        }
         System.out.println("User '"+user.getName()+"' (balance= "+user.getBalance()+ " commission= " +
                 ((amount * user.getBank().getCommission(amount))/100) + ")");
         System.out.println("====================================================");
     }


    @Override
    public void fundUser(User user, int amount) {

        user.getBank().setLimitOfFunding(user.getBank().getCurrency());
        user.getBank().setCommission(user.getBank().getCurrency(), amount);

        if (amount <=0) {
            System.out.println("Error. Enter amount!");
        } else if (amount > user.getBank().getLimitOfFunding() && user.getBank().getCurrency().equals(Currency.USD)){
            user.setBalance(user.getBalance() + (amount - ((amount * user.getBank().getCommission(amount)) / 100)));
        } else if (amount > user.getBank().getLimitOfFunding()){
            System.out.println("Error. Max amount " + user.getBank().getLimitOfFunding());
        }
        System.out.println("User '" + user.getName() + "' (balance= " + user.getBalance() + " commission= " +
                ((amount * user.getBank().getCommission(amount))/100) + ")");
        System.out.println("====================================================");

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (amount <=0){
            System.out.println("Error. Enter amount!");
        } else {
            fromUser.setBalance(fromUser.getBalance()- (amount + ((amount * fromUser.getBank().getCommission(amount)) / 100)));
            toUser.setBalance(toUser.getBalance()+ amount);
        }
        System.out.println("User '" + fromUser.getName() + "' (balance= " + fromUser.getBalance() + " commission= " +
                ((amount * fromUser.getBank().getCommission(amount))/100) +  ")");
        System.out.println("User '" + toUser.getName() + "' (balance= " + toUser.getBalance() + ")");
        System.out.println("====================================================");
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("User '" + user.getName() + "' (balance= " + user.getBalance() + " salary= " +user.getSalary() + ")");
        System.out.println("====================================================");
    }
}