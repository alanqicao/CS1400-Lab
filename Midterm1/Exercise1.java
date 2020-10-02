import java.util.Scanner;

public class Exercise1{

   public static void main(String[] args){
      
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please enter a number between 1 to 100");
       
       System.out.print("number: ");
       int n1 = input.nextInt();
        
       int n2 = n1*2;
        
       System.out.printf("2 x %d = %d\n",n1,n2);
       
       if(n1>=10 & n1<100){
         
         System.out.printf("%d is a 2-digit number", n1);
       
       } else if (n1>=100 & n1<=999){
         
         System.out.printf("%d is a 3-digit number", n1);
       }
   
   }

}