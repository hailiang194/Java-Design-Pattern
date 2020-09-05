/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.remote;

import Command.ICommand;

/**
 *
 * @author hailiang194
 */
public class SimpleRemote {
	private Command.ICommand slot;

	public SimpleRemote() {
	}

	public void setSlot(ICommand slot) {
		this.slot = slot;
	}
	
	public void buttonWasPressed()
	{
		this.slot.execute();
	}
}
