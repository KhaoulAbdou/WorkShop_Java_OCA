package model;

public class Etudiant {

	private String nom;
	private int age;
	private double moyenne;
	private String adresse;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if ( nom.length() < 8 || nom.length()> 30) {
			System.out.println("le nom doit etre comprise entre 8 et 30 caracteres");
		}
		this.nom = nom;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if ( age < 18 || age > 28) {
			System.out.println("Age doit être comprise entre 18 et 28.");
		}
		this.age = age;
	}

	public double getMoyenne() {
		
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		if ( moyenne < 0 || moyenne > 20) {
			System.out.println("La moyenne doit être comprise entre 0 et 20.");
		}
		this.moyenne = moyenne;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	// constructeur par defaut
	public Etudiant() {
	}

	// Constructeur avec paramètre
	public Etudiant(String nom, int age, double moyenne, String adresse) {
		super();
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + ", moyenne=" + moyenne + ", adresse=" + adresse + "]";
	}

	// permet d’afficher toutes les infos de l’étudiant.
	void info() {
		System.out.println(this);
	}

}
