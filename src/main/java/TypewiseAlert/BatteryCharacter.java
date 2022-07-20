package TypewiseAlert;

import TypewiseAlert.constants.BreachType;
import TypewiseAlert.constants.CoolingType;

public class BatteryCharacter {
	public CoolingType coolingType;
	public static String brand;
    
	public BatteryCharacter(CoolingType coolingType, String brand) {
		this.coolingType = coolingType;
		this.brand = brand;
	}
}
