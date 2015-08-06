package com.tbetous.springlab.web.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.tbetous.springlab.data.User;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object user, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pseudo", "errors.pseudo");
        if(errors.hasErrors()) {
            errors.reject("errors.register");
        }
    }

}
