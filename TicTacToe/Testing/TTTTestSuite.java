import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses
({
		
		scoreCountTest.class,
		PlayersTest.class,
		togglePlayerTest.class,
		WinningPlayerTest.class
		
})
public class TTTTestSuite {
	//Test Suite to Run All my Test Cases
}
