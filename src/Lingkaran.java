import bangun.service.BangunDatarService;

public class Lingkaran implements BangunDatarService {
    int jariJari;

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public void bentuk() {
    System.out.println("=== Ceritanya Lingkaran ===");
    }

    @Override
    public void karakteristik() {
        System.out.println("Memiliki jumlah sudut 180 derajat dan memiliki diameter yang terbagi menjadi 2 sisi");
    }

    @Override
    public float luas(){
        return (float) (Math.PI * jariJari * jariJari);
    }

    @Override
    public float keliling(){
        return (float) (2 * Math.PI * jariJari);
    }

    public void getHasil() {
        System.out.println("Luas Lingkaran: " + luas());
        System.out.println("keliling Lingkaran: " + keliling());
    }
}
