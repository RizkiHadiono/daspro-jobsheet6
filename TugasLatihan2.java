import java.util.Scanner;

public class TugasLatihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jenis dan jumlah buku
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = input.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = input.nextInt();

        double diskon = 0.0;

        // Menghitung diskon berdasarkan jenis dan jumlah buku
        if (jenisBuku.equals("kamus")) {
            // Diskon 10% untuk kamus
            diskon = 10.0;
            if (jumlahBuku > 2) {
                // Tambahan diskon 2% jika beli lebih dari 2 kamus
                diskon += 2.0;
            }
        } else if (jenisBuku.equals("novel")) {
            // Diskon 7% untuk novel
            diskon = 7.0;
            if (jumlahBuku > 3) {
                // Tambahan diskon 2% jika beli lebih dari 3 novel
                diskon += 2.0;
            } else {
                // Tambahan diskon 1% jika beli 3 atau kurang novel
                diskon += 1.0;
            }
        } else {
            // Diskon 5% untuk buku selain kamus/novel jika beli lebih dari 3
            if (jumlahBuku > 3) {
                diskon = 5.0;
            }
        }

        // Menampilkan hasil diskon
        System.out.println("Total diskon yang didapat: " + diskon + "%");
    }
}
