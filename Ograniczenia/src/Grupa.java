import java.util.ArrayList;


public class Grupa {
	private String nazwa;
	private ArrayList<StudentGrupaNalezy> studentGrupa = new ArrayList<StudentGrupaNalezy>();
	private ArrayList<StudentGrupaStarosta> studentGrupaStarosta = new ArrayList<StudentGrupaStarosta>();
    public Grupa(String nazwa) {
        this.setNazwa(nazwa);
    }
   
    public void dodajStudenta(Student student) {
    	if (student != null) {
//		    	this.turystaKraj.add( )
    		new StudentGrupaNalezy(student, this);
//		    	turysta.setKraj(this);
//		    	turysta.setTurysta(turysta);
    	}
    }
	public void setStudentGrupaNalezy(StudentGrupaNalezy b) {
		if (b != null) {
			this.studentGrupa.add(b);
		}
	}
	public void setStudentGrupaStarosta(StudentGrupaStarosta b) {
		if (b != null) {
			this.studentGrupaStarosta.add(b);
		}
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
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
		return nazwa ;
	}
	

}
