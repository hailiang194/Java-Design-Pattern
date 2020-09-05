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
public class SoldOutState implements IState{

    private Gumball gumBall;

    public SoldOutState(Gumball gumBall) {
        this.gumBall = gumBall;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven' inserted a quarter yet.");
    }

    @Override
    public void turnCrack() {
        System.out.println("Your turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    
}
