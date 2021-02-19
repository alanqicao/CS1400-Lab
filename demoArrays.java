import java.util.*;
public class demoArrays{
 public static void main(String[] args){
   
  // int [] box = new int[4];
  // int [] box = {3,5,6,8};
   int [] [] box = new int [4] [4];
//    int [] [] box = {
//                       {5,3,0,0},
//                       {7,0,0,0},
//                       {6,0,0,0},
//                       {7,0,0,0}
//                       
//                       };
   
   box [0] [0] = 5;
   box [1] [0] = 7;
   box [2] [0] = 6;
   box [3] [0] = 7;
   
   box [0][1] = 3;
   
   int num = 7;
   
   for(int i = 0; i<box.length; i++){
      for(int j = 0; i<box[0].length; j++){
      
         box[i][j] = num;
      }
      num+=2;
   }
   
   System.out.println(Arrays.deepToString(box));
   
   
 
 }
 }