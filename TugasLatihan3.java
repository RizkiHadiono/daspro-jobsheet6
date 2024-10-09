import java.util.Scanner;

public class TugasLatihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan daftar merk dan kategori sepatu
        System.out.println("Daftar Merk Sepatu dan Kategorinya:");
        System.out.println("1. Converse");
        System.out.println("   - Slip On (Ukuran 36-40)");
        System.out.println("   - High Top (Ukuran 40-44)");
        System.out.println("2. Skecher");
        System.out.println("   - Woman (Ukuran 36-41)");
        System.out.println("   - Man (Ukuran 41-44)");
        System.out.println("3. Nike");
        System.out.println("   - Kids (Ukuran 36-40)");
        System.out.println("   - Adult (Ukuran 40-44)");
        System.out.println();

        // Input data dari pengguna
        System.out.print("Masukkan merk sepatu (Converse/Skecher/Nike): ");
        String merk = input.nextLine().toLowerCase();

        System.out.print("Masukkan kategori sepatu: ");
        String kategori = input.nextLine().toLowerCase();

        System.out.print("Masukkan ukuran sepatu: ");
        int ukuran = input.nextInt();

        double harga = 0.0;

        // Menentukan harga berdasarkan merk, kategori, dan ukuran
        if (merk.equals("converse")) {
            if (kategori.equals("slip on") && ukuran >= 36 && ukuran <= 40) {
                harga = 800000;
            } else if (kategori.equals("high top") && ukuran >= 40 && ukuran <= 44) {
                harga = 1200000;
            }
        } else if (merk.equals("skecher")) {
            if (kategori.equals("woman") && ukuran >= 36 && ukuran <= 41) {
                harga = 1000000;
            } else if (kategori.equals("man") && ukuran >= 41 && ukuran <= 44) {
                harga = 1800000;
            }
        } else if (merk.equals("nike")) {
            if (kategori.equals("kids") && ukuran >= 36 && ukuran <= 40) {
                harga = 750000;
            } else if (kategori.equals("adult") && ukuran >= 40 && ukuran <= 44) {
                harga = 1500000;
            }
        }

        // Menampilkan hasil
        if (harga > 0) {
            System.out.println("Harga sepatu: Rp " + harga);
        } else {
            System.out.println("Data tidak valid, cek kembali merk, kategori, dan ukuran.");
        }
    }
}
