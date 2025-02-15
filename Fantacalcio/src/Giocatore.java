public class Giocatore extends BaseEntity implements Valutabile, Comparable<Giocatore> {
	
	private Ruolo r;
	private double d;//costo del giocatore

	public Giocatore(String nome, Ruolo r, double d) {
		super(nome);
		this.r=r;
		this.d=d;
	}
	
	public void setRuolo(Ruolo r) {
		this.r=r;
	}
	
	public void setD(double d) {
		this.d=d;
	}
	
	public Ruolo getRuolo() {
		return r;
	}
	
	@Override
	public double valore() {
		return d;
	}

	@Override
	public int compareTo(Giocatore o) {
		return Double.compare(o.valore(), this.valore());
	}

	@Override
	public String descrivi() {
		return "Nome: "+getNome()+" Ruolo: "+getRuolo()+" Valore di mercato: "+valore();
	}
}