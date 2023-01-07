package ex1.ex1_7;

import java.util.Scanner;

public class TestMyComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double real1, imag1, real2, imag2;
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        real1 = sc.nextDouble();
        imag1 = sc.nextDouble();
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        real2 = sc.nextDouble();
        imag2 = sc.nextDouble();
        MyComplex m1 = new MyComplex(real1, imag1);
        MyComplex m2 = new MyComplex(real2, imag2);
        System.out.println("Number 1 is: " + m1.toString());
        if (!(m1.isReal())) System.out.println(m1.toString() + " is NOT a pure real number");
        if (!(m1.isImaginary())) System.out.println(m1.toString() + " is NOT a pure imaginary number");
        System.out.println();
        System.out.println("Number 2 is: " + m2.toString());
        if (!(m2.isReal())) System.out.println(m2.toString() + " is NOT a pure real number");
        if (!(m2.isImaginary())) System.out.println(m2.toString() + " is NOT a pure imaginary number");
        if (!(m1.equals(m2))) System.out.println(m1.toString() + " is NOT equal to " + m2.toString());
        System.out.println(m1.toString() + " + " + m2.toString() + " = " + m1.addNew(m2));
        System.out.println(m1.toString() + " - " + m2.toString() + " = " + m1.subtractNew(m2));
        System.out.println(m1.toString() + " * " + m2.toString() + " = " + m1.multiply(m2));
        System.out.println(m1.toString() + " / " + m2.toString() + " = " + m1.divide(m2));

    }
}
