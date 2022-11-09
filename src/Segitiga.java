

public class Segitiga extends Main{
    Float alas;
    Float tinggi;

    public Segitiga (Float alas) {

    }


    public Float getAlas() {
        return this.alas;
    }

    public void setAlas(Float alas) {
        this.alas = alas;
    }

    public Float getTinggi() {
        return tinggi;
    }

    public void setTinggi(Float tinggi) {
        this.tinggi = tinggi;
    }



    @Override
    Float luas() {
        return super.luas();
    }

    @Override
    Float keliling() {
        return super.keliling();
    }

        public void getSegitiga(){
        System.out.println("luas Segitiga: " + this.alas * this.tinggi);
    }
}