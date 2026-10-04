public class binarytodec {
    public class BinaryToDecimal {

    public static int binaryToDecimal(int n) {

        int decimal = 0;
        int power = 1;

        while (n > 0) {

            int rem = n % 10;

            decimal = decimal + rem * power;

            power = power * 2;

            n = n / 10;
        }

        return decimal;
    }

    public static void main(String[] args) {

        int n = 1101;

        int result = binaryToDecimal(n);

        System.out.println(result);
    }
}
}
