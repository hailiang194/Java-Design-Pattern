/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator.Coffee;

import Decorator.Beverage;

/**
 *
 * @author hailiang194
 */
public class HouseBlend extends Beverage{

	public HouseBlend() {
		decription = "House Blend";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}
	
}
