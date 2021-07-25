package com;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
       assertEquals(10,10);	
    }
@Test
  public void testAddMethod() {
	Calculation cc = new Calculation();
	int result = cc.add(10,20);
	assertEquals(50,result);
}

}
