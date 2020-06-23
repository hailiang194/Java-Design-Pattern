/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import Decorator.Coffee.DarkRoast;
import Decorator.Coffee.Decaf;
import Decorator.Coffee.Espresso;
import Decorator.Coffee.HouseBlend;
import Decorator.Condiment.Mocha;
import Decorator.Condiment.Soy;
import Decorator.Condiment.StramedMilk;
import Decorator.Condiment.Whip;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hailiang194
 */
public class Demo {
	
	private static final int YES = 1;
	private static final int NO = 0;
	
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public enum COFFEE
	{
		HOUSE_BLEND,
		DARK_ROAST,
		DECAF,
		ESPRESSO
	};
	
	public enum CONDIMENT
	{
		STREAMED_MILK,
		MOCHA,
		SOY,
		WHIP
	}
	
	public static Beverage inputCoffee() throws IOException
	{
		COFFEE[] coffees = COFFEE.values();
		
		System.out.println("Choose coffee:");
		for(int i = 0 ; i < coffees.length; i++)
		{
			System.out.println(i + ". " + coffees[i].toString().replace('_', ' '));
		}
		
		COFFEE coffee = coffees[Integer.parseInt(in.readLine())];
		
		switch(coffee)
		{
			case HOUSE_BLEND:
				return new HouseBlend();
			case DARK_ROAST:
				return new DarkRoast();
			case DECAF:
				return new Decaf();
			case ESPRESSO:
				return new Espresso();
		}
		
		return null;
	}
	
	public static Beverage inputCondiment(Beverage beverage) throws IOException
	{
		System.out.println("Choose condiment");
		
		CONDIMENT[] condiments = CONDIMENT.values();
		
		for(int i = 0; i < condiments.length; i++)
		{
			System.out.println(i + ". " + condiments[i]);
		}
		
		CONDIMENT condiment = condiments[Integer.parseInt(in.readLine())];
		
		switch(condiment)
		{
			case STREAMED_MILK:
				return new StramedMilk(beverage);
			case MOCHA:
				return new Mocha(beverage);
			case SOY:
				return new Soy(beverage);
			case WHIP:
				return new Whip(beverage);
		}
		
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		
		int option = NO;
		
		while(option != YES)
		{
			Beverage beverage = inputCoffee();
			
			while(true)
			{
				System.out.println("Do you want to add more condiment?(1 for yes/ 0 for no)");
				int condimentOption = Integer.parseInt(in.readLine());
				
				if(condimentOption == NO)
					break;
				
				beverage = inputCondiment(beverage);
			}
			
			System.out.println("Order name = " + beverage.getDecription());
			System.out.println("Cost = " + beverage.cost());
			
			System.out.println("Do you want to exit?(1 for yes, 0 for no)");
			option = Integer.parseInt(in.readLine());
		}
	}
}
