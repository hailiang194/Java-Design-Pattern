/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author hailiang194
 */
public class Demo {
	public static void main(String[] args) {
		PizzaStore store = new PizzaStore(new SimplePizzaFactory());
		
		store.orderPizza("NY Style");
		System.out.println("");
		store.orderPizza("Chicago Style");
	}
}
