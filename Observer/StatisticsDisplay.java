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
public class StatisticsDisplay implements IObserver, IDisplay{

	private double maxTemperature;
	private double minTemperature;
	private double totalTemperature;
	private int measureTimes; //count the time measure
	private WeatherData weatherData;

	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.resigterObserver(this);
		double temperature = weatherData.getTemperature();
		
		maxTemperature = temperature;
		minTemperature = temperature;
		totalTemperature = temperature;
		
		if(Double.compare(temperature, WeatherData.MIN_TEMPERATURE) <= 0)
		{
			measureTimes = 0;
		}
		else
		{
			measureTimes = 1;
		}
	}
	
	
	
	@Override
	public void update(WeatherData data) {
		double temperature = data.getTemperature();
		
		if(measureTimes == 0)
		{
			maxTemperature = temperature;
			minTemperature = temperature;
			totalTemperature = temperature;
			measureTimes++;
			display();
			return;
		}
		
		maxTemperature = (temperature > maxTemperature) ? temperature : maxTemperature;
		minTemperature = (temperature < minTemperature) ? temperature : minTemperature;
		totalTemperature += temperature;
		measureTimes++;
		display();
	}

	public double getMaxTemperature() {
		return maxTemperature;
	}

	public double getMinTemperature() {
		return minTemperature;
	}
	
	public double getAverageTemperature()
	{
		if(measureTimes == 0)
			return 0.0;
		
		return (totalTemperature / measureTimes);
	}

	@Override
	public void display() {
		if(measureTimes == 0)
		{
			System.out.println("No statistic data.");
		}
		else
		{
			System.out.println("Max/Avg/Min temperature: " + getMaxTemperature() + ", " + getAverageTemperature() + ", " + getMinTemperature());
		}
	}
	
}
