public class Triangle{

   // fields
   
   private double side1;
   private double side2;
   private double side3;

 //constructors
 public Triangle(double side1, double side2, double side3){
 
   if(isTriangle(side1,side2,side3)){
      
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
   
   }else{
   
   this.side1 = 1.0;
   this.side2 =1.0;
   this.side3 =1.0;
   
   }
 
 }
 
   //methods
   public double getSide1(){
      return side1;
   }
   
   public double getSide2(){
      return side2;
   }
   
   public double getSide3(){
      return side3;
   }
   
   
   private boolean isTriangle(double side1,double side2, double side3){
   
      if((side1+side2>side3)&&(side1+side3>side2)&&(side2+side3>side1)){
         
        return true;
      
      }else {
      
         return false;
      }
      
   }
   
   
   public boolean isEquilateral(){
   
         if(side1 == side2 && side2 == side3){
            return true;
         } else {
            return false;
         }
      
      
   }
   
   
   public boolean isRight(){
   
      double square1 = side1*side1;
      double square2 =side2*side2;
      double square3 = side3*side3;
      
      if((square1==square2+square3)||(square2==square1+square3)||(square3==square1+square2)){
      
         return true;
      
      }else{
      
      return false;
      }
   }
   
}