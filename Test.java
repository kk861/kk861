import java.util.List;
import java.util.ArrayList;
import java.util.Random;
class Card {
    int rank;
    String color;
    public Card(int rank,String color)
    {
        this.rank=rank;
        this.color=color;
    }
    @Override
    public String toString() {
        String valueStr;
        if(rank==1){
            valueStr="A";
        }
        if(rank>10){
            if (rank==11)
                valueStr="J";
            if (rank==12)
                valueStr="Q";
            if (rank==13)
                valueStr="K";
        }
        return String.format("[%s %d]", color, rank);
    }
}
public class Test {
    public static final String[] colors = {"♠", "♥", "♣", "♦"};
    public static List<Card> creatCard()
    {
        List<Card> deck = new ArrayList<>(52);
        for(int i=0;i<4;i++){
            for(int j=0;j<13;++j){
                Card car=new Card(j+1,colors[i]);
                deck.add(car);
            }
        }
        return deck;
    }
    private static void swap(List<Card> deck, int i, int j) {
        Card tmp = deck.get(i);
        deck.set(i, deck.get(j));
        deck.set(j, tmp);
    }
    private static void shuffle(List<Card> deck) {
        Random random = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int pos = random.nextInt(i);
            swap(deck, i, pos);
        }
    }
    public static void main(String[] args){
        List<Card>deck = creatCard();
        System.out.println(deck);
        shuffle(deck);
        System.out.println(deck);
        List<List<Card>> hands = new ArrayList<>();
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        hands.add(new ArrayList<>());
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                hands.get(j).add(deck.remove(0));
            }
            //System.out.println(hands.get(0));
        }
        System.out.println(hands.get(0));
        System.out.println(hands.get(5));

    }
}

