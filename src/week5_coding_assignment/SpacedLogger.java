package week5Homework;

public class SpacedLogger implements Logger{
	
	@Override
	public void log(String log) {
		System.out.println(log.replace("", " ").trim());
		
	}
	
	@Override
	public void error(String error) {
		System.err.println("Error: " + error.replace("", " ").trim());
		
	}

}
