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
public class CurrentConditionsDisplay implements IObserver, IDisplay{

	private double temperature;
	private double himidity;
	private ISubject weatherData;

	public CurrentConditionsDisplay(ISubject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.resigterObserver(this);
	}
	
	
	
	@Override
	public void update(WeatherData data) {
		this.temperature = data.getTemperature();
		this.himidity = data.getHumidity();
		display();
	}

	@Override
	public void display() {
		System.out.printf("Current conditions %.0f *C and %.2f%% himidity.", this.temperature, this.himidity);
	}
	
}
