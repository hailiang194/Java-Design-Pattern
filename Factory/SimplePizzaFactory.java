/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Factory.Pizza.ChicagoStyleCheesePizza;
import Factory.Pizza.NYStyleChessePizza;
import Factory.Pizza.Pizza;

/**
 *
 * @author hailiang194
 */
public class SimplePizzaFactory {
	public Pizza createPizza(String type)
	{
		Pizza pizza = null;
		
		if(type.equals("NY Style"))
			pizza = new NYStyleChessePizza();
		else if(type.equals("Chicago Style"))
			pizza = new ChicagoStyleCheesePizza();
		
		return pizza;
	}
}
