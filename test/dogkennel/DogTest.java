/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogkennel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thor
 */
public class DogTest {
	
	public DogTest() {
	}
	
	@Before
	public void setUp() {
	}

	/**
	 * Test of compareTo method, of class Dog.
	 */
	@Test
	public void testCompareTo() {
		System.out.println("compareTo");
		Dog o = null;
		Dog instance = new Dog();
		int expResult = 0;
		int result = instance.compareTo(o);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}
	
}
