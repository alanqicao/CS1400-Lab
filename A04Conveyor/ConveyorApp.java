public class ConveyorApp {

   public static void main(String[] args){
   
      Conveyor flatBeltConveyor = new Conveyor("flat belt",0.9);
      Conveyor rollerConveyor = new Conveyor("roller", -0.5);
      
      
       System.out.printf("%nConveyor1: %s conveyor with a speed of %.1f m/s",flatBeltConveyor.getType(),flatBeltConveyor.getSpeed());
       System.out.printf("%nTime to transport an item 50 m: %.1f s\n",flatBeltConveyor.timeToTransport(flatBeltConveyor.getSpeed(),50));
     
      
    
      
       System.out.printf("%nConveyor2: %s conveyor with a speed of %.1f m/s",rollerConveyor.getType(),rollerConveyor.getSpeed());
       System.out.printf("%nTime to transport an item 50 m: %.1f s\n%n",rollerConveyor.timeToTransport(rollerConveyor.getSpeed(),50)); 
      
      
      flatBeltConveyor.roll();
      
     
      flatBeltConveyor.setSpeed(-3);
      
      rollerConveyor.setSpeed(0.4);
      
       System.out.printf("%nConveyor1: %s conveyor with a speed of %.1f m/s",flatBeltConveyor.getType(),flatBeltConveyor.getSpeed());
       System.out.printf("%nTime to transport an item 50 m: %.1f s\n",flatBeltConveyor.timeToTransport(flatBeltConveyor.getSpeed(),50));
      
      
       System.out.printf("%nConveyor2: %s conveyor with a speed of %.1f m/s",rollerConveyor.getType(),rollerConveyor.getSpeed());
       System.out.printf("%nTime to transport an item 50 m: %.1f s\n",rollerConveyor.timeToTransport(rollerConveyor.getSpeed(),50));
      
      
      

   
   
   }//main

}//class