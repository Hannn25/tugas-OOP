public  class Persegi extends Main{
    Float sisi;

    public Persegi(Float sisi) {
        this.sisi = Float.valueOf(sisi);
    }

    @Override
    Float luas() {
        return super.luas();
    }

    @Override
    Float keliling() {
        return super.keliling();
    }

    public Float getSisi() {
        return sisi;
    }

    public void setSisi(Float sisi) {
        this.sisi = sisi;
    }

    public void getPersegi(){
        System.out.println("luas Persegi: " + this.sisi * this.sisi);
        System.out.println("Keliling Persegi: " + this.sisi * 4);
    }


}