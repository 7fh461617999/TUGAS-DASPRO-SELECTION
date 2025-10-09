package jobsheet5;
import java.util.Scanner;
public class IfCetakKRS09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- PRINT KRS SIAKAD ---");
        System.out.println("Has the UKT been paid in full? (true/false)");
        boolean uktlunas = sc.nextBoolean();
        if (uktlunas) {
            System.out.println("UKT payment verified");
            System.out.println("please print KRS and request DPA signature");
        }
    }
}