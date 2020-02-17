import java.util.ArrayList;


public class StudentGrupaNalezy {
	private Student student;
	private Grupa grupa;
	private static ArrayList<StudentGrupaNalezy> StudentGrupaNalezy = new ArrayList<StudentGrupaNalezy>();
	
    public StudentGrupaNalezy(Student nowyStudent, Grupa nowaGrupa ) {
    	this.student = nowyStudent;
    	this.grupa = nowaGrupa;
    	StudentGrupaNalezy.add(this);
    	nowyStudent.setStudentGrupaNalezy(this);
    	nowaGrupa.setStudentGrupaNalezy(this);
    }
}
