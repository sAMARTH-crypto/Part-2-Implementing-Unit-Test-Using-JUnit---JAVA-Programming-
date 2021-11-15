import static org.junit.jupiter.api.Assertions.*;
//import org.junit.*;
import org.junit.jupiter.api.Test;


public class divideTest 
{

	
	@Test
	public void test() 
	{
		JunitTesting test = new JunitTesting();
		double output = test.divide(2, 2);
		assertEquals(1, output); 
	}
	
	
	@Test                         //Testing the negative Input
	public void negativetestCase() 
	{
			JunitTesting test = new JunitTesting();	
			
			Exception exception = assertThrows(
					ArithmeticException.class,
					() -> test.divide(5, 0));
			assertEquals("/ by zero",exception.getMessage());
			
			assertTrue(exception.getMessage().contains("zero"));
				
	}

} 
