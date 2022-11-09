public class Kubus extends Persegi{

    public Kubus(Float sisi) {
        super(sisi);
    }

    public void setSisi(Float sisi) {
        super.setSisi(sisi);
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


    public void getKubus() {
        Float volume = super.getSisi() * super.getSisi() * super.getSisi();
        System.out.println("Volume Kubus: " + volume);
    }
}
