package uk.rusticflare.cardz;

public abstract class AbstractCard {

	@Override
	public abstract String toString();

	@Override
	public abstract int hashCode();

	@Override
	public abstract boolean equals(Object obj);
}
