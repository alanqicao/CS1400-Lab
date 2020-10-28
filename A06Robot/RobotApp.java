/**********************************************
* Author: Qi Cao
* 
* RobotApp solved three challenges where a 
* robot needs to figure out the number
* of rooms in a given grid.
*
* Important: 
* The code still needs to work when you change
* the values of the variables n, h, and w.
***********************************************/

public class RobotApp {
	public static void main(String[] args) { 
       
      int n = 5;
      int h = 4;
      int w = 6;
      
      // square nxn grid with the robot in the north-east corner
      Robot robot = new Robot(n, n, n-1, 0);        
      challenge1(robot);    
      
      // rectangular grid with width w and height h
      // robot in the north-east corner
      robot = new Robot(w, h, w-1, 0);  
      challenge2(robot);
      
      // square nxn grid 
      // robot's starting position: 1 over, 2 down 
      robot = new Robot(n, n, 1, 2);   
      challenge3(robot);      
      
      // rectangular grid with width w and height h
      // robot's starting position: 3 over, 1 down 
      robot = new Robot(w, h, 3, 1);   
      challenge4(robot);
	}
     
   private static void challenge1(Robot robot) {      
      // TODO: Solve challenge 1 and update the text below
      int room1X=1;
      while(robot.check('S')){
         if(robot.check('S')){
            robot.go('S');
            room1X++;
         }
      
      }
      robot.say(room1X*room1X+ " rooms "+(room1X-1) +"moves");		
   }
   
   private static void challenge2(Robot robot) {      
      // TODO: Solve challenge 2 and update text below
      int room2X=1;
      while(robot.check('S')){
         if(robot.check('S')){
            robot.go('S');
            room2X++;   
            
         }
      }
      
      int room2Y = 1;
      
         while(robot.check('W')){
         
            if(robot.check('W')){
                  robot.go('W');
                  
                  room2Y++;
            }
         }
   
      robot.say(room2X*room2Y + " rooms"+((room2X-1)+(room2Y-1))+ "moves");   
   }
   
   private static void challenge3(Robot robot) {   
      // TODO: Solve challenge 3 and update text below
      
      int room3CheckV = 1;
      
            while(robot.check('S')){
               if(robot.check('S')){
                  robot.go('S');
                  room3CheckV++;
               }}
               
               int room3X = 1;
               while(robot.check('N')){
                  
                     if(robot.check('N')){
                        robot.go('N');
                        room3X++;
                     }
               }
                    
      robot.say(room3X *room3X + " rooms"+ ((room3CheckV-1)+(room3X-1))+ "moves");   
   }
      
   private static void challenge4(Robot robot) {   
         int room4CheckV = 1;
      
            while(robot.check('S')){
               if(robot.check('S')){
                  robot.go('S');
                  room4CheckV++;
               }}
               
               int room4X = 1;
               while(robot.check('N')){
                  
                     if(robot.check('N')){
                        robot.go('N');
                        room4X++;
                     }
               }
               int room4CheckH = 1;
               while(robot.check('W')){
                  if(robot.check('W')){
                     robot.go('W');
                     room4CheckH++;
                  }
               
               }
               
               int room4Y= 1;
               
               while(robot.check('E')){
                  if(robot.check('E')){
                     robot.go('E');
                     room4Y++;
                     
                  }
               }
               
            
   
      robot.say(room4X *room4Y + " rooms"+ (((room4CheckV-1)+(room4X))+((room4CheckH-1)+(room4Y)))+ "moves");   
   }
   
  }
