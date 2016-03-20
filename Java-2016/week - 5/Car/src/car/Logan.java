package car;

public class Logan extends Dacia {

	private final static float FUEL_TANK_SIZE = 60f;
	private final static int NUMBER_OF_GEARS = 5;
	private final static float CONSUMTION_KM = 0.070f;
	private final static String FUEL_TYPE = "Diesel";

	public Logan(float availableFuel, String chasseNumber) {
		super(availableFuel, chasseNumber, FUEL_TANK_SIZE, FUEL_TYPE, NUMBER_OF_GEARS, CONSUMTION_KM);
	}

	float calculateFuelKm(int gear) {
		float fuelValue;
		switch (gear) {
		case 1:
			fuelValue = 0.085f;
			break;
		case 2:
			fuelValue = 0.062f;
			break;
		case 3:
			fuelValue = 0.054f;
			break;
		case 4:
			fuelValue = 0.047f;
			break;
		case 5:
			fuelValue = 0.039f;
			break;
		default:
			fuelValue = 0.01f;
			break;
		}
		return fuelValue;
	}

	public float consumptionCompute(double numberOfKm, int gear) {
		float consumption;
		if (gear != 0) {
			consumption = (float) (calculateFuelKm(getCurrentGear()) * numberOfKm);
			return consumption;
		} else
			return (float) (CONSUMTION_KM * numberOfKm);
	}

	@Override
	public void start() {
	}

	@Override
	public void stop() {

	}

	@Override
	public void drive(double numberOfKm) {

	}

	@Override
	float consumtionCompute(double numberOfKm, int gear) {
		return 0;
	}

}
