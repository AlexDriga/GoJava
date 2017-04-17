package exemple.unit_06.user;

/**
 * Created by Vitalii on 19.03.2017.
 */
public final class User {

    private final long id;
    private final String firstName;
    private final String lastName;
    private final int salary;
    private final int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int getBalance() {
        return balance;
    }

    public User setBalance(int balance) {
        return new User(id, firstName, lastName, salary, this.balance + balance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (salary != user.salary) return false;
        if (balance != user.balance) return false;
        if (!firstName.equals(user.firstName)) return false;
        return lastName.equals(user.lastName);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + salary;
        result = 31 * result + balance;
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("id: ").append(id).append(", ");
        builder.append("first name: ").append(firstName).append(", ");
        builder.append("last name: ").append(lastName).append(", ");
        builder.append("salary: ").append(salary).append(", ");
        builder.append("balance: ").append(balance).append("\n");

        return builder.toString();
    }
}
