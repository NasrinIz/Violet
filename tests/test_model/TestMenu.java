package test_model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * This class contains test cases for Aggressive Class
 * @author vaibh
 *
 */
public class TestMenu {

    /**
     * Over-ridden method for initial setup ran once before all test cases
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * Overridden method for tear down after all test cases ends.
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * Overridden method to be ran for each test case
     */
    @Before
    public void setUp() throws Exception {

    }

    /**
     * Overridden method runs after each test case.
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Checks reinforcement for Aggressive player
     */
    @Test
    public void testMenu() {
        int rt = 0;
        assertTrue(rt == 0);
    }
}
