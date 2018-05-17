package tests;

import java.awt.Color;
import java.util.List;
import org.junit.*;

import game.Effect;
import game.Item;
import game.Spell;

import static org.junit.Assert.*;

/**
 * The class <code>ItemTest</code> contains tests for the class <code>{@link Item}</code>.
 *
 * @generatedBy CodePro at 5/17/18 1:30 PM
 * @author rjoaq
 * @version $Revision: 1.0 $
 */
public class ItemTest {
	/**
	 * Run the Item(char,Color,String,String) constructor tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		char glyph = '';
		Color color = new Color(1);
		String name = "";
		String appearance = "";

		Item result = new Item(glyph, color, name, appearance);

		// add additional tests code here
		assertNotNull(result);
		assertEquals("", result.name());
		assertEquals(0, result.rangedAttackValue());
		assertEquals(1, result.thrownAttackValue());
		assertEquals("", result.details());
		assertEquals(0, result.foodValue());
		assertEquals("", result.appearance());
		assertEquals('', result.glyph());
		assertEquals(0, result.attackValue());
		assertEquals(0, result.defenseValue());
		assertEquals(null, result.quaffEffect());
	}

	/**
	 * Run the Item(char,Color,String,String) constructor tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testItem_2()
		throws Exception {
		char glyph = '';
		Color color = new Color(1);
		String name = "";
		String appearance = null;

		Item result = new Item(glyph, color, name, appearance);

		// add additional tests code here
		assertNotNull(result);
		assertEquals("", result.name());
		assertEquals(0, result.rangedAttackValue());
		assertEquals(1, result.thrownAttackValue());
		assertEquals("", result.details());
		assertEquals(0, result.foodValue());
		assertEquals("", result.appearance());
		assertEquals('', result.glyph());
		assertEquals(0, result.attackValue());
		assertEquals(0, result.defenseValue());
		assertEquals(null, result.quaffEffect());
	}

	/**
	 * Run the void addWrittenSpell(String,int,Effect) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testAddWrittenSpell_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		String name = "";
		int manaCost = 1;
		Effect effect = new Effect(1);

		fixture.addWrittenSpell(name, manaCost, effect);

		// add additional tests code here
	}

	/**
	 * Run the String appearance() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testAppearance_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		String result = fixture.appearance();

		// add additional tests code here
		assertEquals("", result);
	}

	/**
	 * Run the int attackValue() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		int result = fixture.attackValue();

		// add additional tests code here
		assertEquals(0, result);
	}

	/**
	 * Run the Color color() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		Color result = fixture.color();

		// add additional tests code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=0,g=0,b=1]", result.toString());
		assertEquals(1, result.getTransparency());
		assertEquals(255, result.getAlpha());
		assertEquals(-16777215, result.getRGB());
		assertEquals(0, result.getGreen());
		assertEquals(0, result.getRed());
		assertEquals(1, result.getBlue());
	}

	/**
	 * Run the int defenseValue() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testDefenseValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		int result = fixture.defenseValue();

		// add additional tests code here
		assertEquals(0, result);
	}

	/**
	 * Run the String details() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testDetails_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.modifyAttackValue(10);

		String result = fixture.details();

		// add additional tests code here
		assertEquals("" + "  attack:" + 10, result);
	}

	/**
	 * Run the String details() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testDetails_2()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.modifyDefenseValue(10);

		String result = fixture.details();

		// add additional tests code here
		assertEquals("" + "  defense:" + 10, result);
	}
	
	@Test
	public void testDetails_3()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.modifyRangedAttackValue(10);

		String result = fixture.details();

		// add additional tests code here
		assertEquals("" + "  ranged:" + 10, result);
	}

	@Test
	public void testDetails_4()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.modifyFoodValue(10);

		String result = fixture.details();

		// add additional tests code here
		assertEquals("" + "  food:" + 10, result);
	}
	
	@Test
	public void testDetails_5()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.modifyThrownAttackValue(10);

		String result = fixture.details();

		// add additional tests code here
		assertEquals("" + "  thrown:" + 11, result);
	}
	/**
	 * Run the int foodValue() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testFoodValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		int result = fixture.foodValue();

		// add additional tests code here
		assertEquals(0, result);
	}

	/**
	 * Run the char glyph() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		char result = fixture.glyph();

		// add additional tests code here
		assertEquals('', result);
	}

	/**
	 * Run the void modifyAttackValue(int) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testModifyAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		int amount = 1;

		fixture.modifyAttackValue(amount);

		// add additional tests code here
	}

	/**
	 * Run the void modifyDefenseValue(int) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testModifyDefenseValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		int amount = 1;

		fixture.modifyDefenseValue(amount);

		// add additional tests code here
	}

	/**
	 * Run the void modifyFoodValue(int) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testModifyFoodValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		int amount = 1;

		fixture.modifyFoodValue(amount);

		// add additional tests code here
	}

	/**
	 * Run the void modifyRangedAttackValue(int) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testModifyRangedAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		int amount = 1;

		fixture.modifyRangedAttackValue(amount);

		// add additional tests code here
	}

	/**
	 * Run the void modifyThrownAttackValue(int) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testModifyThrownAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		int amount = 1;

		fixture.modifyThrownAttackValue(amount);

		// add additional tests code here
	}

	/**
	 * Run the String name() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testName_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		String result = fixture.name();

		// add additional tests code here
		assertEquals("", result);
	}

	/**
	 * Run the Effect quaffEffect() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testQuaffEffect_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		Effect result = fixture.quaffEffect();

		// add additional tests code here
		assertNotNull(result);
		assertEquals(false, result.isDone());
	}

	/**
	 * Run the int rangedAttackValue() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testRangedAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		int result = fixture.rangedAttackValue();

		// add additional tests code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setQuaffEffect(Effect) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testSetQuaffEffect_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));
		Effect effect = new Effect(1);

		fixture.setQuaffEffect(effect);

		// add additional tests code here
	}

	/**
	 * Run the int thrownAttackValue() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testThrownAttackValue_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		int result = fixture.thrownAttackValue();

		// add additional tests code here
		assertEquals(1, result);
	}

	/**
	 * Run the List<Spell> writtenSpells() method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	@Test
	public void testWrittenSpells_1()
		throws Exception {
		Item fixture = new Item('', new Color(1), "", "");
		fixture.setQuaffEffect(new Effect(1));

		List<Spell> result = fixture.writtenSpells();

		// add additional tests code here
		assertNotNull(result);
		assertEquals(0, result.size());
	}

	/**
	 * Perform pre-tests initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/17/18 1:30 PM
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
	 * @generatedBy CodePro at 5/17/18 1:30 PM
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
	 * @generatedBy CodePro at 5/17/18 1:30 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(ItemTest.class);
	}
}