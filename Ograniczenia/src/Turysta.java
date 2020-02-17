import java.util.HashMap;

public class Turysta {
    private String imie;
    private String nazwisko;
    private String numerPaszportu;
    private static HashMap <String, Turysta> nPaszportow = new HashMap<>();

    public Turysta (String imie, String nazwisko, String numerPaszportu) throws Exception{
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setNumerPaszportu(numerPaszportu);
        Turysta.nPaszportow.put(numerPaszportu, this);
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNumerPaszportu() {
        return numerPaszportu;
    }

    public void setNumerPaszportu(String numerPaszportu) throws Exception {
        if ( Turysta.nPaszportow.containsKey(numerPaszportu) ) {
        	throw new Exception(String.format("Osoba z numerem paszportu " + numerPaszportu + " już istnieje, podaj przawidłowy numer."));
        } else {
            this.numerPaszportu = numerPaszportu;
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

	@Override
	public String toString() {
		return "Turysta [imie=" + imie + ", nazwisko=" + nazwisko
				+ ", numerPaszportu=" + numerPaszportu + "]";
	}

	public static HashMap <String, Turysta> getnPaszportow() {
		return nPaszportow;
	}
    
}
