package es.cdelhoyo.designpatterns.observer.exercise;

import java.util.concurrent.TimeUnit;

public class WeatherStation {

	public static void main(String[] args) throws InterruptedException {
		CurrentConditionsDisplay currentDisplay =  new CurrentConditionsDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();

		WeatherData weatherData = new WeatherData(currentDisplay, statisticsDisplay, forecastDisplay);

		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println("\n\n\n\n");
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println("\n\n\n\n");
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
