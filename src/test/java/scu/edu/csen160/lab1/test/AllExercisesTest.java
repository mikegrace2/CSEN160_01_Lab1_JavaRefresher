package scu.edu.csen160.lab1.test;

import org.junit.jupiter.api.Test;
import scu.edu.csen160.lab1.test.exercise1.Puppy;
import scu.edu.csen160.lab1.test.exercise2.Cube;
import scu.edu.csen160.lab1.test.exercise3.PatternMaker;
import scu.edu.csen160.lab1.test.exercise4.ScannerDemo;
import scu.edu.csen160.lab1.test.exercise5.Exercise5;
import scu.edu.csen160.lab1.test.exercise6.Exercise6;
import scu.edu.csen160.lab1.test.exercise7.Exercise7;

import static org.junit.jupiter.api.Assertions.*;

public class AllExercisesTest {
    public static int testResults=0;

    @Test
    void testExercise1() {
        AllExercisesTest.testResults=0;

        Puppy myPuppy = new Puppy("Fido",2);
        assertEquals("Fido",myPuppy.getName());
        assertEquals(2,myPuppy.getAge());
        assertEquals(730,myPuppy.getAgeDays());

        AllExercisesTest.testResults=1;
    }

    @Test
    void testExercise2() {
        Cube myCube=new Cube(100.0);
        assertEquals(1000000.0, myCube.getVolume());

        AllExercisesTest.testResults+=10;
    }

    @Test
    void testExercise3() {
        String expectedString =
                "    ****\n" +
                        "        ********\n" +
                        "            ************\n";
        String retString=PatternMaker.drawPattern();
        assertNotNull(retString);
        assertEquals(expectedString, retString);

        AllExercisesTest.testResults+=100;
    }

    @Test
    void testExercise4() {
        ScannerDemo sc = new ScannerDemo();
        sc.setAnInteger(100);
        sc.setaFloat(10.5F);
        sc.setaDoubleNumber(65.54345734);

        assertNotNull(sc);
        assertEquals(100, sc.getAnInteger());
        assertEquals(10.5F, sc.getaFloat());
        assertEquals(65.54345734, sc.getaDoubleNumber());

        AllExercisesTest.testResults+=1000;
    }

    @Test
    void testExercise5() {
        assertTrue(Exercise5.isItALeapYear(1716));
        assertFalse(Exercise5.isItALeapYear(1989));
        assertTrue(Exercise5.isItALeapYear(1992));
        assertTrue(Exercise5.isItALeapYear(2000));
        assertFalse(Exercise5.isItALeapYear(2010));
        assertTrue(Exercise5.isItALeapYear(2012));

        AllExercisesTest.testResults+=10000;
    }

    @Test
    void testExercise6() {
        assertTrue(Exercise6.palindrome("A man, a plan, a canal, Panama"));
        assertFalse(Exercise6.palindrome("desserts"));
        assertTrue(Exercise6.palindrome("radar"));
        assertTrue(Exercise6.palindrome("Madam"));
        assertFalse(Exercise6.palindrome("Tamagotchi"));

        AllExercisesTest.testResults+=100000;
    }

    @Test
    void testExercise7() {
        // Generate x numbers in the range of 0-9
        int x=100;
        int range=10;
        int[] retArr= Exercise7.genRandNum(range, x);

        for (int i=0;i<x;i++) {
            if (retArr[i]>=0 && retArr[i] < range )
                assertTrue(true);
            else
                assertTrue(false);
        }

        AllExercisesTest.testResults+=1000000;
        System.out.println("All tests passed! Total score: "+AllExercisesTest.testResults);
    }
}