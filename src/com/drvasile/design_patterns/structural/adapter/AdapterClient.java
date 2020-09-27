package com.drvasile.design_patterns.structural.adapter;

import com.drvasile.domain.models.courses.papers.TxtPaper;

public class AdapterClient {

    public static void main(String[] args) {
        TxtPaper txtPaper = new TxtPaper();
        ClassPdfAdapter classPdfAdapter = new ClassPdfAdapter();

        txtPaper.editText();
        classPdfAdapter.editText();

        ObjectPdfAdapter objectPdfAdapter = new ObjectPdfAdapter();
        txtPaper.editText();
        objectPdfAdapter.editText();
    }
}
