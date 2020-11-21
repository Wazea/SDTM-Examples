package com.drvasile.examples.design_patterns.behavioral.iterator;

import com.drvasile.domain.models.actors.Student;
import com.drvasile.examples.design_patterns.behavioral.iterator.abstractions.IIterator;
import com.drvasile.examples.design_patterns.behavioral.iterator.abstractions.ISource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SecondSource implements ISource, IIterator {

    private List<Student> students = new ArrayList<>();

    SecondSource() {
        this.students.add(new Student("G", "H", 24, 6.5));
        this.students.add(new Student("I", "J", 25, 7.3));
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> studentList) {
        this.students = studentList;
    }

    @Override
    public Iterator createIterator() {
        return students.iterator();
    }
}
