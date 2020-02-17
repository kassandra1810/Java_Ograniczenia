
public class Dziecko {
	String imie;
	String nazwisko;
	double wzrost;
	double kieszonkowe;
	
	public Dziecko (String imie, String nazwisko, double wzrost, double kieszonkowe) throws Exception {
		this.setImie(imie);
		this.setNazwisko(nazwisko);
		this.wzrost = wzrost;
		this.setKieszonkowe(kieszonkowe);
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public double getWzrost() {
		return wzrost;
	}
	public void setWzrost(double w)throws Exception {
		if(w < this.wzrost) {
            throw new Exception(String.format("Wzrist nie może być mniejszy niż " + this.wzrost));
        }		
        if(this.wzrost * (1d + maxProcentWzrost /100d) < w) {
            throw new Exception(String.format("Wzrost nie może być większy! niż " + maxProcentWzrost + " procent w ciągu roku "));
        } else {
        	this.wzrost = w;
        }
	}
	public double getKieszonkowe() {
		return kieszonkowe;
	}
	public void setKieszonkowe(double kieszonkowe) throws Exception {
		if(kieszonkowe < minKieszonkowe) {
            throw new Exception(String.format("Kieszonkowe musza być nie niższe niż "+ minKieszonkowe + " PLN"));
        }
		this.kieszonkowe = kieszonkowe;
	}
	public final static int maxProcentWzrost = 30;
	public final static int minKieszonkowe = 100;

	@Override
	public String toString() {
		return "Dziecko [imie=" + imie + ", nazwisko=" + nazwisko + ", wzrost="
				+ wzrost + ", kieszonkowe=" + kieszonkowe + "]";
	}
	
}
