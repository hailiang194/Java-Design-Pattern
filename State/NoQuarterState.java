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
public class NoQuarterState implements IState{

    private Gumball gumBall;

    public NoQuarterState(Gumball gumBall) {
        this.gumBall = gumBall;
    }
    
    
    @Override
    public void insertQuarter() {
        this.gumBall.setState(this.gumBall.HAS_QUARTER_STATE);
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrack() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
    
}
