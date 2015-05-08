public class Discard extends Turn
{
   private final int HAND = Hanabi.getHand();
   private int theCard;
   public Discard(int card) throws IllegalArgumentException
   {
      if(card < 0 || card >= HAND)
         throw new IllegalArgumentException();
      theCard = card;
   }
}