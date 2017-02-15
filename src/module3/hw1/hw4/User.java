package module3.hw1.hw4;

/**
 * Создайте класс User со следующими полями:
 String name,
 int balance,
 int monthsOfEmployment,
 String companyName,
 int salary,
 String currency.

 Создайте get-, set-методы и конструктор с аргументами - всеми полями класса.
 Напишите методы:
 void paySalary() - добавляет заработную плату к балансу пользователя
 withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
 companyNameLenght - вычисляет длину имя компании
 monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth
 */

public class User {
    private String name;
    private int balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setBalance(int balance) { this.balance = balance; }
    public int getBalance() { return balance; }

    public void setMonthsOfEmployment(int monthsOfEmployment) { this.monthsOfEmployment = monthsOfEmployment; }
    public int getMonthsOfEmployment() { return monthsOfEmployment; }

    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getCompanyName() { return companyName; }

    public void setSalary(int salary) { this.salary = salary; }
    public int getSalary() { return salary; }

    public void setCurrency(String currency) { this.currency = currency; }
    public String getCurrency() { return currency; }

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public void paySalary() {
        System.out.println("===============================");
        System.out.println("Balance = " + balance);
        balance += salary;
        System.out.println("Balance + Salary = " + balance);
        System.out.println("===============================");
    }

    public int withdraw (int summ) {
        System.out.println("Balance before withdraw = " + balance);
        double commission = 0.1;
        if (summ <= 1000) { commission = 0.05; }
        balance -=(summ+(summ*commission));
        if (balance <= 0) {
            System.out.println("Error - withdraw less money");
        } else
        System.out.println("Balance after withdraw = " + balance);
        System.out.println("===============================");
        return balance;
    }

    public void companyNameLenght () {
        int lenght = companyName.length();
        if (companyName.length() <= 0)
            System.out.println("Please enter company name");
            else System.out.println("Company name lenght: " + lenght);
        System.out.println("===============================");
    }

    public int monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
        System.out.println("Final months of employment: " + monthsOfEmployment);
        System.out.println("===============================");
    return monthsOfEmployment;
    }

}
