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
public class Demo {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		System.out.println("Preparing coffee");
		coffee.prepare();
		
		Tea tea = new Tea();
		System.out.println("Preparing tea");
		tea.prepare();
	}
}
