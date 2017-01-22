package uk.rusticflare.cardz;

import java.util.Collections;
import java.util.Stack;

public class FiftyTwoCardDeck implements Deck {

	Stack<Card> deck;

	public FiftyTwoCardDeck() {
		deck = new Stack<>();
		for (Value value : Value.values()) {
			for (Suit suit : Suit.values()) {
				deck.push(new Card(value, suit));
			}
		}
		shuffle();
	}

	@Override
	public Card dealCard() {
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
