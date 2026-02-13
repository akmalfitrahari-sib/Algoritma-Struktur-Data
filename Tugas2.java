import java.util.Scanner;
public class Tugas2 {
    
      public static void tampilkanMenu(){
        System.out.println("\n==== Sistem Pendaftaran Beasiswa ====");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
    }

    public static void inputJadwal(Scanner sc, String[][] jadwal) {
        for (int i = 0; i < jadwal.length; i++) {
            System.out.println("Masukkan data jadwal ke-" + (i+1));
            System.out.print("Nama mata kuliah  : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang             : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari              : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam               : ");
            jadwal[i][3] = sc.nextLine();
            System.out.println("-----------------------------");
        }
    }

    public static void tampilkanSemuaJadwal(String[][] jadwal) {
        System.out.println("====================================================================");
        System.out.printf("%-25s | %-10s | %-10s | %-10s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("====================================================================");
        for(int i = 0; i < jadwal.length; i++) {
            System.out.printf("%-25s | %-10s | %-10s | %-10s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[][] jadwal, String hari) {
        for (int i = 0; i < jadwal.length; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("%-25s | %-10s | %-10s | %-10s\n", jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            }
        }
        
    }

    public static void tampilkanJadwalBerdasarkanNama(String[][] jadwal, String namaMK) {
        boolean ditemukan = false;
    System.out.println("\n--------------------------------------------------------------------");
    System.out.printf("%-25s | %-10s | %-10s | %-10s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
    System.out.println("--------------------------------------------------------------------");

    for (int i = 0; i < jadwal.length; i++) {
        // Membandingkan input user dengan kolom ke-0 (Nama MK)
        if (jadwal[i][0].equalsIgnoreCase(namaMK)) { 
            System.out.printf("%-25s | %-10s | %-10s | %-10s\n", 
                jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
            ditemukan = true;
        }
    }

    if (!ditemukan) {
        System.out.println("Jadwal untuk Mata Kuliah '" + namaMK + "' tidak ditemukan.");
    }
        System.out.println("--------------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] dataJadwal = new String[n][4];
        inputJadwal(sc, dataJadwal);

        int pilihanMenu;
        do {
             tampilkanMenu();
            System.out.print("Pilih menu (1-5): ");
            pilihanMenu = sc.nextInt();
            sc.nextLine(); 

        switch (pilihanMenu) {
            case 1:
                tampilkanSemuaJadwal(dataJadwal);
                break;
            case 2:
                System.out.print("Masukkan hari yang dicari: ");
                String cariHari = sc.nextLine();
                tampilkanJadwalBerdasarkanHari(dataJadwal, cariHari);
                break;
            case 3:
                System.out.print("Masukkan nama MK yang dicari: ");
                String cariMK = sc.nextLine();
                tampilkanJadwalBerdasarkanNama(dataJadwal, cariMK);
                break;
        }
            } while (pilihanMenu != 4);
    }

} 
    

