package uk.rusticflare.cardz;

import static uk.rusticflare.cardz.Suit.SPADES;
import static uk.rusticflare.cardz.Value.ACE;
import static uk.rusticflare.cardz.assertions.CardAssert.assertThat;

import org.junit.Test;

public class CardTest {

	@Test
	public void constructorTest() {
		Card card = new Card(ACE,SPADES);
		
		assertThat(card).hasValue(ACE).hasSuit(SPADES);
	}
}
