public class Card
{
   private int cardNumber = 0;
   private int cardColor = 0;
   public Card(int number, int color)
   {
      cardNumber = number;
      cardColor = color;
   }
   private int getNumber()
   {
      return cardNumber;
   }
   private int getColor()
   {
      return cardColor;
   }
}