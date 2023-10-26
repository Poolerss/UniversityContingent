package org.Lab3;

public class Professor extends Person {
    AkademicDegree akademicDegree;
    String nameOfSpeciality;

    public Professor(String name, String surname, Gender gender, String facultyName, AkademicDegree akademicDegree,
                     String nameOfSpeciality) {
        super(name, surname, gender, facultyName);
        this.akademicDegree = akademicDegree;
        this.nameOfSpeciality = nameOfSpeciality;
    }

    public AkademicDegree getAkademicDegree() {
        return akademicDegree;
    }

    public String getNameOfSpeciality() {
        return nameOfSpeciality;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("teachers at " + getFacultyName() + ". " + getGender().getGenderAppeal() +
                " has " + getAkademicDegree() + " degree in " + getNameOfSpeciality() + ".");
    }
}


