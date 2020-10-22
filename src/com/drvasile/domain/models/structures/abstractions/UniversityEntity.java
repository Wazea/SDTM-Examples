package com.drvasile.domain.models.structures.abstractions;

public abstract class UniversityEntity {

    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void printWhiteSpaces(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
        }
    }

    public abstract String toString();
    public abstract void traverseObject();
}
