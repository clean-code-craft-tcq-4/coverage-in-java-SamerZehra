package typewisealert;

import typewisealert.constants.BreachType;

public class Alerter {

	public static void sendToController(BreachType breachType) {
		int header = 0xfeed;
		System.out.print(header);
		System.out.println(" \n " + breachType);
	}

	public static void sendToEmail(BreachType breachType) {
		String recepient = "a.b@c.com";
		switch (breachType) {
		case TOO_LOW:
			System.out.printf("To: %s\n", recepient);
			System.out.println("Hi, the temperature is too low\n");
			break;
		case TOO_HIGH:
			System.out.printf("To: %s\n", recepient);
			System.out.println("Hi, the temperature is too high\n");
			break;
		case NORMAL:
			break;
		}
	}
}
