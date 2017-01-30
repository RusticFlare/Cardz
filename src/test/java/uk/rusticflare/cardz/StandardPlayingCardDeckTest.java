package uk.rusticflare.cardz;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.rusticflare.cardz.PlayingCardSuit.SPADES;
import static uk.rusticflare.cardz.PlayingCardValue.ACE;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class StandardPlayingCardDeckTest {

	@Test
	public void emptyConstuctorTest() {
		StandardPlayingCardDeck deck = new StandardPlayingCardDeck();
		assertThat(deck).isEmpty();
	}

	@Test
	public void collectionConstuctorTest() {
		Set<StandardPlayingCard> cards = new HashSet<>();
		cards.add(new StandardPlayingCard(ACE, SPADES));

		StandardPlayingCardDeck deck = new StandardPlayingCardDeck(
				cards);

		assertThat(deck).containsExactlyElementsOf(cards);
	}

}
