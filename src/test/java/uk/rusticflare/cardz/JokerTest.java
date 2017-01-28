package uk.rusticflare.cardz;

import static uk.rusticflare.cardz.CardzAssertions.assertThat;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class JokerTest {

	@Test
	public void constructorTest() {
		Joker joker = new Joker();

		assertThat(joker).isJoker().hasToString("JOKER");
	}

	@Test
	public void equalsContract() {
		EqualsVerifier.forClass(Joker.class).verify();
	}

}
