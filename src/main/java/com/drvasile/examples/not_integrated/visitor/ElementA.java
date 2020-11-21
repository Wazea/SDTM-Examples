package com.drvasile.examples.not_integrated.visitor;

import com.drvasile.examples.not_integrated.visitor.abstractions.IElement;
import com.drvasile.examples.not_integrated.visitor.abstractions.IVisitor;

// Professor
public class ElementA implements IElement {

    private int courseNum;
    private int seminarNum;
    private int labNum;
    private IVisitor visitor;

    public ElementA(int courseNum, int seminarNum, int labNum) {
        this.courseNum = courseNum;
        this.seminarNum = seminarNum;
        this.labNum = labNum;
    }

    @Override
    public void accept(IVisitor visitor) {
        this.visitor = visitor;
    }

    @Override
    public void operation() {
        visitor.performOperation(this);
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

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }
}
