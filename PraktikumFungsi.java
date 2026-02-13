import java.util.Scanner;
public class PraktikumFungsi {
Scanner sc = new Scanner(System.in);

    public static void tampilkanIncome(int[][] stok, int[] harga) {
        System.out.println("===========================================");
        System.out.printf("%-15s %-15s %-15s\n", "Cabang", "Pendapatan", "Status");
        System.out.println("===========================================");

        for (int i = 0; i < stok.length; i++) {
            int totalPendapatan = 0;

            for (int j = 0; j < stok[i].length; j++) {
                totalPendapatan += (stok[i][j] * harga[j]);
            }

            String status = (totalPendapatan > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";
            System.out.printf("RoyalGarden %-3d Rp %-13d %-14s\n", (i+1), totalPendapatan, status);
        }
        System.out.println("===========================================");
    }   
    public static void main(String[] args) {
        int [][] stok = { 
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
        
        int[] harga = {75000,50000,60000,10000};
        tampilkanIncome (stok,harga);
        
    }   
}