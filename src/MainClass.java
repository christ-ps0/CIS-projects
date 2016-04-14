import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {

		// Create and Employee object using the default constructor.
		Racer[] racerList = new Racer[3];
		racerList[0] = collectHotRodInformation();
		displayRacerInformation(racerList[0]);

		racerList[1] = collectStreetTunerInformation();
		displayRacerInformation(racerList[1]);

		racerList[2] = collectStreetTunerInformation();
		displayRacerInformation(racerList[2]);
	}

	public static Racer collectHotRodInformation() {
		final String name = getInput("Name");
		final int speed = Integer.parseInt(getInput("Speed"));
		final int cylinders = Integer.parseInt(getInput("Number of Cylinders"));
		final int hp = Integer.parseInt(getInput("Horse Power"));
		final boolean blower = Boolean.parseBoolean(getInput("Blower?"));

		return new HotRod(name, speed, new Engine(cylinders, hp), blower);
	}

	public static Racer collectStreetTunerInformation() {
		final String name = getInput("Name");
		final int speed = Integer.parseInt(getInput("Speed"));
		final int cylinders = Integer.parseInt(getInput("Number of Cylinders"));
		final int hp = Integer.parseInt(getInput("Horse Power"));
		final boolean nitro = Boolean.parseBoolean(getInput("Nitro?"));

		return new StreetTuner(name, speed, new Engine(cylinders, hp), nitro);
	}

	public static void displayRacerInformation(Racer rcr) {
		displayDivider("Racer Information");
		System.out.println(rcr);
		System.out.println("is racer dead?: " + rcr.isDead());
	}

	// provide output separator
	public static void displayDivider(String outputTitle) {
		System.out.println("************" + outputTitle + "*********");
	}

	// return the string of the user input
	public static String getInput(String inputType) {
		String stringInput;
		stringInput = JOptionPane.showInputDialog("Enter the " + inputType);

		return stringInput;
	}
}
