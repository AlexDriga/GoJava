package module4;

/**
 *  ChinaBank:
 *  лимит снятия = 100, если валюта - USD и 150, если EUR
 *  лимит пополнения - 5000, если EUR и 10000, если USD
 *  месячная ставка - 1% на USD и 0% на EUR
 *  комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
 *  10%, если EUR и до 1000 и 11%, если EUR и больше 1000
 */

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        Currency currency = getCurrency();
        int limitOfWithdrawal = 100;
        if (currency.equals(Currency.USD))  {
            limitOfWithdrawal = 100;
        } else if (currency.equals(Currency.EUR)) {
            limitOfWithdrawal = 150;
        }
        return limitOfWithdrawal;
    }

    @Override
    int getLimitOfFunding() {
        Currency currency = getCurrency();
        int limitOfFunding = 5000;
        if (currency.equals(Currency.USD)) {
            limitOfFunding = 10000;
        } else if (currency.equals(Currency.EUR)) {
            limitOfFunding = 5000;
        }
        return limitOfFunding;
    }

    @Override
    int getMonthlyRate() {
        Currency currency = getCurrency();
        int monthlyRate = 0;
        if (currency.equals(Currency.USD)) {
            monthlyRate = 1;
        } else if (currency.equals(Currency.EUR)) {
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    @Override
    int getCommission(int summ) {
        Currency currency = getCurrency();
        int commission = 3;
        if (currency.equals(Currency.USD) && summ <= 1000) {
            commission = 3;
        } else if (currency.equals(Currency.USD) && summ >= 1000) {
            commission = 5;
        } else if (currency.equals(Currency.EUR) && summ <= 1000) {
            commission = 10;
        } else if (currency.equals(Currency.EUR) && summ >= 1000) {
            commission = 11;
        }
        return commission;
    }

}

