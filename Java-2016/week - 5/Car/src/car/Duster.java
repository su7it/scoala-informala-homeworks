package car;

public class Duster extends Dacia {
	private final static float FUEL_TANK_SIZE = 80f;
	private final static int NUMBER_OF_GEARS = 6;
	private final static float CONSUMTION_KM = 0.095f;
	private final static String FUEL_TYPE = "Diesel";

	public Duster(float availableFuel, String chasseNumber) {
		super(availableFuel, chasseNumber, FUEL_TANK_SIZE, FUEL_TYPE, NUMBER_OF_GEARS, CONSUMTION_KM);
	}

	float calculateFuelKm(int gear) {
		float fuelValue;
		switch (gear) {
		case 1:
			fuelValue = 0.105f;
			break;
		case 2:
			fuelValue = 0.092f;
			break;
		case 3:
			fuelValue = 0.084f;
			break;
		case 4:
			fuelValue = 0.077f;
			break;
		case 5:
			fuelValue = 0.076f;
			break;
		case 6:
			fuelValue = 0.069f;
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
