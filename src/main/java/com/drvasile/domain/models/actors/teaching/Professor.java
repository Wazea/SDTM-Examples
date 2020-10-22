package com.drvasile.domain.models.actors.teaching;

import com.drvasile.domain.models.actors.Student;
import com.drvasile.domain.models.actors.abstractions.ITeacher;
import com.drvasile.domain.models.actors.abstractions.IUniversityEmployee;
import com.drvasile.domain.models.structures.abstractions.ISimpleEntity;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;

public class Professor extends UniversityEntity implements IUniversityEmployee, ITeacher, ISimpleEntity {

    private int age;
    private boolean isPhd;
    private String name;
    private Student[] students;

    @Override
    public void traverseObject() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Professor";
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
