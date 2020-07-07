public class GFG {
    public static void main(String[] args) {
      
        int N = 30;
        int sum =0;
        for (int num = 0; num < N; num++) 
        {      
          
            if (num % 4 == 0 && num % 5 == 0){ 
                System.out.print(num + " ");
                sum =  sum +1;}
        } 
        
        System.out.println("They are" + sum);
        System.out.println("They are not" + (N - sum));
    } 
    }