import java.util.Random;

public class Martian{
   
   private String name;
   static int count;
   private static Random rand = new Random();
   
   public Martian(){
      name = getRandomName();   
      count++;
   }   
   
   private String getRandomName(){
   
      char randomChar = (char)(rand.nextInt(26)+65);
      int randomNum = rand.nextInt(89)+10;
      
      return String.format("%s%s",randomChar,randomNum);
      
      
   }
   
   public void doSometing(){
      
      if(count<5){
         System.out.println(name+"is hiding");
      }else{
      
         System.out.println("ATTACK!");
      
      }
      
   }
   
   
   public static Martian[] invade(int num){
      
      Martian [] temp = new Martian[num];
      
 for(int i = 0; i<temp.length;i++){
     
        temp[i] = new Martian();
     } 
      
  
      
      return temp;
      
   }
   
   
   
     public static Martian[] invade(){
     
      int num = rand.nextInt(8)+2;
      
      Martian [] temp = new Martian[num];
     
    
      
   for(int i = 0; i<temp.length;i++){
     
        temp[i] = new Martian();
     } 
      
  
      
      return temp;
      
   }
   
   
   
   
   
  public String toString(){
  
         return name + "\\" + count;
   
  }

}