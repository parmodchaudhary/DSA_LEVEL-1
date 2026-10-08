import java.util.Scanner;

public class ArraySpan {
public static void main(String[] args) {
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    Scanner sc= new Scanner(System.in);
    int[] arr =new int[5];
    for (int i = 0; i < 5; i++) {
        arr[i]=sc.nextInt();
    }
    for (int i = 0; i < 5; i++) {
       if (arr[i]>max) {
        max=arr[i];
       }
       if (arr[i]<min) {
        min=arr[i];
       }
      
    }
     int span=max-min;
     System.out.println( "the span in the array is :"+span);
}
    
}