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
public class Demo {
    public static void main(String[] args) {
        Gumball gumBall = new Gumball();
        gumBall.setNumOfGumball(5);
        
        System.out.println(gumBall);
        
        gumBall.insertQuarter();
        gumBall.turnCrack();
        
        System.out.println(gumBall);
        
        gumBall.insertQuarter();
        gumBall.ejectQuarter();
        gumBall.turnCrack();
        
        System.out.println(gumBall);
        
        gumBall.insertQuarter();
        gumBall.turnCrack();
        gumBall.insertQuarter();
        gumBall.turnCrack();
        gumBall.ejectQuarter();
        
        System.out.println(gumBall);
        
        gumBall.insertQuarter();
        gumBall.insertQuarter();
        gumBall.turnCrack();
        gumBall.insertQuarter();
        gumBall.turnCrack();
        gumBall.insertQuarter();
        gumBall.turnCrack();
        
        System.out.println(gumBall);
    }
}
