package src.module4.BankBody;

import module4.CurrencyEnum.Currency;

/**
 *  USBank:
 *  лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
 *  лимит пополнения - 10000, если EUR, и нет лимита, если USD
 *  месячная ставка - 1% на USD и 2% на EUR
 *  комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 *  6%, если EUR и до 1000 и 8%, если EUR и больше 1000
 */

public class USBank extends Bank {

    private int limitOfWithdrawl;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public void setLimitOfWithdrawal(Currency currency) {
        if (currency.equals(Currency.USD))  {
            limitOfWithdrawl = 1000;
        } else if (currency.equals(Currency.EUR)) {
            limitOfWithdrawl = 1200;
        }
    }

    @Override
    public int getLimitOfWithdrawal() { return this.limitOfWithdrawl; }

    @Override
    public void setLimitOfFunding(Currency currency) {
        if (currency.equals(Currency.USD)) {
            limitOfFunding = 0;
        } else if (currency.equals(Currency.EUR)) {
            limitOfFunding = 10000;
        }
    }

    @Override
    public int getLimitOfFunding() { return limitOfFunding; }

    @Override
    public void setMonthlyRate(Currency currency) {
        if (currency.equals(Currency.USD)) {
            monthlyRate = 1;
        } else if (currency.equals(Currency.EUR)) {
            monthlyRate = 2;
        }
    }

    @Override
    public int getMonthlyRate() { return monthlyRate; }

    @Override
    public int setCommission(Currency currency, int amount) {
        if (currency.equals(Currency.USD) && amount <= 1000) {
            commission = 5;
        } else if (currency.equals(Currency.USD) && amount >= 1000) {
            commission = 7;
        } else if (currency.equals(Currency.EUR) && amount <= 1000) {
            commission = 6;
        } else if (currency.equals(Currency.EUR) && amount >= 1000) {
            commission = 8;
        }
        return commission;
    }

    @Override
    public int getCommission(int summ) { return commission; }
}
