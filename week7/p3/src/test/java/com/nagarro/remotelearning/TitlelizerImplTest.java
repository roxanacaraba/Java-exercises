package com.nagarro.remotelearning;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TitlelizerImplTest {

    private Titlelizer titlelizer;

    @Before
    public void setUp() {
        //instantiate the object you want to test
        titlelizer = new com.nagarro.remotelearning.StringTitlelizer();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testTitlelizeForNullShouldThrowException() throws Exception {
        titlelizer.titlelize(null);
    }

    @Test
    public void testTitlelizeForEmptyStringShouldReturnEmptyString() {
        //WHEN
        String actualResult = titlelizer.titlelize("");

        //THEN
        assertThat(actualResult, is(""));
    }

    @Test
    public void testTitlelizeForTitlelizedString() throws Exception {
        //WHEN
        String actualResult = titlelizer.titlelize("Already Titlelized String");

        //THEN
        assertThat(actualResult, is("Already Titlelized String"));
    }

    @Test
    public void testTitlelizeShouldIgnorePrepositionsString() throws Exception {
        //WHEN
        String actualResult = titlelizer.titlelize("this string is a titlelized string");

        //THEN
        assertThat(actualResult, is("This String Is a Titlelized String"));
    }

    @Test
    public void testTitlelizeWhenFirsWordIsPreposition() throws Exception {
        //WHEN
        String actualResult = titlelizer.titlelize("the string is titlelized");

        //THEN
        assertThat(actualResult, is("the String Is Titlelized"));
    }

    @Test
    public void testTitlelize() throws Exception {
        //WHEN
        String actualResult = titlelizer.titlelize("please titlelize me");

        //THEN
        assertThat(actualResult, is("Please Titlelize Me"));
    }
}
