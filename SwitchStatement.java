import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int nomorhari;
        System.out.println("Masukan no.1-7: ");
        nomorhari = Scanner.nextInt();
        String namaHari = "";

        switch (nomorhari) {
            case 1:
                namaHari = "Minggu";
                break;
            case 2:
                namaHari = "Senin";
                break;
            case 3:
                namaHari = "Selasa";
                break;
            case 4:
                namaHari = "Rabu";
                break;
            case 5:
                namaHari = "Kamis";
                break;
            case 6:
                namaHari = "Jumat";
                break;
            case 7:
                namaHari = "Sabtu";
                break;
            default:
                System.out.println("Masukan Nomor hanya antara 1-7!!");
                System.exit( 0);
        }
        System.out.println("Nama hari : " + namaHari);
    }
}
