import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        boolean found=false;
       
        int[] arr = new int[5];
        System.out.print("please,enter the number: ");
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target number: ");
         int target=sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (arr[i]==target) {
                found=true;
                break;
            }
        }
        if (found) {
            System.out.println("the element is found");
        } else {
            System.out.println("element is not found");
        }
    }
}
