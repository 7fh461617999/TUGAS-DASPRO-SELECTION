package jobsheet5;
import java.util.Scanner;
public class switchCetakKRS09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Print KRS SIAKAD ---");
        System.out.print("Input now semester :");
        int semester = sc.nextInt();
        switch (semester) {
            case 1:
               System.out.println("display KRS 1st semester"); 
                break;
            case 2 :
               System.out.println("display KRS 2nd semester"); 
                break;
            case 3 :
               System.out.println("display KRS 3rd semester"); 
                break;
            case 4 :
               System.out.println("display KRS 4rd semester"); 
                break;
            case 5 :
               System.out.println("display KRS 5rd semester"); 
                break;
            case 6:
               System.out.println("display KRS 6rd semester"); 
                break;
            case 7 :
               System.out.println("display KRS 7rd semester"); 
                break;
            case 8 :
               System.out.println("display KRS 8rd semester"); 
                break;
            default:
                break;
        }
    }
}
