package mainp;

/**
 *
 * @author ASUS
 */
public abstract class Penumpang {
    protected String nama;
    protected String noTiket;

    public Penumpang(String nama, String noTiket) {
        this.nama = nama;
        this.noTiket = noTiket;
    }

    // abstraksi
    public abstract double hitungHargaTiket();

    // method tampilkan data
    public void tampilkanData() {
        System.out.println("Nama      : " + nama);
        System.out.println("No Tiket  : " + noTiket);
        System.out.println("Harga Tiket: Rp " + (int) hitungHargaTiket());
    }

    // overloading tampilkanData
    public void tampilkanData(String keterangan) {
        tampilkanData();
        System.out.println("Keterangan : " + keterangan);
    }
}
