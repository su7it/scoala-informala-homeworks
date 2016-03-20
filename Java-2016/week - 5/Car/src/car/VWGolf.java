package car;

public class VWGolf extends VW {

	private final static float FUEL_TANK_SIZE = 50f;
	private final static int NUMBER_OF_GEARS = 5;
	private final static float CONSUMTION_KM = 0.065f;
	private final static String FUEL_TYPE = "Gas";

	public VWGolf(float availableFuel, String chasseNumber) {
		super(availableFuel, chasseNumber, FUEL_TANK_SIZE, FUEL_TYPE, NUMBER_OF_GEARS, CONSUMTION_KM);
	}

	float calculateFuelKm(int gear) {
		float fuelValue;
		switch (gear) {
		case 1:
			fuelValue = 0.075f;
			break;
		case 2:
			fuelValue = 0.062f;
			break;
		case 3:
			fuelValue = 0.054f;
			break;
		case 4:
			fuelValue = 0.057f;
			break;
		case 5:
			fuelValue = 0.049f;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void drive(double numberOfKm) {
		// TODO Auto-generated method stub

	}

	@Override
	float consumtionCompute(double numberOfKm, int gear) {
		// TODO Auto-generated method stub
		return 0;
	}

}
