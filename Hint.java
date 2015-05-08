public class Hint extends Turn
{
   private final int PLAYERS = Hanabi.getPlayers();
   private final int NUMBERS = Hanabi.getNumbers();
   private final int COLORS = Hanabi.getColors();
   private final int HAND = Hanabi.getHand();
   private int thePlayer;
   private boolean numberHintRatherThanColorHint;
   private int theNumberOrTheColor;
   public Hint(int player, boolean numberHint, int numberOrColor) throws IllegalArgumentException
   {
      if(player < 0 || player >= PLAYERS)
         throw new IllegalArgumentException();
      if(numberOrColor < 0 || (numberHint && numberOrColor >= NUMBERS) || (!numberHint && numberOrColor >= COLORS))
         throw new IllegalArgumentException();
      thePlayer = player;
      numberHintRatherThanColorHint = numberHint;
      theNumberOrTheColor = numberOrColor;
   }
}