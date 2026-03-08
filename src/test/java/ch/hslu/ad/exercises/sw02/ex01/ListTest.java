package ch.hslu.ad.exercises.sw02.ex01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class ListTest {

    // Grösse

    /**
     * TC-1: Single node → size 1.
     */
    @Test
    void testSizeSingleNode() {
        List<Integer> list = new List<>(1);
        assertThat(list.size()).isEqualTo(1);
    }

    /**
     * TC-2: Three-node chain → size 3.
     */
    @Test
    void testSizeThreeNodes() {
        List<Integer> list = new List<>(1);
        list.insert(2);
        list.insert(3);
        assertThat(list.size()).isEqualTo(3);
    }

    // Einfügen

    /**
     * TC-3: insert prepends; new head holds the inserted value.
     */
    @Test
    void testInsertPrependsValue() {
        List<Integer> list = new List<>(2);
        list.insert(10);
        assertThat(list.getHead().getValue()).isEqualTo(10);
    }

    /**
     * TC-4: insert increases size by 1.
     */
    @Test
    void testInsertIncreasesSize() {
        List<Integer> list = new List<>(3);
        list.insert(5);
        assertThat(list.size()).isEqualTo(2);
    }

    // --- Mehrere Elemente Einfügen ---

    /**
     * TC-5: insertMultiple adds all elements (size grows accordingly).
     */
    @Test
    void testInsertMultipleSize() {
        List<Integer> list = new List<>(4);
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        list.insertMultiple(values);
        assertThat(list.size()).isEqualTo(4); // 3 inserted + original head
    }

    /**
     * TC-6: insertMultiple — last inserted value is the new head (prepend order).
     */
    @Test
    void testInsertMultipleHeadIsLastInserted() {
        List<Integer> list = new List<>(5);
        ArrayList<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        list.insertMultiple(values);
        assertThat(list.getHead().getValue()).isEqualTo(3);
    }

    // --- Laden / Beinhaltet ---

    /**
     * TC-7: get returns the matching node.
     */
    @Test
    void testGetReturnsMatchingNode() {
        List<Integer> list = new List<>(6);
        list.insert(99);
        assertThat(list.get(99)).isNotNull();
        assertThat(list.get(99).getValue()).isEqualTo(99);
    }

    /**
     * TC-8: get returns null when value is absent.
     */
    @Test
    void testGetReturnsNullWhenAbsent() {
        List<Integer> list = new List<>(7);
        assertThat(list.get(42)).isNull();
    }

    /**
     * TC-9: contains returns true for a present value.
     */
    @Test
    void testContainsPresent() {
        List<Integer> list = new List<>(8);
        list.insert(7);
        assertThat(list.contains(7)).isTrue();
    }

    /**
     * TC-10: contains returns false for an absent value.
     */
    @Test
    void testContainsAbsent() {
        List<Integer> list = new List<>(9);
        assertThat(list.contains(99)).isFalse();
    }

    // --- Pop ---

    /**
     * TC-11: pop returns the head value and removes it.
     */
    @Test
    void testPopReturnsAndRemovesHead() {
        List<Integer> list = new List<>(10);
        list.insert(55);
        assertThat(list.pop()).isEqualTo(55);
        assertThat(list.contains(55)).isFalse();
    }

    // --- Entfernen ---

    /**
     * TC-12: remove head element.
     */
    @Test
    void testRemoveHead() {
        List<Integer> list = new List<>(11);
        list.insert(1);
        list.insert(2); // head = 2 -> 1 -> null-node
        list.remove(2);
        assertThat(list.getHead().getValue()).isEqualTo(1);
    }

    /**
     * TC-13: remove middle element closes the gap.
     */
    @Test
    void testRemoveMiddle() {
        List<Integer> list = new List<>(12);
        list.insert(1);
        list.insert(2);
        list.insert(3); // 3 -> 2 -> 1 -> null-node
        list.remove(2);
        assertThat(list.contains(2)).isFalse();
        assertThat(list.size()).isEqualTo(3); // 3, 1, null-node
    }

    /**
     * TC-14: remove returns the value.
     */
    @Test
    void testRemoveReturnsValue() {
        List<Integer> list = new List<>(13);
        list.insert(10);
        assertThat(list.remove(10)).isEqualTo(10);
    }

    /**
     * TC-15: remove absent value returns null.
     */
    @Test
    void testRemoveAbsentReturnsNull() {
        List<Integer> list = new List<>(14);
        assertThat(list.remove(999)).isNull();
    }
}
