package uk.rusticflare.cardz;

import org.assertj.core.api.Assertions;

public class CardzAssertions extends Assertions {

	public static FiftyTwoCardDeckAssert assertThat(
			FiftyTwoCardDeck actual) {
		return new FiftyTwoCardDeckAssert(actual);
	}

	public static StandardCardAssert assertThat(
			StandardCard actual) {
		return new StandardCardAssert(actual);
	}

	public static JokerAssert assertThat(Joker actual) {
		return new JokerAssert(actual);
	}

	protected CardzAssertions() {
	}

}
