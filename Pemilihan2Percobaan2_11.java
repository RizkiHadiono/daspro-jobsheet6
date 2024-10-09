import java.util.Scanner;

public class Pemilihan2Percobaan2_11 {
    public static void main(String[] args) {
        
        Scanner input11 = new Scanner(System.in);

        String menu, member, metodePembayaran;
        int pilihan_menu;
        double diskon, total_bayar, harga;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input11.nextInt();
        input11.nextLine();
        System.out.println("Apakah punya member (y/n) ? = ");
        member = input11.nextLine();
        System.out.println("Metode pembayaran (QRIS/nontunai/tunai) ? = ");
        metodePembayaran = input11.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10 %");
        } else if (member.equalsIgnoreCase("n")) {
            diskon = 0.0;
        } else {
            System.out.println("Member tidak valid");
            return;
        }

        // Menghitung harga berdasarkan pilihan menu
        if (pilihan_menu == 1) {
            harga = 14000;
            System.out.println("Harga ricebowl = " + harga);
        } else if (pilihan_menu == 2) {
            harga = 3000;
            System.out.println("Harga ice tea = " + harga);
        } else if (pilihan_menu == 3) {
            harga = 15000;
            System.out.println("Harga bunding = " + harga);
        } else {
            System.out.println("Masukkan menu dengan benar");
            return;            
        }

        // Menghitung total bayar setelah diskon
        total_bayar = harga - (harga * diskon);

        // Cek apakah pembayaran menggunakan QRIS
        if (metodePembayaran.equalsIgnoreCase("QRIS")) {
            total_bayar -= 1000; // Potongan Rp.1.000
            System.out.println("Potongan harga karena pembayaran dengan QRIS = Rp. 1.000");
        }

        // Pastikan total bayar tidak negatif
        if (total_bayar < 0) {
            total_bayar = 0;
        }

        System.out.println("Total bayar setelah diskon = " + total_bayar);
        System.out.println("-------------------------------------");
    }
}
