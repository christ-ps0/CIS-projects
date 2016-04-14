import java.util.Random;

public class HotRod extends Racer {

	private boolean blower;

	public HotRod() {
		// call the parent default constructor
		super();

	}

	public HotRod(String name, int speed, Engine engine, boolean blower) {

		super(name, speed, engine);
		this.blower = blower;
	}

	public void setBlower(boolean blower) {
		this.blower = blower;
	}

	public String toString() {
		String output = "";
		output = super.toString();
		output += "Blower: " + this.blower + "\n";
		return output;
	}

	@Override
	public boolean isDead() {
		Random rnd = new Random();
		boolean dead;

		if (this.getSpeed() > 50 && rnd.nextDouble() > .6) {
			if (this.getEngine().getHorsePower() < 300 && blower)
				dead = false;
			else
				dead = true;
		} else if (this.getSpeed() > 100 && rnd.nextDouble() > .4) {
			if (this.getEngine().getHorsePower() >= 300 && blower)
				dead = true;
			else
				dead = false;
		} else
			dead = false;

		return dead;

	}

}
