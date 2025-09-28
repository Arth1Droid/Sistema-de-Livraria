package models;

public enum Status {
	DISPONIVEL ("Disponivel"),
	eMPRESTADO ("Emprestado"),
	INDISPONIVEL("Indisponivel");
	
	private final String status;
	
	Status(String status){
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
	
}
