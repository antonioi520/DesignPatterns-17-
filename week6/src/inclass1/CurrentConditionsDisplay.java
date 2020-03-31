package inclass1;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private float temperature;
	private float minTemp;
	private float maxTemp;
	private float avgTemp;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Avg/Max/Min Temperature = " + minTemp + "/" + maxTemp + "/" + avgTemp);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		if (temperature < minTemp) minTemp = temperature;
		if (temperature > maxTemp) maxTemp = temperature;
		avgTemp = (avgTemp + temperature) / 2;
		display();
	}
	
}
