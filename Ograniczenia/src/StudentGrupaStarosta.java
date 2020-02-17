import java.util.ArrayList;

	public class StudentGrupaStarosta {
		private Student student;
		private Grupa grupa;
		private static ArrayList<StudentGrupaStarosta> StudentGrupaStarosta = new ArrayList<StudentGrupaStarosta>();
		
	    public StudentGrupaStarosta(Student nowyStudent, Grupa nowaGrupa, StudentGrupaNalezy sgn ) {
	    	if(nowyStudent.getStudentGrupa().contains(sgn)){
		    	this.student = nowyStudent;
		    	this.grupa = nowaGrupa;
		    	StudentGrupaStarosta.add(this);
		    	nowyStudent.setStudentGrupaStarosta(this);
		    	nowaGrupa.setStudentGrupaStarosta(this);
		    	System.out.print("Student " +student+ " został starostą grupy "+ grupa +" \n");
	    	} else {
	    		System.out.print("Nie można ustawiś starotą grupy osobę, która nie nalezy do tej grupy! \n");
	    	}
	    }
	
	}
