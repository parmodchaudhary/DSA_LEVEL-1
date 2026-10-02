import java.util.Scanner;



public class PrintRangeInPrimeNnumber {
    public static void main(String[] args) {
      
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the range to print a range of prime number:");
        int start=sc.nextInt();
        int end = sc.nextInt();
        for(int i=start;i<=end;i++){
              boolean found=true;
        int element=i;
        if(element<2){
            found=false;
        }
       for (int j = 2; j <= Math.sqrt(element); j++) {
        if (element%j==0) {
            found=false;
            break;
        }
       }
       if (found==true) {
        System.out.println(element);
       
        
       
        }
    }
}
}