package Services;

import java.util.List;

public interface PaymentServices<K> {
    void order(List<K> index, List<K> orders, List<K> type);

    void getOrders();

    void editOrders(K index, K amount);

    void deleteOrders(K index);

    int getTotalOrder();

    int getTotalOrderPPN();

    int getPPN();

    void payment(K amount);
}




