package it.shop;

import java.util.Random;

public class Prodotto {
	
	private int codice = generaCodice();
	private int iva;
	private String nome, descrizione;
	private double prezzo;
	
	
	public Prodotto(String nome, String descrizione, double prezzo, int iva) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}
		
	
		
		public int getIva() {
		return iva;
	}



	public void setIva(int iva) {
		this.iva = iva;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescrizione() {
		return descrizione;
	}



	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}



	public double getPrezzo() {
		return prezzo;
	}



	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}



	public int getCodice() {
		return codice;
	}

		public int generaCodice(){
			Random rng = new Random();
			return rng.nextInt(100) + 1;
		}
		
		public double generaPrezzo() {
			return this.prezzo;
		}
		
		public double generaPrezzoIva() {
			return this.prezzo + ((this.prezzo * 22) / 100);
		}
		
		public String generaNomeEsteso() {
			return (this.codice + "-" + this.nome);
		}
		
		
	
	
	
	
}
