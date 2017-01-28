package uk.rusticflare.cardz;

import org.assertj.core.api.Assertions;

public class CardzAssertions extends Assertions {

	public static FiftyTwoCardDeckAssert assertThat(
			FiftyTwoCardDeck actual) {
		return FiftyTwoCardDeckAssert.assertThat(actual);
	}

	public static StandardCardAssert assertThat(
			StandardCard actual) {
		return StandardCardAssert.assertThat(actual);
	}

	public static JokerAssert assertThat(Joker actual) {
		return JokerAssert.assertThat(actual);
	}

	protected CardzAssertions() {
	}

}
