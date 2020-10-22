package com.drvasile.domain.models.papers;

import com.drvasile.domain.models.papers.abstractions.IPaper;

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
