

public class Lingkaran extends Main {
    Float r;

    public Float getr() {
        return r;
    }

    @Override
    Float luas() {
        return (float) (Math.PI * r );

    }

    @Override
    Float keliling() {
        return (float) (2 * Math.PI * r);
    }

    public void setR(Float r) {
        this.r = r;
    }

    public Lingkaran(Float r) {
        this.r = r;
    }


    public void getLingkaran(){
        System.out.println("luas Lingkaran: " + this.r * Math.PI * r );
        System.out.println("Keliling Lingkaran: " + this.r * 2 * Math.PI * r);
    }
}