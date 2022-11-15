package Repository;

import Services.MenuServices;
import Model.Menu;

import java.util.ArrayList;
import java.util.List;

public class MenuDao implements MenuServices<Menu,Integer> {

    // Instance List object
    List<Menu> menu = new ArrayList<>();

    // CRUD method
    @Override
    public List<Menu> findAll() {
        return menu;
    }
    @Override
    public Menu findById(Integer id) {
        return menu.get(id);
    }
    @Override
    public void save(Menu data) {
        menu.add(data);
    }
    @Override
    public void update(Integer id, Menu data) {
        menu.set(id, data);
    }
    @Override
    public void delete(Integer id) {
        menu.remove((int)id);
    }
    @Override
    public int getMenu(int index) {

        return index;
    }

    @Override
    public int update(Integer pesanan) {

        return 0;
    }

}
