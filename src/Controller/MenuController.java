package Controller;

import Repository.MenuDao;
import Repository.OrderDao;
import Services.PaymentServices;
import Model.Menu;
import Services.MenuServices;


import java.util.*;

public class MenuController {

    private static MenuServices<Menu, Integer> menuMakanan;
    private static MenuServices<Menu, Integer> menuMinuman;
    private static MenuServices<Menu, Integer> menuPaket;
    private static MenuServices<Menu, Integer> totalPesan;

    static Scanner inputUser = new Scanner(System.in);
    static String opsi = "y";
    static int menuApp;
    static int total;
    static int index, amount;
    static boolean state = true;

    public static void main(String[] args) {
        menuMakanan = new MenuDao();
        menuMinuman = new MenuDao();
        menuPaket = new MenuDao();
        totalPesan = new MenuDao();
        Menu menu = new Menu();
        Menu makanan = new Menu("Ayam Kecap Kabur", 30000);
        menuMakanan.save(makanan);
        makanan = new Menu("Ayam GepreK Balmond", 23000);
        menuMakanan.save(makanan);

        Menu minuman = new Menu("Es Teh Manis Anget", 2500);
        menuMinuman.save(minuman);
        minuman = new Menu("Teh Es Manis Anget Dingin", 4000);
        menuMinuman.save(minuman);

        Menu paket = new Menu("Paket Begah 1", 28000);
        menuPaket.save(paket);
        paket = new Menu("Paket Begah 2", 34000);
        menuPaket.save(paket);

        OrderDao order = new OrderDao();


        do {
            System.out.println("""

                    \n========== Warung Makang Uncle ji ==========\s
                    1. Menu
                    2. Pesanan
                    3. Pembayaran"""
            );
            System.out.print("Pilih Menu : ");
            menuApp = inputUser.nextInt();
            inputUser.nextLine();



            switch (menuApp) {
                case 1 -> {
                    System.out.println("\n===== Menu =====");
                    System.out.println("\n===== List =====");
                    int a = 0;
                    for (Menu makananMenu : menuMakanan.findAll()) {
                        a++;
                        System.out.println(a + ". " + makananMenu);
                    }

                    System.out.println("\n========== Minuman ==========");
                    int b = 0;
                    for (Menu minumanMenu : menuMinuman.findAll()) {
                        b++;
                        System.out.println(b + ". " + minumanMenu);

                    }

                    System.out.println("\n========== Paket ==========");
                    int c = 0;
                    for (Menu paketMenu : menuPaket.findAll()) {
                        c++;
                        System.out.println(c + ". " + paketMenu);
                    }
                }
                case 2 -> {
                    while (opsi.equals("y")) {
                        System.out.println("""
                                ========== PEMESANAN ==========\s
                                1. Makanan
                                2. Minuman
                                3. Paket Kenyang
                                4. Ubah Pesanan
                                5. Hapus Pesanan"""
                        );
                        System.out.print("Pilih Menu : ");
                        int pilihMenu = inputUser.nextInt();
                        inputUser.nextLine();

                        switch (pilihMenu) {
                            case 1 -> {

                                int i = 0;
                                for (Menu makananMenu : menuMakanan.findAll()) {
                                    i++;
                                    System.out.println(i + ". " + makananMenu);
                                }

                                System.out.print("Mau Makan Apa Tuan : ");
                                int index = inputUser.nextInt();
                                menu.setTotalPesanan(index - 1);
                                totalPesan.save(menuMakanan.findById(menu.getTotalPesanan()));
                                int j = 0;
                                for (Menu totalpesan : totalPesan.findAll()) {
                                    j++;
                                    System.out.println(" Pesanan Anda : ");
                                    System.out.println(j + ". " + totalpesan);
                                }
                                opsi = inputUser.nextLine();
                            }

                            case 2 -> {
                                int j = 0;
                                for (Menu minumanMenu : menuMinuman.findAll()) {
                                    j++;
                                    System.out.println(j + ". " + minumanMenu);
                                }
                                System.out.print("Mau Minum Apa Tuan : ");
                                int index = inputUser.nextInt();
                                menu.setTotalPesanan(index - 1);
                                totalPesan.save(menuMinuman.findById(menu.getTotalPesanan()));
                                int i = 0;
                                for (Menu totalpesan : totalPesan.findAll()) {
                                    i++;
                                    System.out.println(" Pesanan Anda : ");
                                    System.out.println(i + ". " + totalpesan);
                                }
                                System.out.print("Pesanan Anda : " + totalPesan.findAll() + "\n");

                            }
                            case 3 -> {

                                int k = 0;
                                for (Menu paketmenu : menuPaket.findAll()) {
                                    k++;
                                    System.out.println(k + ". " + paketmenu);
                                }
                                System.out.print("Mau Paket Apa Tuan : ");
                                int index = inputUser.nextInt();
                                menu.setTotalPesanan(index - 1);
                                totalPesan.save(menuPaket.findById(menu.getTotalPesanan()));
                                System.out.print("Pesanan Anda : " + totalPesan.findAll() + "\n");
                            }
                            case 4 -> {
                                System.out.println("\n========== Ubah Pesanan ==========");
                                int i = 0;
                                for (Menu totalpesan : totalPesan.findAll()) {
                                    i++;
                                    System.out.println(" Pesanan Anda : ");
                                    System.out.println( i + ". " +   totalpesan);
                                }
                                System.out.print("Mau ganti apa tuan : ");
                                int index = inputUser.nextInt();
                                menu.setTotalPesanan(index - 1);
                                totalPesan.delete(index-1);
                                System.out.println("Pesanan berhasil diubah!");
                                opsi = inputUser.nextLine();
                            }
                            case 5 -> {
                                System.out.println("\n========== Hapus Pesanan ==========");
                                int i = 0;
                                for (Menu totalpesan : totalPesan.findAll()) {
                                    System.out.println(" Pesanan Anda : ");
                                    System.out.println( i + ". " +   totalpesan);
                                }
                                System.out.println("\n========== Ubah Pesanan ==========");
                                System.out.print("Mau dihapus apa tuan : ");
                                int index = inputUser.nextInt();
                                totalPesan.delete(index-1);
                                System.out.println("Pesanan berhasil dihapus!");
                                opsi = inputUser.nextLine();
                            }



                            default -> System.out.println("Menu tidak tersedia!");
                            }

                    }
                        opsi = "y";
                }

                    case 3 -> {

                        int j = 0;
                        for (Menu totalpesan : totalPesan.findAll()) {
                            j++;
                            System.out.println(" Pesanan Anda : ");
                            System.out.println(j + ". " + totalpesan);
                        }
                        System.out.print("Input your amount: ");
                        amount = inputUser.nextInt();
                        totalPesan.getMenu(index - 1);
                        inputUser.nextLine();
                        if (amount < totalPesan.getMenu(menu.getTotalPesanan())) {
                            System.out.println("Uangnya Gacukup Tuan");
                            state = true;
                        } else {
                            order.payment(amount);
                            state = false;
                        }


                    }
                        default -> System.out.println("Silahkan pilih menu yang tersedia!.\n");
                    }

                System.out.print("\nApakah ingin melanjutkan program? (y/n): ");
                opsi = inputUser.nextLine();
            } while (opsi.equalsIgnoreCase("y")) ;

        }
}

