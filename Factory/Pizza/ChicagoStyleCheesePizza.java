/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.Pizza;

/**
 *
 * @author hailiang194
 */
public class ChicagoStyleCheesePizza extends Pizza{

	public ChicagoStyleCheesePizza() {
		this.name = "Chicago Style Deep Dish Cheese Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
		
		toppings.add("Sheredded Mozzarella Cheese");
	}
	
	@Override
	public void cut()
	{
		System.out.println("Cutting the pizza into square slices");
	}
}
