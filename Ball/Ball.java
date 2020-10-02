public class Ball{
   //fields
   private double size;
       //constructors
        public Ball(){
   }
   
      public Ball(double s){
         size = s;
      }
   
       //methods
       public double getSize(){
      return size;
   }
   
      public void setSize(double s){
        if(s >= 0){
         size = s;
        
        }
      
      }
      
      public void roll(){
      
         System.out.println("rolling...");
      
      }
      
      public void bounce(int numberOfBounces){
      
         if(numberOfBounces == 1){
         
            System.out.printf("Bouncing %d time",numberOfBounces);
         
         } else if(numberOfBounces > 1){
            
            System.out.printf("Bouncing %d times",numberOfBounces);
         }else {
         
            System.out.println("Check your math and try again");
         
         }
         
      }

}