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
public class DinnerIterator implements IIterator{
    private MenuItem[] items;
    private int position;

    public DinnerIterator(MenuItem[] items) {
        this.items = items;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return ((this.position < this.items.length) && (this.items[this.position] != null));
    }

    @Override
    public MenuItem next() {
        return this.items[this.position++];
    }
    
    
}
