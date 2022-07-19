package typewisealert;

import javax.swing.text.AbstractDocument.BranchElement;

import typewisealert.constants.BreachType;
import typewisealert.constants.CoolingType;

public class BatteryCharacter {
	public CoolingType coolingType;
	public static String brand;
    
    public static BreachType classifyTemperatureBreach(CoolingType coolingType ,double temperatureInC) {
		int lowerLimit = 0;
		int upperLimit = 0;
		switch (coolingType) {
		case PASSIVE_COOLING:
			upperLimit = 35;
			break;
		case HI_ACTIVE_COOLING:
			upperLimit = 45;
			break;
		case MED_ACTIVE_COOLING:
			upperLimit = 40;
			break;
		}
		brand = coolingType.name();
		System.out.println("Brand : " + brand);
		return BreachType.inferBreach(temperatureInC, lowerLimit, upperLimit);
	}
}
