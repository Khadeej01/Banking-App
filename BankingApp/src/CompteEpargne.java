import java.util.ArrayList;
import java.util.Scanner;

public class CompteEpargne extends Compte {
    private double tauxInteret;


    public CompteEpargne(double tauxInteret, String numero, double solde, Client client) {
        super(numero, solde, client);
        this.tauxInteret = tauxInteret;


    }
    public CompteEpargne() {
        
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    //Gestion du compte epargne
    
    public  void GestionCompteEpargne(ArrayList<CompteEpargne> compteEpargnes,ArrayList<Client> clients ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ajouter un compte Epargnes ");
        System.out.println("Afficher un compte Epargnes ");
        System.out.println("Tapez votre choix");
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                AjouterCompteEpargne(compteEpargnes,clients);
                break;
            case 2:
                AfficherCompteEpargne(compteEpargnes, clients);
                break;
            default:
                System.out.println("Choix invalide");
                break;
        }
    }}
