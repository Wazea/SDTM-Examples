package com.drvasile.design_patterns.structural.adapter;

import com.drvasile.domain.models.courses.papers.PdfPaper;
import com.drvasile.domain.models.courses.papers.interfaces.IPaper;

public class ClassPdfAdapter extends PdfPaper implements IPaper {

    @Override
    public void editText() {
        PdfConvertor.convertPdf();
        super.editPdfText();
    }

    @Override
    public String showText() {
        return super.showText();
    }
}
