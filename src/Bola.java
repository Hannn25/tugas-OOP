public class Bola extends Lingkaran{


    public Bola(Float r) {
        super(r);
    }

    @Override
    public Float keliling() {
        return super.keliling();
    }
    @Override
    public Float luas() {
        System.out.println("Luas Permukaan adalah : " + super.luas());
        return Float.valueOf(0);
    }

    public Float getVolume(){
        return 4 * super.luas();
    }

    public void getBola(){
        System.out.println("Volume Bola adalah : " + getVolume());
    }
}