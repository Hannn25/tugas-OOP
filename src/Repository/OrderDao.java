package Repository;





import Services.MenuServices;
import Services.PaymentServices;
import Model.Order;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderDao implements PaymentServices<Integer> {

    int sum;

    private Order order = new Order();
    private MenuDao menudao = new MenuDao();
    List<Order> listofOrder = new ArrayList<Order>();
    List<Integer> totalOrder = new ArrayList<Integer>();

    @Override
    public void order(List<Integer> index, List<Integer> orders, List<Integer> type) {
        for (int i = 0; i < index.size(); i++) {
            listofOrder.add(new Order(index.get(i), orders.get(i), type.get(i)));
        }
    }

    @Override
    public void getOrders() {
        MenuServices<Object, Object> totalPesanan = null;
        System.out.print("Pesanan Anda : " + totalPesanan.findAll() + "\n");
        System.out.println("Total Order: " + getTotalOrder());
        System.out.println("Total Order with PPN (11%): " + getTotalOrderPPN());
    }

    @Override
    public void editOrders(Integer index, Integer amount) {
        order = listofOrder.get(index);
        order.setTotalHarga(amount);
        System.out.println("Pesanan Berhasil diubah!");

    }

    @Override
    public void deleteOrders(Integer index) {
        listofOrder.remove((int) index);
        System.out.println("\nPesanan Berhasil dihapus!");
    }

    @Override
    public int getTotalOrder() {
        sum = 0;
        for (Integer totalOrder : totalOrder) {
            sum += totalOrder;
        }
        totalOrder.clear();
        return sum;
    }

    @Override
    public int getTotalOrderPPN() {
        return (sum + (sum * 11 / 100));
    }

    @Override
    public int getPPN() {
        return (sum * 11 / 100);
    }

    @Override
    public void payment(Integer amount) {
        System.out.println("========== Pembayaran ==========");
        LocalDateTime dateTimeNow = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, dd-mm-yyyy, HH:mm:ss");
        String dateTimeFormatted = dateTimeNow.format(formatter);
        System.out.println(dateTimeFormatted);
        System.out.println("Uang dibayarkan  : " + amount);
        System.out.println("Terima kasih, sampai jumpa lagi Tuan!");
        listofOrder.clear();

    }
}
