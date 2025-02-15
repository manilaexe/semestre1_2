public class App {
    
    public static void main(String[] args) {
        Campionato campionato = Campionato.getInstance();

        // Creazione delle squadre
        Squadra squadra1 = new Squadra("I Leoni");
        Squadra squadra2 = new Squadra("Gli Aquilotti");

        // Creazione dei giocatori
        Giocatore giocatore1 = new Giocatore("Luca Rossi", Ruolo.ATTACCANTE, 25.0);
        Giocatore giocatore2 = new Giocatore("Marco Bianchi", Ruolo.PORTIERE, 10.0);
        Giocatore giocatore3 = new Giocatore("Paolo Verdi", Ruolo.DIFENSORE, 15.0);

        Giocatore giocatore4 = new Giocatore("Giorgio Neri", Ruolo.CENTROCAMPISTA, 20.0);
        Giocatore giocatore5 = new Giocatore("Fabio Gialli", Ruolo.ATTACCANTE, 30.0);

        // Aggiunta dei giocatori alle squadre
        squadra1.aggiungiGiocatore(giocatore1);
        squadra1.aggiungiGiocatore(giocatore2);
        squadra1.aggiungiGiocatore(giocatore3);

        squadra2.aggiungiGiocatore(giocatore4);
        squadra2.aggiungiGiocatore(giocatore5);

        // Aggiunta delle squadre al campionato
        campionato.aggiungiSquadra(squadra1);
        campionato.aggiungiSquadra(squadra2);

        // Mostra tutte le squadre
        System.out.println("Squadre nel campionato:");
        campionato.mostraTutteLeSquadre();

        // Mostra giocatori di una squadra ordinati per valore di mercato
        System.out.println("\nGiocatori della squadra 'I Leoni' ordinati per valore:");
        squadra1.mostraGiocatoriOrdinati();
    }
}