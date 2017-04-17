package exemple.unit_03.lesson_04;

/**
 * Created by Vitalii on 17.02.2017.
 * Create User class with the following fields: String name, int balance, int monthsOfEmployment,
 * String companyName, int salary, String currency.
 * Create getters and setters and constructor with all fileds.
 */
public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }


    public void monthIncreaser(int addMonth) {
        if (addMonth < 0) {
            throw new IllegalArgumentException("addMonth is negative");
        }
        monthsOfEmployment += addMonth;
    }

    public int companyNameLenght() {
        if (companyName == null) {
            throw new NullPointerException("company name is NULL");
        }

        return companyName.length();
    }

    public void withdraw(int summ) {
        if (summ < 0) {
            throw new IllegalArgumentException();
        }

        int commission = (summ < 1000) ? 5 : 10;
        double result = balance - 1d * summ * commission / 100;

        balance -= result;
    }

    public void paySalary() {
        balance += salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
