package org.example.model;

public class Servizio implements Articolo {

	String string;
	double d;
	Categoria servizi;
	
	public Servizio(String string, double d, Categoria servizi) {
		this.string=string;
		this.d=d;
		this.servizi=servizi;
	}

	@Override
	public String getNome() {
		return string;
	}

	@Override
	public double getPrezzo() {
		return d;
	}

	@Override
	public Categoria getCategoria() {
		return servizi;
	}
    
}
