package jobsheet6;
import java.util.Scanner;
public class Studycase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, NIM, nilaiHuruf1, nilaiHuruf2 ,status1 ,status2,statusSemester ;
        int UTS1,UAS1,TUGAS1,UTS2,UAS2,TUGAS2;
        double Nilaiakhir1,Nilaiakhir2,rataRataNilaiAkhir;
        //input data mahasiswa
        System.out.println("===== INPUT DATA MAHASISWA =====");

        System.out.print("Nama : ");
        nama = sc.nextLine();
        System.out.print("NIM  : ");
        NIM = sc.nextLine();
        //input nilai Mata kuliah 1
        System.out.println();
        System.out.println("--- Mata Kuliah 1: Algorima dan Pemrograman ---");
        
        System.out.print("Nilai UTS   : ");
        UTS1 = sc.nextInt();
        System.out.print("Nilai UAS   : ");
        UAS1 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        TUGAS1 = sc.nextInt();
        //input nilai mata kuliah 2
        System.out.println();
        System.out.println("--- Mata Kuliah 2: Struktur data ---");
        
        System.out.print("Nilai UTS   : ");
        UTS2 = sc.nextInt();
        System.out.print("Nilai UAS   : ");
        UAS2 = sc.nextInt();
        System.out.print("Nilai Tugas : ");
        TUGAS2 = sc.nextInt();

        System.out.println();
        //proses 
        //hitung nilai akhir
        Nilaiakhir1 = TUGAS1*0.3+UAS1*0.4+UTS1*0.3;
        Nilaiakhir2 = TUGAS2*0.3+UAS2*0.4+UTS2*0.3;
        //get nilai huruf1
        if (Nilaiakhir1 >= 80 && Nilaiakhir1 <= 100) {
      nilaiHuruf1 = "A";
    } else if (Nilaiakhir1 >= 73 && Nilaiakhir1 < 80) {
      nilaiHuruf1 = "B+";
    } else if (Nilaiakhir1 >= 65 && Nilaiakhir1 < 73) {
      nilaiHuruf1 = "B";
    } else if (Nilaiakhir1 >= 60 && Nilaiakhir1 < 65) {
      nilaiHuruf1 = "C+";
    } else if (Nilaiakhir1 >= 50 && Nilaiakhir1 < 60) {
      nilaiHuruf1 = "C";
    } else if (Nilaiakhir1 >= 39 && Nilaiakhir1 < 50) {
      nilaiHuruf1 = "D";
    } else {
      nilaiHuruf1 = "E";
    }
//get nilai huruf 2
    if (Nilaiakhir2 >= 80 && Nilaiakhir2 <= 100)
      nilaiHuruf2 = "A";
    else if (Nilaiakhir2 >= 73 && Nilaiakhir2 < 80) {
      nilaiHuruf2 = "B+";
    } else if (Nilaiakhir2 >= 65 && Nilaiakhir2 < 73) {
      nilaiHuruf2 = "B";
    } else if (Nilaiakhir2 >= 60 && Nilaiakhir2 < 65) {
      nilaiHuruf2 = "C+";
    } else if (Nilaiakhir2 >= 50 && Nilaiakhir2 < 60) {
      nilaiHuruf2 = "C";
    } else if (Nilaiakhir2 >= 39 && Nilaiakhir2 < 50) {
      nilaiHuruf2 = "D";
    } else {
      nilaiHuruf2 = "E";
    }
      // Get passing status for course 1
    if (Nilaiakhir2 < 60) {
      status1 = "TIDAK LULUS";
    } else {
      status1 = "LULUS";
    }

    // Get passing status for course 2
    if (Nilaiakhir2 < 60) {
      status2 = "TIDAK LULUS";
    } else {
      status2 = "LULUS";
    }
    //calculate rata rata nilai akhir 
     rataRataNilaiAkhir = (Nilaiakhir1 + Nilaiakhir2) / 2;

    // Determine semester status
   
    if (status1.equalsIgnoreCase("LULUS") && status2.equalsIgnoreCase("LULUS")) {
      if (rataRataNilaiAkhir >= 70) {
        statusSemester = "LULUS";
      } else {
        statusSemester = "TIDAK LULUS";
      }
      System.out.println("\nSelamat! Anda Lulus Semua Mata Kuliah.");
    } else {
      statusSemester = "TIDAK LULUS";
    }
        //output 
        System.out.println();

        System.out.println("================== hasil penilaian akademik ==================");
        System.out.println("Nama : "+nama);
        System.out.println("NIM  : "+NIM);

        System.out.println();
        System.out.println("mata kuliah               UTS    UAS   Tugas   Nilai Akhir   Nilai Huruf   Status");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Algortima pemrogramnan    "+UTS1+"     "+UAS1+"      "+TUGAS1+"         "+Nilaiakhir1+"           "+nilaiHuruf1+"       "+status1);
        System.out.println("Struktur data             "+UTS2+"     "+UAS2+"      "+TUGAS2+"         "+Nilaiakhir2+"           "+nilaiHuruf2+"       "+status2);
        System.out.println();
        System.out.println("Rata Rata Nilai akhir: "+rataRataNilaiAkhir);
        System.out.println("Status semester      : "+statusSemester);
    }
}
