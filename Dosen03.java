public class Dosen03 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    Dosen03 () {
    }

    Dosen03 (String id, String nm, boolean status, int thn, String bdg) {
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thn;
        bidangKeahlian = bdg;
    }

    void tampilkanInformasi () {
        System.out.println("Id dosen: " + idDosen);
        System.out.println("Nama dosen: " + nama);
        System.out.println("Status: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
        System.out.println("====================================");
    }

    void setStatusAktif (boolean status) {
        statusAktif = status;
    }


    int hitungMasaKerja (int thnSkrg) {
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian (String bidang) {
        bidangKeahlian = bidang;
    }
}
