/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author hailiang194
 */
public class HasQuarterState implements IState{

    private Gumball gumBall;

    public HasQuarterState(Gumball gumBall) {
        this.gumBall = gumBall;
    }
    
    
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned.");
        this.gumBall.setState(this.gumBall.NO_QUARTER_STATE);
    }

    @Override
    public void turnCrack() {
        System.out.println("Your turned...");
        this.gumBall.setState(this.gumBall.SOLD_STATE);
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
    
}
