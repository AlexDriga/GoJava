package exemple.unit_03.lesson_03;

import java.util.Date;

/**
 * Created by Vitalii on 17.02.2017.
 * <p>
 * You need to create following structure of the classes.
 * Class Course with fields:
 * Date startDate, String name, int hoursDuration, String teacherName.
 * Create two constructors with fields startDate, name; and hourseDuration, name, teacherName.
 * Class Student with fields: String firstName, String lastName, int group, Course[] coursesTaken, int age.
 * With 2 constructors firstName, lastName, group; and lastName, coursesTaken.
 * CollegeStudent that is a child of Student. With additional fields: String collegeName, int rating, long id.
 * Create three constructors: two the same as in Student and one with all the fields of the class.
 * Class SpecialStudent that is child of CollegeStudent. With additional fields long secretKey, String email.
 * Create three constructors: two the same as in CollegeStudend and one with secretKey field.
 * <p>
 * Create getters and setters for all fields and make fields private as OOP principle follows.
 * Create 5 objects Course class.
 * Create objects of others classes using every constructor.
 * You must have 13 objects in Solution class.
 */
public class Solution {
    public static void main(String[] args) {
        Course course1 = new Course(new Date(), "course1");
        Course course2 = new Course(100, "course2", "teacher2");
        Course course3 = new Course(new Date(), "course3");
        Course course4 = new Course(100, "course4", "teacher4");
        Course course5 = new Course(new Date(), "course5");

        Course[] courses = new Course[]{course1, course2, course3, course4, course5};

        Student student1 = new Student("firstName", "lastName", 1);
        Student student2 = new Student("lastName", courses);

        Student student3 = new SpecialStudent("firstName", "lastName", 2);
        Student student4 = new SpecialStudent("collegeName", 1, 123_000_000_000L);
        Student student5 = new SpecialStudent(123_456_789_012L);

        Student student6 = new CollegeStudent("firstName", "lastName", 3);
        Student student7 = new CollegeStudent("lastName", courses);
        Student student8 = new CollegeStudent("collegeName", 2, 987_654_321_012L);
    }
}
