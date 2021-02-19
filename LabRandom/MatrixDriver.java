public class MatrixDriver {
  
   public static void main(String args[])
   {
       // create 2 metrices
       Matrix m1 = new Matrix(2, 3);
       Matrix m2 = new Matrix(2, 3);
      
       System.out.println("Matrix m1: ");
       System.out.println("---------");
       m1.print();
      
       System.out.println();
       System.out.println("Matrix m2: ");
       System.out.println("---------");
       m2.print();
       System.out.println();
       Matrix res1 = m1.plus(m2);
       System.out.println("Adding the above Matrix will get.");
       System.out.println("--------------------------------");
       res1.print();
       System.out.println();
       Matrix res2 = m1.minus(m2);
       System.out.println("Subtracting the Matrix (m1 - m2).");
       System.out.println("--------------------------------");
       res2.print();
       System.out.println();
      
   }

}