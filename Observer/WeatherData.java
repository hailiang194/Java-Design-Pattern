/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this temperature file, choose Tools | temperatures
 * and open the temperature in the editor.
 */
package Observer;

import java.util.ArrayList;

/**
 *
 * @author hailiang194
 */
public class WeatherData implements ISubject{

	private ArrayList<IObserver> observers;
	private double temperature;
	private double humidity;
	private double pressure;

	public static final double MIN_TEMPERATURE = -273.15;
	
	public WeatherData() {
		observers = new ArrayList<>();
		temperature = MIN_TEMPERATURE;
		humidity = 0.0;
		pressure = 0.0;
	}
	
	/**
	 * run when measurements has been changed
	 */
	public void measurementsChanged()
	{
		notifyObserver();
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
	
	
	
	/**
	 * update weather data
	 * @param temperature new temperature
	 * @param humidity new humidity
	 * @param pressure new pressure
	 */
	public void setMeasurements(double temperature, double humidity, double pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	@Override
	public void resigterObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		int index = observers.indexOf(observer);
		
		if(index > 0)
		{
			observers.remove(index);
		}
	}

	@Override
	public void notifyObserver() {
		for (IObserver observer : observers) {
			observer.update(this);
		}
	}
	
}
