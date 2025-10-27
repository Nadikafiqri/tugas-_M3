import java.util.Scanner;

/**
 * Kelas MainProgram adalah kelas utama untuk menjalankan aplikasi Donasi Amal.
 * Memberikan menu interaktif kepada pengguna untuk mengelola donasi.
 */
public class MainProgram {
    /**
     * Method utama untuk menjalankan aplikasi.
     *
     * @param args argumen baris perintah (tidak digunakan dalam aplikasi ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DonasiManager manager = new DonasiManager();
        int pilihan;

        do {
            System.out.println("\n=== APLIKASI DONASI AMAL (Versi OOP) ===");
            System.out.println("1. Tambah Donasi");
            System.out.println("2. Tampilkan Donasi");
            System.out.println("3. Total Donasi");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine(); // clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama donatur: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan jumlah donasi (Rp): ");
                    double jumlah = input.nextDouble();
                    manager.tambahDonasi(nama, jumlah);
                    break;

                case 2:
                    manager.tampilkanDonasi();
                    break;

                case 3:
                    System.out.println("💰 Total Donasi Saat Ini: Rp " + manager.hitungTotalDonasi());
                    break;

                case 4:
                    System.out.println("👋 Terima kasih atas partisipasi Anda!");
                    break;

                default:
                    System.out.println("❌ Pilihan tidak valid, coba lagi.");
            }

        } while (pilihan != 4);

        input.close();
    }
}
