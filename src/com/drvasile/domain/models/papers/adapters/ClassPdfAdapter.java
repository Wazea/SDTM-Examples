package com.drvasile.domain.models.papers.adapters;

import com.drvasile.domain.models.papers.PdfPaper;
import com.drvasile.domain.models.papers.abstractions.IPaper;
import com.drvasile.domain.utilities.PdfConverter;

public class ClassPdfAdapter extends PdfPaper implements IPaper {

    @Override
    public void editText() {
        PdfConverter.convertPdf();
        super.editPdfText();
    }

    @Override
    public String showText() {
        return super.showText();
    }
}
