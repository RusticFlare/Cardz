package uk.rusticflare.cardz;

import java.util.Collections;
import java.util.LinkedList;

public class FiftyTwoCardDeck implements Deck {

	LinkedList<StandardCard> deck;

	public FiftyTwoCardDeck() {
		deck = new LinkedList<>();
		for (Value value : Value.values()) {
			for (Suit suit : Suit.values()) {
				deck.push(new StandardCard(value, suit));
			}
		}
		shuffle();
	}

	@Override
	public StandardCard takeTopCard() {
		return deck.pop();
	}

	@Override
	public void shuffle() {
		Collections.shuffle(deck);
	}

	public int size() {
		return deck.size();
	}

	public boolean contains(StandardCard card) {
		return deck.contains(card);
	}

}
