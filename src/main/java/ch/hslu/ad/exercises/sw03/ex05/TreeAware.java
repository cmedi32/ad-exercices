package ch.hslu.ad.exercises.sw03.ex05;

import org.jspecify.annotations.Nullable;

/**
 * Interface for binary search tree operations.
 */
public interface TreeAware {

    /**
     * Inserts a new value into the tree.
     *
     * @param value the value to insert
     */
    void insert(char value);

    /**
     * Searches for a node with the given value.
     *
     * @param value the value to search for
     * @return the node if found, null otherwise
     */
    Node search(char value);

    /**
     * Deletes the node with the given value from the tree.
     *
     * @param value the value to delete
     */
    void delete(char value);

    /**
     * Traverses the tree in-order (left, root, right).
     */
    void traverseInOrder(@Nullable Node root);

    /**
     * Traverses the tree pre-order (root, left, right).
     */
    void traversePreOrder(@Nullable Node root);

    /**
     * Traverses the tree post-order (left, right, root).
     */
    void traversePostOrder(@Nullable Node root);

    /**
     * Returns the number of nodes in the tree.
     *
     * @return the size of the tree
     */
    int getSize();

    /**
     * Returns the height of the tree.
     *
     * @return the height of the tree
     */
    int getHeight();
}