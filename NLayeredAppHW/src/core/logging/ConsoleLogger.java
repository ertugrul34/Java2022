package core.logging;

public class ConsoleLogger implements ILogger {

	@Override
	public void log(String data) {
		System.out.println("Logged to console : ");

	}

}
