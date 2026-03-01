package ch.hslu.ad.exercises.sw01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Exercise 4.3 - Implementation of Fibonacci algorithms to demonstrate time complexity.
 */
public final class EX_4_3 {

    private static final Logger LOG = LoggerFactory.getLogger(EX_4_3.class);
    private long[] memo;

    public static void main(final String[] args) {
        final int n = 40; // Fibonacci index to compute
        final EX_4_3 exercise = new EX_4_3();
        exercise.runDemo(n);
    }

    /**
     * Runs a performance demonstration for all three Fibonacci implementations.
     */
    public void runDemo(final int n) {
        LOG.info("Starting Fibonacci demonstration for n = {}", n);

        long start = System.currentTimeMillis();
        long result = fiboRec1(n);
        long end = System.currentTimeMillis();
        LOG.info("fiboRec1 (Classic Recursive): result = {}, time = {} ms", result, (end - start));

        this.memo = new long[n + 1];
        start = System.currentTimeMillis();
        result = fiboRec2(n);
        end = System.currentTimeMillis();
        LOG.info("fiboRec2 (Memoized Recursive): result = {}, time = {} ms", result, (end - start));

        start = System.currentTimeMillis();
        result = fiboIter(n);
        end = System.currentTimeMillis();
        LOG.info("fiboIter (Iterative):         result = {}, time = {} ms", result, (end - start));
    }

    /**
     * Computes Fibonacci number using classic recursion.
     */
    public long fiboRec1(final int n) {
        if (n <= 1) {
            return n;
        }
        return fiboRec1(n - 1) + fiboRec1(n - 2);
    }

    /**
     * Computes Fibonacci number using recursion with memoization.
     */
    public long fiboRec2(final int n) {
        if (n <= 1) {
            return n;
        }
        if (this.memo == null || this.memo.length <= n) {
            this.memo = new long[n + 1];
        }
        if (this.memo[n] != 0) {
            return this.memo[n];
        }
        this.memo[n] = fiboRec2(n - 1) + fiboRec2(n - 2);
        return this.memo[n];
    }

    /**
     * Computes Fibonacci number using an iterative approach.
     */
    public long fiboIter(final int n) {
        if (n < 2) {
            return n;
        }
        long fpp = 0;
        long fp = 1;
        long f = 1;
        for (int i = 3; i <= n; i++) {
            fpp = fp;
            fp = f;
            f = fp + fpp;
        }
        return f;
    }
}
