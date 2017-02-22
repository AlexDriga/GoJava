package src.module4.BankBody;

import module4.CurrencyEnum.Currency;

/**
 *  ChinaBank:
 *  лимит снятия = 100, если валюта - USD и 150, если EUR
 *  лимит пополнения - 5000, если EUR и 10000, если USD
 *  месячная ставка - 1% на USD и 0% на EUR
 *  комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
 *  10%, если EUR и до 1000 и 11%, если EUR и больше 1000
 */

public class ChinaBank extends Bank {

    private int limitOfWithdrawl;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public void setLimitOfWithdrawal(Currency currency) {
        if (currency.equals(Currency.USD))  {
            limitOfWithdrawl = 100;
        } else if (currency.equals(Currency.EUR)) {
            limitOfWithdrawl = 150;
        }
    }

    @Override
    public int getLimitOfWithdrawal() { return limitOfWithdrawl; }

    @Override
    public void setLimitOfFunding(Currency currency) {
        if (currency.equals(Currency.USD)){
            limitOfFunding = 10000;
        }else if (currency.equals(Currency.EUR)) {
            limitOfFunding = 5000;
        }
    }

    @Override
    public int getLimitOfFunding() { return limitOfFunding; }

    @Override
    public void setMonthlyRate(Currency currency) {
        if (currency.equals(Currency.USD)) {
            monthlyRate = 1;
        } else if (currency.equals(Currency.EUR)) {
            monthlyRate = 0;
        }
    }

    @Override
    public int getMonthlyRate() { return monthlyRate; }

    @Override
    public int setCommission(Currency currency, int amount) {
        if ( amount <=0 ){
            System.out.println("Error. Enter amount!");
        }
        if (currency.equals(Currency.USD) && amount <= 1000) {
            commission = 3;
        } else if (currency.equals(Currency.USD) && amount >= 1000) {
            commission = 5;
        } else if (currency.equals(Currency.EUR) && amount <= 1000) {
            commission = 10;
        } else if (currency.equals(Currency.EUR) && amount >= 1000) {
            commission = 11;
        }
        return commission;
    }

    @Override
    public int getCommission(int summ) { return commission; }

}

