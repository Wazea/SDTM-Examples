package com.drvasile.domain.models.papers.adapters;

import com.drvasile.domain.models.papers.PdfPaper;
import com.drvasile.domain.models.papers.abstractions.IPaper;
import com.drvasile.domain.utilities.PdfConverter;

public class ObjectPdfAdapter implements IPaper {

    private final PdfPaper pdfPaper;

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
