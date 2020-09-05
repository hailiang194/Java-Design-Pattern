/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command.remote;

/**
 *
 * @author hailiang194
 */
public class RemoteControl {
	public static int TOTAL_SLOT = 6;
	private Command.ICommand[] onCmds;
	private Command.ICommand[] offCmds;
	private Command.ICommand undoCmd;
	
	public RemoteControl() {
		this.onCmds = new Command.ICommand[TOTAL_SLOT];
		this.offCmds = new Command.ICommand[TOTAL_SLOT];
	
		for (int i = 0; i < TOTAL_SLOT; i++) {
			this.onCmds[i] = new Command.command.NoCommand();
			this.offCmds[i] = new Command.command.NoCommand();
		}
		
		this.undoCmd = new Command.command.NoCommand();
	}
	
	public void setCommand(int slot, Command.ICommand onCmd, Command.ICommand offCmd)
	{
		if(slot >= TOTAL_SLOT)
			return;
		
		this.onCmds[slot] = onCmd;
		this.offCmds[slot] = offCmd;
	}
	
	public void onButtonPushed(int slot)
	{
		if(slot >= TOTAL_SLOT)
			return;
		
		this.onCmds[slot].execute();
		this.undoCmd = this.onCmds[slot];
	}
	
	public void offButtonPushed(int slot)
	{
		if(slot >= TOTAL_SLOT)
			return;
		
		this.offCmds[slot].execute();
		this.undoCmd = this.offCmds[slot];
	}
	
	public void undoButtonPushed()
	{
		this.undoCmd.undo();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < TOTAL_SLOT; i++) {
			builder.append("[slot ").append(i).append("]: ").append(this.onCmds[i].getClass().getName()).append(", ").append(this.offCmds[i].getClass().getName()).append("\n");
		}
		builder.append("[Undo]: ").append(this.undoCmd.getClass().getName()).append("\n");
		
		return builder.toString();
	}
	
	
}
