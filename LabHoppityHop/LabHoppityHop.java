public class LabHoppityHop{


   public static void main(String [] args){
   
      for(int i=1; i <=25;i++ ){
         
         if(i%3== 0 && i%5 ==0 ){
            
            System.out.println("Hopity Hop");
            
         }//if
         
          else if(i%3 ==0){
            
            System.out.println("Hoppity");
            
         }//else if
         
         else if(i %5 == 0){
            System.out.println("Hop");
                 
         }//else if
         
         else{
            System.out.println(i);
         }//else
         
      }//for
   
   }//main

}//class