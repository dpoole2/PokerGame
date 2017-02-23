/**
 * 
 */

/**
 * @author Dylan
 *
 */
public class DeckCreator {
static char[] card = new char[15];
static char[][] fullDeck=new char[4][52];

public DeckCreator(char[] cards, char[][] deck){
	cards= card;
	deck=fullDeck;
}
public void cardGen(){
	for(int x =0; x<13; x++){
		fullDeck[0][x]=card[x];
		fullDeck[1][x]=card[x];
		fullDeck[2][x]=card[x];
		fullDeck[3][x]=card[x];
		System.out.println(x);
	}
}
}
