public class LabMagicSquare{

   public static void main(String[] args){
         
         int[] [] square = {
               {8,11,14,9},
               {13,2,7,12},
               {3,16,9,6},
               {10,5,4,15}
         };
         
         System.out.printf("The square %s amagic square. %n",
                  (isMagicSquare(square) ? "is":"is not"));
         
         }
         
      public static boolean isMagicSquare(int [] [] square){
         boolean result = true;
         //TODO
         int [] magicNumber = new int[8];
         int rows = 0;
         int cols = 0;
         
         for(int i =0; i<square.length;i++){
            for(int j =0; j<square[0].length;j++){
               rows += square[i][j];
               cols +=square[j][i];
            }
            magicNumber[i] = rows;
            magicNumber[i+4] = cols;
            rows = 0;
            cols = 0;
         }
         
        for(int el: magicNumber){
        
            if(magicNumber[0]!=el){
               result = false;
            }
        }
         
         
      return result;
      
      
   }
}