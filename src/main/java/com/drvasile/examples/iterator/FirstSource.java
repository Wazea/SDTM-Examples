package com.drvasile.examples.iterator;

import com.drvasile.domain.models.actors.Student;
import com.drvasile.examples.iterator.abstractions.IIterator;
import com.drvasile.examples.iterator.abstractions.ISource;

import java.util.Arrays;
import java.util.Iterator;

public class FirstSource implements ISource, IIterator {

    private Student[] students;

    FirstSource() {
        this.students = new Student[3];
        this.students[0] = new Student("A", "B", 20, 9.0);
        this.students[1] = new Student("C", "D", 21, 7.0);
        this.students[2] = new Student("E", "F", 22, 10.0);
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public Iterator createIterator() {
        return Arrays.asList(this.students).iterator();
    }
}
