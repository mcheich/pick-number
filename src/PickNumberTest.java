import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PickNumberTest {

	@Test
	void guess5Test() {
		assertEquals("Correct", PickNumber.userGuess(5));
	}

}
