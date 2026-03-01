package ch.hslu.ad.exercises.sw01;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit tests for Ackermann function implementation.
 */
public class EX_5_2_test {

    @Test
    public void testAckermannValues() {
        final EX_5_2 ackermann = new EX_5_2();

        // Standard known values
        assertThat(ackermann.ack(0, 0)).isEqualTo(1);
        assertThat(ackermann.ack(0, 1)).isEqualTo(2);
        assertThat(ackermann.ack(1, 0)).isEqualTo(2);
        assertThat(ackermann.ack(1, 1)).isEqualTo(3);
        assertThat(ackermann.ack(2, 2)).isEqualTo(7);
        assertThat(ackermann.ack(3, 1)).isEqualTo(13);
        assertThat(ackermann.ack(3, 2)).isEqualTo(29);
        assertThat(ackermann.ack(3, 3)).isEqualTo(61);
    }

    @Test
    public void testExerciseValues() {
        final EX_5_2 ackermann = new EX_5_2();

        // Exercise 5.3b values
        assertThat(ackermann.ack(0, 4)).isEqualTo(5);
        assertThat(ackermann.ack(1, 2)).isEqualTo(4);
        assertThat(ackermann.ack(2, 2)).isEqualTo(7);
    }
}
