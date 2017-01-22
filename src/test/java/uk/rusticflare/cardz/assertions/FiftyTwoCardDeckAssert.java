package uk.rusticflare.cardz.assertions;

import org.assertj.core.api.AbstractAssert;

import uk.rusticflare.cardz.Card;
import uk.rusticflare.cardz.FiftyTwoCardDeck;

public class FiftyTwoCardDeckAssert extends
		AbstractAssert<FiftyTwoCardDeckAssert, FiftyTwoCardDeck> {

	public FiftyTwoCardDeckAssert hasSize(int expected) {
		if (actual.size() != expected)
			failWithMessage(
					"Expected size <%s>, but was <%s>",
					expected, actual.size());
		return myself;
	}

	public FiftyTwoCardDeckAssert contains(Card expected) {
		if (!actual.contains(expected))
			failWithMessage(
					"Expected to contain <%s>, but was didn't",
					expected.toString());
		return myself;
	}

	public FiftyTwoCardDeckAssert doesNotContain(
			Card expected) {
		if (actual.contains(expected))
			failWithMessage(
					"Expected to not contain <%s>, but did",
					expected.toString());
		return myself;
	}

	private FiftyTwoCardDeckAssert(
			FiftyTwoCardDeck actual) {
		super(actual, FiftyTwoCardDeckAssert.class);
	}

	public static FiftyTwoCardDeckAssert assertThat(
			FiftyTwoCardDeck actual) {
		return new FiftyTwoCardDeckAssert(actual);
	}

}
