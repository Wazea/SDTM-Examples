# SOLID Principles

## History

The **SOLID Principles** were conceptualized by Robert C. Martin in his 2000 paper, Design Principles and Design Patterns.
Later, Michael Feathers introduced the acronym.

## Motivation

These principles have the purpose to encourage the creation of software that is:
* maintainable;
* understandable;
* flexible/extensible; 

## Single Responsibility

A class should only have one responsibility. 
Furthermore, it should only have one reason to change.

## Open/Closed

Classes should be open for extension, but closed for modification. 

## Liskov Substitution

If class A is a subtype of class B, then we should be able to replace B with A without disrupting the behavior of our program.

## Interface Segregation

Larger interfaces should be split into smaller ones. 
By doing so, we can ensure that implementing classes only need to be concerned about the methods that are of interest to them.

## Dependency Inversion

The principle of Dependency Inversion refers to the decoupling of software modules.
This way, instead of high-level modules depending on low-level modules, both will depend on abstractions.