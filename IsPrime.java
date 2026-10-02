import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a range: ");
        int range= sc.nextInt();
         int count=0;
        for (int i = 0; i < range; i++) {
            System.out.print("Enter a element to cheak a prime or not: ");
            int element=sc.nextInt();
            for (int j = 2; j <=Math.sqrt(element); j++) {
                if (element%j==0) {
                    count++;
                    break;
                }
                
            }
              if (count==0) {
            System.out.println("prime number ");
        } else {
            System.out.println("Not a prime ");
        }
        }
      
    }
}
