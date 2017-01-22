package uk.rusticflare.cardz;

import static uk.rusticflare.cardz.assertions.FiftyTwoCardDeckAssert.assertThat;

import org.junit.Test;

public class FiftyTwoCardDeckTest {

	@Test
	public void constructorTest() {
		FiftyTwoCardDeck deck = new FiftyTwoCardDeck();

		assertThat(deck).hasSize(52);

		for (Value value : Value.values()) {
			for (Suit suit : Suit.values()) {
				assertThat(deck)
						.contains(new StandardCard(value, suit));
			}
		}
	}

	@Test
	public void dealCardTest() {
		FiftyTwoCardDeck deck = new FiftyTwoCardDeck();

		StandardCard card = deck.takeTopCard();

		assertThat(deck).hasSize(51).doesNotContain(card);
	}

}
