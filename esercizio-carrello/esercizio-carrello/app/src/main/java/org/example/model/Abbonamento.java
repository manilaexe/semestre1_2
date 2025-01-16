package org.example.model;

public class Abbonamento implements Articolo {
	
	String string;
	double d;
	Categoria servizi;

	public Abbonamento(String string, double d, Categoria servizi) {
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