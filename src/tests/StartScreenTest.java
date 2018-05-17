package tests;

import java.awt.Component;
import java.awt.event.KeyEvent;
import org.junit.*;
import asciiPanel.AsciiPanel;
import game.AppletMain;
import ui.Screen;
import ui.StartScreen;

import static org.junit.Assert.*;

/**
 * The class <code>StartScreenTest</code> contains tests for the class <code>{@link StartScreen}</code>.
 *
 * @generatedBy CodePro at 5/17/18 1:29 PM
 * @author rjoaq
 * @version $Revision: 1.0 $
 */
public class StartScreenTest {
	/**
	 * Run the void displayOutput(AsciiPanel) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testDisplayOutput_1()
		throws Exception {
		StartScreen fixture = new StartScreen();
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional tests code here
		// An unexpected exception was thrown in user code while executing this tests:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testRespondToUserInput_1()
		throws Exception {
		StartScreen fixture = new StartScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional tests code here
		// An unexpected exception was thrown in user code while executing this tests:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method tests.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/17/18 1:29 PM
	 */
	@Test
	public void testRespondToUserInput_2()
		throws Exception {
		StartScreen fixture = new StartScreen();
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional tests code here
		// An unexpected exception was thrown in user code while executing this tests:
		//    java.lang.SecurityException: Unable to create temporary file or directory
		//       at java.nio.file.TempFileHelper.create(Unknown Source)
		//       at java.nio.file.TempFileHelper.createTempFile(Unknown Source)
		//       at java.nio.file.Files.createTempFile(Unknown Source)
		//       at javax.imageio.stream.FileCacheImageInputStream.<init>(Unknown Source)
		//       at com.sun.imageio.spi.InputStreamImageInputStreamSpi.createInputStreamInstance(Unknown Source)
		//       at javax.imageio.ImageIO.createImageInputStream(Unknown Source)
		//       at javax.imageio.ImageIO.read(Unknown Source)
		//       at asciiPanel.AsciiPanel.loadGlyphs(AsciiPanel.java:301)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:273)
		//       at asciiPanel.AsciiPanel.<init>(AsciiPanel.java:243)
		//       at game.AppletMain.<init>(AppletMain.java:19)
		assertNotNull(result);
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
		new org.junit.runner.JUnitCore().run(StartScreenTest.class);
	}
}