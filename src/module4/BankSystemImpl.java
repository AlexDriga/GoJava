package module4;

public class BankSystemImpl implements BankSystem {


    @Override
    public void withdrawOfUser(User user, int amount) {

        if (amount <= 0) {
            System.out.println("Error. Enter amount!");
        } else if (amount > user.getBank().getLimitOfWithdrawal()) {
            System.out.println("Error. Max withdraw " + user.getBank().getLimitOfWithdrawal());
        } else if (amount <= user.getBank().getLimitOfWithdrawal()){
            user.setBalance(user.getBalance() - (amount + ((amount * user.getBank().getCommission(amount)) / 100.0)));
            System.out.println("User '"+user.getName()+"' (balance= "+user.getBalance()+ " commission= " +
                    ((amount * user.getBank().getCommission(amount))/100.0) + ")");
        }
     }


    @Override
    public void fundUser(User user, int amount) {

        if (amount <= 0) {
            System.out.println("Error. Enter amount!");
        } else if (amount > user.getBank().getLimitOfFunding()) {
            System.out.println("Error. Max fund " + user.getBank().getLimitOfFunding());
        } else if (amount < user.getBank().getLimitOfFunding()){
            user.setBalance(user.getBalance() + (amount - ((amount * user.getBank().getCommission(amount)) / 100.0)));
            System.out.println("User '" + user.getName() + "' (balance= " + user.getBalance() + " commission= " +
                    ((amount * user.getBank().getCommission(amount)) / 100.0) + ")");
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

        if (amount <=0){
            System.out.println("Error. Enter amount!");
        } else {
            fromUser.setBalance(fromUser.getBalance()- (amount + ((amount * fromUser.getBank().getCommission(amount)) / 100.0)));
            toUser.setBalance(toUser.getBalance()+ amount);
            System.out.println("User '" + fromUser.getName() + "' (balance= " + fromUser.getBalance() + " commission= " +
                    ((amount * fromUser.getBank().getCommission(amount))/100.0) +  ")");
            System.out.println("User '" + toUser.getName() + "' (balance= " + toUser.getBalance() + ")");
        }
    }

    @Override
    public void paySalary(User user) {

        user.setBalance(user.getBalance() + user.getSalary());
        System.out.println("User '" + user.getName() + "' (balance= " + user.getBalance() + " salary= " +user.getSalary() + ")");
        System.out.println("====================================================");
    }
}