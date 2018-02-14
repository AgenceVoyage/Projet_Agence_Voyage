package fr.adaming.model;

public class Temp extends Voiture {
	
	private int idVoy;

	public int getIdVoy() {
		return idVoy;
	}

	public void setIdVoy(int idVoy) {
		this.idVoy = idVoy;
	}

	public Temp() {
		super();
	}

	public Temp(String loueur, String categorie, double prix, int idVoy) {
		super(loueur, categorie, prix);
		this.idVoy = idVoy;
	}



	
	

}
