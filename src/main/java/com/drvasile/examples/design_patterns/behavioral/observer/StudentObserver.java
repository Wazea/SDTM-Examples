package com.drvasile.examples.design_patterns.behavioral.observer;

import com.drvasile.examples.design_patterns.behavioral.observer.abstractions.IObserver;

public class StudentObserver implements IObserver {

    private Integer id;
    private Double grade;

    public StudentObserver(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public void update() {
        if (this.grade >= 5.00) {
            System.out.println("Your work has been graded with: ");
            System.out.println(this.grade);
        } else {
            System.out.println("Failed!");
        }
    }
}
