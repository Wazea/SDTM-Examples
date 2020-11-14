package com.drvasile.examples.not_integrated.interpreter;

import com.drvasile.data.Universities;

public class InterpreterClient {

    private static String query = "University:TUM;";

    public static void main(String[] args) {
        // Initialize the list
        Universities.readUniversities();

        NonTerminalExp nonTerminalExp = new NonTerminalExp(query);
        nonTerminalExp.interpret().traverseObject();
    }
}
