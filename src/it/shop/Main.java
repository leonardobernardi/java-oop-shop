package it.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto prodotto1 = new Prodotto("Prodotto1", "Descrizione prodotto1", 0, 0);
		prodotto1.setNome("Computer");
		prodotto1.setDescrizione("Informatica");
		prodotto1.setPrezzo(499.99);
		prodotto1.setIva(22);
		
		System.out.println("Codice: " + prodotto1.getCodice());
		System.out.println("Prezzo base: " + prodotto1.generaPrezzo() + " euro");
		System.out.println("Prezzo con iva: " + prodotto1.generaPrezzoIva() + " euro");
		System.out.println("Nome esteso: " + prodotto1.generaNomeEsteso());
		
		
		

	}

}
