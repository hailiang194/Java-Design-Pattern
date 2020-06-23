/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator.Condiment;

import Decorator.Beverage;
import Decorator.CondimentDecorator;

/**
 *
 * @author hailiang194
 */
public class Soy extends CondimentDecorator{

	private Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
		
	@Override
	public String getDecription() {
		return beverage.getDecription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.15;
	}
	
}
