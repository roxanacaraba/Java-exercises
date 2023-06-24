package com.nagarro.remotelearning;


import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.nagarro.remotelearning.exception.InvalidStringNumberException;
import com.nagarro.remotelearning.exception.NullOrEmptyException;
import com.nagarro.remotelearning.exception.IndexOutOfBoundsException;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MyListTest {
    
    private StringList list;
    private String[] initData = {"12", "23", "34", "45"};

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() {
        this.list = new StringList();
    }

    @Test
    public void testAddValuesToTheList() {
        initData();
    	assertEquals(initData.length, list.size());
        for (String data : initData) {
        	assertTrue(list.contains(data));
        }
    }
    
    @Test
    public void testAddNonIntegerValue() {
        assertThrows(InvalidStringNumberException.class, () -> list.add("Hey, I'm not an integer."));
    }
    
    @Test
    public void testAddNullValue() {
        assertThrows(NullOrEmptyException.class, () -> list.add(null));
    }
    
    @Test
    public void testIndexOutOfBoundsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> list.get(initData.length));
    }

    @Test
    public void testIndexOutOfBounds() {
        initData();
        String results = list.get(0);
        assertEquals(results, "12");
    }

    @Test
    public void testContainsTrue() {
        initData();
        boolean results = list.contains("12");
        assertTrue(results);
    }

    @Test
    public void testContainsFalse() {
        initData();
        boolean results = list.contains("100");
        assertFalse(results);
    }

    @Test
    public void testContainsAllTrue() {
        initData();
        StringList testList = new StringList();
        testList.add("12");
        testList.add("23");
        testList.add("34");
        testList.add("45");
        boolean results = list.containsAll(testList);
        assertTrue(results);
    }

    @Test
    public void testContainsAllFalse() {
        initData();
        StringList testList = new StringList();
        testList.add("12");
        testList.add("23");
        testList.add("34");
        testList.add("46");
        boolean results = list.containsAll(testList);
        assertFalse(results);
    }

    @Test
    public void testReturnRecordInformation() {
    Assert.assertNotNull(list.returnRecordInformation());
    }

    private void initData() {
        for (String numberAsString : this.initData) {
            list.add(numberAsString);
        }
    }
}
