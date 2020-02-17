import java.util.ArrayList;
import java.util.Collections;


public class Main {

	public static void main(String[] args) throws Exception {
	//// OGRANICZENIE ATRYBUTÓW (statyczne i dynamiczne)
        System.out.println("OGRANICZENIE ATRYBUTÓW (statyczne i dynamiczne"+ "\n");
		Dziecko d1 = new Dziecko("Marek", "Wawelski", 100d, 100d);
		// Wzrost - ograniczenie dynamiczne
		//d1.setWzrost(145d); // Przy próbie padania wzrostu ponad 30% wyskoczy Exception z komunikatem o błędzie
		d1.setWzrost(130d);
		// Kieszonkowe - ograniczenie statyczne
		//d1.setKieszonkowe(90); // Przy próbie ustawienia kieszonkowych niższych od 100, wyskoczy Exception z komunikatem.
		d1.setKieszonkowe(120d);
		System.out.println(d1);
		System.out.println("\n");	
		
	//// OGRANICZENIE UNIQUE
        System.out.println("OGRANICZENIE UNIQUE"+ "\n");
        Turysta t1 = new Turysta("Maria", "Kowalska", "WE123412");
        System.out.println(t1);
        //Turysta t2 = new Turysta("Anna", "Wuld","WE123412");// Przy próbie dodania takiego samego numeru paszportu, wyskoczy Exception z błędem
        //System.out.println(t2);
		System.out.println("\n");
		
	//// OGRANICZENIE ORDERED - ogramiczenie dotyczy klasy, sortuje albabetycznie według typu zwierzęcia.
        System.out.println("OGRANICZENIE ORDERED"+ "\n");
		Zwierze z1 = new Zwierze("Kot","Mały");
		Zwierze z2 = new Zwierze("Pies","Burek");
		Zwierze z3 = new Zwierze("Koza","Frania");
		Zwierze z4 = new Zwierze("Wiewiórka", "Ania");
		Zwierze z5 = new Zwierze("Aligator", "Antek");
		System.out.println(Zwierze.getZwierzeta());//pokazuje sortowanie ekstencji w kolejności alfabetycznej
		System.out.println("\n");
		
	/// OGRANICZENIE BAG - używa kolekcji Vector, żeby zliczać duplikaty powiązań
        System.out.println("OGRANICZENIE BAG"+ "\n");
		Turysta_AA turysta1 = new Turysta_AA("Janusz","Kowalski","Polak"); //tworze turystów
		Turysta_AA turysta2 = new Turysta_AA("Ilona", "Wepryk", "Ukrainka");
		Kraj_AA kraj1 = new Kraj_AA("Hiszpania"); //tworze kraje
		Kraj_AA kraj2 = new Kraj_AA("Niemcy");
		turysta2.dodajKraj(kraj1, 44); //łączenie za pomocą klasy Turysta
		kraj1.dodajTuryste(turysta1, 22); //Pierwsze powiązanie z Hiszpanią
		kraj1.dodajTuryste(turysta1, 13); //Drugie powiązanie z Hiszpanią
		turysta1.wyswietlKraje(); //wyświetlenie wszystkich odwiedzonych przez turystę krajów
		turysta2.wyswietlKraje();
		System.out.println("\n");
		
	/// OGRANICZENIE SUBSET - ogranicza ustawianie studenta starostą grupy jeżeli osoba nie należy do tej grupy
        System.out.println("OGRANICZENIE SUBSET"+ "\n");
		Student s1 = new Student("s111111","Piotr", "Kowalski");
		Student s2 = new Student("s222222","Kamila", "Kowalska");
		Grupa g1 = new Grupa("G123");
		Grupa g2 = new Grupa("G123");
		StudentGrupaNalezy sgn = new StudentGrupaNalezy(s1,g1); //dodaje asocjacje należy
		StudentGrupaStarosta sgs = new StudentGrupaStarosta(s1,g1,sgn); //dodaje asocjacje starosta
		StudentGrupaStarosta sgs2 = new StudentGrupaStarosta(s2,g2,sgn); //zadziała ograniczenie, relacja nie zostanie utworzona
		StudentGrupaStarosta sgs3 = new StudentGrupaStarosta(s1,g1,null); //zadziała ograniczenie, relacja nie zostanie utworzona
		System.out.println("\n");
		
	/// OGRANICZENIE XOR - Farmer może hodować rysie lub kury
		System.out.println("OGRANICZENIE XOR"+ "\n");
		Farmer f1 = new Farmer("Piotr","Kowalski");
		Farmer f2 = new Farmer("Kamil","Jaworski");
		Rys r1 = new Rys ("Mruczek"); 
		Rys r2 = new Rys ("Kalina");
		Kura k1 = new Kura("Zosia"); //błąd
		f1.dodajRysia(r1); //dodaje asocjacje hoduje
		f1.dodajKure(k1); //nie zadziała ponieważ już hiduje rysie
		f2.dodajKure(k1); //dodaje asocjacje hoduje
		f2.dodajRysia(r2); //nie zadziała ponieważ już hiduje kury
		System.out.println("\n");
		
	/// OGRANICZENIE WŁASNE - Farmer może hodować kury jeżeli nie hoduje dzików lub rysi (OR)
		System.out.println("OGRANICZENIE WŁASNE"+ "\n");
		Farmer f3 = new Farmer("Marek","Kowalski");
		Farmer f4 = new Farmer("Karol","Mowelska");
		Rys r3 = new Rys ("Kalina");
		Dzik dz1 = new Dzik("Pumba");
		Kura k2 = new Kura("Zosia");	
		f3.dodajRysia(r3);
		f3.dodajDzika(dz1);
		f3.dodajKure(k2); // nie doda ponieważ hoduje rysie lub dziki, lub to i drugie.
		f4.dodajKure(k2);
		f4.dodajDzika(dz1); // nie doda dzika, ponieważ farmer hoduje kury
		f4.dodajRysia(r3); // nie doda rysia, ponieważ farmer hoduje kury
		
		}

}
