import java.util.Vector;

public class Kraj_AA {


	private String nazwa;
	private Vector<TurystaKraj_AA> turystaKraj = new Vector<TurystaKraj_AA>();
 
    public Kraj_AA(String nazwa) {
        this.nazwa = nazwa;
    }
   
    public void dodajTuryste(Turysta_AA turysta, int iloscDni) {
    	if (turysta != null) {
//		    	this.turystaKraj.add( )
    		new TurystaKraj_AA(turysta, this, iloscDni);
//		    	turysta.setKraj(this);
//		    	turysta.setTurysta(turysta);
    	}
    }

    public String getNazwa() {
    	return this.nazwa;
    }
	public Vector<TurystaKraj_AA> getTurystaKraj() {
		Vector<TurystaKraj_AA> kopia = (Vector<TurystaKraj_AA>) turystaKraj.clone();
		return kopia;
	}
	public void setTurystaKraj(TurystaKraj_AA turystaKraj) {
		if (turystaKraj != null) {
			this.turystaKraj.add(turystaKraj);
		}
	}
	
	

	public void wyswietlTurystow() {
		if (turystaKraj.size()>0) {
			System.out.println(this.getNazwa());
			for (int i=0; i<turystaKraj.size();i++) {
				System.out.println(turystaKraj.get(i).getTurysta()+" Ilość dni: " + turystaKraj.get(i).getIloscDni());
			}
			System.out.println("\n");
		} else {
			System.out.println(this.getNazwa());
			System.out.println("0" +"\n");
		}
	}
			
	@Override
	public String toString() {
		return "Kraj " + nazwa;
	}

	public void setTurysta(Turysta_AA turysta) {
		// TODO Auto-generated method stub
		
	}

	public void setKraj(Kraj_AA kraj) {
		// TODO Auto-generated method stub
			
	
		}

}

