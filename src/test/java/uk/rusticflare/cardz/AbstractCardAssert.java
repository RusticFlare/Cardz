package uk.rusticflare.cardz;

import org.assertj.core.api.AbstractAssert;

public abstract class AbstractCardAssert<S extends AbstractCardAssert<S, A>, A extends AbstractCard>
		extends AbstractAssert<S, A> {

	public AbstractCardAssert(A actual, Class<?> selfType) {
		super(actual, selfType);
		as("Card: %s", actual.toString());
	}

}
