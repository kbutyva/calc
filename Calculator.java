/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test;

import java.util.Scanner;

/**
 *
 * @author kbuty
 */
public class Calculator {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        Validator v = new Validator();
        Resulting r = new Resulting();
        String s = sc.nextLine();
        
        if (v.validate(s)) {
            
            
            
           r.resulting(s);
            
            
        } else {
            System.out.println("format matematicheskoy operacii ne udovletvoryaet zadaniyu - "
                    + "dva operanda i odin operator (+, -, /, *)");
        }
        
    }
    
}
