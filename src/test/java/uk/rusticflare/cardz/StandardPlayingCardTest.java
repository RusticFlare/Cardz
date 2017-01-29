package uk.rusticflare.cardz;

import static uk.rusticflare.cardz.CardzAssertions.assertThat;
import static uk.rusticflare.cardz.PlayingCardSuit.SPADES;
import static uk.rusticflare.cardz.PlayingCardValue.ACE;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class StandardPlayingCardTest {

	@Test
	public void constructorTest() {
		StandardPlayingCard card = new StandardPlayingCard(ACE, SPADES);

		assertThat(card).hasValue(ACE).hasSuit(SPADES)
				.isNotJoker().hasToString("ACE of SPADES");
	}

	@Test
	public void equalsContract() {
		EqualsVerifier.forClass(StandardPlayingCard.class)
				.verify();
	}

}
