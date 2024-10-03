import java.util.Scanner;

public class Pemilihan2Percobaan1_11 {

    public static void main(String[] args) {

        Scanner input11 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan Tahun: ");
        tahun = input11.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0)
                System.out.println("Tahun Kabisat");
            else {
                System.out.println("bukan tahun kabisat");
            }
        } else
            System.out.println("Bukan Tahun Kabisat"); 
            
    }
}