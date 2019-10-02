package mum.edu.validator;

import mum.edu.domain.Operation;

import java.util.ArrayList;
import java.util.List;

public class ValidatorImpl implements Validator {

    public List<String> validate(Object object) {
        List<String> errors = new ArrayList<String>();

        Operation operation = (Operation) object;

        if (operation.getSum1() == null || operation.getSum2() == null) {
            errors.add("Summation operation must have two numbers!");
        }

        if (operation.getMult1() == null || operation.getMult2() == null) {
            errors.add("Multiply operation must have two numbers!");
        }
        return errors;
    }
}
