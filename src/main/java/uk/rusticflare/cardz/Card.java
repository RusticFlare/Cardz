package uk.rusticflare.cardz;

/**
 * Created by j_d_b on 27/08/2016.
 */
public final class Card {

	public final Value value;
	public final Suit suit;

	public Card(Value v, Suit s) {
		value = v;
		suit = s;
	}

	@Override
	public String toString() {
		return String.format("%s of %s", value.name(),
				suit.name());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((suit == null) ? 0 : suit.hashCode());
		result = prime * result
				+ ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (suit != other.suit)
			return false;
		if (value != other.value)
			return false;
		return true;
	}
}
