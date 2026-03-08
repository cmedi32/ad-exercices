package ch.hslu.ad.exercises.sw02.ex01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NodeTest {

    /** TC-1: No successor when constructed with null. */
    @Test
    void testConstructorNullNext() {
        Node<Integer> node = new Node<>(null);
        assertThat(node.getNext()).isNull();
    }

    /** TC-2: Successor is set correctly via constructor. */
    @Test
    void testConstructorWithNext() {
        Node<Integer> successor = new Node<>(null);
        Node<Integer> node = new Node<>(successor);
        assertThat(node.getNext()).isSameAs(successor);
    }

    /** TC-3: Value is null by default. */
    @Test
    void testValueNullByDefault() {
        Node<String> node = new Node<>(null);
        assertThat(node.getValue()).isNull();
    }

    /** TC-4: setValue / getValue roundtrip. */
    @Test
    void testSetAndGetValue() {
        Node<Integer> node = new Node<>(null);
        node.setValue(42);
        assertThat(node.getValue()).isEqualTo(42);
    }

    /** TC-5: Works with String generic type. */
    @Test
    void testGenericStringValue() {
        Node<String> node = new Node<>(null);
        node.setValue("hello");
        assertThat(node.getValue()).isEqualTo("hello");
    }

    /** TC-6: setNext updates the successor. */
    @Test
    void testSetNextUpdatesSuccessor() {
        Node<Integer> node = new Node<>(null);
        Node<Integer> successor = new Node<>(null);
        node.setNext(successor);
        assertThat(node.getNext()).isSameAs(successor);
    }

    /** TC-7: setNext(null) clears the successor. */
    @Test
    void testSetNextNullClears() {
        Node<Integer> successor = new Node<>(null);
        Node<Integer> node = new Node<>(successor);
        node.setNext(null);
        assertThat(node.getNext()).isNull();
    }
}
