package tests;

import java.util.List;
import org.junit.*;

import game.Point;

import static org.junit.Assert.*;

/**
 * The class <code>PointTest</code> contains tests for the class <code>{@link Point}</code>.
 *
 * @generatedBy CodePro at 5/17/18 1:29 PM
 * @author rjoaq
 * @version $Revision: 1.0 $
 */
public class PointTest {
	/**
	 * Run the Point(int,int,int) constructor tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testPoint_1()
		throws Exception {
		int x = 1;
		int y = 1;
		int z = 1;

		Point result = new Point(x, y, z);

		// add additional tests code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean equals(Object) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Point fixture = new Point(1, 1, 1);
		Object obj = new Point(1, 1, 1);

		boolean result = fixture.equals(obj);

		// add additional tests code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Point fixture = new Point(1, 1, 1);
		Object obj = new Point(0, 1, 1);

		boolean result = fixture.equals(obj);

		// add additional tests code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Point fixture = new Point(1, 1, 1);
		Object obj = new Point(1, 0, 1);

		boolean result = fixture.equals(obj);

		// add additional tests code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testEquals_4()
		throws Exception {
		Point fixture = new Point(1, 1, 1);
		Object obj = new Point(1, 1, 0);

		boolean result = fixture.equals(obj);

		// add additional tests code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testEquals_5()
		throws Exception {
		Point fixture = new Point(1, 1, 1);

		boolean result = fixture.equals(fixture);

		// add additional tests code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean equals(Object) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testEquals_6()
		throws Exception {
		Point fixture = new Point(1, 1, 1);
		Object obj = null;

		boolean result = fixture.equals(obj);

		// add additional tests code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Object) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testEquals_7()
		throws Exception {
		Point fixture = new Point(1, 1, 1);
		Object obj = new Object();

		boolean result = fixture.equals(obj);

		// add additional tests code here
		assertEquals(false, result);
	}

	/**
	 * Run the int hashCode() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testHashCode_1()
		throws Exception {
		Point fixture = new Point(1, 1, 1);

		int result = fixture.hashCode();

		// add additional tests code here
		assertEquals(30784, result);
	}

	/**
	 * Run the List<Point> neighbors8() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testNeighbors8_1()
		throws Exception {
		Point fixture = new Point(1, 1, 1);

		List<Point> result = fixture.neighbors8();

		// add additional tests code here
		assertNotNull(result);
		assertEquals(8, result.size());
	}

	/**
	 * Run the List<Point> neighbors8() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testNeighbors8_2()
		throws Exception {
		Point fixture = new Point(1, 1, 1);

		List<Point> result = fixture.neighbors8();

		// add additional tests code here
		assertNotNull(result);
		assertEquals(8, result.size());
	}

	/**
	 * Run the List<Point> neighbors8() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testNeighbors8_3()
		throws Exception {
		Point fixture = new Point(1, 1, 1);

		List<Point> result = fixture.neighbors8();

		// add additional tests code here
		assertNotNull(result);
		assertEquals(8, result.size());
	}

	/**
	 * Run the List<Point> neighbors8() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testNeighbors8_4()
		throws Exception {
		Point fixture = new Point(1, 1, 1);

		List<Point> result = fixture.neighbors8();

		// add additional tests code here
		assertNotNull(result);
		assertEquals(8, result.size());
	}

	/**
	 * Run the List<Point> neighbors8() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testNeighbors8_5()
		throws Exception {
		Point fixture = new Point(1, 1, 1);

		List<Point> result = fixture.neighbors8();

		// add additional tests code here
		assertNotNull(result);
		assertEquals(8, result.size());
	}

	/**
	 * Perform pre-tests initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-tests clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the tests.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(PointTest.class);
	}
}