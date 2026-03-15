package ch.hslu.ad.exercises.sw03.ex05;

import lombok.Getter;
import org.jspecify.annotations.Nullable;

/**
 * Binary search tree implementation.
 */
public class Tree implements TreeAware {
    @Getter
    private final Node root;

    @Getter
    private int size;
    @Getter
    private int height;

    public Tree(final char value) {
        this.root = new Node(value);
        this.size = 1;
        this.height = 1;
    }

    /**
     * Recalculates and stores the tree height.
     */
    private void updateHeight() {
        this.height = calcHeight(root);
    }

    private int calcHeight(final Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(calcHeight(node.getLeft()), calcHeight(node.getRight()));
    }

    /**
     * @param value the value to insert
     * @throws IllegalArgumentException if the element is already present
     */
    @Override
    public void insert(final char value) {
        Node current = root;
        Node insert = new Node(value);
        Node parent = null;

        while (current != null) {
            System.out.println(current);
            parent = current;
            int cmp = insert.compareTo(current);
            if (cmp < 0) {
                current = current.getLeft(); // 50%
            } else if (cmp > 0) {
                current = current.getRight(); // 50%
            } else {
                throw new IllegalArgumentException("Node already exists");
            }
        }

        insert.setParent(current);
        if (insert.compareTo(parent) < 0) {
            parent.setLeft(insert);
        } else {
            parent.setRight(insert);
        }

        size++;
        updateHeight();
    }

    /**
     * @param value the value to search for
     * @return null if value is not present
     * Best-Case O(log(n))
     */
    @Override
    public Node search(final char value) {
        Node temp = new Node(value);
        Node current = root;

        while (current != null) { // base case
            System.out.println(current);
            int cmp = temp.compareTo(current);
            if (cmp < 0) {
                current = current.getLeft(); // 50%
            } else if (cmp > 0) {
                current = current.getRight(); // 50%
            } else {
                return current; // 1% - will never happen if not present
            }
        }

        return null;
    }


    @Override
    public void traverseInOrder(@Nullable Node root) {
        if (root == null) {
            root = this.getRoot();
        }
        if (root.getLeft() != null) {
            traverseInOrder(root.getLeft());
        }
        System.out.println(root);
        if (root.getRight() != null) {
            traverseInOrder(root.getRight());
        }
    }

    @Override
    public void delete(final char value) {
        // TODO: implement BST deletion - OPTIONAL
    }

    @Override
    public void traversePreOrder(@Nullable Node root) {
        // TODO: implement pre-order traversal - OPTIONAL
    }

    @Override
    public void traversePostOrder(@Nullable Node root) {
        // TODO: implement post-order traversal - OPTIONAL
    }
}