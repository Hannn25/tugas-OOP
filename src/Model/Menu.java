package Model;

public class Menu {



    private  String menu;
    private  Integer harga;
    private Integer totalPesanan;

    public Menu(){

    }

    public Menu(String menu, Integer harga) {
        this.menu = menu;
        this.harga = harga;
    }

    public Integer getTotalPesanan() {
        return totalPesanan;
    }

    public void setTotalPesanan(Integer totalPesanan) {
        this.totalPesanan = totalPesanan;
    }

    public String getMenu() {
        return this.menu;
    }

    public boolean setMenu(String menu) {
        this.menu = menu;
        return false;
    }

    public Integer getHarga() {
        return this.harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return menu + " - Rp. " + harga + "\n";
    }
}
