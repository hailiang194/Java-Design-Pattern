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
public class WeatherData extends java.util.Observable{
	private double temperature;
	private double humidity;
	private double pressure;

	public WeatherData() {
	}
	
	public void measurementsChanged()
	{
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(double temperature, double humidity, double pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}
	
}
