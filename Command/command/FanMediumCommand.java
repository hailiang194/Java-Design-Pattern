/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.command;

/**
 *
 * @author hailiang194
 */
public class FanMediumCommand implements Command.ICommand{
	private Command.control.Fan fan;
	private Command.control.Fan.SPEED_STATUS prevSpeed;
	public FanMediumCommand(Command.control.Fan fan) {
		this.fan = fan;
	}

	@Override
	public void execute() {
		this.prevSpeed = fan.getSpeed();
		this.fan.setSpeed(Command.control.Fan.SPEED_STATUS.MEDIUM);
	}

	@Override
	public void undo() {
		this.fan.setSpeed(this.prevSpeed);
	}
	
	
}
