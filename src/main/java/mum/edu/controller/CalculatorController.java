package mum.edu.controller;

import mum.edu.domain.Operation;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.validator.Validator;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@mum.edu.framework.annotation.Controller
public class CalculatorController {

    @AutoWired
    Validator operationValidator;

    @RequestMapping(value = {"/"})
    public String inputProduct() {
        return "index.jsp";
    }

    @RequestMapping(value = {"/calculate"})
    public String saveProduct(Operation operation, HttpServletRequest request) {
        //        ProductValidator productValidator = new ProductValidator();
        List<String> errors = operationValidator.validate(operation);
        if (errors.isEmpty()) {
            // no validation error, execute action method
            // insert code to save product to the database

            // store product in a scope variable for the view
            request.setAttribute("operation", operation);
            return "/WEB-INF/jsp/CalculateResult.jsp";
        } else {

            // store errors and product in a scope variable for the view
            request.setAttribute("errors", errors);
            request.setAttribute("form", operation);
            return "/WEB-INF/jsp/InputForm.jsp";
        }
    }
}
