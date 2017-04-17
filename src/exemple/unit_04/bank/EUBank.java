package exemple.unit_04.bank;

import unit_04.Currency;

/**
 * Created by Vitalii on 17.02.2017.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 2000;
            case EUR:
                return 2200;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

    @Override
    public int getLimitOfFunding() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 10_000;
            case EUR:
                return 20_000;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

    @Override
    public int getMonthlyRate() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 0;
            case EUR:
                return 1;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

    @Override
    public int getCommission(int summ) {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return (summ <= 1000) ? 5 : 7;
            case EUR:
                return (summ <= 1000) ? 2 : 4;
        }
        throw new IllegalArgumentException("Illegal currency");
    }
}
