package org.Lab3;

public class Student extends Person{
    LevelOfEducation levelOfEducation;
    CourseNumber courseNumber;

    public LevelOfEducation getLevelOfEducation() {
        return levelOfEducation;
    }

    public CourseNumber getCourseNumber() {
        return courseNumber;
    }

    public Student(String name, String surname, Gender gender, String facultyName, LevelOfEducation levelOfEducation,
                   CourseNumber courseNumber) {
        super(name, surname, gender, facultyName);
        this.levelOfEducation = levelOfEducation;
        this.courseNumber = courseNumber;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("studies at " + getFacultyName() + ". " + getGender().getGenderAppeal() + " is "
                + getCourseNumber()+ "\'th year " + getLevelOfEducation() + " student.");
    }
}


