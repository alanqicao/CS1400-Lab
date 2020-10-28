/********************************************** 
* Author: Qi Cao
*
* Assignment Volumes calculates the volumes
* of various shapes.
***********************************************/

public class Volumes {

   public static double cuboid(double sideA, double sideB, double sideC) {
   
      double volume = sideA*sideB*sideC ;
      return volume; // TODO
   }
   
   public static double cuboid(double side) {
   
     double volume= cuboid(side,side,side);
      
      return volume; // TODO
   }
   
   public static double ellipsoid(double sideA, double sideB, double sideC){
   
      double volume = (4.0/3.0)*Math.PI*sideA*sideB*sideC;
      
      return volume;
   }
   
   public static double ellipsoid(double side){
     double volume = ellipsoid(side,side,side);
      
      return volume;
   }
   
   public static double cylinder(double radius, double height){
      double volume = Math.PI*Math.pow(radius,2)*height;
      
      return volume;
   }
   public static double cone(double diameter, double side){
   
      double volume = 1/3*(Math.PI*Math.pow(diameter/2,2)*side);
      
      return volume;
   }
}