import java.util.ArrayList;


public class Student {
	private String nrIndeksu;
	private String imie;
	private String nazwisko;
	private ArrayList<StudentGrupaNalezy> studentGrupa = new ArrayList<StudentGrupaNalezy>();
	private ArrayList<StudentGrupaStarosta> studentGrupaStarosta = new ArrayList<StudentGrupaStarosta>();
 
    public Student(String nrIndeksu, String imie, String nazwisko) {
        this.setImie(imie);
        this.setNazwisko(nazwisko);
        this.setNrIndeksu(nrIndeksu);
    }
    
    public void dodajGrupe(Grupa grupa) {
    	if (grupa != null) {
	    	new StudentGrupaNalezy(this, grupa);
    	}
    }
/*    public void dodajGrupeStarosta(Grupa grupa) {
    	if (grupa != null && grupa.getStudentGrupa().contains(grupa)) {
	    	new StudentGrupaStarosta(this, grupa);
    	}
    }*/
    
	public void setStudentGrupaNalezy(StudentGrupaNalezy b) {
		if (b != null) {
			this.studentGrupa.add(b);
		}
	}
	public void setStudentGrupaStarosta(StudentGrupaStarosta d) {
		if (d != null) {
			this.studentGrupaStarosta.add(d);
		}
	}

	public String getNrIndeksu() {
		return nrIndeksu;
	}

	public void setNrIndeksu(String nrIndeksu) {
		this.nrIndeksu = nrIndeksu;
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

	public ArrayList<StudentGrupaNalezy> getStudentGrupa() {
		ArrayList<StudentGrupaNalezy> kopia = (ArrayList<StudentGrupaNalezy>) studentGrupa.clone();
		return kopia;
	}
	public ArrayList<StudentGrupaStarosta> getStudentGrupaStarosta() {
		ArrayList<StudentGrupaStarosta> kopia = (ArrayList<StudentGrupaStarosta>) studentGrupa.clone();
		return kopia;
	}

	@Override
	public String toString() {
		return nrIndeksu + " " + imie
				+ " " + nazwisko;
	}
	
}
