package exemple.unit_04.bank;

import unit_04.Currency;

/**
 * Created by Vitalii on 17.02.2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 1000;
            case EUR:
                return 1200;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

    @Override
    public int getLimitOfFunding() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 0;
            case EUR:
                return 10_000;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

    @Override
    public int getMonthlyRate() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 1;
            case EUR:
                return 2;
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
                return (summ <= 1000) ? 6 : 8;
        }
        throw new IllegalArgumentException("Illegal currency");
    }
}
