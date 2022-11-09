public class Prisma extends Segitiga {

    private int tinggiPrisma;

    public Prisma(Float tinggiPrisma) {
        super(tinggiPrisma);
    }

    public void setTinggiPrisma(int tinggiPrisma) {
        this.tinggiPrisma = tinggiPrisma;
    }

    // Getter
    public int getTinggiPrisma() {
        return tinggiPrisma;
    }

    public void cetakHasil() {
        System.out.println("Nilai alas: " + getAlas());
        System.out.println("Nilai tinggi: " + getAlas());
        System.out.println("Jumlah Volume : " + 1/2 * getAlas() * getTinggi() * getTinggiPrisma());
    }
}



