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
public class Demo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter(new DinerMenu(), new PancakeHouseMenu());
        waiter.displayMenu();
    }
}
