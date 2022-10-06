package week5Homework;

public class App {

	public static void main(String[] args) {
		
		Logger logger = new AsteriskLogger();
		
		logger.log("Hello");
		logger.error("not today");
		
		Logger logger2 = new SpacedLogger();
		logger2.log("Hello");
		logger2.error("Hello");
		
	}

}
