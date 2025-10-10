package jobsheet5;
import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apakah UKT sudah lunas (true/false)? ");
        boolean uktLunas = sc.nextBoolean();

        // Versi singkat menggunakan ternary operator
        System.out.println(
            uktLunas
            ? "Cetak KRS berhasil"
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu"
        );

        sc.close();
    }
}