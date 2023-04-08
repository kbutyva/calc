/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.test;

/**
 *
 * @author kbuty
 */
public class Resulting {
    
    public void resulting(String s){
        String[] split = s.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);
//        int result = 0;
//        float res = 0;
        switch (split[1]) {
            case "+": System.out.println(a+b);
                
            break;
            case "-": System.out.println(a-b);
            break;
            case "*": System.out.println(a*b);
            break;
            case "/": System.out.println((float) a/b);
            break;
               
        }
        
    }
}
