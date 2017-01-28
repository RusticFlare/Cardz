package uk.rusticflare.cardz;

import org.assertj.core.api.AbstractAssert;

public abstract class AbstractCardAssert<S extends AbstractCardAssert<S, A>, A extends AbstractCard>
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
					"Expected the card not to be a JOKER, but it was");
		return myself;
	}

	protected AbstractCardAssert(A actual,
			Class<?> selfType) {
		super(actual, selfType);
		as("Card: %s", actual.toString());
	}

}
