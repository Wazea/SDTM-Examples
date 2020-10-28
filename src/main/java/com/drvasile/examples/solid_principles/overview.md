# SOLID Principles

## History

The **SOLID Principles** were conceptualized by Robert C. Martin in his 2000 paper, Design Principles and Design Patterns.
Later, Michael Feathers introduced the acronym.

## Motivation

In software design, the SOLID and other popular principles, have the goal of anticipating the rotting design.
The symptoms of a rotting design are the following: 
* __Rigidity__: 
    The software becomes difficult to change, and every change can require multiple changes on dependent software entities;
* __Fragility__:
    The software has the tendency to break in many places when a change is required;
* __Immobility__:
    The inability of reusing some software entities, usually due to tightly coupled software entities or implementations that are too specific;
* __Viscosity__: 
    This symptom comes into 2 forms. Viscosity of the design and of the environment.
    Viscosity of the design appears when the design preserving measures are harder to implement than some simple hacks that offer the required functionality;
    It becomes easier to do the wrong thing that the right one.
    The other form of this symptom comes when the dev environment becomes slow and inefficient. 

These principles have the purpose to encourage the creation of software that is:
* maintainable;
* understandable;
* flexible/extensible;

Usually, in literature, these principles are illustrated by examples with classes/interfaces or methods, but some of these principles are in fact more general
and can be applied also for other software entities like packages/directories, modules etc. 

## Single Responsibility

A class should only have one responsibility. 
Furthermore, it should only have one reason to change.

This principle deals primarily with __*cohesion*__. 
When software entities have bigger cohesion (i.e. are more coherent) they are easier to be reused and understood.

In the file __*ExampleSRP*__ are presented 2 classes that show a scenario in which SRP is obeyed and another one in which it is not.

## Open/Closed

Classes should be open for extension, but closed for modification.

An extension scenario might be adding a subclass for example. 
Now, if our existing functional is based on concretions rather than abstractions it will be necessary to perform modifications so that the system will support the newly added subclass. 
Thus, abstraction is the key to the OCP. By using abstraction, the functional of the system will get the necessary types of objects via Polymorphism.

There are two techniques by which Polymorphism can be achieved. 
* __*Dynamic Polymorphism*__: By using a common abstraction (i.e. an interface or abstract class) and subclasses;
* __*Static Polymorphism*__: By using generics/templates;

## Liskov Substitution

If class A is a subtype of class B, then we should be able to replace B with A without disrupting the behavior of our program.

## Interface Segregation

Larger interfaces should be split into smaller ones. 
By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

## Dependency Inversion

The principle of Dependency Inversion refers to the decoupling of software modules.
This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.