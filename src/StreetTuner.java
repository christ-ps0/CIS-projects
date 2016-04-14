import java.util.Random;


public class StreetTuner extends Racer {


	private boolean nitro;

	public StreetTuner() {
		// call the parent default constructor
		super();

	}

	
	public StreetTuner(String name, int speed, Engine engine,boolean nitro) {

		super(name, speed, engine);
		this.nitro = nitro;
		
	}

	public String toString() {
		String output = "";
		output = super.toString();
		output += "Nitro: " + this.nitro + "\n";
		return output;
	}

	@Override
	public boolean isDead() {
		Random rnd = new Random();
		boolean dead;

		if (this.getSpeed() > 50 && rnd.nextDouble() > .6) {
			if (this.getEngine().getHorsePower() < 300 && nitro)
				dead = false;
			else
				dead = true;
		}
		else if (this.getSpeed() > 100 && rnd.nextDouble() > .4)	
		{
			if (this.getEngine().getHorsePower() >= 300 && nitro)
				dead = true;
			else 
				dead = false;
		}
		else 
			dead = false;

		return dead;
		
	}

}


