/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author hailiang194
 */
public class Demo {
	public static void testDuck(Duck duck)
	{
		duck.quack();
		duck.fly();
	}
	
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe duck says...");
		testDuck(duck);
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
}
