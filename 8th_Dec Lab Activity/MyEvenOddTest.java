
package com.even_odd_test;


import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

class FindEvenOdd{
    //method which returns true if the number given in the parameter is even
    //otherwise return false
    static boolean validateEvenOdd(int a) {
        if(a%2==0) { return true; }
        else { return false; }
    }
}

public class MyEvenOddTest {
    @Test
    public void validateTwelve() {
        //Test case 1 : The result should be true(as an even number is given )..and I have given the expected output as true.
        //If JUnit test passes then the code is written correctly
        assertEquals(true,FindEvenOdd.validateEvenOdd(12));
    }
    @Test
    public void validateTwentyOne() {
        //Test case 2 : The result should be false(as an odd number is given)..But I have given the expected output as true
        //If JUnit test fails then the code is written correctly
        assertEquals(true,FindEvenOdd.validateEvenOdd(21));
    }

}