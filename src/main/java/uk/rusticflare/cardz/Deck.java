package uk.rusticflare.cardz;

import java.util.Deque;

public interface Deck<C extends AbstractCard>
		extends Deque<C> {

	void shuffle();

	C dealCard();

}
