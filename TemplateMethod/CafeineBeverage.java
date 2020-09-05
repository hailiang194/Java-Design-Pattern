/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author hailiang194
 */
public abstract class CafeineBeverage {
	public void boilWater()
	{
		System.out.println("Boiling water");
	}
	
	public abstract void brew();
	
	public void pourInCup()
	{
		System.out.println("Pouring in cup");
	}
	
	public abstract void addCondiments();
	
	final public void prepare()
	{
		this.boilWater();
		this.brew();
		this.pourInCup();
		this.addCondiments();
	}
}
