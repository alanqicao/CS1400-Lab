public class MartianApp{

public static void main(String[] args){
      Martian m1= new Martian();
      System.out.println(m1);
     // test();
     /*
      Martian [] invaders = m1.invade(13);
      
      for(Martian el: invaders){
         
         System.out.println(el);
      
      } */
      
      
      Martian [] unknowinvaders = m1.invade();
      
      for(Martian el: unknowinvaders){
         
         el.doSometing();
      }
   

}

private static void test(){
   
     
         
         Martian[] martians = {new Martian(),new Martian(),new Martian()};
         
       for(Martian el: martians){
             System.out.println(el);
            el.doSometing();
          
        }
         
//    for(int i = 0; i<martians.length;i++){
//         
//             martians[i].doSomething();
//         }

}


}