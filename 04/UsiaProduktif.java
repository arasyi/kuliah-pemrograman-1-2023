import java.util.Scanner;

public class UsiaProduktif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia anda: ");
        int usia = input.nextInt();

        if (usia >= 15) {
            if (usia <= 64) {
                System.out.println("Anda sedang dalam usia produktif");
            } else {
                System.out.println("Anda tidak dalam usia produktif");
            }
        } else {
            System.out.println("Anda tidak dalam usia produktif");
        }

        if (
            // usia >= 15 && usia <= 64
            15 <= usia && usia <= 64
        ) {
            System.out.println("Anda sedang dalam usia produktif");
        } else {
            System.out.println("Anda tidak dalam usia produktif");
        }
        
        if (usia < 15 || usia > 64) {
            System.out.println("Anda tidak dalam usia produktif");
        } else {
            System.out.println("Anda sedang dalam usia produktif");
        }

        if (!(usia < 15 || usia > 64)) {
            System.out.println("Anda sedang dalam usia produktif");
        } else {
            System.out.println("Anda tidak dalam usia produktif");
        }

        if (usia < 15) {
            System.out.println("Anda belum dalam usia produktif");
        } else if (usia > 64) {
            System.out.println("Anda sudah melewati usia produktif");
        } else {
            System.out.println("Anda sedang dalam usia produktif");
        }
    }
}
