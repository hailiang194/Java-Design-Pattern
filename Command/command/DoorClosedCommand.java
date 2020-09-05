/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.command;

import Command.control.Door;

/**
 *
 * @author hailiang194
 */
public class DoorClosedCommand implements Command.ICommand{
	private Command.control.Door door;

	public DoorClosedCommand(Door door) {
		this.door = door;
	}

	@Override
	public void execute() {
		this.door.close();
	}

	@Override
	public void undo() {
		this.door.open();
	}
	
	
}
