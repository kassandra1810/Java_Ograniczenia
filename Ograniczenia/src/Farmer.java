import java.util.ArrayList;


public class Farmer extends Osoba {
	private ArrayList<Rys> rysie = new ArrayList<Rys>();
	private ArrayList<Kura> kury = new ArrayList<Kura>();
	private ArrayList<Dzik> dziki = new ArrayList<Dzik>();
	public Farmer(String imie, String nazwisko) {
		super(imie, nazwisko);
		// TODO Auto-generated constructor stub
	}
    public void dodajRysia(Rys rys) {
    	if (this.kury.isEmpty()) {
    		this.rysie.add(rys);
    		rys.setFarmer(this);
    		System.out.print("Farmer "+this.getImie() + " zaczął hodować rysie \n");
    	}else {
	    	System.out.print("Farmer "+this.getImie() + " nie może hodować rysie, ponieważ hoduje kury \n");	    
    	}
    } 
    public void dodajDzika(Dzik dzik) {
    	if (this.kury.isEmpty()) {
    		this.dziki.add(dzik);
    		dzik.setFarmer(this);
    		System.out.print("Farmer "+this.getImie() + " zaczął hodować dziki \n");
    	}else {
	    	System.out.print("Farmer "+this.getImie() + " nie może hodować dzików, ponieważ hoduje kury \n");	    
    	}
    }
    
    public void dodajKure(Kura kura) {
    	if (this.rysie.isEmpty()&& this.dziki.isEmpty()) {
    		this.kury.add(kura);
    		kura.setFarmer(this);
    		System.out.print("Farmer "+this.getImie() + " zaczął hodować kury \n");
    	}else {
	    	System.out.print("Farmer "+this.getImie() + " nie może hodować kury, ponieważ hoduje rysie lub dziki \n");	    
    	}
    } 
}
