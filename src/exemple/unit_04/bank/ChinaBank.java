package exemple.unit_04.bank;

import unit_04.Currency;

/**
 * Created by Vitalii on 17.02.2017.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return 100;
            case EUR:
                return 150;
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
                return 5_000;
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
                return 0;
        }
        throw new IllegalArgumentException("Illegal currency");
    }

    @Override
    public int getCommission(int summ) {
        Currency currency = getCurrency();
        switch (currency) {
            case USD:
                return (summ <= 1000) ? 3 : 5;
            case EUR:
                return (summ <= 1000) ? 10 : 11;
        }
        throw new IllegalArgumentException("Illegal currency");
    }
}
