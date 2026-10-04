public class Decimal {
public static int decimalToOctal(int n, int base, int octal) {

    while (n > 0) {
        int rem = n % base;
        octal = (octal * 10) + rem;
        n = n / base;
    }

    return octal;
}

public static void main(String[] args) {

    int n = 63;
    int base = 8;
    int octal = 0;

    int r = decimalToOctal(n, base, octal);

    System.out.println(r);
}

}

