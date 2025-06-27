package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;
public class ExampleCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the a, b, and c values from your quadratic:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double solution = quadraticFormula(a, b, c);

        System.out.println("The solution is: " + solution + "!");
    }
    private static double quadraticFormula(double a, double b, double c) {
        return (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
    }
}

