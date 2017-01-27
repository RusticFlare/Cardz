package uk.rusticflare.cardz;

import static uk.rusticflare.cardz.FiftyTwoCardDeckAssert.assertThat;

import java.util.LinkedList;

import org.junit.Test;

public class FiftyTwoCardDeckTest {

	@Test
	public void constructorTest() {
		FiftyTwoCardDeck deck = new FiftyTwoCardDeck();

		StandardCard[] standard52Cards = getStandard52Cards();

		assertThat(deck).hasSize(52)
				.contains(standard52Cards);
	}

	private static StandardCard[] getStandard52Cards() {
		LinkedList<StandardCard> cards = new LinkedList<>();
		for (Value value : Value.values()) {
			for (Suit suit : Suit.values()) {
				cards.add(new StandardCard(value, suit));
			}
		}
		return cards.toArray(new StandardCard[0]);
	}

	@Test
	public void dealCardTest() {
		FiftyTwoCardDeck deck = new FiftyTwoCardDeck();

		StandardCard card = deck.takeTopCard();

		assertThat(deck).hasSize(51).doesNotContain(card);
	}

}
