public class PenumpangReguler extends Penumpang {

    public PenumpangReguler(String nama, String noTiket) {
        super(nama, noTiket);
    }

    // overriding
    @Override
    public double hitungHargaTiket() {
        return 50000;
    }
}
