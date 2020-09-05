/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.control;

/**
 *
 * @author hailiang194
 */
public class Fan {
	public enum SPEED_STATUS {OFF, LOW, MEDIUM, HIGH};
	private SPEED_STATUS speed;

	public Fan() {
		this.speed = SPEED_STATUS.OFF;
	}

	public SPEED_STATUS getSpeed() {
		return this.speed;
	}

	public void setSpeed(SPEED_STATUS speed) {
		this.speed = speed;
		System.out.println("Speead mode = " + this.speed.name());
	}
	
	
}
