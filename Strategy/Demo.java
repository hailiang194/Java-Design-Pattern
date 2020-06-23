/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

import Strategy.Ducks.DecoyDuck;
import Strategy.Ducks.MallanDuck;
import Strategy.Ducks.RedHeadDuck;
import Strategy.Ducks.RubberDuck;
import java.util.ArrayList;

/**
 * Demo for strategy pattern
 * @author hailiang194
 */
public class Demo {
	public static void main(String[] args) {
		ArrayList<Duck> ducks = new ArrayList();
		
		ducks.add(new MallanDuck());
		ducks.add(new RedHeadDuck());
		ducks.add(new RubberDuck());
		ducks.add(new DecoyDuck());
		
		for (Duck duck : ducks) {
			System.out.println("demo for " + duck.what());
			
			System.out.print("fly: ");
			duck.performFly();
			
			System.out.print("quack: ");
			duck.performQuack();
			
			System.out.println();
		}
	}
}
