package com.epam.rd.autotasks.validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EpamEmailValidation {
    public static boolean validateEpamEmail(String input) {
        if (input == null) {
            return false;
        }

        Pattern pattern = Pattern.compile("^[a-zA-Z]+_[a-zA-Z]+[0-9]*@epam.com$");
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
/*
* This method uses regular expressions to check if the
* input string matches the pattern of a regular EPAM email.
* The email must start with a first name and last name (in English),
* separated by an underscore (_), and end with @epam.com.
*  The first name and last name may be followed by an optional number.
* If the input string matches this pattern, the method returns true;
* otherwise, it returns false.
* */




