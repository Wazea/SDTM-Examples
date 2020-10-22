package com.drvasile.domain.models.actors;

public class Student {

    private String name;
    private String surname;
    private Integer age;
    private Double highSchoolGrade;

    public Student(String name, String surname, Integer age, Double highSchoolGrade) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.highSchoolGrade = highSchoolGrade;
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getHighSchoolGrade() {
        return highSchoolGrade;
    }

    public void setHighSchoolGrade(Double highSchoolGrade) {
        this.highSchoolGrade = highSchoolGrade;
    }
}
