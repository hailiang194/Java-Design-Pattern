/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy.Ducks;

import Strategy.Duck;
import Strategy.Fly.FlyNoWay;
import Strategy.Quack.Squeak;

/**
 *
 * @author hailiang194
 */
public class RubberDuck extends Duck{

	public RubberDuck() {
		type = "Rubber duck";
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
}
