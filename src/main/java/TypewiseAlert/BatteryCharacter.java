package typewisealert;

import typewisealert.constants.BreachType;
import typewisealert.constants.CoolingType;

public class BatteryCharacter {
	public CoolingType coolingType;
	public static String brand;
    
	public BatteryCharacter(CoolingType coolingType, String brand) {
		this.coolingType = coolingType;
		this.brand = brand;
	}
}
