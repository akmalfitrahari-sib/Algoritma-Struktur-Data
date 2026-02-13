import java.util.Scanner;

public class PraktikumPemilihan {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("====================");

        System.out.print("Masukkan Nilai Tugas : ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai Uts : ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai Uas : ");
        int uas = sc.nextInt();

        System.out.println("====================");
        System.out.println("====================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
                System.out.println("nilai tidak valid");
                return;
            }

        double nilaiAkhir = (0.2* tugas)+(0.2*kuis)+(0.3*uts)+(0.3 * uas);
        System.out.println("Nilai akhir : " + nilaiAkhir);

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            System.out.println("Nilai huruf : A");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai huruf : B+");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            System.out.println("Nilai huruf : B");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            System.out.println("Nilai huruf : C+");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            System.out.println("Nilai huruf : C");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            System.out.println("Nilai huruf : D");
        } else {
            System.out.println("Nilai huruf : E");
        }

        System.out.println("====================");
        System.out.println("====================");

        String status;

        if (nilaiAkhir > 80) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 73) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 65) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 60) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 50) {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiAkhir > 39) {
            System.out.println("MAAF ANDA TIDAK LULUS");
        } else {
            System.out.println("MAAF ANDA TIDAK LULUS");
        }

    }
}    
