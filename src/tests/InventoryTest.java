package tests;

import java.awt.Color;
import org.junit.*;

import asciiPanel.AsciiPanel;
import game.Inventory;
import game.Item;

import static org.junit.Assert.*;

/**
 * The class <code>InventoryTest</code> contains tests for the class <code>{@link Inventory}</code>.
 *
 * @generatedBy CodePro at 5/17/18 1:29 PM
 * @author rjoaq
 * @version $Revision: 1.0 $
 */
public class InventoryTest {
	/**
	 * Run the Inventory(int) constructor tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		int max = 1;

		Inventory result = new Inventory(max);

		// add additional tests code here
		assertNotNull(result);
		assertEquals(false, result.isFull());
	}

	/**
	 * Run the void add(Item) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testAdd_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.add(item);

		// add additional tests code here
		assertTrue(fixture.contains(item));
	}

	/**
	 * Run the void add(Item) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testAdd_2()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");
		Item rock = new Item(',', AsciiPanel.yellow, "rock", null);

		fixture.add(item);
		fixture.add(rock);

		// add additional tests code here
		assertFalse(fixture.contains(rock));
	}

	/**
	 * Run the void add(Item) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testAdd_3()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.add(item);

		// add additional tests code here
		assertTrue(fixture.contains(item));
	}

	/**
	 * Run the boolean contains(Item) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testContains_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.contains(item);

		// add additional tests code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean contains(Item) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testContains_2()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");
		fixture.add(item);

		boolean result = fixture.contains(item);

		// add additional tests code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean contains(Item) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testContains_3()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		boolean result = fixture.contains(item);

		// add additional tests code here
		assertEquals(false, result);
	}

	/**
	 * Run the Item get(int) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testGet_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item rock = new Item(',', AsciiPanel.yellow, "rock", null);
		fixture.add(rock);
		int i = 0;

		Item result = fixture.get(i);

		// add additional tests code here
		// An unexpected exception was thrown in user code while executing this tests:
		//    java.lang.ArrayIndexOutOfBoundsException: 1
		//       at game.Inventory.get(Inventory.java:7)
		assertEquals(rock,result);
		assertNotNull(result);
	}

	/**
	 * Run the Item[] getItems() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testGetItems_1()
		throws Exception {
		Inventory fixture = new Inventory(1);

		Item[] result = fixture.getItems();

		// add additional tests code here
		assertNotNull(result);
		assertEquals(1, result.length);
		assertEquals(null, result[0]);
	}

	/**
	 * Run the boolean isFull() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testIsFull_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item rock = new Item(',', AsciiPanel.yellow, "rock", null);
		fixture.add(rock);

		boolean result = fixture.isFull();

		// add additional tests code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isFull() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testIsFull_2()
		throws Exception {
		Inventory fixture = new Inventory(1);

		boolean result = fixture.isFull();

		// add additional tests code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isFull() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testIsFull_3()
		throws Exception {
		Inventory fixture = new Inventory(1);

		boolean result = fixture.isFull();

		// add additional tests code here
		assertEquals(false, result);
	}

	/**
	 * Run the void remove(Item) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testRemove_1()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");
		fixture.add(item);

		fixture.remove(item);

		// add additional tests code here
		assertFalse(fixture.contains(item));
	}

	/**
	 * Run the void remove(Item) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testRemove_2()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);
		assertFalse(fixture.contains(item));

		// add additional tests code here
	}

	/**
	 * Run the void remove(Item) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testRemove_3()
		throws Exception {
		Inventory fixture = new Inventory(1);
		Item item = new Item('', new Color(1), "", "");

		fixture.remove(item);

		// add additional tests code here
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
		new org.junit.runner.JUnitCore().run(InventoryTest.class);
	}
}