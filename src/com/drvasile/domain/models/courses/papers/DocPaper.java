package com.drvasile.domain.models.courses.papers;

import com.drvasile.domain.models.courses.papers.interfaces.IPaper;

public class DocPaper implements IPaper {
    @Override
    public void editText() {
        System.out.println("Edit the doc");
    }

    @Override
    public String showText() {
        return null;
    }
}
