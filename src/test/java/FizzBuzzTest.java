import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

	@Test
	public void return1AsString() {
		
		String result = FizzBuzzer.fizzBuzz(1);
		assertEquals("1", result );
	}
	
	@Test
	public void return2AsString() {
		
		String result = FizzBuzzer.fizzBuzz(2);
		assertEquals("2", result );
	}
	
	@Test
	public void returnFizzFor3() {
		
		String result = FizzBuzzer.fizzBuzz(3);
		assertEquals("Fizz", result );
	}
	
	@Test
	public void return4AsString() {
		
		String result = FizzBuzzer.fizzBuzz(4);
		assertEquals("4", result );
	}
}
