package com.exercises;
import java.text.DecimalFormat;
import java.util.Scanner;
// Description:
// Write a program in which the user enters the type and dimensions of a geometric figure and calculates its area. There are four types of figures: square, rectangle, circle and triangle. The first line of input reads the type of figure (text with the following options: square, rectangle, circle or triangle).
// • If the figure is a square: the next line reads a single fractional number - the length of its side
// • If the figure is a rectangle: the next two lines read two fractional numbers - the lengths of its sides
// • If the figure is a circle: the next line reads a single fractional number - the radius of the circle
// • If the figure is a triangle: the next two lines read two fractional numbers - the length of its side and the length of the height to it
// The result should be rounded to 3 digits after the decimal point.
//  Solution: 
public class Problem024 {
    public static void main(String[] args) {
        try( Scanner input = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("#.000");

            System.out.print("Figure: ");
            String figure = input.nextLine();
            if (figure.equals("square")) {
                double side = input.nextDouble();
                System.out.println(df.format(side * side));
            }
            else if (figure.equals("rectangle")) {
                double width = input.nextDouble();
                double height = input.nextDouble();
                System.out.println(df.format(width * height));
            }
            else if (figure.equals("circle")) {
                double radius = input.nextDouble();
                System.out.println(df.format(radius * radius * Math.PI));
            } 
            else if (figure.equals("triangle")) {
                double side = input.nextDouble();
                double height = input.nextDouble();
                System.out.println(df.format(height * side / 2));
            }
            else 
                System.out.println("Invalid input!");
        }
    }
}
