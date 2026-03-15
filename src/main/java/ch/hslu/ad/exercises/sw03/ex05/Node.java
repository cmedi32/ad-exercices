package ch.hslu.ad.exercises.sw03.ex05;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

/**
 * Represents a node in a binary search tree.
 */
public class Node implements Comparable<Node> {

    @Getter
    private final int value;

    @Getter
    @Setter
    private Node left;

    @Getter
    @Setter
    private Node right;

    @Getter
    @Setter
    private Node parent;

    public Node(final int value) {
        this.value = value;
    }

    @Override
    public int compareTo(final Node other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Node other)) {
            return false;
        }
        return this.value == other.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value);
    }
}