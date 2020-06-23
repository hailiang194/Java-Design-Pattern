/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 * Demo for observer pattern
 * @author hailiang194
 */
public class Demo {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(data);
		StatisticsDisplay statisic = new StatisticsDisplay(data);
		
		data.setMeasurements(20, 10, 8);
		data.setMeasurements(30, 20, 5);
	}
}
