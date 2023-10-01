import java.util.Scanner;
import java.time.Year;

public class TP02 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Meminta pengguna memasukkan tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Mendapatkan tahun sekarang
        int tahunSekarang = Year.now().getValue();

        // Menghitung usia
        int usia = tahunSekarang - tahunLahir;

        // Menampilkan pesan perkenalan
        System.out.println("Halo, " + nama + ".");
        System.out.println("Ternyata usiamu baru " + usia + " tahun ya!");

        // Menutup objek Scanner
        scanner.close();
    }
}