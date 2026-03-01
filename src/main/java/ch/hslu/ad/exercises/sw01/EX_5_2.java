package ch.hslu.ad.exercises.sw01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Exercise 5.2 & 5.3 - Implementation of the Ackermann function.
 * The Ackermann function is a classic example of a recursive function that is not primitive recursive.
 */
public final class EX_5_2 {

    private static final Logger LOG = LoggerFactory.getLogger(EX_5_2.class);

    private long callCount = 0;
    private long currentStackDepth = 0;
    private long maxStackDepth = 0;

    /**
     * Main method to compute Ackermann values from Exercise 5.3b.
     * @param args Command line arguments (not used).
     */
    public static void main(final String[] args) {
        final EX_5_2 ackermann = new EX_5_2();

        // Exercise 5.3b values
        int[][] values = {
            {0, 4},
            {1, 2},
            {2, 2},
            {4, 2}
        };

        for (int[] pair : values) {
            int n = pair[0];
            int m = pair[1];
            ackermann.resetCounters();
            long result = ackermann.ack(n, m);
            LOG.info("ack({}, {}) = {} [Calls: {}, Max Stack: {}]", 
                n, m, result, ackermann.getCallCount(), ackermann.getMaxStackDepth());
        }
    }

    /**
     * Computes the Ackermann function ack(n, m) recursively.
     * Definition:
     * ack(0, m) = m + 1
     * ack(n, 0) = ack(n - 1, 1)            (for n > 0)
     * ack(n, m) = ack(n - 1, ack(n, m - 1)) (for n, m > 0)
     *
     * @param n First parameter.
     * @param m Second parameter.
     * @return The result of the Ackermann function.
     */
    public long ack(final long n, final long m) {
        callCount++;
        currentStackDepth++;
        if (currentStackDepth > maxStackDepth) {
            maxStackDepth = currentStackDepth;
        }

        long result;
        if (n == 0) {
            result = m + 1;
        } else if (m == 0) {
            result = ack(n - 1, 1);
        } else {
            result = ack(n - 1, ack(n, m - 1));
        }

        currentStackDepth--;
        return result;
    }

    /**
     * Resets the call and stack counters.
     */
    public void resetCounters() {
        this.callCount = 0;
        this.currentStackDepth = 0;
        this.maxStackDepth = 0;
    }

    /**
     * @return Total number of calls to ack.
     */
    public long getCallCount() {
        return callCount;
    }

    /**
     * @return Maximum recursion depth reached.
     */
    public long getMaxStackDepth() {
        return maxStackDepth;
    }
}
