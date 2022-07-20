package Typewisealert;

import Typewisealert.constants.BreachType;
import Typewisealert.constants.CoolingType;

public class BatteryCharacter {
	public CoolingType coolingType;
	public static String brand;
    
	public BatteryCharacter(CoolingType coolingType, String brand) {
		this.coolingType = coolingType;
		this.brand = brand;
	}
}
