package module4;

/**
 *  EUBank:
 *  лимит снятия = 2000, если валюта - USD и 2200, если EUR
 *  лимит пополнения - 20000, если EUR и 10000, если USD
 *  месячная ставка - 0% на USD и 1% на EUR
 *  комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 *  2%, если EUR и до 1000 и 4%, если EUR и больше 1000
 */

public class EUBank extends Bank {


    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        Currency currency = getCurrency();
        int limitOfWithdrawal = 2000;
        if (currency.equals(Currency.USD))  {
            limitOfWithdrawal = 2000;
        } else if (currency.equals(Currency.EUR)) {
            limitOfWithdrawal = 2200;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        Currency currency = getCurrency();
        int limitOfFunding = 10000;
        if (currency.equals(Currency.USD)) {
            limitOfFunding = 10000;
        } else if (currency.equals(Currency.EUR)) {
            limitOfFunding = 20000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        Currency currency = getCurrency();
        int monthlyRate = 0;
        if (currency.equals(Currency.USD)) {
            monthlyRate = 0;
        } else if (currency.equals(Currency.EUR)) {
            monthlyRate = 1;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        Currency currency = getCurrency();
        int commission = 2;
        if (currency.equals(Currency.USD) && summ <= 1000) {
            commission = 5;
        } else if (currency.equals(Currency.USD) && summ >= 1000) {
            commission = 7;
        } else if (currency.equals(Currency.EUR) && summ <= 1000) {
            commission = 2;
        } else if (currency.equals(Currency.EUR) && summ >= 1000) {
            commission = 4;
        }
        return commission;
    }
}


