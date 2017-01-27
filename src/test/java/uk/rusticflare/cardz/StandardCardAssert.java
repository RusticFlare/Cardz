package uk.rusticflare.cardz;

import uk.rusticflare.cardz.StandardCard;
import uk.rusticflare.cardz.Suit;
import uk.rusticflare.cardz.Value;

public class StandardCardAssert extends
		CardAssert<StandardCardAssert, StandardCard> {

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

	private StandardCardAssert(StandardCard actual) {
		super(actual, StandardCardAssert.class);
	}

	public static StandardCardAssert assertThat(
			StandardCard actual) {
		return new StandardCardAssert(actual);
	}

}
