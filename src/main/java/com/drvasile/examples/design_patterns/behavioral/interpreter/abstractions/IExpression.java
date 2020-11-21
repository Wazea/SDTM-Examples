package com.drvasile.examples.design_patterns.behavioral.interpreter.abstractions;

import com.drvasile.domain.models.structures.abstractions.UniversityEntity;

public interface IExpression {

    UniversityEntity interpret();
}
