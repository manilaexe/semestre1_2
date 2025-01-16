package org.example.model;

public class Prodotto implements Articolo {

	String string;
	double d;
	Categoria elettronica;
	public Prodotto(String string, double d, Categoria elettronica) {
		this.string=string;
		this.d=d;
		this.elettronica=elettronica;
	
	}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return string;
	}
	@Override
	public double getPrezzo() {
		// TODO Auto-generated method stub
		return d;
	}
	@Override
	public Categoria getCategoria() {
		return elettronica;
	}
    
}
