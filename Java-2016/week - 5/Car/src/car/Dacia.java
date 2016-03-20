package car;

public abstract class Dacia extends Car {
	public Dacia(float availableFuel, String chasseNumber, float fuelTankSize, String fuelType, int numberOfGears,
			float fuelConsumption) {
		super(availableFuel, chasseNumber, fuelTankSize, fuelType, numberOfGears, fuelConsumption);
	}

	abstract float consumtionCompute(double numberOfKm, int gear);
}
