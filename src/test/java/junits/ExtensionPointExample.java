package junits;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

	@ExtendWith(EnvCheck.class)

public class ExtensionPointExample {



	@Test
	@DisplayName("Positive Test")
	public void Test1() {
	
	assertTrue(StringFunctions.isPlaindrome("oppo"));
	
	
}

	@Test
	@DisplayName("Negative Test")
	public void Test2() {
	
	assertFalse(StringFunctions.isPlaindrome("abcd"));
	
	}
	
	
}
