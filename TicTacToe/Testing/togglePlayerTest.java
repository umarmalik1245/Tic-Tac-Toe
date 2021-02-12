import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class togglePlayerTest 
{

	private TestingGUI gui;
	
	@Before
	public void runBeforeEachTest()//testing if players are switching based on turn correctly
	{
		
		gui = new TestingGUI();
		
	}
	
	@Test
	public void testTogglePlayer1()
	{
	
		String result = TestingGUI.toggleP("X");
		String Expected ="O";
		assertEquals(Expected, result);
		
	}
	
	@Test
	public void testTogglePlayer2()
	{
	
		String result = TestingGUI.toggleP("O");
		String Expected ="X";
		assertEquals(Expected, result);
		
	}
	
	
}