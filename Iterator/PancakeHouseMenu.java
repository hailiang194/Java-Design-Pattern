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
public class PancakeHouseMenu {

    private java.util.ArrayList<MenuItem> memuItems;

    public PancakeHouseMenu() {
        this.memuItems = new java.util.ArrayList<>();

        this.memuItems.add(new MenuItem("Banh Xeo", "Vietnamese pancake", true, 5.0));
        this.memuItems.add(new MenuItem("Regular Pancake Breakfast", "Pancake with eggs and sausage", false, 3.56));
        this.memuItems.add(new MenuItem("Blueberry Pancake", "Pancake with blueberry", true, 5.0));
        this.memuItems.add(new MenuItem("Special pancake", "The combination with banh xeo and blueberry pancake", false, 3.0));
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        this.memuItems.add(new MenuItem(name, description, vegetarian, price));
    }

    public IIterator iterator() {
        return new PancakeHouseIterator(this.memuItems);
    }
}
