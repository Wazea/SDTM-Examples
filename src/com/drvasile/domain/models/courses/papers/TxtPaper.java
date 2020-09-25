package com.drvasile.domain.models.courses.papers;

import com.drvasile.domain.models.courses.papers.interfaces.IPaper;

public class TxtPaper implements IPaper {
    @Override
    public void editText() {
        System.out.println("Edit text from txt file");
    }

    @Override
    public String showText() {
        return null;
    }
}
