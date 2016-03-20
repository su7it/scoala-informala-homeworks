package car;

public abstract class Car implements Vehicle {
	private String chasseNumber;
	private final float fuelTankSize;
	private String fuelType;
	private final int numberOfGears;
	private float fuelConsumption;
	private int currentGear;
	private int gear;
	private float currentKm;
	private float currentConsumption;
	private float fuelInTank;
	private float availableFuelInTank;

	public Car(float availableFuel, String chasseNumber, float fuelTankSize, String fuelType, int numberOfGears,
			float fuelConsumption) {
		this.availableFuelInTank = availableFuel;
		this.fuelTankSize = fuelTankSize;
		this.fuelType = fuelType;
		this.numberOfGears = numberOfGears;
		this.fuelConsumption = fuelConsumption;
	}

	public void setChasseNumber(String chasseNumber) {
		this.chasseNumber = chasseNumber;
	}

	public String getChasseNumber() {
		return chasseNumber;
	}

	public int getgear() {
		return gear;
	}

	public void shiftGear(int gear) {
		this.gear = gear;
		System.out.println("You have changed in " + gear + " gear");
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public float getCurrentKm() {
		return currentKm;
	}

	public void setCurrentKm(float currentKm) {
		this.currentKm = currentKm;
	}

	public float getCurrentConsumption() {
		return currentConsumption;
	}

	public float getFuelConsumption() {
		return fuelConsumption;
	}

	public void setCurrentConsumption(float currentConsumption) {
		this.currentConsumption = currentConsumption;
	}

	abstract float consumptionCompute(double numberOfKm, int gear);

	public float getFuelTankSize() {
		return fuelTankSize;
	}

	public float getFuelInTank() {
		return fuelInTank;
	}

	public float getAvailableFuel() {
		return availableFuelInTank;
	}

	public void setAvailableFuel(float availableFuel) {
		this.availableFuelInTank = availableFuel;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void getCurrentFuelLevel() {
		float fuel = fuelInTank - getCurrentConsumption();
		setAvailableFuel(fuel);
		System.out.println("The car has " + fuel + " liters of " + this.getFuelType() + " in tank");
	}

	public float getAverageFuelConsumption() {
		float averageFuelConsumption = ((getCurrentConsumption() / getCurrentKm()) * 100);
		return averageFuelConsumption;
	}

	public void showAverageConsumtion() {
		float averageFuelConsumtion = ((getCurrentConsumption() / getCurrentKm()) * 100);
		System.out.println("The average of consumtion is " + averageFuelConsumtion + " L/100 km");
	}
	@Override
		public void start(){
			System.out.println(	"The car started and has " + getAvailableFuel() + " liters of " + this.getFuelType()+ " in the tank. \n"+
								"Please fasten seat belt!");
			this.setCurrentConsumption(currentConsumption);
		}
		
		@Override
		public void drive(double numberOfKm){
			float consumption;
			consumption = this.getCurrentConsumption() + consumptionCompute(numberOfKm, currentGear);
			this.setCurrentConsumption(currentConsumption);
			float currentKm = (float) (this.getCurrentKm() + numberOfKm);
			this.setCurrentKm(currentKm);
		}
	
		@Override
		public void stop(){
			this.getCurrentFuelLevel();
			this.showAverageConsumtion();
		}

}
