package metier;

public class User {

	// 1. Les attributs priv�s
    private int id_user;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
	private String accountType;
	private String password;
	
	// 2. Constructeur par defaut
	public User() {
		super();
	}
	
	public User(int id_user	,String nom,String prenom,String telephone,String email,String password) {
		this.setId_user(id_user);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setTelephone(telephone);
		this.setEmail(email);
		this.setPassword(password);
		
	}
	// Getters et Setters
	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
