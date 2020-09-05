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
public class NYStyleChessePizza extends Pizza{

	public NYStyleChessePizza() {
		this.name = "NY Style Sauce and Cheese Pizza";
		this.dough = "Thin Crust Dough";
		this.sauce = "Marinara Sauce";
		
		this.toppings.add("Grated Reggiano Cheese");
	}
	
}
