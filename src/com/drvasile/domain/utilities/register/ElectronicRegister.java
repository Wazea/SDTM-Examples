package com.drvasile.domain.utilities.register;

import com.drvasile.domain.utilities.register.abstraction.Register;

public class ElectronicRegister extends Register {

    @Override
    public void makeAttendance() {
        System.out.println("Make attendance on the electronic register");
    }
}
