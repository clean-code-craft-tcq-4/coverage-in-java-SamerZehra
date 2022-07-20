package Typewisealert;

import Typewisealert.constants.AlertTarget;
import Typewisealert.constants.BreachType;
import Typewisealert.constants.CoolingType;

public class TypewiseAlert {
    
	public static BreachType classifyTemperatureBreach(CoolingType coolingType, double temperatureInC) {
		int lowerLimit = 0;
		int upperLimit = 0;
		if (coolingType != null) {
			lowerLimit = coolingType.getTempLowerLimit();
			upperLimit = coolingType.getTempUpperLimit();
		}
		return BreachType.inferBreach(temperatureInC, lowerLimit, upperLimit);
	}
	
	public static int checkAndAlert(AlertTarget alertTarget, BatteryCharacter batteryChar, double temperatureInC) {

		BreachType breachType = classifyTemperatureBreach(batteryChar.coolingType ,temperatureInC);
		
		if(alertTarget == AlertTarget.TO_CONTROLLER) {
			Alerter.sendToController(breachType);
			return 1;
			
		}else {
			Alerter.sendToEmail(breachType);
			return 1;
		}
	}
	
}
