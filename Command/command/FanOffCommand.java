/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.command;

import Command.control.Fan;

/**
 *
 * @author hailiang194
 */
public class FanOffCommand implements Command.ICommand{
	private Command.control.Fan fan;
	private Command.control.Fan.SPEED_STATUS prevSpeed;
	public FanOffCommand(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		this.prevSpeed = fan.getSpeed();
		this.fan.setSpeed(Command.control.Fan.SPEED_STATUS.OFF);
	}

	@Override
	public void undo() {
		this.fan.setSpeed(this.prevSpeed);
	}
	
	
}
