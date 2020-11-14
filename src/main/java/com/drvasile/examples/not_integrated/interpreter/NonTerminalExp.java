package com.drvasile.examples.not_integrated.interpreter;

import com.drvasile.data.Universities;
import com.drvasile.domain.models.structures.Department;
import com.drvasile.domain.models.structures.Faculty;
import com.drvasile.domain.models.structures.University;
import com.drvasile.domain.models.structures.abstractions.UniversityEntity;
import com.drvasile.examples.not_integrated.interpreter.abstractions.IExpression;

public class NonTerminalExp implements IExpression {

    private String expression;
    private University searchedUni;
    private Faculty searchedFaculty;
    private Department searchedDepartment;

    NonTerminalExp(String expression) {
        this.expression = expression;
    }

    University searchUniversity(String name) {
        for (University university : Universities.universityList) {
            if (name.equals(university.getName())) {
                return university;
            }
        }

        return null;
    }

    Faculty searchFaculty(String name) {
        for (Faculty faculty : this.searchedUni.getFaculties()) {
            if (name.equals(faculty.getName())) {
                return faculty;
            }
        }

        return null;
    }

    Department searchDepartment(String name) {
        for (Department department : this.searchedFaculty.getDepartments()) {
            if (name.equals(department.getName())) {
                return department;
            }
        }

        return null;
    }

    @Override
    public UniversityEntity interpret() {

        while (!expression.isBlank()) {
            // University:TUM;
            // University:TUM;Faculty:FCIM;
            // Faculty:FCIM;
            //
            String currentType = expression.substring(0, expression.indexOf(':')).toLowerCase();
            String currentName = expression.substring(expression.indexOf(':') + 1, expression.indexOf(';'));
            expression = expression.substring(expression.indexOf(';') + 1);

            switch (currentType) {
                case "university":
                    University currentUni = searchUniversity(currentName);
                    if (expression.isBlank()) {
                        return currentUni;
                    } else {
                        this.searchedUni = currentUni;
                        break;
                    }
                case "faculty":
                    Faculty currentFaculty = searchFaculty(currentName);
                    if (expression.isBlank()) {
                        return currentFaculty;
                    } else {
                        this.searchedFaculty = currentFaculty;
                        break;
                    }
                case "department":
                    Department currentDepartment = searchDepartment(currentName);
                    if (expression.isBlank()) {
                        return currentDepartment;
                    } else {
                        this.searchedDepartment = currentDepartment;
                        break;
                    }
                case "professor":
                    return (new TerminalExp(currentName, searchedDepartment)).interpret();
                default:
                    return null;
            }
        }

        return null;
    }
}
