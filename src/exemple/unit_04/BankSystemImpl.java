package exemple.unit_04;

/**
 * Created by Vitalii on 17.02.2017.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user == null || amount < 0) {
            throw new IllegalArgumentException("Incorrect data");
        }

        int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();
        int sum = (amount < limitOfWithdrawal) ? amount : limitOfWithdrawal;
        double commission = user.getBank().getCommission(amount);

        double result = user.getBalance() - sum * (commission / 100);
        user.setBalance(result);
    }

    @Override
    public void fundUser(User user, int amount) {
        if (user == null || amount < 0) {
            throw new IllegalArgumentException("Incorrect data");
        }
        int limitOfFunding = user.getBank().getLimitOfFunding();
        int sum = ((amount < limitOfFunding) || (limitOfFunding == 0)) ? amount : limitOfFunding;
        user.setBalance(user.getBalance() + sum);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        withdrawOfUser(fromUser, amount);
        fundUser(toUser, amount);
    }

    @Override
    public void paySalary(User user) {
        if (user == null){
            throw new IllegalArgumentException("Incorrect data");
        }

        user.setBalance(user.getBalance() + user.getSalary());
    }
}
