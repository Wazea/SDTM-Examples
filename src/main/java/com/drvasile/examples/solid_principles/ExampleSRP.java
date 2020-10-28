package com.drvasile.examples.solid_principles;

public class ExampleSRP {}

/*
 * The class BeforeSRP gives an example of SRP not being obeyed.
 * In this case, the class has the responsibility of data representation and also of data persistence.
 */
class BeforeSRP {

    private Integer id;
    private String data;

    // Constructors, Getters, Setters

    public void saveToDb() {
        // Open Database connection
        // Execute query
        // Print status
    }
}

/*
 * In order to obey the SRP we need to split the responsibilities into separate classes as shown below.
 * The object can be sent as an argument to the function responsible for data persistence from the other class.
 */
class AfterSRP {

    private Integer id;
    private String data;

    // Constructors, Getters, Setters
}

class DbManager {

    public void saveToDb(AfterSRP object) {
        // Open Database connection
        // Execute query
        // Print status
    }
}