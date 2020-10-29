package LabLineDrawing;

public class LineDrawingApp{
public static void main(String[] args){
 //LineDrawing.drawTriangle();
   LineDrawing.drawHouse();
   Point p1 = new Point(.1,.2);
   Point p2 = new Point(.2,.3);
   Line l1 = new Line(p1,p2);
   System.out.println(l1);
   }
}