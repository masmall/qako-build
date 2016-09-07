package model;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
    public MathTest() {
    }

    public static void main(String[] args) {
        String[] args2 = { MathTest.class.getName() };
        org.junit
           .runner
           .JUnitCore
           .main(args2);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(MathTest.class);
    }

    /**
     * @see Math#add(int,int)
     */
    @Test
    public void testAdd() {
        //fail("Unimplemented");
        int num1 = 3;
        int num2 = 2;
        int total = 5;
        int sum = 0;
        sum = Math.add(num1, num2);
        assertEquals(sum, total);
    }
}
