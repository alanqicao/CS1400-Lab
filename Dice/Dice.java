import java.util.*;

public class Dice{

 public static void main(String[] args){
 
   Random rand = new Random();  
   int dice1;
   int dice2;
   int diceSumCount[] = new int[11];
   double percentage = 0.0;
   int sum;
   
  for (int i=0; i<36000;i++){
   
      dice1 = rand.nextInt(6)+1;
      dice2 = rand.nextInt(6)+1;
      
      sum = dice1+dice2;
      
     diceSumCount[sum-2]++; //frequency
     
   } 
   
   System.out.println("Sum\tFrequency\tPercentage");

   for (int i=2; i<=12; i++){
   
      percentage = (diceSumCount[i-2]*100/(double)36000);
      
        System.out.printf("%3d%12d%12.1f%%\n",i,diceSumCount[i-2],percentage); 
   
   }
   
         
}

}