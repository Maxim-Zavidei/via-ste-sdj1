public class DriversLicense {

	private int number;
	private boolean permitForTruck;
	private boolean permitForBus;

	public DriversLicense(int number, boolean permitForTruck, boolean permitForBus) {
		this.number = number;
		this.permitForTruck = permitForTruck;
		this.permitForBus = permitForBus;
	}

	public DriversLicense(int number, boolean permitForTruckAndBus) {
		this.number = number;
		this.permitForTruck = permitForTruckAndBus;
		this.permitForBus = permitForTruckAndBus;
	}

	public DriversLicense(int number) {
		this.number = number;
		this.permitForTruck = false;
		this.permitForBus = false;
	}

	public int getNumber() {
		return this.number;
	}

	public boolean getPermitForTruck() {
		return this.permitForTruck;
	}

	public boolean getPermitForBus() {
		return this.permitForBus;
	}

	@Override
	public String toString() {
		return "Driver License Number: " + this.number + ", Valid for truck: " + this.permitForTruck + ", Valid for bus: " + this.permitForBus;
	}
}
