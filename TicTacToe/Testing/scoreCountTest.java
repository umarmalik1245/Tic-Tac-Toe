import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class scoreCountTest 
{

	private TestingGUI gui;
	
	@Before
	public void runBeforeEachTest()
	{
		
		gui = new TestingGUI();
		
	}
	
	//Testing for score increase on tile X
	@Test
	public void testScoreCount1_X()//Testing if the score for each player is incrementing correctly
	{
	
		int result = TestingGUI.scoreCounter("X");
		int Expected =1;
		assertEquals(Expected, result);
		
	}
	
	@Test
	public void testScoreCount2_X()
	{
	
		int result = TestingGUI.scoreCounter("X");
		int Expected =2;
		assertEquals(Expected, result);
		
	}
	
	@Test
	public void testScoreCount3_X()
	{
	
		int result = TestingGUI.scoreCounter("X");
		int Expected =3;
		assertEquals(Expected, result);
		
	}
	
	@Test
	public void testScoreCount4_X()
	{
	
		int result = TestingGUI.scoreCounter("X");
		int Expected =4;
		assertEquals(Expected, result);
		
	}
	
	@Test
	public void testScoreCount5_X()
	{
	
		int result = TestingGUI.scoreCounter("X");
		int Expected =5;
		assertEquals(Expected, result);
		
	}
	
	
	
	
	
	//Testing for score increase on tile O
	@Test
	public void testScoreCount1_O()
	{
	
		int result = TestingGUI.scoreCounter("O");
		int Expected =1;
		assertEquals(Expected, result);
		
	}
	
	@Test
	public void testScoreCount2_O()
	{
	
		int result = TestingGUI.scoreCounter("O");
		int Expected =2;
		assertEquals(Expected, result);
		
	}
	
	@Test
	public void testScoreCount3_O()
	{
	
		int result = TestingGUI.scoreCounter("O");
		int Expected =3;
		assertEquals(Expected, result);
		
	}
	
	@Test
	public void testScoreCount4_O()
	{
	
		int result = TestingGUI.scoreCounter("O");
		int Expected =4;
		assertEquals(Expected, result);
		
	}
	
	@Test
	public void testScoreCount5_O()
	{
	
		int result = TestingGUI.scoreCounter("O");
		int Expected =5;
		assertEquals(Expected, result);
		
	}
}