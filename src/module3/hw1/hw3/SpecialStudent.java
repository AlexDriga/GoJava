package module3.hw1.hw3;

/**
 Class SpecialStudent унаследован от CollegeStudent.
 Дополнительные поля long secretKey, String email.
 Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.
 */

public class SpecialStudent extends CollegeStudent {
    private long secretKey;
    private String email;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken) {
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, long secretKey) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }
    public long getSecretKey() { return secretKey; }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() { return email; }
}
