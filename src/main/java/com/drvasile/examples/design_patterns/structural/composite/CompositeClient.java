package com.drvasile.examples.design_patterns.structural.composite;

import com.drvasile.domain.models.actors.administration.Dean;
import com.drvasile.domain.models.actors.teaching.Professor;
import com.drvasile.domain.models.actors.administration.Rector;
import com.drvasile.domain.models.structures.Department;
import com.drvasile.domain.models.structures.Faculty;
import com.drvasile.domain.models.structures.University;

public class CompositeClient {

    public static void main(String[] args) {

        University university = new University(); // Root object;
        university.setLevel(0);
        university.setRector(new Rector("Name"));
        university.setFaculties(new Faculty[]{ new Faculty(), new Faculty() });

        for (Faculty faculty : university.getFaculties()) {
            faculty.setDean(new Dean("Name"));
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
