package ch.hslu.ad.exercises.sw01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EX_2_3 {

    private static final Logger LOG = LoggerFactory.getLogger(EX_2_3.class);

    private static long task1_calls = 0;
    private static long task2_calls = 0;
    private static long task3_calls = 0;

    public static void task(final int n) {
        task1(); task1(); task1(); task1();
        for (int i = 0; i < n; i++) {
            task2(); task2(); task2();
            for (int j = 0; j < n; j++) {
                task3(); task3();
            }
        }
    }

    public static void task1() {
        task1_calls++;
    }

    public static void task2() {
        task2_calls++;
    }

    public static void task3() {
        task3_calls++;
    }

    public static long getTotalCalls() {
        return task1_calls + task2_calls + task3_calls;
    }

    public static void resetCounters() {
        task1_calls = 0;
        task2_calls = 0;
        task3_calls = 0;
    }

    public static void main(String[] args) {
        System.out.println("n | Total Calls");
        System.out.println("--|------------");
        for (int i = 0; i <= 10000; i+=1000) {
            resetCounters();
            task(i);
            System.out.printf("%d | %d%n", i, getTotalCalls());
        }
    }
}
