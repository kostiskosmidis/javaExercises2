import java.util.Scanner;
public class WorkDay {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String day;
       System.out.println("Please enter a day of the week");
       day = sc.next();
       switch(day)
		{
		  	case "Monday":
		  	case "Tuesday":
			case "Wednesday": 	
			case "Thursday":
			case "Friday":			  	
				System.out.println("\n Go to work");
			  	break;
			
			case "Saturday":	
			case "Sunday":			    	
				System.out.println("\n Relaxing");  
				break;}
    }
    
}