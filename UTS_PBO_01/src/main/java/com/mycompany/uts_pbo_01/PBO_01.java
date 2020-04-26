/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uts_pbo_01;

/**
 *
 * @author Njumbull
 */
import java.util.Scanner;

public class PBO_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        Quadratic_Equations equation = new Quadratic_Equations(a, b, c);
        double discriminant = equation.getDiscriminant();
        if (discriminant > 0) {
            System.out.println("The equation has two roots " + equation.getRoot1()
                    + " and " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("The equation has one root " + equation.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
