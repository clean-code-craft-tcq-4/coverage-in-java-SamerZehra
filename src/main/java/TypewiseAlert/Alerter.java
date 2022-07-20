package Typewisealert;

import Typewisealert.constants.BreachType;

public class Alerter {

	

	public static boolean sendToController(BreachType breachType) {
		int header = 0xfeed;
		printControllerAlert(header, breachType);
		return true;
	}

	public static boolean sendToEmail(BreachType breachType) {
		String recepient = "a.b@c.com";
		printEmailAlert(recepient, breachType.name());
		return true;
	}

	private static void printEmailAlert(String recepient, String contetnt) {
		System.out.printf("To: %s\n", recepient);
		System.out.println("Hi, the temperature is \t" + contetnt + "\n");
	}

	private static void printControllerAlert(int header, BreachType breachType) {
		System.out.println( header + ":"+ breachType);
	}

}
