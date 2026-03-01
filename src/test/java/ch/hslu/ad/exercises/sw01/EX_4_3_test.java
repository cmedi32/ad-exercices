package ch.hslu.ad.exercises.sw01;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for EX_4_3 Fibonacci implementations.
 */
public class EX_4_3_test {

    /**
     * Test data: index and expected Fibonacci value.
     */
    private static final int[][] FIBO_DATA = {
        {0, 0}, {1, 1}, {2, 1}, {3, 2}, {4, 3}, {5, 5}, {6, 8}, {10, 55}
    };

    @Test
    public void testFiboRec1() {
        final EX_4_3 exercise = new EX_4_3();
        for (int[] pair : FIBO_DATA) {
            assertThat(exercise.fiboRec1(pair[0])).isEqualTo(pair[1]);
        }
    }

    @Test
    public void testFiboRec2() {
        final EX_4_3 exercise = new EX_4_3();
        for (int[] pair : FIBO_DATA) {
            assertThat(exercise.fiboRec2(pair[0])).isEqualTo(pair[1]);
        }
    }

    @Test
    public void testFiboIter() {
        final EX_4_3 exercise = new EX_4_3();
        for (int[] pair : FIBO_DATA) {
            assertThat(exercise.fiboIter(pair[0])).isEqualTo(pair[1]);
        }
    }
}
