package uk.rusticflare.cardz;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import uk.rusticflare.cardz.FiftyTwoCardDeck;
import uk.rusticflare.cardz.StandardCard;

public class FiftyTwoCardDeckAssert extends
		AbstractAssert<FiftyTwoCardDeckAssert, FiftyTwoCardDeck> {

	public FiftyTwoCardDeckAssert hasSize(int expected) {
		if (actual.size() != expected)
			failWithMessage(
					"Expected size <%s>, but was <%s>",
					expected, actual.size());
		return myself;
	}

	public FiftyTwoCardDeckAssert contains(
			StandardCard... values) {
		Assertions.assertThat(actual.toArray())
				.as(FiftyTwoCardDeck.class.getSimpleName())
				.contains(values);
		return myself;
	}

	public FiftyTwoCardDeckAssert doesNotContain(
			StandardCard... values) {
		Assertions.assertThat(actual.toArray())
				.as(FiftyTwoCardDeck.class.getSimpleName())
				.doesNotContain(values);
		return myself;
	}

	private FiftyTwoCardDeckAssert(
			FiftyTwoCardDeck actual) {
		super(actual, FiftyTwoCardDeckAssert.class);
		as(FiftyTwoCardDeck.class.getSimpleName());
	}

	public static FiftyTwoCardDeckAssert assertThat(
			FiftyTwoCardDeck actual) {
		return new FiftyTwoCardDeckAssert(actual);
	}

}