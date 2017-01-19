package application;

public enum ShipType {

	 CARGO("Cargo"), CRUISE("Cruise"), WARSHIP("Warship"), 
	 CARRIER("Carrier"), CRUISER("Cruiser"), DESTROYER("Destroyer"), 
	 MINE_SWEEPER("Mine Sweeper"), SUBMARINE("Submarine");
	 
	 private String name;
		
		
		ShipType(String name) {
			this.name = name;
		}
		
		public String toString() {
			return name;
		}
}
