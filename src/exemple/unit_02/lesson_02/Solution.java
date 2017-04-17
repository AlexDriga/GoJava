package exemple.unit_02.lesson_02;

/**
 * Created by Vitalii on 16.02.2017.
 */
public class Solution {
    public static void main(String[] args) {
        int commission = 5;

        BankManager manager = new BankManager();

        manager.printWithdrawText(100, 10, commission);
        manager.printWithdrawText(100, 99, commission);

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        manager.printWithdrawTextByName(balances, ownerNames, "Ann", 100, commission);
        manager.printWithdrawTextByName(balances, ownerNames, "Oww", 490, commission);

        manager.fund(balances, ownerNames, "Oww", 100);
        manager.printOwnerInfo(balances, ownerNames, "Oww");
    }
}
