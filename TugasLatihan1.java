import java.util.Scanner;

public class TugasLatihan1 {
    public static void main(String[] args) {
        // Membuat scanner untuk input
        Scanner input = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bil1: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bil2: ");
        int bil2 = input.nextInt();
        System.out.print("Masukkan bil3: ");
        int bil3 = input.nextInt();
        
        int billmax = 0;  // Variabel untuk menyimpan bilangan terbesar
        
        // Memulai perbandingan untuk menentukan bilangan terbesar
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                billmax = bil1;
            } else {
                billmax = bil3;
            }
        } else {
            if (bil2 > bil3) {
                billmax = bil2;
            } else {
                billmax = bil3;
            }
        }
        
        // Menampilkan bilangan terbesar
        System.out.println("Bilangan terbesar: " + billmax);
    }
}
