package com.drvasile.examples.design_patterns.behavioral.iterator;

import com.drvasile.domain.models.actors.Student;
import com.drvasile.examples.design_patterns.behavioral.iterator.abstractions.IIterator;
import com.drvasile.examples.design_patterns.behavioral.iterator.abstractions.ISource;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ThirdSource implements ISource, IIterator {

    private Map<Integer, Student> students = new HashMap<>();

    ThirdSource() {
        this.students.put(0, new Student("K", "L", 30, 9.7));
        this.students.put(1, new Student("M", "N", 29, 9.1));
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<Integer, Student> studentMap) {
        this.students = studentMap;
    }

    @Override
    public Iterator createIterator() {
        return students.values().iterator();
    }
}
