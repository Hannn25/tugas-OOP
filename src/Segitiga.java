import bangun.service.BangunDatarService;

public class Segitiga implements BangunDatarService {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void bentuk() {
        System.out.println("=== Ceritanya Segitiga");
    }

    @Override
    public void karakteristik() {
        System.out.println("Memiliki sudut yg sama, dan memiliki sumbu simetri putar");
    }

    @Override
    public float luas(){
        return this.alas * this.tinggi;
    }

    @Override
    public float keliling() {
        return 0;
    }

    public void getHasil() {
        System.out.println("Luas Segitiga: " + luas());
    }
}