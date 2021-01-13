/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp0050;

import Doctor.Doctor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Main {

    public static void main(String[] args) {
        ArrayList<Float> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //loop until user want to exit
        while (true) {
            System.out.println("1. Calculate Superlative Equation");
            System.out.println("2. Calculate Quadratic Equation");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");           
            int choice =  Validate.checkInputIntLimit(0, 3);
            switch (choice) {
                case 1:
                    Calculate.outputSuperlative(list);
                    break;
                case 2:
                    Calculate.outputQuadratic(list);
                    break;
                case 3:
                    return;
            }
        }
    }
}
