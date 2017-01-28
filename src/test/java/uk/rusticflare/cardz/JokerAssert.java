package uk.rusticflare.cardz;

import uk.rusticflare.cardz.Joker;

public class JokerAssert
		extends AbstractCardAssert<JokerAssert, Joker> {

	public static JokerAssert assertThat(Joker actual) {
		return new JokerAssert(actual);
	}

	private JokerAssert(Joker actual) {
		super(actual, JokerAssert.class);
	}

}
