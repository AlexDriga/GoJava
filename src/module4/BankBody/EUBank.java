package src.module4.BankBody;

import module4.CurrencyEnum.Currency;

/**
 *  EUBank:
 *  лимит снятия = 2000, если валюта - USD и 2200, если EUR
 *  лимит пополнения - 20000, если EUR и 10000, если USD
 *  месячная ставка - 0% на USD и 1% на EUR
 *  комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 *  2%, если EUR и до 1000 и 4%, если EUR и больше 1000
 */

public class EUBank extends Bank {

    private int limitOfWithdrawl;
    private int limitOfFunding;
    private int monthlyRate;
    private int commission;


    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployee, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public void setLimitOfWithdrawal(Currency currency) {
        if (currency.equals(Currency.USD))  {
            limitOfWithdrawl = 2000;
        } else if (currency.equals(Currency.EUR)) {
            limitOfWithdrawl = 2200;
        }
    }

    @Override
    public int getLimitOfWithdrawal() { return limitOfWithdrawl; }

    @Override
    public void setLimitOfFunding(Currency currency) {
        if (currency.equals(Currency.USD)){
            limitOfFunding = 10000;
        }else if (currency.equals(Currency.EUR)) {
            limitOfFunding = 20000;
        }
    }

    @Override
    public int getLimitOfFunding() { return limitOfFunding; }

    @Override
    public void setMonthlyRate(Currency currency) {
        if (currency.equals(Currency.USD)) {
            monthlyRate = 0;
        } else if (currency.equals(Currency.EUR)) {
            monthlyRate = 1;
        }
    }

    @Override
    public int getMonthlyRate() { return monthlyRate; }

    @Override
    public int setCommission(Currency currency, int amount) {
        if ( amount <=0 ) {
            System.out.println("Error. Enter amount!");
        }
        if (currency.equals(Currency.USD) && amount <= 1000) {
            commission = 5;
        } else if (currency.equals(Currency.USD) && amount >= 1000) {
            commission = 7;
        } else if (currency.equals(Currency.EUR) && amount <= 1000) {
            commission = 2;
        } else if (currency.equals(Currency.EUR) && amount >= 1000) {
            commission = 4;
        }
        return commission;
    }

    @Override
    public int getCommission(int summ) { return commission; }
}


