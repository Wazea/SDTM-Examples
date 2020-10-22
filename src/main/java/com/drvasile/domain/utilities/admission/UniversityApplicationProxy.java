package com.drvasile.domain.utilities.admission;

import com.drvasile.domain.utilities.admission.abstractions.IAdmission;

// Online application
public class UniversityApplicationProxy implements IAdmission {

    private boolean isRegistered;
    private UniversityApplication universityApplication;

    public UniversityApplicationProxy() {
        this.isRegistered = false;
        this.universityApplication = new UniversityApplication();
    }

    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;
    }

    private void applyOnline() {
        System.out.println("Successfully registered!");
        // If the applicant has finished high school and he/she provides all the required documents
        this.isRegistered = true;
    }

    @Override
    public void applyToUniversity() {
        applyOnline();
        if (this.isRegistered) {
            this.universityApplication.applyToUniversity();
        }
    }
}
