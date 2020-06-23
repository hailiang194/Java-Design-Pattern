/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy.Quack;

import Strategy.IQuackBehavior;

/**
 *
 * @author hailiang194
 */
public class Squeak implements IQuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak squeak!");
	}
	
}
