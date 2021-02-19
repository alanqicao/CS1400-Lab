import java.util.*;

public class Matrix{
   private int m;
   private int n;
   private double [] [] data;
   
   public Matrix(int m,int n){
   this.m=m;
   this.n=n;
   data = new double[m][n];
   Random rand = new Random();
   
 for(int i = 0; i<m;i++){
   for(int j = 0; j<n;j++){
      data[i][j]=rand.nextFloat();
   }
 }
   
   }
   
   public Matrix(double[][] data){
   
   this.m = data.length;
   this.n = data[0].length;
   this.data = new double[m][n];
   for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
         data[i][j]=data[i][j];
      }
   }
   
   }
   
   public Matrix(Matrix matrix){
      this.m=matrix.m;
      this.n=matrix.n;
      this.data = new double[m][n];
      for(int i=0; i<m;i++){
         for(int j=0; j<n;j++){
            this.data[i][j]=matrix.data[i][j];
            
         }
      }
      
   }
   
   
  public Matrix plus(Matrix other){
   Matrix result = new Matrix(m,n);
      for(int i = 0;i<m;i++){
         for(int j=0; j<n;j++){
            result.data[i][j]=data[i][j]+other.data[i][j];
         }
      }
   return result;
  }
  
  public Matrix minus(Matrix other){
  
   Matrix result = new Matrix(m,n);
   for(int i=0;i<m;i++){
      for(int j=0;j<n;j++){
         result.data[i][j]=data[i][j]-other.data[i][j];
      }
   }
  return result;
   
  }
  
  public void print(){
  
   for(int i=0;i<m;i++){
      for(int j=0;j<m;j++){
         System.out.printf("%6.2f",data[i][j]);
      }
      System.out.println();
   }
  
  }
}