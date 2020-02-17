
public class Kura {
	private String nazwa;
	private Farmer farmer;
	
	public Kura (String nazwa) {
		this.setNazwa(nazwa);
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

}
