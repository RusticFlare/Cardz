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
						.contains(new Card(value, suit));
			}
		}
	}

	@Test
	public void dealCardTest() {
		FiftyTwoCardDeck deck = new FiftyTwoCardDeck();

		Card card = deck.dealCard();

		assertThat(deck).hasSize(51).doesNotContain(card);
	}

}
