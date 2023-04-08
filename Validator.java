/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author kbuty
 */
public class Validator {
    
    private final Pattern pattern;
    private Matcher matcher;
    private final String regex = "([1-9]|10) (\\+|-|/|\\*) ([1-9]|10)";
    
    
    public Validator() {
        pattern = Pattern.compile(regex, Pattern.UNICODE_CHARACTER_CLASS);
    }
    
    public boolean validate(final String message) {
        matcher = pattern.matcher(message);
        if (matcher.matches()) {
            return true;
        } else {return false;}
    }
}
