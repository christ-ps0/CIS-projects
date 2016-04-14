public class Engine {

	private int cylinders, horsePower;

	public Engine() {
		cylinders = 0;
		horsePower = 0;

	}

	public Engine(int cylinders, int horsePower) {
		this.cylinders = cylinders;
		this.horsePower = horsePower;
	}

	public int getCylinders() {
		return cylinders;
	}

	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}

	public void setCylinders(String cylinders) {
		Integer cyl = Integer.parseInt(cylinders);
		setCylinders(cyl);
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public void setHorsePower(String horsePower) {
		Integer hpr = Integer.parseInt(horsePower);
		setHorsePower(hpr);
	}

	public String toString() {
		String out = "**Engine Information**\n";
		out+= "\t" + "Cylinders: " + cylinders + "\n";
		out += "\t" + "Horse Power: " + horsePower + "\n";

		return out;
	}

}
