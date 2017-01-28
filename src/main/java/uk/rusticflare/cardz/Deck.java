package uk.rusticflare.cardz;

public interface Deck<C extends AbstractCard> {

	public C takeTopCard();

	public void shuffle();

	public C[] toArray();

	public int size();

}
