import java.util.Scanner;
public class SchoolClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        if(age >=5 && age<=12 ){
            System.out.println("You go to elementary");
        
        }
        else if(age>=13 && age<=15){
            System.out.println("You go to middle school");
        
        }
        else if(age>=16 && age<=18){
                  
            System.out.println("You go to high school");
        
        }
    }
    
}