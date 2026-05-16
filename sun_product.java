import java.util.Arrays;
import java.util.Scanner;
public class sun_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       

        
    
     

        
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr=new int[size];

        System.out.println("now enter " + size + " elements in the array: ");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
       
        System.out.println("this is the array: " + Arrays.toString(arr));
         sumOfArray(arr);
        
        

    

    }

    public static int sumOfArray(int[] arr){
        int sum=0;
        int product=1;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            product*=arr[i];
            
        }
        System.out.println("sum: " + sum + " and product: " + product);
        return sum;
    }
    
}
