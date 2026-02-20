public class MataKuliah03 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    MataKuliah03 () {
    }

    MataKuliah03 (String kode, String nm, int sks, int jumlahJam) {
        kodeMK = kode;
        nama = nm;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilkanInformasi () {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS (int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam (int jam) {
        jumlahJam = jam;
    }

    void kurangiJam (int jam) {
        if (jumlahJam >= jam ) {
            jumlahJam -= jam;
        } else { 
            System.out.println("Pengurangan tidak dapat dilakukan. Jam tidak cukup");
        }
    }
}
