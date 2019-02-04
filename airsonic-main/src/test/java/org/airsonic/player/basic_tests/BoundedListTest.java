package org.airsonic.player.basic_tests;

import org.airsonic.player.util.BoundedList;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test of {@link BoundedList}.
 *
 * @author Noah Pittinger
 */
public class BoundedListTest {
    private BoundedList<Object> sut;
    private int maxSize = 5;

    @Before
    public void setup() {
        sut = new BoundedList<>(maxSize);
    }

    /**
     * Unit test of {@link BoundedList#add(Object)} basic functionality.
     *
     * @author Noah Pittinger
     */
    @Test
    public void givenBoundedList_whenElementAdded_thenElementContainedInList() {
        Object listObject = new Object();
        sut.add(listObject);
        assertTrue(sut.contains(listObject));
    }

    /**
     * Unit test of {@link BoundedList#add(Object)}'s removal of the first element from a full list.
     *
     * @author Noah Pittinger
     */
    @Test
    public void givenFullBoundedList_whenAdd_thenFirstElementRemoved() {
        Object firstElement = new Object();
        sut.add(firstElement);

        for (int i = 0; i < maxSize; i++) {
            sut.add(new Object());
        }

        assertFalse(sut.contains(firstElement));
    }

    /**
     * Unit test of {@link BoundedList#addFirst(Object)}'s removal of the last element from a full list.
     *
     * @author Noah Pittinger
     */
    @Test
    public void givenFullBoundedList_whenAddFirst_thenLastElementRemoved() {
        for (int i = 0; i < maxSize; i++) {
            sut.add(new Object());
        }

        Object lastElement = sut.get(maxSize - 1);
        sut.addFirst(new Object());

        assertFalse(sut.contains(lastElement));
    }

    @After
    public void teardown() {
        sut.clear();
        sut = null;
    }
}
