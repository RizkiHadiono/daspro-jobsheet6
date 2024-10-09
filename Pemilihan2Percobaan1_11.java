import java.util.Scanner;

public class Pemilihan2Percobaan1_11 {

    public static void main(String[] args) {

        Scanner input11 = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan Tahun: ");
        tahun = input11.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println(tahun + " termasuk tahun kabisat");
            }
            else {
                if (tahun % 400 == 0) {
                System.out.println(tahun + " bukan tahun kabisat");
                }
                else {
                    System.out.println(tahun + " bukan tahun kabisat");
                }
            }

        } 
        else {
            System.out.println(tahun + " Bukan Tahun Kabisat");
        }
            
    }
}