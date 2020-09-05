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
public class Waiter {
    private DinerMenu dinner;
    private PancakeHouseMenu pancake;

    public Waiter(DinerMenu dinner, PancakeHouseMenu pancake) {
        this.dinner = dinner;
        this.pancake = pancake;
    }
    
    private void displayMenuOf(IIterator iterator)
    {
        while(iterator.hasNext())
        {
            MenuItem item = iterator.next();
            System.out.println(item.getName());
            System.out.println("descrption: " + item.getDescription());
            System.out.println("price: " + item.getPrice());
        }
    }
    
    public void displayMenu()
    {
        System.out.println("---- Pancake House Menu ----");
        this.displayMenuOf(pancake.iterator());
        System.out.println("\n---- Dinner Menu ----");
        this.displayMenuOf(dinner.iterator());
    }
}
