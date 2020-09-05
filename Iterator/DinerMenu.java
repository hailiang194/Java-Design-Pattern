/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author hailiang194
 */
public class DinerMenu {

    public static final int MAX_ITEMS = 6;
    private int numberOfItems;
    MenuItem[] menuItems;

    public DinerMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        this.numberOfItems = 0;

        this.addItem("Vietnamese regular dinner", "Rice, meat and Rau Ngot soup", false, 3.0);
        this.addItem("Japanese regular dinner", "Rice, natto and Miso soup", true, 3.5);
        this.addItem("Hotdog", "Only sausage", false, 1.5);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (this.numberOfItems >= MAX_ITEMS) {
            System.err.println("Menu is full! Can't add item to menu");
            return;
        }

        this.menuItems[this.numberOfItems] = new MenuItem(name, description, vegetarian, price);
        ++this.numberOfItems;
    }

    public IIterator iterator() {
        return new DinnerIterator(this.menuItems);
    }

}
