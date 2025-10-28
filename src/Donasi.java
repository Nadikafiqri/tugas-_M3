
public class Donasi {
    private String namaDonatur;
    private double jumlahDonasi;

    /**
     * Konstruktor untuk membuat objek Donasi.
     *
     * @param namaDonatur nama dari donatur.
     * @param jumlahDonasi jumlah donasi yang diberikan.
     */
    public Donasi(String namaDonatur, double jumlahDonasi) {
        this.namaDonatur = namaDonatur;
        this.jumlahDonasi = jumlahDonasi;
    }

    /**
     * Mengambil nama donatur.
     *
     * @return nama donatur.
     */
    public String getNamaDonatur() {
        return namaDonatur;
    }

    /**
     * Mengambil jumlah donasi.
     *
     * @return jumlah donasi dalam bentuk double.
     */
    public double getJumlahDonasi() {
        return jumlahDonasi;
    }
}
