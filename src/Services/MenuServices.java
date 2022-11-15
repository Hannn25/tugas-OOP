package Services;

import Model.Menu;

import java.util.List;

public interface MenuServices<T, K> {
    List<T> findAll();
    T findById (K id);
    void save (Menu data);
    void update (K id, T data);
    void delete (K id);
    int getMenu(int index);

    int update(K pesanan);
}

