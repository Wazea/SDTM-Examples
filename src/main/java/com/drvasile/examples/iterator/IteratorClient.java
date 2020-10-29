package com.drvasile.examples.iterator;

import java.util.Iterator;

public class IteratorClient {

    public static void printStudents(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public static void main(String[] args) {
        printStudents(new FirstSource().createIterator());
        printStudents(new SecondSource().createIterator());
        printStudents(new ThirdSource().createIterator());
    }
}
