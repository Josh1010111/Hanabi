public class Hanabi
{
   private static final int PLAYERS = 4;
   private static final int LIVES = 4;
   private static int livesLeft = LIVES;
   private static final int CLUES = 8;
   private static int cluesLeft = CLUES;
   private static final int[] COPIES = {3, 2, 2, 2, 1};
   private static final int NUMBERS = COPIES.length;
   private static final int COLORS = 5;
   private static final int HAND = 5;
   public static void main(String[] args)
   {
      
   }
   public static int getPlayers()
   {
      return PLAYERS;
   }
   public static int getLives()
   {
      return LIVES;
   }
   public static int getLivesLeft()
   {
      return livesLeft;
   }
   public static int getClues()
   {
      return CLUES;
   }
   public static int getCluesLeft()
   {
      return cluesLeft;
   }
   public static  int[] getCopies()
   {
      return COPIES;
   }
   public static int getNumbers()
   {
      return NUMBERS;
   }
   public static int getColors()
   {
      return COLORS;
   }
   public static int getHand()
   {
      return HAND;
   }
}