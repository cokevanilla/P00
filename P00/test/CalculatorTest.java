import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testSubtract() {
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 3087;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testMultiply() {
		int a = 7;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 21;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 9;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 3;
		assertEquals (expected, actual);
		
		try {
			cal.divide(5, 0);
			fail("Expected IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("b cannot be 0",e.getMessage());
		}
	}
	

	}
