import java.util.Scanner;

public class Usia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia anda: ");
        int usia = input.nextInt();

        if (usia >= 17) {
            System.out.println("Anda sudah boleh memiliki KTP");
        } else {
            System.out.println("Anda belum boleh memiliki KTP");
        }

        if (usia < 20) {
            System.out.println("Anda masih muda");
        }

        if (usia > 25) {
            System.out.println("Anda seharusnya sudah lulus kuliah");
        }

        if (usia > 60) {
            System.out.println("Anda tua banget");
        } else if (usia > 50) {
            System.out.println("Anda sudah tua tapi belum tua-tua amat");
        }
    }
}