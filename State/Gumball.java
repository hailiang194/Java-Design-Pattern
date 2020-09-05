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
public class Gumball {

    private IState state;
    private int numOfGumball;
    public final SoldOutState SOLD_OUT_STATE = new SoldOutState(this);
    public final SoldState SOLD_STATE = new SoldState(this);
    public final NoQuarterState NO_QUARTER_STATE = new NoQuarterState(this);
    public final HasQuarterState HAS_QUARTER_STATE = new HasQuarterState(this);

    public Gumball() {
        this.state = this.SOLD_OUT_STATE;
        this.numOfGumball = 0;
    }

    public void setNumOfGumball(int numOfGumball) {
        if(numOfGumball > 0)
            this.state = NO_QUARTER_STATE;
        else if(this.numOfGumball == 0)
            this.state = SOLD_OUT_STATE;
        
        this.numOfGumball = numOfGumball;
    }

    public int getNumOfGumball() {
        return numOfGumball;
    }

    public void soldGumBall(int soldGumBall) {
        this.numOfGumball -= soldGumBall;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrack() {
        this.state.turnCrack();
    }

    public void dispense() {
        this.state.dispense();
    }

    @Override
    public String toString() {
        return "Gumball{" + "state=" + state + ", numOfGumball=" + numOfGumball + '}';
    }
    
    

}
