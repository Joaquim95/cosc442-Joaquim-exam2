package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.InventoryTest;
import tests.ItemTest;
import tests.LineTest;
import tests.PointTest;
import tests.SpellTest;

/**
 * The class <code>TestAll</code> builds a suite that can be used to run all
 * of the tests within its package as well as within any subpackages of its
 * package.
 *
 * @generatedBy CodePro at 5/17/18 2:37 PM
 * @author rjoaq
 * @version $Revision: 1.0 $
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	PointTest.class,
	LineTest.class,
	SpellTest.class,
	ItemTest.class,
	InventoryTest.class,
	StartScreenTest.class,
	WinScreenTest.class
})
public class TestAll {

	/**
	 * Launch the tests.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/17/18 2:37 PM
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestAll.class });
	}
}
