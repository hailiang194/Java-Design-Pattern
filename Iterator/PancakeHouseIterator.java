/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

import java.util.ArrayList;

/**
 *
 * @author hailiang194
 */
public class PancakeHouseIterator implements IIterator{
    private final java.util.ArrayList<MenuItem> items;
    private int position;

    public PancakeHouseIterator(ArrayList<MenuItem> items) {
        this.items = items;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return ((this.position < items.size()) && (items.get(position) != null));
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(this.position);
        ++this.position;
        return item;
    }
    
    
  
}
