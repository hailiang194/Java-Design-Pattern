/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author hailiang194
 */
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	
	private static ChocolateBoiler instance = new ChocolateBoiler();
	
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		return instance;
	}
	
	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
	
	public void fill()
	{
		if(this.isEmpty())
		{
			empty = false;
			boiled = false;
		}
	}
	
	public void drain()
	{
		if(!this.isEmpty() && this.isBoiled())
		{
			this.empty = false;
		}
	}
	
	public void boil()
	{
		if(!this.isEmpty() && !this.isBoiled())
		{
			this.boiled = true;
		}
	}
}
