package module3.hw3;

import java.util.Date;

/**
 Класс Course с полями:
 Date startDate,
 String name,
 int hoursDuration,
 String teacherName.
 Создайте 2 конструктора с аргументами
 startDate, name;
 hourseDuration, name, teacherName.
 */

public class Course {
    private Date starDate;
    private String name;
    private int hoursDuration;
    private String teacherName;


    public Course(Date starDate, String name) {
        this.starDate = starDate;
        this.name = name;
    }

    public Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public void setStarDate(Date starDate) { this.starDate = starDate; }
    public Date getStarDate() { return starDate; }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setHoursDuration(int hoursDuration) { this.hoursDuration = hoursDuration; }
    public int getHoursDuration() { return hoursDuration; }

    public void setTeacherName(String teacherName) { this.teacherName = teacherName; }
    public String getTeacherName() { return teacherName; }
}
