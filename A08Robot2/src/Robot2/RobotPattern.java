/*************************************************
* Author: Qi Cao
* 
* RobotPattern solved three challenges where a 
* robot walks specified patterns in ramdom-sized
* grids.
*
* Important: 
* The code still needs to work when you change
* the value of the variable n
*************************************************/
package Robot2;
import java.util.Random;
public class RobotPattern {
	public static void main(String[] args) { 
   

      // square nxn grid with the robot in the north east corner
      int  n = getRandom();
      Robot robot = new Robot(n, n, n-1, 0);      
      challenge1(robot); 
         
     n = getRandom();
      robot = new Robot(n, n, n-1, 0);    
      challenge2(robot);
      
      n = getRandom();
      robot = new Robot(n, n, n-1, 0);  
      challenge3(robot);
	}
     
   private static void challenge1(Robot robot) {      
      while(true){
      
         while(robot.check('W')){
            if(robot.check('W')){
               robot.go('W');
            
            }
         }
            if(robot.check('S')){
            
            robot.go('S');
            
            }
            else{
               break;
            }
            while(robot.check('E')){
               if(robot.check('E')){
               
                  robot.go('E');
               
               }
            }
            
            if(robot.check('S')){
               robot.go('S');
            }
            else{
               break;
            }
      }
      
      robot.say("done");
   
   }
   
   private static void challenge2(Robot robot) {      
         int n = 1;
         
            while(robot.check('S')){
               if(robot.check('S')){
                  robot.go('S');
                  n++;
               }//if
            }//while
            
         while(true){
            int i = 1;
            while(robot.check('W')&& i<n){
               if(robot.check('W')){
                  robot.go('W');
                  i++;
               }//IF
            }//while
            
          i = 1;
          while(robot.check('N')&& i<n){
               if(robot.check('N')){
                  robot.go('N');
                  i++;
               }//if
            
            }
            
            
            n--;
            //check center room
            if(n==0 || 1==n){
               break;
            }
            
            i=1;
            while(robot.check('E')&& i<n){
               if(robot.check('E')){
                  robot.go('E');
                  i++;
               }//if
            
            }//while
            
            i =1;
            while(robot.check('S') && i<n){
               if(robot.check('S')){
                  robot.go('S');
                  i++;
               }//if
            }//while
            
            n--;

         }//while
         
      robot.say("did it");
         
   }
   
   private static void challenge3(Robot robot) {   
      int n=1;
      while(robot.check('S')){
         if(robot.check('S')){
            robot.go('S');
            n++;
            
         }//if
      
      }//while
      
      while(true){
         int i = 1;
         while(robot.check('W')){
            if(robot.check('W')){
               robot.go('W');
               i++;
            }//IF
         }//while
         
         if(robot.check('N')){
            robot.go('N');
         }//if
         else{
            break;
         }//else
         
         n--;
         i=1;
         
         while(robot.check('E') && i<n){
            if(robot.check('E')){
               robot.go('E');
               i++;
            }
         }//while
         
         i=1;
         while(robot.check('N') && i < n){
            if(robot.check('N')){
               robot.go('N');
               i++;
            }
         }//WHILE
         
         if(robot.check('W')){
            robot.go('W');
           
         }//if
         else{
            break;
         }//else
         
         n--;
         i=1;
         while(robot.check('S') && i<n){
            if(robot.check('S')){
               robot.go('S');
               i++;
            }//if
         }//while
         
         
         
      }//while
      robot.say("finished");
   }
   
   
    //make random size room
   
   private static int getRandom(){
      
      Random random = new Random();
      int n = random.nextInt(4)+2;
      if(n==4){
         n = 6;
      }
      return n ;

   
   }

}
