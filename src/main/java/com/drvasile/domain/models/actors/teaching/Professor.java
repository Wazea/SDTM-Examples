package com.drvasile.domain.models.actors.teaching;

import com.drvasile.domain.models.actors.Student;
import com.drvasile.domain.models.actors.abstractions.ITeachingStaff;
import com.drvasile.domain.models.actors.abstractions.IUniversityEmployee;
import com.drvasile.domain.models.structures.abstractions.ISimpleEntity;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;

import java.util.Arrays;

public class Professor extends UniversityEntity implements IUniversityEmployee, ITeachingStaff, ISimpleEntity {

    private int age;
    private boolean isPhd;
    private String name;
    private Student[] students;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPhd() {
        return isPhd;
    }

    public void setPhd(boolean phd) {
        isPhd = phd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void traverseObject() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Professor: " +
                " age = " + age +
                ", isPhd = " + isPhd +
                ", name = " + name +
                ", students=" + Arrays.toString(students);
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
