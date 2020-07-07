import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String planet;
        double weight;
        System.out.println("Please enter your weight: ");
        weight = sc.nextInt();
        System.out.println("Please give a planet name: ");
        planet = sc.next();
        
        if ("Venus".equals(planet)){ double weightVenus = 0.78 * weight;
            System.out.println("Your weight in Venus is: " + weightVenus);
        
        }
        else if ("Mars".equals(planet)){
            double weightMars = 0.39 * weight;
            System.out.println("Your weight in Mars is: "+ weightMars);}
        else if ("Jupiter".equals(planet)){
            double weightJupiter = 2.65 * weight;
            System.out.println("Your weight in Jupiter is: "+ weightJupiter);}
        else if ("Saturn".equals(planet)){
            double weightSaturn = 1.17 * weight;
            System.out.println("Your weight in Saturn is: "+ weightSaturn);}
        else if ("Uranus".equals(planet)){
            double weightUranus = 1.05 * weight;
            System.out.println("Your weight in Uranus is: "+ weightUranus);}
        else if ("Neptune".equals(planet)){
            double weightNeptune = 1.23 * weight;
            System.out.println("Your weight in Neptune is: "+ weightNeptune);}
        }
    }