package car;

public abstract class VW extends Car {

	public VW(float availableFuel, String chasseNumber, float fuelTankSize, String fuelType, int numberOfGears,
			float fuelConsumption) {
		super(availableFuel, chasseNumber, fuelTankSize, fuelType, numberOfGears, fuelConsumption);
	}

	abstract float consumtionCompute(double numberOfKm, int gear);

}
