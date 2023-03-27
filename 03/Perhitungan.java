import java.util.Scanner;

public class Perhitungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        double n = input.nextDouble();

        System.out.println("n + 1 = " + (n + 1));
        System.out.println("n - 2 = " + (n - 2));
        System.out.println("n / 3 = " + (n / 3));
        System.out.println("n * 4 = " + (n * 4));
        System.out.println("n % 5 = " + (n % 5));

        System.out.println("sqrt(n) = " + Math.sqrt(n));
        System.out.println("ln(n) = " + Math.log(n));
        System.out.println("log(n) = " + Math.log10(n));
        System.out.println("sin(n) [radian] = " + Math.sin(n));
        System.out.println("sin(n) [degree] = " + Math.sin(n / 180 * Math.PI));
        System.out.println("sin(n) [degree] = " + Math.sin(Math.toRadians(n)));
        System.out.println("n^PI = " + Math.pow(n, Math.PI));
        System.out.println("random number = " + Math.random());
    }
}
