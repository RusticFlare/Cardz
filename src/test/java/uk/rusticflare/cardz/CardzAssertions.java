package uk.rusticflare.cardz;

import org.assertj.core.api.Assertions;

public class CardzAssertions extends Assertions {

	public static StandardPlayingCardAssert assertThat(
			StandardPlayingCard actual) {
		return new StandardPlayingCardAssert(actual);
	}

	public static JokerAssert assertThat(Joker actual) {
		return new JokerAssert(actual);
	}

	protected CardzAssertions() {
	}

}
