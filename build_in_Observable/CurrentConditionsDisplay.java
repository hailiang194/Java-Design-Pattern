/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package build_in_Observable;

import java.util.Observable;

/**
 *
 * @author hailiang194
 */
public class CurrentConditionsDisplay implements java.util.Observer, IDisplayElement {

	java.util.Observable observable;
	private double temperature;
	private double humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData)
		{
			WeatherData data = (WeatherData)o;
			this.temperature = data.getTemperature();
			this.humidity = data.getHumidity();
			display();
		}
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "*C and " + humidity + "% humidity.");
	}
	
}
