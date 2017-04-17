package module4;

/**
 * Задание 1
 * Абстрактный класс Bank должен содержать поля:
 * long id
 * String bankCountry
 * Currency currency
 * int numberOfEmployees
 * double avrSalaryOfEmployee
 * long rating
 * long totalCapital
 *
 * Создайте get-,set-методы и конструктор с аргументами - всеми полями.
 *
 * Методы:
 * abstract int getLimitOfWithdrawal()
 * abstract int getLimitOfFunding()
 * abstract int getMonthlyRate()
 * abstract int getCommission(int summ)
 * double moneyPaidMonthlyForSalary()
*/

    public abstract class Bank {

    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployee;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public Bank(long id, String bankCountry, Currency currency, int numberOfEmployee, double avrSalaryOfEmployee, long rating, long totalCapital) {
        this.id = id;
        this.bankCountry = bankCountry;
        this.currency = currency;
        this.numberOfEmployee = numberOfEmployee;
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
        this.rating = rating;
        this.totalCapital = totalCapital;
    }


    abstract int getLimitOfWithdrawal();
    abstract int getLimitOfFunding();
    abstract int getMonthlyRate();
    abstract int getCommission(int summ);

    double moneyPaidMonthlyForSalary(){
        return getNumberOfEmployee() * getAvrSalaryOfEmployee(); }


    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getBankCountry() { return bankCountry; }
    public void setBankCountry(String bankCountry) { this.bankCountry = bankCountry; }

    public Currency getCurrency() { return currency; }
    public void setCurrency(Currency currency) { this.currency = currency; }

    public int getNumberOfEmployee() { return numberOfEmployee; }
    public void setNumberOfEmployee(int numberOfEmployee) { this.numberOfEmployee = numberOfEmployee; }

    public double getAvrSalaryOfEmployee() { return avrSalaryOfEmployee; }
    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) { this.avrSalaryOfEmployee = avrSalaryOfEmployee; }

    public long getRating() { return rating; }
    public void setRating(long rating) { this.rating = rating; }

    public long getTotalCapital() { return totalCapital; }
    public void setTotalCapital(long totalCapital) { this.totalCapital = totalCapital; }






}
