package ch.hslu.ad.exercises.sw03.ex05;

/**
 * Manually constructs the binary tree from img.png.
 */
public final class TreeProgram {

    public static void main(final String[] args) {
        // Create Tree Root
        final Tree j = new Tree('J');
        // Create Nodes
        final Node a = new Node('A');
        final Node k = new Node('K');
        final Node b = new Node('B');
        final Node l = new Node('L');
        final Node e = new Node('E');
        final Node q = new Node('Q');
        final Node c = new Node('C');
        final Node f = new Node('F');
        final Node p = new Node('P');

        // Level 1: J is root (instantiated as Tree Element)
        j.getRoot().setLeft(a);
        j.getRoot().setRight(k);
        a.setParent(j.getRoot());
        k.setParent(j.getRoot());

        // Level 2:
        a.setRight(b);
        b.setParent(a);

        k.setRight(l);
        l.setParent(k);

        // Level 3:
        b.setRight(e);
        e.setParent(b);

        l.setRight(q);
        q.setParent(l);

        // Level 4:
        e.setLeft(c);
        e.setRight(f);
        c.setParent(e);
        f.setParent(e);

        q.setLeft(p);
        p.setParent(q);

        // Search
        System.out.println("Found: " + j.search('E').getValue());
        // Insert
        j.insert('M');
        System.out.println("Inserted M");
        // Search Inserted
        System.out.println("Found: " + j.search('M').getValue());

        // Traverse in Order
        j.traverseInOrder(null);
    }
}
