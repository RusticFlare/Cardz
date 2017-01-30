package uk.rusticflare.cardz;

public class FiftyTwoCardDeck
		extends StandardPlayingCardDeck {

	private static final long serialVersionUID = 479810882993109169L;

	public FiftyTwoCardDeck() {
		super();
		for (PlayingCardValue value : PlayingCardValue
				.values()) {
			for (PlayingCardSuit suit : PlayingCardSuit
					.values()) {
				push(new StandardPlayingCard(value, suit));
			}
		}
		shuffle();
	}

}
