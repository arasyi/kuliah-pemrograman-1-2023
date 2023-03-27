import java.util.Scanner;

public class NamaDanUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        // String nama = input.next(); // satu kata
        String nama = input.nextLine(); // satu baris

        System.out.print("Masukkan usia anda: ");
        // int usia = Integer.parseInt(input.nextLine());
        int usia = input.nextInt();

        input.nextLine(); // Scanner bug?

        System.out.print("Masukkan nama teman anda: ");
        String namaTeman = input.nextLine();

        System.out.print("Masukkan usia teman anda: ");
        int usiaTeman = input.nextInt();

        System.out.println("Halo " + nama + "!");
        System.out.println("Usiamu sekarang adalah " + usia + " tahun.");
        System.out.println("Lima tahun lagi, kamu akan berusia " + (usia + 5) + " tahun.");
        System.out.println("Selisih usiamu dan " + namaTeman + " adalah " + Math.abs(usiaTeman - usia) + " tahun.");
    }
}