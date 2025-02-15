import java.util.List;
public class App {

    public static void main(String[] args) {
        GestioneImbarchi gestioneImbarchi = GestioneImbarchi.getInstance();

        // Creazione di imbarchi
        Imbarco imbarco1 = new Imbarco("AZ1234");
        Imbarco imbarco2 = new Imbarco("BA5678");

        // Creazione di passeggeri
        Passeggero p1 = new PasseggeroBase("Mario", "Rossi", "AA1234567");
        Passeggero p2 = new PasseggeroBusiness("Luisa", "Bianchi", "BB7654321");
        Passeggero p3 = new PasseggeroConInvalidita("Giulia", "Verdi", "CC1122334", TipoInvalidita.FISICA);

        // Aggiunta passeggeri agli imbarchi
        imbarco1.aggiungiPasseggero(p1);
        imbarco1.aggiungiPasseggero(p2);
        imbarco2.aggiungiPasseggero(p3);

        // Aggiunta imbarchi alla gestione
        gestioneImbarchi.aggiungiImbarco(imbarco1);
        gestioneImbarchi.aggiungiImbarco(imbarco2);

        // Test ricerca imbarco e stampa passeggeri
        try {
            System.out.println("Passeggeri per il volo AZ1234:");
            List<Passeggero> passeggeriVolo1 = gestioneImbarchi.listaPasseggeriPerVolo("AZ1234");
            for (Passeggero p : passeggeriVolo1) {
                System.out.println(p);
            }
        } catch (ImbarcoNonTrovatoException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        try {
            System.out.println("\nPasseggeri per il volo BA5678:");
            List<Passeggero> passeggeriVolo2 = gestioneImbarchi.listaPasseggeriPerVolo("BA5678");
            for (Passeggero p : passeggeriVolo2) {
                System.out.println(p);
            }
        } catch (ImbarcoNonTrovatoException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        try {
            System.out.println("\nPasseggeri per il volo inesistente:");
            gestioneImbarchi.listaPasseggeriPerVolo("XX9999"); // Questo lancerà l'eccezione

        } catch (ImbarcoNonTrovatoException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}
