import java.util.ArrayList;
import java.util.Arrays;

public class LabArrays {

   public static void main(String[] args){
   
      int [] boxes = new int[4];
      
      ArrayList<String> box = new ArrayList();
      
      box.add("7");
      String num = "3";
      box.add(num);
      box.add(num);
      box.add(num);
      box.add(num);
      box.add(num);
      box.add(num);
      box.add(num);
      box.remove(1);
      box.add(7,"Jan");
      System.out.println(box);
      box.clear();
      System.out.println(box);
      
      //Multi dimensional Array
      
      int[] [] users = new int [4] [4] ;
      
      users[0] [0] = 6;
      users[3] [3] = 9;
      
      //System.out.println(Arrays.toString(users[1]));  
      for(int[] el:users){
      System.out.println(Arrays.toString(el));
      }   
      
      for(int i =0; i<users[0].length;i++){
         System.out.println(Arrays.toString(users[i]));
      
      }
      
      
   }


}