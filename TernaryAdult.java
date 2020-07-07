import java.util.Scanner;

public class TernaryAdult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Please input your age: ");
        age = sc.nextInt();
        String result = (age >=18)? "He is an adult" : "He is a child";
        System.out.println(result);
    }
    
}