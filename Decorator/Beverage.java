/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author hailiang194
 */
public abstract class Beverage {
	protected String decription = "Unknown Beverage";

	public String getDecription() {
		return decription;
	}
	
	public abstract double cost();
}
