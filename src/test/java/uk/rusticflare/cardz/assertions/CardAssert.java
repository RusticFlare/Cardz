package uk.rusticflare.cardz.assertions;

import org.assertj.core.api.AbstractAssert;

import uk.rusticflare.cardz.Card;
import uk.rusticflare.cardz.Suit;
import uk.rusticflare.cardz.Value;

public class CardAssert
		extends AbstractAssert<CardAssert, Card> {

	public CardAssert hasValue(Value expected) {
		if (actual.getValue() != expected)
			failWithMessage(
					"Expected value <%s>, but was <%s>",
					expected.name(),
					actual.getValue().name());
		return myself;
	}

	public CardAssert hasSuit(Suit expected) {
		if (actual.getSuit() != expected)
			failWithMessage(
					"Expected suit <%s>, but was <%s>",
					expected.name(),
					actual.getValue().name());
		return myself;
	}

	private CardAssert(Card actual) {
		super(actual, CardAssert.class);
	}

	public static CardAssert assertThat(Card actual) {
		return new CardAssert(actual);
	}

}