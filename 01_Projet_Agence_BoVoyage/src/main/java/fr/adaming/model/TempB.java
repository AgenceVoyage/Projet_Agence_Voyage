package fr.adaming.model;

public class TempB extends Hotel {

	private int idVoy;

	public int getIdVoy() {
		return idVoy;
	}

	public void setIdVoy(int idVoy) {
		this.idVoy = idVoy;
	}

	public TempB() {
		super();
	}

	public TempB(String nomHotel,  double prix, Adresse adresse, int idVoy) {
		super(nomHotel, prix, adresse);
		this.idVoy = idVoy;
	}

	
}
