package com.drvasile.examples.design_patterns.structural.adapter;

import com.drvasile.domain.models.papers.TxtPaper;
import com.drvasile.domain.models.papers.adapters.ClassPdfAdapter;
import com.drvasile.domain.models.papers.adapters.ObjectPdfAdapter;

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
