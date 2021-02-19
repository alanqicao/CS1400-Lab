/* 
   Class: 1400
   Student: Qi Cao
   Fianl Exam code
*/



public class FinalExam{
  private int rows;
  private int columns;
  
  
  public FinalExam(int row, int column){
  
   this.rows = row;
   this.columns = column;
  
  }
  
  public int [][] createArray(){
   
   int dataArray [][] = new int[this.rows][this.columns];
   int dataNumber = 8;
     for(int i = 0; i<dataArray.length;i++){
       for(int j = 0; j<dataArray[0].length;j++){
        dataArray[i][j] = dataNumber;
        dataNumber += 3;
          }
       }

   return dataArray;
   
  }
  
  public int calculateRows(int [][] sumArray){
  
   int total = 0;
   
   for(int i = 0; i<sumArray.length;i++){
   
     for(int j = 0; j<sumArray[0].length;j++){
     
         total += sumArray[i][j];     
   }
}
  
   return total;
  
  }
  
   

}