package uk.rusticflare.cardz;

public class StandardCardAssert extends
		AbstractCardAssert<StandardCardAssert, StandardCard> {

	public StandardCardAssert(StandardCard actual) {
		super(actual, StandardCardAssert.class);
	}

	public StandardCardAssert hasValue(Value expected) {
		if (actual.value != expected)
			failWithMessage(
					"Expected value <%s>, but was <%s>",
					expected.name(), actual.value.name());
		return myself;
	}

	public StandardCardAssert hasSuit(Suit expected) {
		if (actual.suit != expected)
			failWithMessage(
					"Expected suit <%s>, but was <%s>",
					expected.name(), actual.value.name());
		return myself;
	}

}
