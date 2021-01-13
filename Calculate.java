/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp0050;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Calculate {
       

    // chech chính phương
    public static boolean isSquare(float number) {
        int temp = (int) Math.sqrt(number);
        if (temp * temp == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void superlativeProcess(List<Float> list, float a, float b) {
        list.add(a);
        list.add(b);
        if (a == 0) {
            if (b == 0) {
                System.out.println("The program has infinite solution");
            } else {
                System.out.println("The program has no solution");
            }
        }else{
            float x = -b/a;
            list.add(x);
            System.out.println("The program has solution x = " + x);
        }
    }  
    public static void quadraticProcess(List<Float> list,float a,float b, float c){
        if(a==0){
            superlativeProcess(list, a, b);
        }else{
            list.add(a);
            list.add(b);
            list.add(c);
            float deta = b*b - 4*a*c;
            if(deta > 0){
                float x1 = (float) ((-b + Math.sqrt(deta))/a*2);
                float x2 = (float) ((-b - Math.sqrt(deta))/a*2);
                list.add(x1);
                list.add(x2);
                System.out.println("The program has two different solution x1 = " + x1 + 
                        "x2 = " + x2);
            }else if(deta == 0){
                float x = -b/(2*a);
                list.add(x);
                System.out.println("The program has to solution x1 = x2 = " + x);
            }else{
                System.out.println("The program no solution");
            }
        }
    }
    public static void output (List<Float> list){
        String outputOdd = "";
        String outputEven = "";
        String square = "";
        for(float x: list){
            if(x % 2 == 0){
                outputEven += x + ", ";
            }else {
                outputOdd += x + ", ";
            }if(isSquare(x)){
                square += x + ", ";
            }
        }
        if(outputOdd.length() > 0){
            System.out.println("Odd Number : "+ outputOdd.substring(0,outputOdd.length() - 2));
        }if(outputEven.length() > 0){
            System.out.println("Even Number: "+ outputEven.substring(0,outputEven.length() -2));
        }if(square.length() > 0){
            System.out.println("Square Number: "+ square.substring(0,square.length() - 2));
        }
    }
    public static void outputSuperlative(List<Float> list){
        list.clear();
        System.out.print("Enter A: ");
        float a = Validate.getFloat();
        System.out.print("Enter B: ");
        float b = Validate.getFloat();
        superlativeProcess(list, a, b);
        output(list);
    }
    public static void outputQuadratic(List<Float> list){
        list.clear();
        System.out.print("Enter A: ");
        float a = Validate.getFloat();
        System.out.print("Enter B: ");
        float b = Validate.getFloat();
        System.out.print("Enter C: ");
        float c = Validate.getFloat();
        quadraticProcess(list, a, b, c);
        output(list);
    }
}

