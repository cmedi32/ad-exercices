package ch.hslu.ad.exercises.sw03.ex05;

import lombok.Getter;
import lombok.Setter;
import org.jspecify.annotations.Nullable;

import java.util.Objects;

/**
 * Represents a node in a binary search tree.
 */
public class Node implements Comparable<Node> {

    @Getter
    private final char value;

    @Getter
    @Setter
    @Nullable
    private Node left;

    @Getter
    @Setter
    @Nullable
    private Node right;

    @Getter
    @Setter
    private Node parent;

    public Node(final char value) {
        this.value = value;
    }

    @Override
    public int compareTo(final Node other) {
        return Character.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return String.format("Node %c visited", value);
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