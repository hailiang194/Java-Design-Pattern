/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author hailiang194
 */
public interface ICommand {
	/**
	 * execute the command
	 */
	public void execute();
	
	/**
	 * execute previous command
	 */
	public void undo();
}
