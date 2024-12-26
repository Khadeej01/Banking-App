import java.util.ArrayList;
import java.util.Scanner;

abstract class Compte {

    private String numero;
    private double solde;
    private Client client ;

    public Compte(String numero, double solde, Client client) {
        this.numero = numero;
        this.solde = solde;
        this.client = client;
    }
    public Compte(){

    }



    public String getNumero(){
        return numero ;
    }
    public void setNumero(String numero){
        this.numero  = numero ;
    }
    public double getSolde(){
        return solde;
    }
    public void setSolde(double solde){
     this.solde = solde;
    }
    public Client getClient( Client client){
        return client ;
    }
    public void setClient(Client client ){
        client = client;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero='" + numero + '\'' +
                ", solde=" + solde +
                ", client=" + client +
                '}';
    }

    public static void GestionCompte(ArrayList<CompteCourant> compteCourants,ArrayList<CompteEpargne> compteEpargnes,ArrayList<Client> clients) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Gestion des Comptes ---");
        System.out.println("1.CompteCourant");
        System.out.println("2.CompteEpargne");
        System.out.print("Tapez votre Choix: ");
        int choix = scanner.nextInt();
        switch (choix) {
        case 1:
           CompteCourant compteCourant = new CompteCourant();
           compteCourant.GestionCompteCourant(compteCourants,clients);
                    break;
            case 2:
                CompteEpargne compteEpargne = new CompteEpargne();
                compteEpargne.GestionCompteEpargne(compteEpargnes,clients);
break;
default:
    System.out.println("Erreur: Choix invalide");
    break;
        }
    }
}
