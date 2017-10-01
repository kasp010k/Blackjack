public class Main {

    public static void main(String[] args) {
        System.out.println("Blackjack!");

        public enum Rank {
            ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

            Rank Highcard, Facecard, Card1, Card2;

            Highcard = Rank.ACE;
            Facecard = Rank.QUEEN;
            Card1 = Rank.THREE;
            Card2 = Rank.NINE;

        System.out.println("A blackjack hand:" + Highcard " and " + Facecard);

            int Card1Val = 3;
            int Card2Val = 9;

        System.out.println("A two card hand:" + Card1 " and " + Card2);
        System.out.println("Hand value" + Card1Val " and " + Card2Val);


        }
    }
}