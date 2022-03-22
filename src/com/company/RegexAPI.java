package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAPI {

    public boolean validateMobileNumber(String mobileNumber) {
        Pattern regex = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher mobileMatcher = regex.matcher(mobileNumber);
        return mobileMatcher.matches();
    }

    public static void main(String[] args) {
        RegexAPI object = new RegexAPI();
        System.out.println(object.validateMobileNumber("111-222-3333"));
    }
}
