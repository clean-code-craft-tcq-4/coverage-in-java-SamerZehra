package TypewiseAlert.constants;

public enum BreachType {
	NORMAL, TOO_LOW, TOO_HIGH;

	public static BreachType inferBreach(double value, double lowerLimit, double upperLimit) {
		if (value < lowerLimit) {
			return BreachType.TOO_LOW;
		}
		
		return (value > upperLimit)? BreachType.TOO_HIGH : BreachType.NORMAL;
	}
}
