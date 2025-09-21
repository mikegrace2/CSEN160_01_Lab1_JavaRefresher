package scu.edu.csen160.lab1.test.exercise4;

import java.util.Scanner;

public class ScannerDemo{
	public static void main(String[] args) {
		// Declarations
		Scanner in = new Scanner(System.in);
		int anInteger;
		float aFloat;
		double aDoubleNumber;

		// Prompts
		System.out.println("Enter an integer");
		anInteger = in.nextInt();
		
		System.out.println("Enter a float");
		aFloat =  in.nextFloat();

		System.out.println("Enter a double");
		aDoubleNumber = in.nextDouble();
		// Output the user input

		System.out.println("Here is what you entered: ");
		System.out.println(anInteger);
		System.out.println(aFloat);
		System.out.println(aDoubleNumber);
		
		in.close();
	}

    public void setAnInteger(int i) {
    }

    public void setaFloat(float v) {
    }

    public void setaDoubleNumber(double v) {
    }

    public int getAnInteger() {
        return -1;
    }

    public float getaFloat() {
        return -1F;
    }

    public double getaDoubleNumber() {
        return -0.0;
    }
}