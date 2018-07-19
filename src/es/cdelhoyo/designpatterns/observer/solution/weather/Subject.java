package es.cdelhoyo.designpatterns.observer.solution.weather;

public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
