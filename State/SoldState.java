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
public class SoldState implements IState {

    private Gumball gumBall;

    public SoldState(Gumball gumBall) {
        this.gumBall = gumBall;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you haven't inserted a quarter");
    }

    @Override
    public void turnCrack() {
        System.out.println("Turning twice doesn't get you another gumball");
    }

    @Override
    public void dispense() {
        System.out.println("A gumball comes rollings out the slot.");
        this.gumBall.soldGumBall(1);
        if (this.gumBall.getNumOfGumball() == 0) {
            System.out.println("Opps, out of gumballs");
            this.gumBall.setState(this.gumBall.SOLD_OUT_STATE);
        } else {
            this.gumBall.setState(this.gumBall.NO_QUARTER_STATE);
        }
    }

}
