package module3.hw3;

import java.util.Date;

/**
 Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
 Создайте 5 объектов класса Course. Создайте объекты других классов, используя все конструкторы.
 У вас должно быть 13 объектов в классе Solution.
 */
public class Solution {
    Course course1 = new Course (new Date (), "Android" );
    Course course2 = new Course (new Date (), "JavaEE" );
    Course course3 = new Course (new Date (), "JavaScript" );
    Course course4 = new Course("Go", 120, "Mr.Steel");
    Course course5 = new Course ("GoIt", 999, "Mr.Vicich");

    Student student1 = new Student("Alex", "Qwe", 9);
    Student student2 = new Student("Jhon", new Course[]{course1});

    CollegeStudent collegeStudent1 = new CollegeStudent("Garry", "Archer", 9);
    CollegeStudent collegeStudent2 = new CollegeStudent("Garrison", new Course[] {course2});
    CollegeStudent collegeStudent3 = new CollegeStudent("Bob", "Bobson", 1, "Harvard", 99, 1000100);

    SpecialStudent specialStudent1 = new SpecialStudent("Iggi", "Pop", 2);
    SpecialStudent specialStudent2 = new SpecialStudent("Armstrong", new Course[] {course3});
    SpecialStudent specialStudent3 = new SpecialStudent("Duke", "Ellington", 3, 123123);

}
