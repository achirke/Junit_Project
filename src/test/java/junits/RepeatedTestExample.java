package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class RepeatedTestExample {
	
	@RepeatedTest(4)
	@Test
	public void Test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));

}
	
}
