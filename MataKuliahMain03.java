public class MataKuliahMain03 {
    public static void main(String[] args) {
        MataKuliah03 mk1 = new MataKuliah03();
        mk1.kodeMK = "PASD";
        mk1.nama = "Praktikum Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(7);
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();

        MataKuliah03 mk2 = new MataKuliah03("BD", "Basis Data", 3, 6);
        mk2.tampilkanInformasi();
       
    }
}
