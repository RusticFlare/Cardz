package uk.rusticflare.cardz;

public abstract class AbstractPlayingCardAssert<S extends AbstractPlayingCardAssert<S, A>, A extends AbstractPlayingCard>
		extends AbstractCardAssert<S, A> {

	public AbstractPlayingCardAssert(A actual,
			Class<?> selfType) {
		super(actual, selfType);
	}

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

}
