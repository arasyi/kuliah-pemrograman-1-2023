public class OutputFormatting {
    public static void main(String[] args) {
        double sepertiga = 1.0 / 3.0;
        long tabungan = 9_876_543_210L;
        int usia = 18;

        System.out.println("sepertiga = " + sepertiga);
        System.out.printf("sepertiga = %f\n", sepertiga);
        System.out.printf("sepertiga = %f, PI = %f\n", sepertiga, Math.PI);
        System.out.printf("sepertiga = %.2f, PI = %.3f\n", sepertiga, Math.PI);
        System.out.printf("sepertiga = %-7.2f, PI = %10.3f\n", sepertiga, Math.PI);

        System.out.println();
        System.out.printf("usia = %d\n", usia);
        System.out.printf("usia = %d, tabungan = %d\n", usia, tabungan);
        System.out.printf("usia = %+d, tabungan = %,d\n", usia, tabungan);
        System.out.printf("usia = %05d, tabungan = %20d\n", usia, tabungan);

        System.out.println();
        System.out.println("Pemasukan dan Pengeluaran Bulanan:");
        System.out.printf("%-10s = %+,10d\n", "Uang saku", 500_000);
        System.out.printf("%-10s = %+,10d\n", "Bensin", -100_000);
        System.out.printf("%-10s = %+,10d\n", "Jajan", -200_000);
        System.out.printf("%-10s = %+,10d\n", "Sedekah", -50_000);
        System.out.printf("%-10s = %+,10d\n", "Saldo", 150_000);
    }
}
