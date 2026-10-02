import java.util.Scanner;

public class LcmAndHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp1=a;
        int temp=b;
        while (a%b==0) {
            int rem =a%b;
           a=b;
            b=rem;
            
        }
        int gcd=b;
        System.out.println("gcd is "+gcd);
        int lcm= (a*b)/gcd;
        System.out.println(" Lcm is "+lcm);

    }
}