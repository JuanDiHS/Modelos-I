//Cliente
public class App {

	public static void main(String[] args) {
		EjemploObservable observable = new EjemploObservable();
		observable.addObserver(new EjemploIObserver());
		observable.addObserver(new EjemploIIObserver());
		
		observable.notifyObservers();
		
		observable.addObserver(new EjemploIIIObserver());
		observable.notifyObservers();
	}
		

	}

