package uk.rusticflare.cardz;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class JokerTest {

	@Test
	public void constructorTest() {
		Joker joker = new Joker();

		JokerAssert.assertThat(joker).isJoker()
				.hasToString("JOKER");
	}

	@Test
	public void equalsContract() {
		EqualsVerifier.forClass(Joker.class).verify();
	}

}
