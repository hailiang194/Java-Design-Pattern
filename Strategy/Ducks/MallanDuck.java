/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy.Ducks;

import Strategy.Duck;
import Strategy.Fly.FlyWithWings;
import Strategy.Quack.Quack;

/**
 *
 * @author hailiang194
 */
public class MallanDuck extends Duck{

	public MallanDuck() {
		type = "Mallan Duck";
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	
}
