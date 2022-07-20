package TypewiseAlert;


import static org.junit.Assert.assertTrue;

import org.junit.Test;


import TypewiseAlert.BatteryCharacter;
import TypewiseAlert.TypewiseAlert;
import TypewiseAlert.constants.AlertTarget;
import TypewiseAlert.constants.BreachType;
import TypewiseAlert.constants.CoolingType;

public class TypewiseAlertTest {
	
	@Test
	public void infersBreachAsPerLimits() {
		assertTrue(BreachType.inferBreach(12, 20, 30) == BreachType.TOO_LOW);
		assertTrue(BreachType.inferBreach(40, 30, 40) == BreachType.NORMAL);
		assertTrue(BreachType.inferBreach(55, 45, 50) == BreachType.TOO_HIGH);
	}
	
	@Test
	public void verifyBreachType() {
		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, -10) == BreachType.TOO_LOW);
		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, 15) == BreachType.NORMAL);
		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, 55) == BreachType.TOO_HIGH);
	}
	 @Test
	 public void verifyEmailHighAlertSent() {
		 BatteryCharacter batteryChar = new BatteryCharacter(CoolingType.HI_ACTIVE_COOLING, "bosch");
		 assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, batteryChar, 55) == 1);
		 
	 }
	 
	 @Test
	 public void verifyEmailLowAlertSent() {
		 BatteryCharacter batteryChar = new BatteryCharacter(CoolingType.PASSIVE_COOLING, "bosch");
		 assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, batteryChar, -10) == 1);
	 }
	 
	 @Test
	 public void verifyControllerAlertSent() {
		 BatteryCharacter batteryChar = new BatteryCharacter(CoolingType.PASSIVE_COOLING, "bosch");
		 assertTrue(TypewiseAlert.checkAndAlert(AlertTarget.TO_CONTROLLER, batteryChar, -10) == 1);
	 }
}
