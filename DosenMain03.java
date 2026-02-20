public class DosenMain03 {
    public static void main(String[] args) {
        Dosen03 dosen1 = new Dosen03();
        dosen1.idDosen = "0099";
        dosen1.nama = "Pak Bagus";
        dosen1.setStatusAktif(false);
        dosen1.tahunBergabung = 2018;
        dosen1.bidangKeahlian = "Konsep Teknologi Infomasi";
        
        dosen1.tampilkanInformasi();
        System.out.println("Masa kerja: " + dosen1.hitungMasaKerja(2026));
        dosen1.setStatusAktif(true);
        dosen1.ubahKeahlian("Basis data");
        dosen1.tampilkanInformasi();

        Dosen03 dosen2 = new Dosen03("0445", "Pak Abhi", true, 2016, "Matematika Lanjut");
        dosen2.tampilkanInformasi();
    }
}
