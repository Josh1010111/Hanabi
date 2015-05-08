public class Play extends Turn
{
   private final int HAND = Hanabi.getHand();
   private int theCard;
   public Play(int card) throws IllegalArgumentException
   {
      if(card < 0 || card >= HAND)
         throw new IllegalArgumentException();
      theCard = card;
   }
}