import java.util.Random;
import java.util.Scanner;

class IfStatement {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        int nomorHari;
        System.out.println("Masukan nomor diantara 1 sampai 7 : ");
        nomorHari = Scanner.nextInt();
        String namaHari = "";

        if (nomorHari == 1) {
            namaHari = "Minggu";
        } else if (nomorHari == 2) {
            namaHari = "Senin";
        } else if (nomorHari == 3) {
            namaHari = "Selasa";
        } else if (nomorHari == 4) {
            namaHari = "Rabu";
        } else if (nomorHari == 5) {
            namaHari = "Kamis";
        } else if (nomorHari == 6) {
            namaHari = "Jumat";
        } else if (nomorHari == 7) {
            namaHari = "Sabtu";
        } else {
            System.out.println("Masukan nomor diantara 1 sampai 7");
            System.exit( 0);
        }
        System.out.println("Nama hari : " + namaHari);

    }
}
