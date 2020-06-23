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
public interface IObserver {
	/**
	 * update data from WeatherData to Object that implements IObserver
	 * @param data WeatherData that store data to update
	 */
	public void update(WeatherData data);
}
