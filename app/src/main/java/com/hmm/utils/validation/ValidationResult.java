package com.hmm.utils.validation;

import java.util.ArrayList;

/**
 * Created by code1 on 31/01/16.
 */
public class ValidationResult {
    private ValidationResultType type;
    private ArrayList<String> validationErrors;

    public ValidationResult() {
        this.validationErrors = new ArrayList<String>();
    }

    public ValidationResult(ValidationResultType type) {
        this.validationErrors = new ArrayList<String>();
        this.setType(type);
    }

    public ValidationResultType getType() {
        return type;
    }

    public void setType(ValidationResultType type) {
        this.type = type;
    }

    public ArrayList<String> getValidationErrors() {
        return validationErrors;
    }
}
