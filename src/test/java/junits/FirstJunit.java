package junits;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;





public class FirstJunit {
	
	@BeforeAll
	public static void Method3() {
		
		System.out.println("Inside before All");
		
	}
	
	@BeforeEach
	public void Method1() {
		
		System.out.println("Inside Before Method");
		
	}
	@Test
	
	public void test1() {
		
		System.out.println("Inside Test1");
		
		boolean flag= true;
		Assert.assertTrue(flag);
		
		
	}
	
	@AfterEach
	public void Method2() {
		
		System.out.println("Inside After Method");
		
	}
	@AfterAll
	
	public static void method4() {
		System.out.println("Inside After All");
	}

}
