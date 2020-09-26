package com.drvasile.design_patterns.structural.adapter;

import com.drvasile.domain.models.courses.papers.PdfPaper;
import com.drvasile.domain.models.courses.papers.interfaces.IPaper;

public class ObjectPdfAdapter implements IPaper {

    private PdfPaper pdfPaper;

    public ObjectPdfAdapter() {
        pdfPaper = new PdfPaper();
    }

    @Override
    public void editText() {
        PdfConverter.convertPdf();
        pdfPaper.editPdfText();
    }

    @Override
    public String showText() {
        return null;
    }
}
