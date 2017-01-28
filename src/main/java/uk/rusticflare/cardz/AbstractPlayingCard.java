package uk.rusticflare.cardz;

public abstract class AbstractPlayingCard
		extends AbstractCard {

	public boolean isJoker() {
		return this instanceof Joker;
	}

}
