package ch.hslu.ad.exercises.sw02.ex01;

import org.jspecify.annotations.Nullable;

import java.util.Objects;

public class Node<T> {

    protected T value = null;

    @Nullable
    protected Node<T> next;

    public Node(@Nullable Node<T> next) {
        this.next = next;
    }

    public @Nullable Node<T> getNext() {
        return next;
    }

    public void setNext(@Nullable Node<T> next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(value, node.value) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }
}
