 import java.util.Scanner;
    public class ThreeNumbers 
   {
       public static void main(String[] args)
      {
      
       Scanner input = new Scanner(System.in);
       System.out.println("Enter three integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        
        System.out.println("Enter 3 numbers separated by a space: "+n1+" "+n2+" "+n3);
        
        if(n1>n2)
        {
          int temp = n1;
          n1 = n2;
          n2 = temp;        
        } 
        
        else if (n2>n3)
        {
          int temp = n2;
          n2 = n3;
          n3 = temp;
        }
        
         else if(n1>n2)
        {
         int temp = n1;
              n1 = n2;
              n2 = temp;
        }
        else
        {
        System.out.print("Error!!!!!! Same number can not sort ");
        }
        
        System.out.print("Sorted numbers: "+n1+" "+n2+" "+n3);
      
       }//main
    }//class
    
   