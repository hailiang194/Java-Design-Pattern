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
public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("Gobble Gobble");
	}

	@Override
	public void fly() {
		System.out.println("I'm flying a short distance");
	}
	
}
