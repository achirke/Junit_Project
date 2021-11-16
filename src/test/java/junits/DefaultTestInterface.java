package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.RepeatedTest;

public interface DefaultTestInterface {
	
	public void method1();
	public void method2();
	
	@RepeatedTest(3)
	default void test() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
	}
	
	

}
