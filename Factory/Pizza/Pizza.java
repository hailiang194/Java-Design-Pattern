/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory.Pizza;

import java.util.ArrayList;

/**
 *
 * @author hailiang194
 */
public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings = new ArrayList<>();
	
	public void prepare()
	{
		System.out.println("Preparing " + this.name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings...");
		for (String topping : toppings) {
			System.out.println("\t" + topping);
		}
	}
	
	public void bake()
	{
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut()
	{
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box()
	{
		System.out.println("Place pizza in offical PizzaStore box");
	}

	public String getName() {
		return name;
	}
	
	
}
