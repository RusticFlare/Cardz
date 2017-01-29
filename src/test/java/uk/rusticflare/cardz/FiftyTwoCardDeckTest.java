package uk.rusticflare.cardz;

import static uk.rusticflare.cardz.CardzAssertions.assertThat;

import java.util.LinkedList;

import org.junit.Test;

public class FiftyTwoCardDeckTest {

	@Test
	public void constructorTest() {
		FiftyTwoCardDeck deck = new FiftyTwoCardDeck();

		StandardPlayingCard[] standard52Cards = getStandard52Cards();

		assertThat(deck).hasSize(52)
				.contains(standard52Cards);
	}

	private static StandardPlayingCard[] getStandard52Cards() {
		LinkedList<StandardPlayingCard> cards = new LinkedList<>();
		for (PlayingCardValue value : PlayingCardValue.values()) {
			for (PlayingCardSuit suit : PlayingCardSuit.values()) {
				cards.add(new StandardPlayingCard(value, suit));
			}
		}
		return cards.toArray(new StandardPlayingCard[0]);
	}

	@Test
	public void dealCardTest() {
		FiftyTwoCardDeck deck = new FiftyTwoCardDeck();

		StandardPlayingCard card = deck.takeTopCard();

		assertThat(card).isNotNull();

		assertThat(deck).hasSize(51).doesNotContain(card);
	}

}
