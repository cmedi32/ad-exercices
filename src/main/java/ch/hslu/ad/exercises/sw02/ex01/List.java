package ch.hslu.ad.exercises.sw02.ex01;

import org.jspecify.annotations.NonNull;

import java.util.ArrayList;
import java.util.Objects;

public class List<T> {

    protected Node<T> head;

    public List(@NonNull T value) {
        Node<T> node = new Node<>(null);
        node.setValue(value);
        this.head = node;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    /**
     * 1.3 b) iterative approach to sizing
     */
    public int size() {
        Node<T> node = head;
        int size = 0;
        while (node != null) {
            node = node.getNext();
            size++;
        }

        return size;
    }

    /**
     * 1.3 b) insert single at the beginning of the list
     * Note that the list will end up in reverse order relative to the input
     */
    public void insert(T value) {
        Node<T> append = this.getHead();
        Node<T> newNode = new Node<>(append);
        newNode.setValue(value);
        this.setHead(newNode);
    }

    /**
     * 1.3 c) insert multiple
     */
    public void insertMultiple(ArrayList<T> newNodes) {
        for (T value : newNodes) {
            insert(value);
        }
    }

    /**
     * 1.3 d) returns the first node matching the value, or null if not found
     */
    public Node<T> get(Integer value) {
        Node<T> node = head;
        while (node != null) {
            if (node.getValue().equals(value)) {
                return node;
            }
            node = node.getNext();
        }
        return null;
    }

    /**
     * 1.3 d) contains
     */
    public boolean contains(Integer value) {
        return get(value) != null;
    }

    /**
     * 1.3 e) removes the first element of the stack
     */
    public T pop() {
        Node<T> head = this.getHead();
        Node<T> next = this.getHead().getNext();
        this.setHead(next);
        return head.getValue();
    }

    /**
     * 1.3 f) finds removes and returns the element
     * Test cases
     * - Elem is first (head)
     * - Elem is last
     * - Elem is in between 2 Elements
     * - Elem is not in list at all (returns null)
     */
    public T remove(Integer value) {
        Node<T> prev = null;
        Node<T> node = head;
        while (node != null) {
            if (node.getValue().equals(value)) {
                if (prev == null) {
                    head = node.getNext(); // removing head
                } else {
                    prev.setNext(node.getNext());
                }
                return node.getValue();
            }
            prev = node;
            node = node.getNext();
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        List<?> list = (List<?>) o;
        return Objects.equals(head, list.head);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(head);
    }
}
