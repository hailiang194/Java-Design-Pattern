/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author hailiang194
 */
public interface ISubject {
	/**
	 * add new observer to observer list
	 * @param observer added observer
	 */
	public void resigterObserver(IObserver observer);
	
	/**
	 * remove observer in observer list
	 * @param observer removed observer
	 */
	public void removeObserver(IObserver observer);
	
	/**
	 * update all observers in observer list
	 */
	public void notifyObserver();
}
