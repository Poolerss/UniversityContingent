package org.Lab3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Professor professor1 = new Professor("Ronald", "Turner", Gender.MALE,
                "Computer science", AkademicDegree.MSc, "Programming paradigm");
        Professor professor2 = new Professor("Ruth", "Hollings", Gender.FEMALE,
                "Jurisprudence", AkademicDegree.PhD, "Domestic arbitration");
        Student student1 = new Student("Leo", "Wilkinson", Gender.MALE,"Computer science",
                LevelOfEducation.BACHELOR, CourseNumber.III);
        Student student2 = new Student("Anna", "Cunningam", Gender.FEMALE, "World economy",
                LevelOfEducation.BACHELOR, CourseNumber.I );
        Student student3 = new Student("Jill", "Lundqvist", Gender.FEMALE, "Jurisprudence",
                LevelOfEducation.MASTER, CourseNumber.I);
        GraduateStudent student4 = new GraduateStudent("Ronald","Correa", Gender.MALE,
                "Computer science", "Design of a functional programming language");

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(professor1);
        personList.add(professor2);
        personList.add(student1);
        personList.add(student2);
        personList.add(student3);
        personList.add(student4);

        //personList.forEach(Person::print);

        Person.printAll(personList);


        }
    }
