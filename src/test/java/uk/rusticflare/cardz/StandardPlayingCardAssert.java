package uk.rusticflare.cardz;

public class StandardPlayingCardAssert extends
		AbstractPlayingCardAssert<StandardPlayingCardAssert, StandardPlayingCard> {

	public StandardPlayingCardAssert(StandardPlayingCard actual) {
		super(actual, StandardPlayingCardAssert.class);
	}

	public StandardPlayingCardAssert hasValue(PlayingCardValue expected) {
		if (actual.value != expected)
			failWithMessage(
					"Expected value <%s>, but was <%s>",
					expected.name(), actual.value.name());
		return myself;
	}

	public StandardPlayingCardAssert hasSuit(PlayingCardSuit expected) {
		if (actual.suit != expected)
			failWithMessage(
					"Expected suit <%s>, but was <%s>",
					expected.name(), actual.value.name());
		return myself;
	}

}
