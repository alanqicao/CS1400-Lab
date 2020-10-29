package LabLineDrawing;

public class Line{

   private Point start;
   
   private Point end;
   
   public Line(Point start, Point end){
   
      this.start = start;
      this.end = end;
    
   }
   
   public String toString(){
      return start+"->"+end;
   }
   
}