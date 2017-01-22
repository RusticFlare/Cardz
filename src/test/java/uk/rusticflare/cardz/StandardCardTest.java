package uk.rusticflare.cardz;

import static uk.rusticflare.cardz.Suit.SPADES;
import static uk.rusticflare.cardz.Value.ACE;
import static uk.rusticflare.cardz.assertions.StandardCardAssert.assertThat;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class StandardCardTest {

	@Test
	public void constructorTest() {
		StandardCard card = new StandardCard(ACE, SPADES);

		assertThat(card).hasValue(ACE).hasSuit(SPADES)
				.isNotJoker().hasToString("ACE of SPADES");
	}

	@Test
	public void equalsContract() {
		EqualsVerifier.forClass(StandardCard.class)
				.verify();
	}

}
