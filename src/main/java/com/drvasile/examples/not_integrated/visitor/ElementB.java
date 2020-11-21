package com.drvasile.examples.not_integrated.visitor;

import com.drvasile.examples.not_integrated.visitor.abstractions.IElement;
import com.drvasile.examples.not_integrated.visitor.abstractions.IVisitor;

// University Assistant
public class ElementB implements IElement {

    private int seminarNum;
    private int labNum;
    private IVisitor visitor;

    public ElementB(int seminarNum, int labNum) {
        this.seminarNum = seminarNum;
        this.labNum = labNum;
    }

    @Override
    public void accept(IVisitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public void operation() {
        this.visitor.performOperation(this);
    }

    public int getLabNum() {
        return labNum;
    }

    public void setLabNum(int labNum) {
        this.labNum = labNum;
    }

    public int getSeminarNum() {
        return seminarNum;
    }

    public void setSeminarNum(int seminarNum) {
        this.seminarNum = seminarNum;
    }
}
