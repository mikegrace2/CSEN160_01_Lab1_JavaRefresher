package scu.edu.csen160.lab1.test.exercise7;

public class Exercise7 {
    public static void genRandNum(int num1, int num2){
        // The Math.random() method returns random double numbers
        // in the range >=0.0 to <1.0 .

        // To scale the number to a range of 0-10 for example, we need
        // to multiply it with 10 and cast it to an int to truncate the
        // fractional part.

        int rand = (int) (10.0 * Math.random());

        // Modify the program such that the method takes 2 parameters, namely,
        // the range and a count of how many numbers to generate in the method.
        // The method generates and prints the count of numbers.
    }
}
