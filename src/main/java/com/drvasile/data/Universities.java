package com.drvasile.data;

import com.drvasile.domain.models.actors.Student;
import com.drvasile.domain.models.actors.administration.Dean;
import com.drvasile.domain.models.actors.administration.Rector;
import com.drvasile.domain.models.actors.teaching.Professor;
import com.drvasile.domain.models.structures.Department;
import com.drvasile.domain.models.structures.Faculty;
import com.drvasile.domain.models.structures.University;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Universities {

    public static final String PATH = ".\\src\\main\\java\\com\\drvasile\\data\\";
    public static final List<University> universityList = new ArrayList<>();

    private static Professor[] parseProfessors(JSONArray professors) {
        List<Professor> professorList = new ArrayList<>();

        for (JSONObject professor : (Iterable<JSONObject>) professors) {
            Professor newProfessor = new Professor();
            Long newAge = (Long) professor.get("age");
            newProfessor.setAge(newAge.intValue());
            newProfessor.setPhd((boolean) professor.get("isPhd"));
            newProfessor.setName((String) professor.get("name"));
            newProfessor.setStudents(new Student[]{});

            professorList.add(newProfessor);
        }

        Professor[] professors1 = new Professor[professorList.size()];
        for (int i = 0; i < professorList.size(); i++) {
            professors1[i] = professorList.get(i);
        }

        return professors1;
    }

    private static Department[] parseDepartments(JSONArray departments) {
        List<Department> departmentList = new ArrayList<>();

        for (JSONObject department : (Iterable<JSONObject>) departments) {
            Department newDepartment = new Department();
            newDepartment.setName((String) department.get("name"));
            newDepartment.setProfessors(parseProfessors((JSONArray) department.get("professors")));

            departmentList.add(newDepartment);
        }

        Department[] departments1 = new Department[departmentList.size()];
        for (int i = 0; i < departmentList.size(); i++) {
            departments1[i] = departmentList.get(i);
        }

        return departments1;
    }

    public static Faculty[] parseFaculties(JSONArray faculties) {

        List<Faculty> facultyList = new ArrayList<>();

        for (JSONObject faculty : (Iterable<JSONObject>) faculties) {
            Faculty newFaculty = new Faculty();
            newFaculty.setName((String) faculty.get("name"));
            newFaculty.setDean(new Dean((String) ((JSONObject) faculty.get("dean")).get("name")));
            newFaculty.setDepartments(parseDepartments((JSONArray) faculty.get("departments")));

            facultyList.add(newFaculty);
        }

        Faculty[] faculties1 = new Faculty[facultyList.size()];
        for (int i = 0; i < facultyList.size(); i++) {
            faculties1[i] = facultyList.get(i);
        }

        return faculties1;
    }

    public static void readUniversities() {
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader(PATH + "university.json")) {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            JSONArray universities = (JSONArray) jsonObject.get("universities");

            for (JSONObject university : (Iterable<JSONObject>) universities) {
                University newUni = new University();
                newUni.setName((String) university.get("name"));
                newUni.setRector(new Rector((String) ((JSONObject) university.get("rector")).get("name")));
                newUni.setFaculties(parseFaculties((JSONArray) university.get("faculties")));

                universityList.add(newUni);
            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public static void write() {
        try (Writer writer = new FileWriter(PATH + "example.json")) {
            // writer.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
