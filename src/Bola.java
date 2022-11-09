import bangun.service.BangunRuangService;

public class Bola extends Lingkaran implements BangunRuangService {


    public Bola(int jariJari) {
        super(jariJari);
    }

    @Override
    public void bentuk() {
        System.out.println("=== Ceritanya Bola ===");
    }

    @Override
    public void karakteristik() {
        System.out.println("Tidak memiliki rusuk serta titik sudut dan hanya memiliki satu sisi lengkung  ");
    }

    public double volume(){
        return 4 * super.luas();
    }

    public void getVolume(){
        System.out.println("Volume Bola adalah : " + volume());
    }
    }
