package com.drvasile.design_patterns.structural.composite;

import com.drvasile.domain.models.actors.Dean;
import com.drvasile.domain.models.actors.Professor;
import com.drvasile.domain.models.actors.Rector;
import com.drvasile.domain.models.structures.Department;
import com.drvasile.domain.models.structures.Faculty;
import com.drvasile.domain.models.structures.University;

public class CompositeMain {

    public static void main(String[] args) {

        University university = new University(); // Root object;
        university.setLevel(0);
        university.setRector(new Rector());
        university.setFaculties(new Faculty[]{ new Faculty(), new Faculty() });

        for (Faculty faculty : university.getFaculties()) {
            faculty.setDean(new Dean());
            faculty.setDepartments(new Department[]{ new Department(), new Department(), new Department()});

            int professorCount = 1;
            for (Department department : faculty.getDepartments()) {
                Professor[] currentProfessorList = new Professor[professorCount];

                for (int i = 0; i < professorCount; i++) {
                    currentProfessorList[i] = new Professor();
                }

                department.setProfessors(currentProfessorList);
                professorCount++;
            }
        }

        university.traverseObject();
    }
}
