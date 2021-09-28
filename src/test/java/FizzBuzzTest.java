import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

	@Test
	public void return1AsString() {
		
		String result = FizzBuzzer.fizzBuzz(1);
		assertEquals("1", result );
	}
}
