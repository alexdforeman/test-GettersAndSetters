package com.alexdforeman.gastest;

import org.junit.Before;
import org.junit.Test;

/**
 * Test Case.
 * @author https://github.com/alexdforeman
 */
public class ATest {

    private A aclass;
    private B bclass;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() {
        aclass = new A(Integer.MIN_VALUE, Integer.MAX_VALUE);
        bclass = new B(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Test
    public void test() {

        // Timespec public accessor.
        long AStartNanoTime = System.nanoTime();
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            aclass._x = i;
            aclass._y = aclass._x;
        }
        long AEndNanoTime = System.nanoTime();
        
        // Timespec Getter.
        long BStartNanoTime = System.nanoTime();
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            bclass.setX(i);
            bclass.setY( bclass.getX() );
        }
        long BEndNanoTime = System.nanoTime();

        System.out.println("Public Variables took:    " + (AEndNanoTime - AStartNanoTime));
        System.out.println("Getters and Setters took: " + (BEndNanoTime - BStartNanoTime));
        
    }
}
