package Librarysystem;
import java.util.Scanner;
public class librarysystem{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean studentcard,onlineregist;
        System.out.println("you have a student card");
        studentcard = sc.nextBoolean();
        System.out.println("you done online registered");
        onlineregist = sc.nextBoolean();
        if (studentcard == true || onlineregist== true ) {
            System.out.println("Access granted ");
        } else {
            System.out.println("Access Denied");
        }
    }
}
