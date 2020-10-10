# Creational Design Patterns

#### Author : Drumea Vasile

----

## Objectives :

* Get familiar with the Creational DPs;
* Choose a specific domain;
* Implement at least 3 CDPs for the specific domain;

## Representatives : 

* Singleton
* Prototype
* Builder
* Factory Method
* Abstract Factory
* Object Pooling 

## Implementation : 

The way Singleton is implemented ...

        if (instance == null) {
            // Thread safe
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

## Conclusions : 

* Conclusion1