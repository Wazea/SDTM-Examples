package com.drvasile.domain.models.papers;

import com.drvasile.domain.models.papers.abstractions.IPaper;

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
