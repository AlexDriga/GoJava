package exemple.unit_02.lesson_02;

/**
 * Created by Vitalii on 16.02.2017.
 *
 * Continue with BANK example
 2.1 Write method which withdraw money from account and takes commission 5% of the transaction.
 Print OK + commission + balance after withdrawal. Print NO is withdrawal is not possible.
 2.2 You need to write method which withdraw money of particular account owner if he/she can.
 Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal
 in other case. Commission is 5% for all cases.
 2.3 You need to write method which will fund (пополнение) balance of particular user.
 Print name + balance after funding
 */
public class BankManager {
    private double withdraw(int balance, int withdrawal, int commission) {
        if (balance < 0 || withdrawal < 0 || commission < 0) {
            throw new IllegalArgumentException();
        }

        double newWithdrawal = 1d * withdrawal * commission / 100;
        return balance - withdrawal - newWithdrawal;
    }

    public void fund(int[] balances, String[] ownerNames, String name, int amount) {
        if (balances == null || ownerNames == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < ownerNames.length; i++) {
            String owner = ownerNames[i];
            if (owner.equals(name)) {
                balances[i] += amount;
            }
        }
    }

    public void printOwnerInfo(int[] balances, String[] ownerNames, String name) {
        if (name == null) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < ownerNames.length; i++) {
            String owner = ownerNames[i];
            if (owner.equals(name)) {
                System.out.println(name + " " + balances[i]);
            }
        }
    }

    public void printWithdrawText(int balance, int withdrawal, int commission) {
        double amount = withdraw(balance, withdrawal, commission);
        double newWithdrawal = 1d * withdrawal * commission / 100;

        if (amount < 0) {
            System.out.println("NO");
        } else {
            System.out.printf("OK %.1f %.1f\n", newWithdrawal, amount);
        }
    }

    public void printWithdrawTextByName(int[] balances, String[] ownerNames, String name, int withdrawal, int commission) {
        if (balances == null || ownerNames == null || balances.length != ownerNames.length) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < ownerNames.length; i++) {
            String owner = ownerNames[i];
            if (owner.equals(name)) {
                int balance = balances[i];
                System.out.print(name + " ");
                printWithdrawText(balance, withdrawal, commission);
            }
        }
    }
}
