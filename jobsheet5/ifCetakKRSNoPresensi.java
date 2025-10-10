package jobsheet5;
import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is your UKT paid in full? (true/false)? ");
        boolean uktLunas = sc.nextBoolean();

        // Versi singkat menggunakan ternary operator
        System.out.println(
            uktLunas
            ? "ukt payment verified,please print KRS and request DPA signature"
            : "ukt payment unverified,sorry you can't got KRS"
        );

        sc.close();
    }
}