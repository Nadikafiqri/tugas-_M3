import java.util.ArrayList;

/**
 * Kelas DonasiManager digunakan untuk mengelola daftar donasi.
 * Menyediakan fungsi untuk menambah, menampilkan, dan menghitung total donasi.
 */
public class DonasiManager {
    private ArrayList<Donasi> daftarDonasi = new ArrayList<>();

    /**
     * Menambahkan donasi baru ke dalam daftar donasi.
     *
     * @param nama   nama donatur.
     * @param jumlah jumlah donasi yang diberikan.
     */
    public void tambahDonasi(String nama, double jumlah) {
        daftarDonasi.add(new Donasi(nama, jumlah));
        System.out.println("✅ Donasi berhasil ditambahkan!");
    }

    /**
     * Menampilkan seluruh daftar donasi ke layar.
     * Jika belum ada donasi, akan menampilkan pesan peringatan.
     */
    public void tampilkanDonasi() {
        if (daftarDonasi.isEmpty()) {
            System.out.println("⚠ Belum ada donasi.");
        } else {
            System.out.println("\n--- DAFTAR DONASI ---");
            for (int i = 0; i < daftarDonasi.size(); i++) {
                Donasi d = daftarDonasi.get(i);
                System.out.println((i + 1) + ". " + d.getNamaDonatur() + " - Rp " + d.getJumlahDonasi());
            }
        }
    }

    /**
     * Menghitung total dari seluruh donasi yang telah terdaftar.
     *
     * @return total jumlah donasi.
     */
    public double hitungTotalDonasi() {
        double total = 0;
        for (Donasi d : daftarDonasi) {
            total += d.getJumlahDonasi();
        }
        return total;
    }
}
