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
public class Whip extends CondimentDecorator{

	private Beverage beverage;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	
	
	@Override
	public String getDecription() {
		return beverage.getDecription() + ", Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.10;
	}
	
}
