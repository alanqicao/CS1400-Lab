public class Conveyor{
   
   
   // fields
   
  private String type;
  private double speed = 0; // m/s (meters per second)
  
  //constructors
  
  public Conveyor(String t, double s){
   
   type = t;
   
   if(s>0){
    speed = s ;
   }  
  
  }
  
  //methods
  
  public String getType(){
  
   return type;
  
  }//getType
  
  public double getSpeed(){
  
   return speed;
   
  }//getSpeed
  
  public void setSpeed(double s){
  
   if(s >0){
       
         speed = s;
       
   }//if
  
  }//setSpeed
  
   public void roll(){
      
         System.out.println(".. updating speed");
      
      }
  
  
  public double timeToTransport(double s, double distance){
  
    
      
      double result = distance/s;
      
      return result;
      
      
      
  
  }//timeTT



}//class