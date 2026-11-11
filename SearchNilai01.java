import java.util.Scanner;
public class SearchNilai01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah]; 

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari: ");
        int key = input.nextInt();

        boolean ditemukan = false; 
        for (int i = 0; i < nilai.length; i++) { 
            if (nilai[i] == key) { 
                System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + (i + 1) ); 
                ditemukan = true; 
                break; 
            } 
        }
        if (!ditemukan) { 
            System.out.println("Pencarian gagal!");
            System.out.println("Nilai " + key + " tidak tersedia dalam array.");
            System.out.println("Silakan periksa kembali nilai yang dimasukkan."); 
        } 
    }
}