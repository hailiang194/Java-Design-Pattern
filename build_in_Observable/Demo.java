/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build_in_Observable;

/**
 *
 * @author hailiang194
 */
public class Demo {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(data);
		
		data.setMeasurements(29, 20, 5);
		data.setMeasurements(31, 30, 2);
	}
}
