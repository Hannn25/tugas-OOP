import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    String menu;
    Float sisi;
    static Float alas;
    Float tinggi;
    Float r;
    Float tinggiPrisma;



    Float luas(){
        return Float.valueOf(0);
    }

    Float keliling(){
        return Float.valueOf(0);
    }

    public void menuApp() {
        System.out.println("===== Mari Menghitung Bangun Datar Tuan =====");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("\n");
        System.out.println("===== Mari Menghitung Bangun Ruang Tuan =====");
        System.out.println("4. Prisma");
        System.out.println("5. Bola");
        System.out.println("3. Kubus");
        System.out.print("Input Here Sir=>>: ");
        menu = scanner.nextLine();
    }

    public static void main(String[] args) {
        Main main = new Main();

        do {
            main.menuApp();

            switch (main.menu) {
                case "1":
                    System.out.println("===== Persegi=====");
                    System.out.print("Masukkan Sisi : ");
                    main.sisi = Float.valueOf(main.scanner.nextLine());
                    Persegi persegi = new Persegi(main.sisi);
                    persegi.getPersegi();
                    break;

                case "2":
                    System.out.println("===== Segitiga =====");
                    System.out.print("Masukkan Alas : ");
                    main.alas = Float.valueOf(main.scanner.nextLine());
                    System.out.print("Masukkan Tinggi : ");
                    main.tinggi = Float.valueOf(main.scanner.nextLine());
                    Segitiga segitiga = new Segitiga(main.alas);
                    segitiga.getSegitiga();
                    break;


                case "3":
                    System.out.println("===== Lingkaran =====");
                    System.out.print("Masukkan r : ");
                    main.r = Float.valueOf(main.scanner.nextLine());
                    Lingkaran lingkaran = new Lingkaran(main.r);
                    lingkaran.getLingkaran();
                    break;

                case "4":
                    System.out.println("===== Prisma =====");
                    System.out.print("Masukkan Tinggi Prisma : ");
                    main.tinggiPrisma = Float.valueOf(main.scanner.nextLine());
                    Prisma prisma = new Prisma(main.tinggiPrisma);
                    prisma.cetakHasil();
                    break;


                case "5":
                    System.out.println("===== Bola =====");
                    System.out.print("Masukkan r : ");
                    main.r = Float.valueOf(main.scanner.nextLine());
                    Bola bola = new Bola(main.r);
                    bola.getBola();
                    break;

                case "6":
                    System.out.println("===== Kubus =====");
                    System.out.print("Masukkan Sisi : ");
                    main.sisi = Float.valueOf(main.scanner.nextLine());
                    Kubus kubus = new Kubus(main.sisi);
                    kubus.getKubus();
                    break;

                default:
                    System.out.println("Salah Pilih Tuan");
                    break;
            }
            System.out.println("Apakah anda sudah capek ngitung tuan? (y/n)");
            main.menu = main.scanner.nextLine();
        } while (main.menu.equalsIgnoreCase("n"));

        System.out.println("Terimakasih Sudah berhitung bersama kami");
    }
}
