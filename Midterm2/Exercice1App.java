package Midterm2;

import java.util.Scanner;

public class Exercice1App {

	public static void main(String[] args) {
		
	Exercice1 e1 = new Exercice1("Qi","Cao", 'A');
   Scanner input = new Scanner(System.in);
   boolean go = true;
   
   do{
         menu();
         int selection = input.nextInt();
         switch(selection){
            case 1:
            
             System.out.printf("First Name: %s\n\n",e1.getFirstName());
             break;
             
             case 2:
            
             System.out.printf("First Name: %s\n\n",e1.getLastName());
             break;
             
             case 3:
            
             System.out.printf("First Name: %c\n\n",e1.getGrade());
             break;
             
             case 4:
             go = false;
             System.out.printf("Good Bye\n\n");
             
             break;
             
             default:
             System.out.printf("Invalid selection\n\n");
             break;
             
         
         }
      
   }while(go);
		
      
	} 

	private static void menu() {
		System.out.printf("%s%n%s%n%s%n%s%nYour Choice: ",
				"1: To display first name",
				"2: To display last name",
				"3: To display grade",
				"4; To quit",
            "Your Choice:");
		
	}

}
