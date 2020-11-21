package com.drvasile.examples.solid_principles;

import com.drvasile.domain.utilities.register.abstraction.Register;

public class ExampleISP { }

/*
 * Big interface that doesn't obey the Interface Segregation Principle.
 */
interface IBeforeISP {
    Register getRegister();
    void makeAttendance();
    void gradeStudents();
    void getUniversityStructure();
}

/*
 * This class provides functionality for attendance.
 * Thus, it doesn't need to implement the other methods.
 */
class BeforeISP implements IBeforeISP {

    @Override
    public Register getRegister() {
        return null;
    }

    @Override
    public void makeAttendance() {

    }

    @Override
    public void gradeStudents() {

    }

    @Override
    public void getUniversityStructure() {

    }
}

/*
 * Decomposition of the initial big interface.
 */
interface IAttendance {
    Register getRegister();
    void makeAttendance();
}

interface IGrading {
    void gradeStudents();
}

interface IUniversityStructure {
    void getUniversityStructure();
}

/*
 * Concrete implementation with only the required methods.
 */
class Attendance implements IAttendance {

    @Override
    public Register getRegister() {
        return null;
    }

    @Override
    public void makeAttendance() {

    }
}

