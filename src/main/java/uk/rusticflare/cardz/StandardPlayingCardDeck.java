package uk.rusticflare.cardz;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class StandardPlayingCardDeck
		extends LinkedList<StandardPlayingCard>
		implements Deck<StandardPlayingCard> {

	private static final long serialVersionUID = -8426099466147440834L;

	public StandardPlayingCardDeck() {
		super();
	}

	public StandardPlayingCardDeck(
			Collection<StandardPlayingCard> c) {
		super(c);
	}

	@Override
	public void shuffle() {
		Collections.shuffle(this);
	}

	@Override
	public StandardPlayingCard dealCard() {
		return pop();
	}

}
