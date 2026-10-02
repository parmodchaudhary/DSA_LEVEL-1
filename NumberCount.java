import java.util.Scanner;

public class NumberCount {
    public static void main(String[] args) {
         int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count : ");
        int n =sc.nextInt();
        int temp=n;
        while (n!=0) {
            temp=temp/10;
            count++;
        }
        
        while (n!=0) {
            n= (int)n/(10^(count-1));
            System.out.println(n);
        }
    }
}
