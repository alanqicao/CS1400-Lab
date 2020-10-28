/***************************************************
* Author: Your Name
*
* Assignment Volumes allows the user to select
* shapes from a menu. 
* Based on the user selection the corresponding
* volume is displayed.
****************************************************/

import java.util.Scanner;

public class VolumesMenu {
   public static void main(String[] args) {
               
       Scanner input = new Scanner(System.in);
       boolean go = true;
       
       
       do{
          menuPrompt();
          
          
          int selection = input.nextInt();
          
          switch(selection){
          
          case 0:
            go = false;
            System.out.println("goodbye");
            break;
            
            case 1:
            
            System.out.printf("Cuboid(2,4,6): volume = %.1f\n\n",Volumes.cuboid(2,4,6));
            
            break;
          
            case 2:
            
            System.out.printf("Cuboid(4): volume = %.1f%n\n",Volumes.cuboid(4));
            
            break;
            
            case 3:
            
             System.out.printf("Ellipsoid(2, 4, 6): volume = %.1f%n\n",Volumes.ellipsoid(2, 4, 6));
             break;
             
             case 4:
             System.out.printf("Ellipsoid(4): volume = %.1f%n\n",Volumes.ellipsoid(4));
             break;
             
             case 5:
               System.out.printf("Cylinder(3, 4): volume = %.1f%n\n",Volumes.cylinder(3, 4));
               break;

             case 6:
               System.out.printf("Cone(6, 5): volume = %.1f%n\n",Volumes.cone(6, 5));
               break;

              default:
               System.out.println("Invalid Input");
               break;
          }
       
       
       }while (go);
               
      /*System.out.printf("cuboid(2, 4, 6): volume = %.1f%n", 
            Volumes.cuboid(2,4,6));
      System.out.printf("cuboid(4): volume = %.1f%n", 
            Volumes.cuboid(4));   
                           
      System.out.printf("ellipsoid(2, 4, 6): volume = %.1f%n", 
            Volumes.ellipsoid(2,4,6));
      System.out.printf("ellipsoid(4): volume = %.1f%n", 
            Volumes.ellipsoid(4));
      System.out.printf("cylinder(3, 4): volume = %.1f%n", 
            Volumes.cylinder(3, 4));
      System.out.printf("cone(6, 5): volume = %.1f%n", 
            Volumes.cone(6, 5));
      */
   }  
   
   public static void menuPrompt() {
      System.out.printf("%-25s %s%n", 
            "1 .. cuboid(2, 4, 6)", "2 .. cuboid(4)");
      System.out.printf("%-25s %s%n", 
            "3 .. ellipsoid(2, 4, 6)", "4 .. ellipsoid(4)");
      System.out.printf("%-25s %s%n", 
            "5 .. cylinder(3,4)", "6 .. cone(6, 5)");
      System.out.println("0 .. exit");
      System.out.print("Your choice: ");
   }
}