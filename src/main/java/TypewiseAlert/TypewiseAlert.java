package typewisealert;

import typewisealert.constants.AlertTarget;
import typewisealert.constants.BreachType;
import typewisealert.constants.CoolingType;

public class TypewiseAlert {
    
	public static void checkAndAlert(AlertTarget alertTarget, CoolingType coolingType, double temperatureInC) {

		BreachType breachType = BatteryCharacter.classifyTemperatureBreach(coolingType ,temperatureInC);
		
		if(alertTarget == AlertTarget.TO_CONTROLLER) {
			Alerter.sendToController(breachType);
		}else {
			Alerter.sendToEmail(breachType);
		}
	}
	
}
