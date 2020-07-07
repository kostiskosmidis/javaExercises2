import java.util.Scanner;
public class WhatAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();
        
        if(age < 16)
        {System.out.println("You cannot drive");}
        else if(age>=16 && age<=17)
        {System.out.println("You can drive but not vote");}
        else if(age>=18 && age<=21){System.out.println("You can vote but not drink");}
        else {System.out.println("You can do anything");}
       
    }
    
}
