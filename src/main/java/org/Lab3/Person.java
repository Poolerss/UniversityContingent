package org.Lab3;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String name;
    private String surname;
    private Gender gender;
    private String facultyName;

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Person(String name, String surname, Gender gender, String facultyName) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.facultyName = facultyName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void print() {
        System.out.print("Tnis is " + name + ". " + getGender().getGenderAppeal() + " ");
                    }
    public static void printAll(ArrayList<Person> personList) {
        personList.forEach(Person::print);
    }
}








