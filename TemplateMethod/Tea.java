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
public class Tea extends CafeineBeverage{

	@Override
	public void brew() {
		System.out.println("Steeping tea bag");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
	
}
