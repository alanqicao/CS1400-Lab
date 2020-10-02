public class BallApp{
   
   public static void main(String [] args){
  
      Ball myBall = new Ball();
   
         myBall.setSize(5.0);
         
         System.out.printf("Ball with size %.1f%n", myBall.getSize());
         myBall.roll();
         myBall.bounce(14);
         myBall.setSize(myBall.getSize() +2);
         System.out.printf("%nBall size second time %.1f%n", myBall.getSize());
   }
}