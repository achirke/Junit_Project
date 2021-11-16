package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class StringFunctionsTest {
	
	@Test
	@DisplayName("Positive Test")
	public void Test1() {
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
		
	}
	@CustomAnnotation
	public void Test2() {
		
		assertFalse(StringFunctions.isPlaindrome("abcd"));

}
	
	
}
