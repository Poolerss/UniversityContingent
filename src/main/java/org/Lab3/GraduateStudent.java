package org.Lab3;

public class GraduateStudent extends Person{
    private String dissertationTopic;

    public String getDissertationTopic() {
        return dissertationTopic;
    }

    public GraduateStudent(String name, String surname, Gender gender, String facultyName, String dissertationTopic) {
        super(name, surname, gender, facultyName);
        this.dissertationTopic = dissertationTopic;
    }
    @Override
    public void print() {
        super.print();
        System.out.print("studies at " + getFacultyName() + ".");
        switch (getGender()) {
            case MALE:
                System.out.print(" His ");
                break;
            case FEMALE:
                System.out.print("Her ");
                break;
        }
        System.out.println("thesis title is " + "\"" + getDissertationTopic() + "\" .");
    }
}


