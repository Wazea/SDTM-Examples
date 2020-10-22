package com.drvasile.domain.data_structures;

import com.drvasile.domain.models.actors.teaching.Professor;
import com.drvasile.domain.models.actors.Student;

import java.util.HashMap;
import java.util.Map;

public class ProfessorRegistry {

    private static final Map<String, Professor> professorMap = new HashMap<>();

    public static Professor getProfessorInstance(String type) {
        if (professorMap.containsKey(type)) {
            System.out.println("Return professor of type : " + type);
            Professor copyProfessor = new Professor();
            copyProfessor.setStudents(professorMap.get(type).getStudents());
            return copyProfessor;
        } else {
            Professor newProfessor = new Professor();
            // Fetch the list of student
            newProfessor.setStudents(new Student[] {});
            professorMap.put(type, newProfessor);
            System.out.println("New Professor created of type : " + type);
            return newProfessor;
        }
    }
}
