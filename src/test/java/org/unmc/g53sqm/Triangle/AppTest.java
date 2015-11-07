package org.unmc.g53sqm.Triangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testScalene() {
		Triangle t = new Triangle(3,4,5);
		assertEquals("Scalene",t.getType());
	}
	
	@Test
	public final void testIsosceles() {
		Triangle t = new Triangle(3,4,3);
		assertEquals("Isosceles",t.getType());
	}
	
	@Test
	public final void testEquilateral() {
		Triangle t = new Triangle(4,4,4);
		assertEquals("Equilateral",t.getType());
	}


}
