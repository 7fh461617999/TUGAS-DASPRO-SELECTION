package Studycase2;
//task 3
import java.util.Scanner;
public class freewifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input user type (lecturer/student/others) : ");
        String usertype = sc.nextLine();

        if (usertype.equalsIgnoreCase("lecturer")) {
            System.out.println("Wifi granted access (lecturer)");

        } else if (usertype.equalsIgnoreCase("student")) {
         System.out.print("enter number of credits : ");
         int credits = sc.nextInt();

         if (credits >= 12) {
            System.out.println("Wifi Access granted for student (active student)");

         } else {System.out.println("Wifi access Denied, credits less than 12");}

        } else {
            System.out.println("ACCESS DENIED");
        }
    }
}
