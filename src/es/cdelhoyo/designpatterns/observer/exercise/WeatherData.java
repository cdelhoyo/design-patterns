package es.cdelhoyo.designpatterns.observer.exercise;


public class WeatherData {

	private CurrentConditionsDisplay currentConditionsDisplay;
	private StatisticsDisplay staticsDisplay;
	private ForecastDisplay forecastDisplay;

	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(CurrentConditionsDisplay currentConditionsDisplay, StatisticsDisplay staticsDisplay, ForecastDisplay forecastDisplay){
		this.currentConditionsDisplay = currentConditionsDisplay;
		this.staticsDisplay = staticsDisplay;
		this.forecastDisplay = forecastDisplay;
	}

	
	public void measurementsChanged() {
		currentConditionsDisplay.update(temperature, humidity, pressure);
		staticsDisplay.update(temperature, humidity, pressure);
		forecastDisplay.update(temperature, humidity, pressure);
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}

}
