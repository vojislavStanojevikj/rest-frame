package com.evildevsmk.validation;

import org.springframework.validation.annotation.Validated;

import java.io.Serializable;

@Validated
public interface JakartaValidation extends Serializable {
    // This interface is used to mark classes that should be validated using Jakarta Bean Validation
    // It can be used as a marker interface for classes that require validation
    // For example, you can annotate a class with @Validated and implement this interface
    // to indicate that the class should be validated using Jakarta Bean Validation
}