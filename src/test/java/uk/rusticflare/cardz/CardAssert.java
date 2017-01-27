package uk.rusticflare.cardz;

import org.assertj.core.api.AbstractAssert;

import uk.rusticflare.cardz.Card;

public abstract class CardAssert<S extends CardAssert<S, A>, A extends Card>
		extends AbstractAssert<S, A> {

	public S isJoker() {
		if (!actual.isJoker())
			failWithMessage("Expected JOKER, but was <%s>",
					actual.toString());
		return myself;
	}

	public S isNotJoker() {
		if (actual.isJoker())
			failWithMessage(
					"Expected card not to be a JOKER, but it was");
		return myself;
	}

	protected CardAssert(A actual, Class<?> selfType) {
		super(actual, selfType);
		as("Card: %s", actual.toString());
	}

}
