package org.Lab3;

public enum Gender {
    MALE ("His"),
    FEMALE("Her");

    private String genderAppeal;

    public String getGenderAppeal() {
        return genderAppeal;
    }

    Gender(String genderAppeal) {
        this.genderAppeal=genderAppeal;
    }
}
