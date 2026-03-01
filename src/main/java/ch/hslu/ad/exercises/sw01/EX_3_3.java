package ch.hslu.ad.exercises.sw01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EX_3_3 {

    private static final Logger LOG = LoggerFactory.getLogger(EX_3_3.class);

    /**
     * Calculates the factorial of n.
     * @param n the number to calculate the factorial for.
     * @return the factorial of n.
     */
    public static java.math.BigInteger factorial(int n) {
        java.math.BigInteger result = java.math.BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(java.math.BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        final int[] nValues = {1, 2, 5, 10, 20, 50, 100};

        LOG.info("{}\t{}\t{}\t{}\t{}\t{}\t{}\t{}\t{}", 
            "log n", "ld n", "n", "n*log n", "n^2", "n^3", "2^n", "3^n", "n!");

        for (int n : nValues) {
            double logN = Math.log10(n);
            double ldN = Math.log(n) / Math.log(2);
            double nLogN = n * logN;
            long n2 = (long) n * n;
            long n3 = (long) n * n * n;
            java.math.BigInteger twoN = java.math.BigInteger.valueOf(2).pow(n);
            java.math.BigInteger threeN = java.math.BigInteger.valueOf(3).pow(n);
            java.math.BigInteger nFact = factorial(n);

            LOG.info("{}\t{}\t{}\t{}\t{}\t{}\t{}\t{}\t{}",
                String.format("%.2f", logN),
                String.format("%.2f", ldN),
                n,
                String.format("%.2f", nLogN),
                n2,
                n3,
                twoN,
                threeN,
                nFact);
        }
    }
}
