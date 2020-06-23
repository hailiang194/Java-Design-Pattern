/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author hailiang194
 */
public abstract class Duck {
	protected IFlyBehavior flyBehavior;
	protected IQuackBehavior quackBehavior;

	protected String type;

		
	public IFlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(IFlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public IQuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(IQuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	/**
	 * duck fly
	 */
	public void performFly()
	{
		flyBehavior.fly();
	}
	
	/**
	 * duck quack
	 */
	public void performQuack()
	{
		quackBehavior.quack();
	}
	
	/**
	 * what is this duck
	 * @return type of duck
	 */
	public String what()
	{
		return type;
	}
}
