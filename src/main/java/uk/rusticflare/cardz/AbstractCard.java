package uk.rusticflare.cardz;

public abstract class AbstractCard {

	public boolean isJoker() {
		return this instanceof Joker;
	}

	@Override
	public abstract String toString();

	@Override
	public abstract int hashCode();

	@Override
	public abstract boolean equals(Object obj);
}
