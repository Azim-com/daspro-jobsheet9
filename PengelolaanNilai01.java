import java.util.Scanner;
public class PengelolaanNilai01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];

        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();

            total += nilai[i];
        }
        double rataRata = (double) total / jumlah;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println("===== HASIL PENGELOLAAN NILAI =====");
        System.out.println("Total nilai       : " + total);
        System.out.println("Rata-rata         : " + rataRata);
        System.out.println("Nilai tertinggi   : " + tertinggi);
        System.out.println("Nilai terendah    : " + terendah);

        System.out.println("===== DAFTAR NILAI MAHASISWA =====");
        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " : " + nilai[i] + " (" + status + ")");
        }
        input.close();
    }
}