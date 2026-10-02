import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
         int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count : ");
        int n =sc.nextInt();
        while (n!=0) {
            n=n/10;
            count++;
        }
        System.out.println("the total number is : "+count);
    }
}
