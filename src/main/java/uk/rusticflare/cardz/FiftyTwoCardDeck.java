package uk.rusticflare.cardz;

import java.util.Collections;
import java.util.LinkedList;

public class FiftyTwoCardDeck
		implements Deck<StandardPlayingCard> {

	private LinkedList<StandardPlayingCard> deck;

	public FiftyTwoCardDeck() {
		deck = new LinkedList<>();
		for (PlayingCardValue value : PlayingCardValue.values()) {
			for (PlayingCardSuit suit : PlayingCardSuit.values()) {
				deck.push(new StandardPlayingCard(value, suit));
			}
		}
		shuffle();
	}

	@Override
	public StandardPlayingCard takeTopCard() {
		return deck.pop();
	}

	@Override
	public void shuffle() {
		Collections.shuffle(deck);
	}

	@Override
	public int size() {
		return deck.size();
	}

	@Override
	public StandardPlayingCard[] toArray() {
		return deck.toArray(new StandardPlayingCard[0]);
	}

}
