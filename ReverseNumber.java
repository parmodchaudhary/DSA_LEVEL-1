import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number =sc.nextInt();
       int  count=0;
        int sum=0;
       while (number!=0) {
        count++;
        number=number%10;
        sum=sum+(count*(10^(number-1)));
        number=number/10;


       }
       System.out.println(sum);

    }
}
