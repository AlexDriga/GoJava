package module4;

/**
 *  USBank:
 *  лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
 *  лимит пополнения - 10000, если EUR, и нет лимита, если USD
 *  месячная ставка - 1% на USD и 2% на EUR
 *  комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 *  6%, если EUR и до 1000 и 8%, если EUR и больше 1000
 */

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        Currency currency = getCurrency();
        int limitOfWithdrawal = 1000;
        if (currency.equals(Currency.USD))  {
            limitOfWithdrawal = 1000;
        } else if (currency.equals(Currency.EUR)) {
            limitOfWithdrawal = 1200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        Currency currency = getCurrency();
        int limitOfFunding = 10000;
        if (currency.equals(Currency.USD)) {
             limitOfFunding = Integer.MAX_VALUE;
         } else if (currency.equals(Currency.EUR)) {
             limitOfFunding = 10000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        Currency currency = getCurrency();
        int monthlyRate = 1;
        if (currency.equals(Currency.USD)) {
         monthlyRate = 1;
        } else if (currency.equals(Currency.EUR)) {
         monthlyRate = 2;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        Currency currency = getCurrency();
        int commission = 5;
        if (currency.equals(Currency.USD) && summ <= 1000) {
             commission = 5;
         } else if (currency.equals(Currency.USD) && summ >= 1000) {
             commission = 7;
         } else if (currency.equals(Currency.EUR) && summ <= 1000) {
             commission = 6;
         } else if (currency.equals(Currency.EUR) && summ >= 1000) {
             commission = 8;
         }
        return commission;
    }
}
