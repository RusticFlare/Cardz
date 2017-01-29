package uk.rusticflare.cardz;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.AbstractAssert;

public class FiftyTwoCardDeckAssert extends
		AbstractAssert<FiftyTwoCardDeckAssert, FiftyTwoCardDeck> {

	public FiftyTwoCardDeckAssert(FiftyTwoCardDeck actual) {
		super(actual, FiftyTwoCardDeckAssert.class);
		as(FiftyTwoCardDeck.class.getSimpleName());
	}

	public FiftyTwoCardDeckAssert hasSize(int expected) {
		if (actual.size() != expected)
			failWithMessage(
					"Expected size <%s>, but was <%s>",
					expected, actual.size());
		return myself;
	}

	public FiftyTwoCardDeckAssert contains(
			StandardPlayingCard... values) {
		assertThat(actual.toArray())
				.as(FiftyTwoCardDeck.class.getSimpleName())
				.contains(values);
		return myself;
	}

	public FiftyTwoCardDeckAssert doesNotContain(
			StandardPlayingCard... values) {
		assertThat(actual.toArray())
				.as(FiftyTwoCardDeck.class.getSimpleName())
				.doesNotContain(values);
		return myself;
	}

}
