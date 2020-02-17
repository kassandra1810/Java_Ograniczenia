import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class Zwierze implements Comparable <Zwierze> {
	private String typ;
	private String imie;
	private static Set<Zwierze> zwierzeta = new TreeSet<>();
	
	public String getTyp() {
		return typ;
	}	
	public Zwierze(String typ, String imie){
		this.imie = imie;
		this.typ = typ;
		zwierzeta.add(this);
	}

/*	@Override
	public int compare(Zwierze o1, Zwierze o2) {
		return o1.getTyp().compareTo(o2.getTyp());
	}*/
	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public static Set<Zwierze> getZwierzeta() {
		Set<Zwierze> zwierzetaKopia = new TreeSet<>(zwierzeta);
		return zwierzetaKopia;
	}
	@Override
	public String toString() {
		return "Zwierze [typ=" + typ + ", imie=" + imie + "] \n";
	}
	
	public static void wyswietlanieZwierzat(){
		for(int i=0;i<Zwierze.getZwierzeta().size();i++){
			System.out.println(Zwierze.getZwierzeta().containsAll(getZwierzeta()));
		}
	}

	@Override
	public int compareTo(Zwierze z) {
		// TODO Auto-generated method stub
		return this.getTyp().compareTo(z.getTyp());
	}

}
