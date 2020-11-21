package com.drvasile.domain.utilities.university_structure;

import com.drvasile.domain.models.actors.teaching.Professor;
import com.drvasile.domain.models.structures.Department;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;
import com.drvasile.domain.utilities.university_structure.abstractions.IExpression;

public class TerminalExp implements IExpression {

    private String name;
    private Department department;

    TerminalExp(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public UniversityEntity interpret() {

        for (Professor professor : department.getProfessors()) {
            if (professor.getName().equals(name)) {
                return professor;
            }
        }

        return null;
    }
}
