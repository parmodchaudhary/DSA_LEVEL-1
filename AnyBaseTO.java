public class AnyBaseTO {
   

    // Any Base → Decimal
    public static int anyBaseToDecimal(int n, int base) {
        int decimal = 0;
        int power = 1;

        while (n > 0) {
            int rem = n % 10;
            decimal = decimal + rem * power;
            power = power * base;
            n = n / 10;
        }

        return decimal;
    }

    // Decimal → Any Base
    public static int decimalToAnyBase(int n, int base) {
        int converted = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % base;
            converted = converted + rem * place;
            place = place * 10;
            n = n / base;
        }

        return converted;
    }

    public static void main(String[] args) {

        int n = 1101;
        int base1 = 2;
        int base2 = 8;

        int decimal = anyBaseToDecimal(n, base1);

        int result = decimalToAnyBase(decimal, base2);

        System.out.println(result);
    }
}

