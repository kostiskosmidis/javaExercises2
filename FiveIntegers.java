public class FiveIntegers {
    public static void main(String[] args) {
      
        int sum = 0;
        int array[] = new int[]{10, 11, 88, 2,120};
        int minValue =array[0];
        int maxValue=array[0];
        for(int i= 0;i<=4;i++){
        sum = sum + array[i];
        if(array[i] > maxValue){maxValue = array[i];}
        if(array[i] < minValue){minValue = array[i];}
         }
        double average = sum / 5;
        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Maximum Value is: "+ maxValue);
        System.out.println("Minimum Value is: "+ minValue);
        System.out.println("Average of the array is: " + average);
        
        for(int i = 0;i<=4;i++){
            System.out.println(array[i]);
        }
        for(int i = 4;i>=0;i--){
            System.out.println(array[i]);
        }
    }