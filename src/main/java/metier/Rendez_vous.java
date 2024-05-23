package metier;

public class Rendez_vous {

	private int id_rendez_vous;
	private String date_controle;
	private String date_rendez_vous;
	private String description;
	private String type_maladie;
	//private boolean notification;
	private Patient patient;
	
	public Rendez_vous() {}
	
	public Rendez_vous(String date_controle,String date_rendez_vous, String description,Patient patient,String type_maladie ) 
	{	
		this.setDate_controle(date_controle);
		this.setDate_rendez_vous(date_rendez_vous);
		this.setDescription(description);
		this.setType_maladie(type_maladie);
		this.setPatient(patient);
		
	}

	public int getId_rendez_vous() {
		return id_rendez_vous;
	}

	public void setId_rendez_vous(int id_rendez_vous) {
		this.id_rendez_vous = id_rendez_vous;
	}

	public String getDate_controle() {
		return date_controle;
	}

	public void setDate_controle(String date_controle) {
		this.date_controle = date_controle;
	}

	public String getDate_rendez_vous() {
		return date_rendez_vous;
	}

	public void setDate_rendez_vous(String date_rendez_vous) {
		this.date_rendez_vous = date_rendez_vous;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType_maladie() {
		return type_maladie;
	}

	public void setType_maladie(String type_maladie) {
		this.type_maladie = type_maladie;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	
}
