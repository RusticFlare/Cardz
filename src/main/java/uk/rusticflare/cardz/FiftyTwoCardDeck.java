package uk.rusticflare.cardz;

import java.util.Collections;
import java.util.LinkedList;

public class FiftyTwoCardDeck implements Deck {

	LinkedList<Card> deck;

	public FiftyTwoCardDeck() {
		deck = new LinkedList<>();
		for (Value value : Value.values()) {
			for (Suit suit : Suit.values()) {
				deck.push(new Card(value, suit));
			}
		}
		shuffle();
	}

	@Override
	public Card takeTopCard() {
		return deck.pop();
	}

	@Override
	public void shuffle() {
		Collections.shuffle(deck);
	}

	public int size() {
		return deck.size();
	}

	public boolean contains(Card card) {
		return deck.contains(card);
	}

}
