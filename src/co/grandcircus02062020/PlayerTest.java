package co.grandcircus02062020;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	void dwayne() {
		TheRock tr = new TheRock();
		assertEquals(Roshambo.ROCK, tr.generateRoshambo());
	}

}
