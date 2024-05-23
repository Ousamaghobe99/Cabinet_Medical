package metier;


public class Patient extends User {
	
	private String dateNaissance;
	private String sex;

 // 2. Constructeur par defaut
    public Patient() {
    	
    }
    
    public Patient(int id	,String nom,String prenom,String telephone,String email,String password,String dateNaissance,String sex) {
     
    	super ( id	, nom, prenom, telephone, email, password);
    	this.dateNaissance = dateNaissance;
    	this.setSex(sex);
    	
    }
    // Getters et Setters
    
    public String getdateNaissance() {
		return dateNaissance;
	}

	public void setdateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
