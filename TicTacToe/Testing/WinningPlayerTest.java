import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class WinningPlayerTest 
{

	private TestingGUI gui;
	
	@Before
	public void runBeforeEachTest()//Testing if winner is selected correctly
	{
		
		gui = new TestingGUI();
		
	}
	
	@Test
	public void testWinningPlayer1()
	{
	
		TestingGUI.player1="Umar";
		TestingGUI.player2="Malik";
		String result = TestingGUI.winningPlayer("X");
		assertEquals(TestingGUI.player1, result);
		
	}
	
	@Test
	public void testWinningPlayer2()
	{
	
		TestingGUI.player1="Umar";
		TestingGUI.player2="Malik";
		String result = TestingGUI.winningPlayer("O");
		assertEquals(TestingGUI.player2, result);
		
	}
	
}