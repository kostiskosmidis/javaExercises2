import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String grade;
       System.out.println("Please enter a grade");
       grade = sc.next();
       
       switch(grade)
		{
		  	case "A":
                            System.out.println("\n Perfect");
                            break;
		  	case "B":
                            System.out.println("\n Good");
                            break;
			case "C": 
                            System.out.println("\n Pass");
                            break;
			case "D":		  	
			     System.out.println("\n Fail");
			  	break;
      default:
          System.out.println("\n The rest");
			
			}
    
}}
