import java.util.*;

public class LabPartyGuests{

   public static void main(String[] agrs){
   
   Scanner input = new Scanner(System.in);
   
   Random rand = new Random();
   
   ArrayList <String> guestList = new ArrayList();
   
   int numberOfGuest = 4;
   
   System.out.println("Please enter 4 guest");
   
   for(int i=1; i<=numberOfGuest;i++){
      
      System.out.print("Guest"+i+": ");
      guestList.add(input.nextLine());
   }
   
   System.out.println(guestList);
   
   int slacker= rand.nextInt(guestList.size());
   System.out.println(guestList.get(slacker)+" Can not come bcos of Drinking ");
   guestList.remove(slacker);
   
   System.out.println("Updated Guest list"+ guestList);  
   
   
   
   
   }

}