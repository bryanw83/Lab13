package Lab13;

public abstract class Player {
	private String name;
	private Roshambo value;
	
	public abstract Roshambo generateRoshambo();
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(String name, Roshambo value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Roshambo getValue() {
		return value;
	}

	public void setValue(Roshambo value) {
		this.value = value;
	}


}
