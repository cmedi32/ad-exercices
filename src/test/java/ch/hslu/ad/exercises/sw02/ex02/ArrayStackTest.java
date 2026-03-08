package ch.hslu.ad.exercises.sw02.ex02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {

    @Test
    void testNewStackIsEmpty() {
        Stack stack = new ArrayStack(5);
        assertTrue(stack.isEmpty());
    }

    @Test
    void testStackWithOneElementIsNotEmpty() {
        Stack stack = new ArrayStack(5);
        stack.push("A");
        assertFalse(stack.isEmpty());
    }

    @Test
    void testStackWithCapacityOneIsFull() {
        Stack stack = new ArrayStack(1);
        stack.push("A");
        assertTrue(stack.isFull());
    }

    @Test
    void testElementCanBePushedAndRetreived() {
        Stack stack = new ArrayStack(5);
        stack.push("A");
        stack.push("B");
        stack.push("C");
        String result = stack.pop();
        assertEquals("C", result);
    }

    @Test
    void testPopOnEmptyStackThrows() {
        Stack stack = new ArrayStack(5);
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    void testPushOnFullStackThrows() {
        Stack stack = new ArrayStack(1);
        stack.push("A");
        assertThrows(IllegalStateException.class, () -> stack.push("B"));
    }
}
