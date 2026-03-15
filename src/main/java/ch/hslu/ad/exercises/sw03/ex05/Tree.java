package ch.hslu.ad.exercises.sw03.ex05;

import lombok.Getter;

/**
 * Binary search tree implementation.
 */
public class Tree implements TreeAware {

    private Node root;

    @Getter
    private int size;
    @Getter
    private int height;

    public Tree(final int value) {
        this.root = new Node(value);
        this.size = 1;
        this.height = 1;
    }

    @Override
    public void insert(final int value) {
        // TODO: implement BST insertion
    }

    @Override
    public Node search(final int value) {
        // TODO: implement BST search
        return null;
    }

    @Override
    public void delete(final int value) {
        // TODO: implement BST deletion
    }

    @Override
    public void traverseInOrder() {
        // TODO: implement in-order traversal
    }

    @Override
    public void traversePreOrder() {
        // TODO: implement pre-order traversal
    }

    @Override
    public void traversePostOrder() {
        // TODO: implement post-order traversal
    }
}