package uk.rusticflare.cardz;

public abstract class Card {

	public boolean isJoker() {
		return (this instanceof Joker);
	}

	@Override
	public abstract String toString();

	@Override
	public abstract int hashCode();

	@Override
	public abstract boolean equals(Object obj);
}
