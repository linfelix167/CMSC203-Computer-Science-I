package application;

public abstract class Ship {
	
	private String name, year;
	private ShipType type;
	
	public Ship(String a, String b, String p){
		this.name = a;
		this.year = b;
		setType(p);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public ShipType getType() {
		return type;
	}
	public void setType(String o) {
		if (o.equals("Cargo")) {
			this.type = ShipType.CARGO;
		} else if (o.equals("Cruise")) {
			this.type = ShipType.CRUISE;
		} else if (o.equals("Warship")) {
			this.type = ShipType.WARSHIP;
		} else if (o.equals("Carrier")) {
			this.type = ShipType.CARRIER;
		}else if (o.equals("Cruiser")) {
			this.type = ShipType.CRUISER;
		} else if (o.equals("Destroyer")) {
			this.type = ShipType.DESTROYER;
		} else if (o.equals("Mine Sweeper")) {
			this.type = ShipType.MINE_SWEEPER;
		}else if (o.equals("Submarine")) {
			this.type = ShipType.SUBMARINE;
		}
	}
	
	public String writeString(){
		return name+","+type+","+year;
	}
	
	public String toString(){
		return name + " built in "+year +", "+type+" class";
	}
	
}
