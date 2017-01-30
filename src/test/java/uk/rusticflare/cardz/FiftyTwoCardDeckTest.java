package uk.rusticflare.cardz;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.rusticflare.cardz.CardzAssertions.assertThat;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class FiftyTwoCardDeckTest {

	@Test
	public void constructorTest() {
		FiftyTwoCardDeck deck = new FiftyTwoCardDeck();

		Set<StandardPlayingCard> standard52Cards = getStandard52Cards();

		assertThat(deck).hasSize(52)
				.containsOnlyElementsOf(standard52Cards);
	}

	private static Set<StandardPlayingCard> getStandard52Cards() {
		Set<StandardPlayingCard> cards = new HashSet<>();
		for (PlayingCardValue value : PlayingCardValue
				.values()) {
			for (PlayingCardSuit suit : PlayingCardSuit
					.values()) {
				cards.add(new StandardPlayingCard(value,
						suit));
			}
		}
		return cards;
	}

	@Test
	public void dealCardTest() {
		FiftyTwoCardDeck deck = new FiftyTwoCardDeck();

		StandardPlayingCard card = deck.dealCard();

		assertThat(card).isNotNull();

		assertThat(deck).hasSize(51).doesNotContain(card);
	}

}
