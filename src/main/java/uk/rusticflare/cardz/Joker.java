package uk.rusticflare.cardz;

public final class Joker extends AbstractPlayingCard {

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public String toString() {
		return "JOKER";
	}

}
