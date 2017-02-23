/*
 * This is where the poker game will start
 * It will not be the actual game board
 */
public class Main {
	//These arrays will now just be unidealized
	static char [][] fullDeck = new char[3][12];
	static char[] cards= new char[12];
	 

	
public static void main(String args[] ){
	//pass the arrays to the DeckCreator class
	DeckCreator deckGen = new DeckCreator(cards, fullDeck);
	System.out.println("ALl GOOD");
	deckGen.cardGen();
}
}
