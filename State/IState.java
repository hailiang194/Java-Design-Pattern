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
public interface IState {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrack();
    public void dispense();
}
