public class LabChar{
   public static void main(String [] args){
      char dash = '-';
      System.out.printf("Dash: %c%n", dash);
      char a = 'a';
      System.out.printf("a: %c%n", a);
      char letter = a;
      System.out.printf("Letter: %c%n", letter);
      
      char b = ++letter;
      
      System.out.printf("b: %c%n",b);
      char c = ++letter;
      System.out.printf("c: %c%n",c);
      letter +=2;
      char e = letter;
      System.out.printf("e: %c%n",e);
      char copyRight ='\u00A9';
      System.out.printf("Symbol: %c Number: %d Hex:%x%n",copyRight,(int)copyRight,(int)copyRight);
      char yen = '\u00A5';
      System.out.printf("Symbol: %c Number: %d Hex:%x%n",yen,(int)yen,(int)yen);
      
      
   }
}