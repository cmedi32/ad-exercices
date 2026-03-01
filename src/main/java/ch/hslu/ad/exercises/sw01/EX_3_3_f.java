package ch.hslu.ad.exercises.sw01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Exercise 3.3 f - Implementation of methods to demonstrate time complexity.
 */
public class EX_3_3_f {

    private static final Logger LOG = LoggerFactory.getLogger(EX_3_3_f.class);
    private static long counter = 0;

    /**
     * Helper method with O(1) complexity.
     */
    public static void doA() {
        counter++;
    }

    /**
     * Helper method with O(1) complexity.
     */
    public static void doB() {
        counter++;
    }

    /**
     * Helper method with O(n) complexity.
     * @param n input size.
     */
    public static void doC(final int n) {
        for (int i = 0; i < n; i++) {
            counter++;
        }
    }

    /**
     * Helper method with O(n^2) complexity.
     * @param n input size.
     */
    public static void doD(final int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                counter++;
            }
        }
    }

    /**
     * Exercise 1 - Complexity: O(n).
     * Logic: O(1) + O(1) + O(n).
     * @param n input size.
     */
    public static void exercise1(final int n) {
        doA();
        doB();
        doC(n);
    }

    /**
     * Exercise 2 - Complexity: O(n).
     * Logic: n * O(1) + (2 * n) * O(5 = n) [since doC(5) is O(1) due to n beeing small enough].
     * @param n input size.
     */
    public static void exercise2(final int n) {
        for (int i = 0; i < n; i++) {
            doA();
        }
        for (int j = 0; j < (2 * n); j++) {
            doC(5);
        }
    }

    /**
     * Exercise 3 - Complexity: O(n^3).
     * Logic: n * (O(1) + n * O(n)) = n + n^3.
     * @param n input size.
     */
    public static void exercise3(final int n) {
        for (int i = 0; i < n; i++) {
            doA();
            for (int j = 0; j < n; j++) {
                doC(n);
            }
        }
    }

    /**
     * Exercise 4 - Complexity: O(n^3).
     * Logic: n * (O(n^2) + (n+5) * O(1)) = n^3 + n^2 + 5n.
     * @param n input size.
     */
    public static void exercise4(final int n) {
        for (int i = 0; i < n; i++) {
            doD(n);
            for (int j = 0; j < (n + 5); j++) {
                doA();
            }
        }
    }

    public static void main(String[] args) {
        final int[] nValues = {10, 20, 50, 100};
        
        LOG.info("Complexity Analysis (Units of Work)");
        LOG.info("n	Ex1 (O(n))	Ex2 (O(n))	Ex3 (O(n^3))	Ex4 (O(n^3))");
        for (int n : nValues) {
            long c1, c2, c3, c4;
            
            counter = 0;
            exercise1(n);
            c1 = counter;
            
            counter = 0;
            exercise2(n);
            c2 = counter;
            
            counter = 0;
            exercise3(n);
            c3 = counter;
            
            counter = 0;
            exercise4(n);
            c4 = counter;
            
            LOG.info("{}	{}		{}		{}		{}", n, c1, c2, c3, c4);
        }
    }
}
