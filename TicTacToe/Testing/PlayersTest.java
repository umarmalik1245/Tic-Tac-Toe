import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PlayersTest {

	private TestingGUI gui;
	
	@Before
	public void runBeforeEachTest()
	{
		
		gui = new TestingGUI();
		
	}
	
	@Test
	public void testPlayers1()
	{
	
		String result = TestingGUI.Players("Umar", "Umar"); //Testing if the names are valid or not
		String Expected = "fail";
		assertEquals(Expected, result);
		
	}
	
	@Test
	public void testPlayers2()
	{
	
		String result2 = TestingGUI.Players("Umar", "Malik");
		String Expected2 = "pass";
		assertEquals(Expected2, result2);
		
	}
	
	@Test
	public void testPlayers3()
	{
	
		String result3 = TestingGUI.Players(null, null);
		String Expected3 = "fail";
		assertEquals(Expected3, result3);
		
	}
	
	@Test
	public void testPlayers4()
	{
	
		String result3 = TestingGUI.Players("Umar", null);
		String Expected3 = "fail";
		assertEquals(Expected3, result3);
		
	}
	
	@Test
	public void testPlayers5()
	{
	
		String result3 = TestingGUI.Players(null, "Umar");
		String Expected3 = "fail";
		assertEquals(Expected3, result3);
		
	}
	
	@Test
	public void testPlayers6()
	{
	
		String result3 = TestingGUI.Players("Omar", "Umar");
		String Expected3 = "pass";
		assertEquals(Expected3, result3);
		
	}


}
