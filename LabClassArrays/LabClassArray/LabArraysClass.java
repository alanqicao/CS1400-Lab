package LabClassArray;
import java.util.Arrays;
import java.util.ArrayList;
public class LabArraysClass
{
   public static void main(String[] args){
      int [] iArray1 = {6,12,3,9,};
      int [] iArray2 = new int[5];
       
      //fill iArray2 with 7
      
      Arrays.fill(iArray2,7);
     
      //print iArray1 and iArray2 (toString)
      System.out.println("iArray1: "+Arrays.toString(iArray1));
      System.out.println("iArray2: " + Arrays.toString(iArray2));
      
      // sear for number 9 in iArraty1 and print the value 
      System.out.println("Search for 9: "+Arrays.binarySearch(iArray1,9));
      
      //sort iArray1 and print it
      
      Arrays.sort(iArray1);
      System.out.println("Search for 9 after sort: "+Arrays.binarySearch(iArray1,9));
      
      // create iArray3 and assign it the first 3
      
      int[] iArray3 = Arrays.copyOf(iArray1,3);
     
      System.out.println(Arrays.toString(iArray3));
      
      // test equality of new int[] {3,6,9}
      
      System.out.println(Arrays.equals(iArray3,new int[] {3,6,11}));
      
      
      
      
      
      
      
      ArrayList<Integer> myArray = new ArrayList<>();
      
      myArray.add(6);
      myArray.add(0);
      myArray.add(1);
      myArray.set(2,10);
      
      System.out.println(myArray.get(2));
      
      
      for(int el: iArray1){
      
       System.out.println(el);
       
      
      }
      System.out.println(iArray1[3]);
      
      
      
      
   }
}