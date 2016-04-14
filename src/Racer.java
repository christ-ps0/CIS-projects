
public abstract class Racer {
	// variable declaration
	private String name;
	private int speed;
	private Engine engine;

	public Racer() {
		name = "not given";
		speed = 0;
		engine = new Engine();
	}

	public Racer(String name, int speed, Engine engine) {
		this.name = name;
		this.speed = speed;
		this.engine = engine;

	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setSpeed(String speed) {
		int spd = Integer.parseInt(speed);
		setSpeed(spd);
	}

	public abstract boolean isDead();

	public String toString() {

		String out = "Name " + name + "\n";
		out += "Speed " + speed + "\n";
		out += this.engine.toString();

		return out;
	}

}
