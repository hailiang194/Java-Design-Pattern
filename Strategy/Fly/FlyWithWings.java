/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy.Fly;

import Strategy.IFlyBehavior;

/**
 *
 * @author hailiang194
 */
public class FlyWithWings implements IFlyBehavior{

	@Override
	public void fly() {
		System.out.println("I have wings so I can fly.");
	}

}
